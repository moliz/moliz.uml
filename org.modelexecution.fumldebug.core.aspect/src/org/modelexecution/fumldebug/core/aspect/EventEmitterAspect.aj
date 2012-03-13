/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tanja Mayerhofer - initial API and implementation
 */
package org.modelexecution.fumldebug.core.aspect;

import java.util.ArrayList;
import java.util.List;

import org.modelexecution.fumldebug.core.ExecutionContext;
import org.modelexecution.fumldebug.core.ExecutionEventListener;
import org.modelexecution.fumldebug.core.ExecutionEventProvider;
import org.modelexecution.fumldebug.core.event.ActivityEntryEvent;
import org.modelexecution.fumldebug.core.event.ActivityExitEvent;
import org.modelexecution.fumldebug.core.event.ActivityNodeEntryEvent;
import org.modelexecution.fumldebug.core.event.ActivityNodeExitEvent;
import org.modelexecution.fumldebug.core.event.Event;
import org.modelexecution.fumldebug.core.event.StepEvent;
import org.modelexecution.fumldebug.core.event.impl.ActivityEntryEventImpl;
import org.modelexecution.fumldebug.core.event.impl.ActivityExitEventImpl;
import org.modelexecution.fumldebug.core.event.impl.ActivityNodeEntryEventImpl;
import org.modelexecution.fumldebug.core.event.impl.ActivityNodeExitEventImpl;
import org.modelexecution.fumldebug.core.event.impl.StepEventImpl;

import fUML.Semantics.Actions.BasicActions.ActionActivation;
import fUML.Semantics.Activities.IntermediateActivities.ActivityExecution;
import fUML.Semantics.Activities.IntermediateActivities.ActivityFinalNodeActivation;
import fUML.Semantics.Activities.IntermediateActivities.ActivityNodeActivation;
import fUML.Semantics.Activities.IntermediateActivities.ActivityNodeActivationList;
import fUML.Semantics.Activities.IntermediateActivities.TokenList;
import fUML.Semantics.Activities.IntermediateActivities.ControlNodeActivation;
import fUML.Semantics.Activities.IntermediateActivities.DecisionNodeActivation;
import fUML.Semantics.Activities.IntermediateActivities.ActivityEdgeInstance;
import fUML.Semantics.Activities.IntermediateActivities.ActivityNodeActivationGroup;
import fUML.Semantics.Classes.Kernel.ExtensionalValue;
import fUML.Semantics.Classes.Kernel.Object_;
import fUML.Semantics.Loci.LociL1.Executor;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueList;

import fUML.Syntax.CommonBehaviors.BasicBehaviors.Behavior;
import fUML.Syntax.Activities.IntermediateActivities.Activity;

public aspect EventEmitterAspect implements ExecutionEventListener {
 
	private ExecutionEventProvider eventprovider = null;
	private List<Event> eventlist = new ArrayList<Event>();
	
	public EventEmitterAspect()	{
		eventprovider = ExecutionContext.getInstance().getExecutionEventProvider();
		eventprovider.addEventListener(this);		
	}	
	
	/*
	 * Handling of ActivityEntryEvent and ActivityExitEvent
	 */
	private pointcut activityExecution(ActivityExecution execution) : execution (void ActivityExecution.execute()) && target(execution);
	
	before(ActivityExecution execution) : activityExecution(execution) {
		Activity activity = (Activity) (execution.getTypes().getValue(0));
		ActivityEntryEvent event = new ActivityEntryEventImpl(activity);
		eventprovider.notifyEventListener(event);
	}
	
	after(ActivityExecution execution) : activityExecution(execution) {
		Activity activity = (Activity) (execution.getTypes().getValue(0));
		ActivityExitEvent event = new ActivityExitEventImpl(activity);
		eventprovider.notifyEventListener(event);				
	}
			
	/*
	 * Handling of ActivityNodeEntryEvent and ActivityNodeExitEvent for Actions
	 */
	private pointcut doAction(ActionActivation activation) : call (void ActionActivation.doAction()) && target(activation);
	
	before(ActionActivation activation) : doAction(activation) {
		ActivityNodeEntryEvent event = new ActivityNodeEntryEventImpl(activation.node);				
		eventprovider.notifyEventListener(event);		
		
		eventprovider.notifyEventListener(new StepEventImpl(activation.node));
	}
	
	after(ActionActivation activation) : doAction(activation) {
		ActivityNodeExitEvent event = new ActivityNodeExitEventImpl(activation.node);		
		eventprovider.notifyEventListener(event);		
	}
	
	/*
	 * Handling of ActivityNodeEntryEvent for ControlNodes
	 */
	private pointcut controlNodeFire(ControlNodeActivation activation) : execution (void ControlNodeActivation.fire(TokenList)) && target(activation);
	
	before(ControlNodeActivation activation) : controlNodeFire(activation) {
		if(activation.node==null) {
			//anonymous fork node
			return;
		}
		ActivityNodeEntryEvent event = new ActivityNodeEntryEventImpl(activation.node);				
		eventprovider.notifyEventListener(event);
		
		eventprovider.notifyEventListener(new StepEventImpl(activation.node));
	}
	
	/*
	 * Handling of ActivityNodeExitEvent for ActivityFinalNodeActivation
	 */	
	private pointcut activityFinalNodeFire(ActivityFinalNodeActivation activation) : execution (void ActivityFinalNodeActivation.fire(TokenList)) && target(activation);
	
	after(ActivityFinalNodeActivation activation) : activityFinalNodeFire(activation) {
		ActivityNodeExitEvent event = new ActivityNodeExitEventImpl(activation.node);				
		eventprovider.notifyEventListener(event);
	}
	
	/*
	 * Handling of ActivityNodeExitEvent for MergeNode, InitialNode, ForkNode, JoinNode
	 */
	private pointcut controlNodeFireSendOffers(ActivityNodeActivation activation, ActivityNodeActivation cflowactivation) : call(void ActivityNodeActivation.sendOffers(TokenList)) && target(activation) && cflow (execution(void ControlNodeActivation.fire(TokenList)) && target(cflowactivation));
	
	before(ActivityNodeActivation activation, ActivityNodeActivation cflowactivation) : controlNodeFireSendOffers(activation, cflowactivation) {
		if(activation.node==null) {
			//anonymous fork node
			return;
		}
		if(activation.getClass() != cflowactivation.getClass()) {
			//sendOffers() was only called in the context of the ControlNode but not for the ContronNode itself
			return;
		}
		ActivityNodeExitEvent event = new ActivityNodeExitEventImpl(activation.node);				
		eventprovider.notifyEventListener(event);
	}
	
	/*
	 * Handling of ActivityNodeExitEvent for DecisionNode
	 */		
	private pointcut decisionNodeFireEdgeSendOffer(DecisionNodeActivation activation) : call(void ActivityEdgeInstance.sendOffer(TokenList))  && cflow (execution(void DecisionNodeActivation.fire(TokenList)) && target(activation));
	// TODO may occur more than once because ActivityEdgeInstance.sendOffer(TokenList) is called in a loop in DecisionNodeActivation.fire(TokenList)
	before(DecisionNodeActivation activation) : decisionNodeFireEdgeSendOffer(activation) {
		ActivityNodeExitEvent event = new ActivityNodeExitEventImpl(activation.node);				
		eventprovider.notifyEventListener(event);
	}	
	
	private pointcut decisionNodeFire(DecisionNodeActivation activation) : execution (void DecisionNodeActivation.fire(TokenList)) && target(activation);
	after(DecisionNodeActivation activation) : decisionNodeFire(activation) {
		Event e = eventlist.get(eventlist.size()-1);
		if(e instanceof StepEvent) {
			if(((StepEvent)e).getLocation() == activation.node) {
				ActivityNodeExitEvent event = new ActivityNodeExitEventImpl(activation.node);				
				eventprovider.notifyEventListener(event);
			}
		}		
	}	
	/*after(DecisionNodeActivation activation) : decisionNodeFire(activation) {
		Event e = eventlist.get(eventlist.size()-2);
		if(e instanceof ActivityNodeEntryEvent) {
			if(((ActivityNodeEntryEvent)e).getNode() == activation.node) {
				ActivityNodeExitEvent event = new ActivityNodeExitEventImpl(activation.node);				
				eventprovider.notifyEventListener(event);
			}
		}		
	}	*/
	
	@Override
	public void notify(Event event) {
		eventlist.add(event);
	}
	
	/*
	private pointcut valueAddedToEnabledNodeActivityNodeActivationList(ActivityNodeActivationList list) : call (void ActivityNodeActivationList.addValue(*))  && target(list) && withincode (void ActivityNodeActivationGroup.run(ActivityNodeActivationList)) && if(ExecutionContext.getInstance().isDebugMode());
	
	after(ActivityNodeActivationList list) : valueAddedToEnabledNodeActivityNodeActivationList(list) {		
		System.out.println("VALUE ADD within ActivityNodeActivationGroup.run() DETECTED");
		System.out.println("new item: " + list.get(list.size()-1).node.toString());		
	}	
	*/
	
	/*
	 * Stops the ActivityNodeActivationGroup from sending offers to the enabled nodes
	 * and stores the enabled nodes
	 */	
	private pointcut debugActivityNodeActivationGroupReceiveOfferEnabledNode(ActivityNodeActivation activation) : call (void ActivityNodeActivation.receiveOffer()) && target(activation) && withincode (void ActivityNodeActivationGroup.run(ActivityNodeActivationList)) && if(ExecutionContext.getInstance().isDebugMode());
	
	void around(ActivityNodeActivation activation) : debugActivityNodeActivationGroupReceiveOfferEnabledNode(activation) {	
		ExecutionContext.getInstance().addEnabledActivityNodeActivation(activation);
	}
	
	private pointcut debugExecutorDestroy() : call (void ExtensionalValue.destroy()) && withincode(ParameterValueList Executor.execute(Behavior, Object_, ParameterValueList));
	
	void around() : debugExecutorDestroy() {
	}
	
	/*
	private pointcut valueAddedToActivityNodeActivationList(ActivityNodeActivationList list) : execution (void ActivityNodeActivationList.addValue(*))  && target(list) && cflow (execution(void ActivityNodeActivationGroup.run(ActivityNodeActivationList)));
	
	after(ActivityNodeActivationList list) : valueAddedToActivityNodeActivationList(list) {
		IsEnabledStartNodeEvent event = new IsEnabledStartNodeEventImpl(list.get(list.size()-1).node);
		eventprovider.notifyEventListener(event);
	}

	private pointcut activityNodeReceiveOffer(ActivityNodeActivation activation) : execution (void ActivityNodeActivation.receiveOffer()) && target(activation);
	
	before(ActivityNodeActivation activation) : activityNodeReceiveOffer(activation) {		
		ReceiveOfferEvent event = new ReceiveOfferEventImpl(activation.node);
		eventprovider.notifyEventListener(event);
	}
	*/
	
	
}

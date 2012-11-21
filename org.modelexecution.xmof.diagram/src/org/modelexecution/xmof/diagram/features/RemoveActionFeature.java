/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package org.modelexecution.xmof.diagram.features;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.impl.RemoveContext;
import org.eclipse.graphiti.features.impl.DefaultRemoveFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.Action;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.InputPin;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.OutputPin;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.Pin;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityEdge;

public class RemoveActionFeature extends DefaultRemoveFeature {

	public RemoveActionFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public void remove(IRemoveContext context) {
		removePins(context);
		super.remove(context);
	}

	private void removePins(IRemoveContext context) {
		EList<EObject> actions = context.getPictogramElement().getLink()
				.getBusinessObjects();
		for (EObject eObject : actions) {
			if (eObject instanceof Action) {
				Action action = (Action) eObject;
				removeEdges(action.getIncoming());
				removeEdges(action.getOutgoing());
				removeOutputPins(action.getOutput());
				removeInputPins(action.getInput());
			}
		}
	}

	private void removeInputPins(EList<InputPin> inputPins) {
		for (InputPin inputPin : new BasicEList<InputPin>(inputPins)) {
			removeEdges(inputPin.getIncoming());
			removeEdges(inputPin.getOutgoing());
			PictogramElement pinShape = getPinShape(inputPin);
			remove(pinShape);
		}
	}

	private void removeOutputPins(EList<OutputPin> outputPins) {
		for (OutputPin outputPin : new BasicEList<OutputPin>(outputPins)) {
			removeEdges(outputPin.getIncoming());
			removeEdges(outputPin.getOutgoing());
			PictogramElement pinShape = getPinShape(outputPin);
			remove(pinShape);
		}
	}

	private PictogramElement getPinShape(Pin pin) {
		return getFeatureProvider().getPictogramElementForBusinessObject(pin);
	}

	private void remove(PictogramElement pictogramElement) {
		IRemoveContext removeContext = new RemoveContext(pictogramElement);
		IRemoveFeature removeFeature = getFeatureProvider().getRemoveFeature(
				removeContext);
		if (removeFeature != null) {
			removeFeature.remove(removeContext);
		}
	}

	private void removeEdges(EList<ActivityEdge> edges) {
		for (ActivityEdge edge : new BasicEList<ActivityEdge>(edges)) {
			remove(getEdgeConnection(edge));
		}
	}

	private PictogramElement getEdgeConnection(ActivityEdge edge) {
		return getFeatureProvider().getPictogramElementForBusinessObject(edge);
	}

}

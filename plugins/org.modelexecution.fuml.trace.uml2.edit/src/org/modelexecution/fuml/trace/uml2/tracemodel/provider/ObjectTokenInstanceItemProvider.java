/**
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tanja Mayerhofer - initial API and implementation
 */
package org.modelexecution.fuml.trace.uml2.tracemodel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.modelexecution.fuml.trace.uml2.tracemodel.ActionExecution;
import org.modelexecution.fuml.trace.uml2.tracemodel.ActivityExecution;
import org.modelexecution.fuml.trace.uml2.tracemodel.InputParameterSetting;
import org.modelexecution.fuml.trace.uml2.tracemodel.InputParameterValue;
import org.modelexecution.fuml.trace.uml2.tracemodel.ObjectTokenInstance;
import org.modelexecution.fuml.trace.uml2.tracemodel.Output;
import org.modelexecution.fuml.trace.uml2.tracemodel.OutputValue;
import org.modelexecution.fuml.trace.uml2.tracemodel.TracemodelPackage;

/**
 * This is the item provider adapter for a {@link org.modelexecution.fuml.trace.uml2.tracemodel.ObjectTokenInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectTokenInstanceItemProvider extends TokenInstanceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTokenInstanceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTransportedValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Transported Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransportedValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectTokenInstance_transportedValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectTokenInstance_transportedValue_feature", "_UI_ObjectTokenInstance_type"),
				 TracemodelPackage.Literals.OBJECT_TOKEN_INSTANCE__TRANSPORTED_VALUE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns ObjectTokenInstance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ObjectTokenInstance"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String objectTokenString = "";
		ObjectTokenInstance objectTokenInstance = (ObjectTokenInstance) object;
		EObject eContainer = objectTokenInstance.eContainer();
		if (eContainer instanceof InputParameterValue) {
			objectTokenString += getObjectTokenIdString((InputParameterValue)eContainer, objectTokenInstance);
		} else if (eContainer instanceof OutputValue) {
			objectTokenString += getObjectTokenIdString((OutputValue)eContainer, objectTokenInstance);
		}
		return getString("_UI_ObjectTokenInstance_type") + " " + objectTokenString;
	}	
	
	private String getObjectTokenIdString(OutputValue outputValue, ObjectTokenInstance objectTokenInstance) {
		Output output = (Output)outputValue.eContainer();
		ActionExecution actionExecution = (ActionExecution)output.eContainer();
		
		int indexOfObjectToken = output.getOutputValues().indexOf(outputValue);
		String activityNodeIdText = TraceElementTextUtil.getActivityNodeIdText(actionExecution);
		String outputString = TraceElementTextUtil.getTraceElementString(output);
		return "ot" + indexOfObjectToken + " provided by " + getString("_UI_ActionExecution_type") + " " + activityNodeIdText + " through " + outputString;
	}
	
	private String getObjectTokenIdString(InputParameterValue inputParameterValue, ObjectTokenInstance objectTokenInstance) {
		InputParameterSetting inputParameterSetting = (InputParameterSetting)inputParameterValue.eContainer();
		ActivityExecution activityExecution = (ActivityExecution)inputParameterSetting.eContainer();
		
		int indexOfObjectToken = inputParameterSetting.getParameterValues().indexOf(inputParameterSetting);
		String activityIdText = "" + activityExecution.getActivityExecutionID();
		String inputParameterSettingString = TraceElementTextUtil.getTraceElementString(inputParameterSetting);
		return "ot" + indexOfObjectToken + " provided by " + getString("_UI_ActivityExecution_type") + " " + activityIdText + " through " + inputParameterSettingString;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}

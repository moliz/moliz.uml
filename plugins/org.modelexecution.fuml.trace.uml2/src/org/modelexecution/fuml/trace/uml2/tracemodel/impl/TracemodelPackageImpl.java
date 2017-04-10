/**
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tanja Mayerhofer - initial API and implementation
 */
package org.modelexecution.fuml.trace.uml2.tracemodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.uml.UMLPackage;
import org.modelexecution.fuml.trace.uml2.fuml.Semantics.Classes.Kernel.KernelPackage;
import org.modelexecution.fuml.trace.uml2.tracemodel.ActionExecution;
import org.modelexecution.fuml.trace.uml2.tracemodel.ActivityExecution;
import org.modelexecution.fuml.trace.uml2.tracemodel.ActivityNodeExecution;
import org.modelexecution.fuml.trace.uml2.tracemodel.CallActionExecution;
import org.modelexecution.fuml.trace.uml2.tracemodel.ControlNodeExecution;
import org.modelexecution.fuml.trace.uml2.tracemodel.ControlTokenInstance;
import org.modelexecution.fuml.trace.uml2.tracemodel.DecisionNodeExecution;
import org.modelexecution.fuml.trace.uml2.tracemodel.ExpansionInput;
import org.modelexecution.fuml.trace.uml2.tracemodel.ExpansionRegionExecution;
import org.modelexecution.fuml.trace.uml2.tracemodel.InitialNodeExecution;
import org.modelexecution.fuml.trace.uml2.tracemodel.Input;
import org.modelexecution.fuml.trace.uml2.tracemodel.InputOutputValue;
import org.modelexecution.fuml.trace.uml2.tracemodel.InputParameterSetting;
import org.modelexecution.fuml.trace.uml2.tracemodel.InputParameterValue;
import org.modelexecution.fuml.trace.uml2.tracemodel.InputValue;
import org.modelexecution.fuml.trace.uml2.tracemodel.ObjectTokenInstance;
import org.modelexecution.fuml.trace.uml2.tracemodel.Output;
import org.modelexecution.fuml.trace.uml2.tracemodel.OutputParameterSetting;
import org.modelexecution.fuml.trace.uml2.tracemodel.OutputParameterValue;
import org.modelexecution.fuml.trace.uml2.tracemodel.OutputValue;
import org.modelexecution.fuml.trace.uml2.tracemodel.ParameterSetting;
import org.modelexecution.fuml.trace.uml2.tracemodel.ParameterValue;
import org.modelexecution.fuml.trace.uml2.tracemodel.StructuredActivityNodeExecution;
import org.modelexecution.fuml.trace.uml2.tracemodel.TokenInstance;
import org.modelexecution.fuml.trace.uml2.tracemodel.Trace;
import org.modelexecution.fuml.trace.uml2.tracemodel.TracemodelFactory;
import org.modelexecution.fuml.trace.uml2.tracemodel.TracemodelPackage;
import org.modelexecution.fuml.trace.uml2.tracemodel.ValueInstance;
import org.modelexecution.fuml.trace.uml2.tracemodel.ValueSnapshot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TracemodelPackageImpl extends EPackageImpl implements TracemodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callActionExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterSettingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTokenInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTokenInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlNodeExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSnapshotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredActivityNodeExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputParameterValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputParameterSettingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputParameterSettingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputParameterValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionRegionExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputOutputValueEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.modelexecution.fuml.trace.uml2.tracemodel.TracemodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TracemodelPackageImpl() {
		super(eNS_URI, TracemodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TracemodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TracemodelPackage init() {
		if (isInited) return (TracemodelPackage)EPackage.Registry.INSTANCE.getEPackage(TracemodelPackage.eNS_URI);

		// Obtain or create and register package
		TracemodelPackageImpl theTracemodelPackage = (TracemodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TracemodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TracemodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		KernelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTracemodelPackage.createPackageContents();

		// Initialize created meta-data
		theTracemodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTracemodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TracemodelPackage.eNS_URI, theTracemodelPackage);
		return theTracemodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_ActivityExecutions() {
		return (EReference)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_ValueInstances() {
		return (EReference)traceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_InitialLocusValueInstances() {
		return (EReference)traceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_RuntimeValues() {
		return (EReference)traceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityExecution() {
		return activityExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityExecution_ActivityInputs() {
		return (EReference)activityExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityExecution_NodeExecutions() {
		return (EReference)activityExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityExecution_Caller() {
		return (EReference)activityExecutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityExecution_Activity() {
		return (EReference)activityExecutionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityExecution_ActivityExecutionID() {
		return (EAttribute)activityExecutionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityExecution_Trace() {
		return (EReference)activityExecutionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityExecution_ActivityOutputs() {
		return (EReference)activityExecutionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityExecution_ContextValueSnapshot() {
		return (EReference)activityExecutionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeExecution() {
		return activityNodeExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeExecution_LogicalSuccessor() {
		return (EReference)activityNodeExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeExecution_LogicalPredecessor() {
		return (EReference)activityNodeExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeExecution_ChronologicalSuccessor() {
		return (EReference)activityNodeExecutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeExecution_ChronologicalPredecessor() {
		return (EReference)activityNodeExecutionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeExecution_Node() {
		return (EReference)activityNodeExecutionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeExecution_ActivityExecution() {
		return (EReference)activityNodeExecutionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityNodeExecution_Executed() {
		return (EAttribute)activityNodeExecutionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityNodeExecution_UnderExecution() {
		return (EAttribute)activityNodeExecutionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallActionExecution() {
		return callActionExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallActionExecution_Callee() {
		return (EReference)callActionExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterSetting() {
		return parameterSettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterSetting_Parameter() {
		return (EReference)parameterSettingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_InputPin() {
		return (EReference)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_InputValues() {
		return (EReference)inputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutput_OutputPin() {
		return (EReference)outputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutput_OutputValues() {
		return (EReference)outputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenInstance() {
		return tokenInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenInstance_TraversedEdges() {
		return (EReference)tokenInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectTokenInstance() {
		return objectTokenInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectTokenInstance_TransportedValue() {
		return (EReference)objectTokenInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlTokenInstance() {
		return controlTokenInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionExecution() {
		return actionExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionExecution_Inputs() {
		return (EReference)actionExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionExecution_Outputs() {
		return (EReference)actionExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionExecution_IncomingControl() {
		return (EReference)actionExecutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionExecution_OutgoingControl() {
		return (EReference)actionExecutionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlNodeExecution() {
		return controlNodeExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlNodeExecution_RoutedTokens() {
		return (EReference)controlNodeExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueInstance() {
		return valueInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueInstance_RuntimeValue() {
		return (EReference)valueInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueInstance_Snapshots() {
		return (EReference)valueInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueInstance_Original() {
		return (EReference)valueInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueInstance_Creator() {
		return (EReference)valueInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueInstance_Destroyer() {
		return (EReference)valueInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSnapshot() {
		return valueSnapshotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSnapshot_Value() {
		return (EReference)valueSnapshotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSnapshot_ValueInstance() {
		return (EReference)valueSnapshotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNodeExecution() {
		return decisionNodeExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionNodeExecution_DecisionInputValue() {
		return (EReference)decisionNodeExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredActivityNodeExecution() {
		return structuredActivityNodeExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredActivityNodeExecution_NestedNodeExecutions() {
		return (EReference)structuredActivityNodeExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputValue() {
		return inputValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValue_InputObjectToken() {
		return (EReference)inputValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputValue() {
		return outputValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputValue_OutputObjectToken() {
		return (EReference)outputValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputParameterValue() {
		return inputParameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputParameterValue_ParameterInputObjectToken() {
		return (EReference)inputParameterValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputParameterSetting() {
		return inputParameterSettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputParameterSetting_ParameterValues() {
		return (EReference)inputParameterSettingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputParameterSetting() {
		return outputParameterSettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputParameterSetting_ParameterValues() {
		return (EReference)outputParameterSettingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputParameterValue() {
		return outputParameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputParameterValue_ParameterOutputObjectToken() {
		return (EReference)outputParameterValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNodeExecution() {
		return initialNodeExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialNodeExecution_OutgoingControl() {
		return (EReference)initialNodeExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterValue() {
		return parameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_ValueSnapshot() {
		return (EReference)parameterValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpansionInput() {
		return expansionInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionInput_ExpansionInputValues() {
		return (EReference)expansionInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionInput_ExpansionNode() {
		return (EReference)expansionInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpansionRegionExecution() {
		return expansionRegionExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionRegionExecution_ExpansionInputs() {
		return (EReference)expansionRegionExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputOutputValue() {
		return inputOutputValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputOutputValue_ValueSnapshot() {
		return (EReference)inputOutputValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracemodelFactory getTracemodelFactory() {
		return (TracemodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		traceEClass = createEClass(TRACE);
		createEReference(traceEClass, TRACE__ACTIVITY_EXECUTIONS);
		createEReference(traceEClass, TRACE__VALUE_INSTANCES);
		createEReference(traceEClass, TRACE__INITIAL_LOCUS_VALUE_INSTANCES);
		createEReference(traceEClass, TRACE__RUNTIME_VALUES);

		activityExecutionEClass = createEClass(ACTIVITY_EXECUTION);
		createEReference(activityExecutionEClass, ACTIVITY_EXECUTION__ACTIVITY_INPUTS);
		createEReference(activityExecutionEClass, ACTIVITY_EXECUTION__NODE_EXECUTIONS);
		createEReference(activityExecutionEClass, ACTIVITY_EXECUTION__CALLER);
		createEReference(activityExecutionEClass, ACTIVITY_EXECUTION__ACTIVITY);
		createEAttribute(activityExecutionEClass, ACTIVITY_EXECUTION__ACTIVITY_EXECUTION_ID);
		createEReference(activityExecutionEClass, ACTIVITY_EXECUTION__TRACE);
		createEReference(activityExecutionEClass, ACTIVITY_EXECUTION__ACTIVITY_OUTPUTS);
		createEReference(activityExecutionEClass, ACTIVITY_EXECUTION__CONTEXT_VALUE_SNAPSHOT);

		activityNodeExecutionEClass = createEClass(ACTIVITY_NODE_EXECUTION);
		createEReference(activityNodeExecutionEClass, ACTIVITY_NODE_EXECUTION__LOGICAL_SUCCESSOR);
		createEReference(activityNodeExecutionEClass, ACTIVITY_NODE_EXECUTION__LOGICAL_PREDECESSOR);
		createEReference(activityNodeExecutionEClass, ACTIVITY_NODE_EXECUTION__CHRONOLOGICAL_SUCCESSOR);
		createEReference(activityNodeExecutionEClass, ACTIVITY_NODE_EXECUTION__CHRONOLOGICAL_PREDECESSOR);
		createEReference(activityNodeExecutionEClass, ACTIVITY_NODE_EXECUTION__NODE);
		createEReference(activityNodeExecutionEClass, ACTIVITY_NODE_EXECUTION__ACTIVITY_EXECUTION);
		createEAttribute(activityNodeExecutionEClass, ACTIVITY_NODE_EXECUTION__EXECUTED);
		createEAttribute(activityNodeExecutionEClass, ACTIVITY_NODE_EXECUTION__UNDER_EXECUTION);

		callActionExecutionEClass = createEClass(CALL_ACTION_EXECUTION);
		createEReference(callActionExecutionEClass, CALL_ACTION_EXECUTION__CALLEE);

		parameterSettingEClass = createEClass(PARAMETER_SETTING);
		createEReference(parameterSettingEClass, PARAMETER_SETTING__PARAMETER);

		inputEClass = createEClass(INPUT);
		createEReference(inputEClass, INPUT__INPUT_PIN);
		createEReference(inputEClass, INPUT__INPUT_VALUES);

		outputEClass = createEClass(OUTPUT);
		createEReference(outputEClass, OUTPUT__OUTPUT_PIN);
		createEReference(outputEClass, OUTPUT__OUTPUT_VALUES);

		tokenInstanceEClass = createEClass(TOKEN_INSTANCE);
		createEReference(tokenInstanceEClass, TOKEN_INSTANCE__TRAVERSED_EDGES);

		objectTokenInstanceEClass = createEClass(OBJECT_TOKEN_INSTANCE);
		createEReference(objectTokenInstanceEClass, OBJECT_TOKEN_INSTANCE__TRANSPORTED_VALUE);

		controlTokenInstanceEClass = createEClass(CONTROL_TOKEN_INSTANCE);

		actionExecutionEClass = createEClass(ACTION_EXECUTION);
		createEReference(actionExecutionEClass, ACTION_EXECUTION__INPUTS);
		createEReference(actionExecutionEClass, ACTION_EXECUTION__OUTPUTS);
		createEReference(actionExecutionEClass, ACTION_EXECUTION__INCOMING_CONTROL);
		createEReference(actionExecutionEClass, ACTION_EXECUTION__OUTGOING_CONTROL);

		controlNodeExecutionEClass = createEClass(CONTROL_NODE_EXECUTION);
		createEReference(controlNodeExecutionEClass, CONTROL_NODE_EXECUTION__ROUTED_TOKENS);

		valueInstanceEClass = createEClass(VALUE_INSTANCE);
		createEReference(valueInstanceEClass, VALUE_INSTANCE__RUNTIME_VALUE);
		createEReference(valueInstanceEClass, VALUE_INSTANCE__SNAPSHOTS);
		createEReference(valueInstanceEClass, VALUE_INSTANCE__ORIGINAL);
		createEReference(valueInstanceEClass, VALUE_INSTANCE__CREATOR);
		createEReference(valueInstanceEClass, VALUE_INSTANCE__DESTROYER);

		valueSnapshotEClass = createEClass(VALUE_SNAPSHOT);
		createEReference(valueSnapshotEClass, VALUE_SNAPSHOT__VALUE);
		createEReference(valueSnapshotEClass, VALUE_SNAPSHOT__VALUE_INSTANCE);

		decisionNodeExecutionEClass = createEClass(DECISION_NODE_EXECUTION);
		createEReference(decisionNodeExecutionEClass, DECISION_NODE_EXECUTION__DECISION_INPUT_VALUE);

		structuredActivityNodeExecutionEClass = createEClass(STRUCTURED_ACTIVITY_NODE_EXECUTION);
		createEReference(structuredActivityNodeExecutionEClass, STRUCTURED_ACTIVITY_NODE_EXECUTION__NESTED_NODE_EXECUTIONS);

		inputValueEClass = createEClass(INPUT_VALUE);
		createEReference(inputValueEClass, INPUT_VALUE__INPUT_OBJECT_TOKEN);

		outputValueEClass = createEClass(OUTPUT_VALUE);
		createEReference(outputValueEClass, OUTPUT_VALUE__OUTPUT_OBJECT_TOKEN);

		inputParameterValueEClass = createEClass(INPUT_PARAMETER_VALUE);
		createEReference(inputParameterValueEClass, INPUT_PARAMETER_VALUE__PARAMETER_INPUT_OBJECT_TOKEN);

		inputParameterSettingEClass = createEClass(INPUT_PARAMETER_SETTING);
		createEReference(inputParameterSettingEClass, INPUT_PARAMETER_SETTING__PARAMETER_VALUES);

		outputParameterSettingEClass = createEClass(OUTPUT_PARAMETER_SETTING);
		createEReference(outputParameterSettingEClass, OUTPUT_PARAMETER_SETTING__PARAMETER_VALUES);

		outputParameterValueEClass = createEClass(OUTPUT_PARAMETER_VALUE);
		createEReference(outputParameterValueEClass, OUTPUT_PARAMETER_VALUE__PARAMETER_OUTPUT_OBJECT_TOKEN);

		initialNodeExecutionEClass = createEClass(INITIAL_NODE_EXECUTION);
		createEReference(initialNodeExecutionEClass, INITIAL_NODE_EXECUTION__OUTGOING_CONTROL);

		parameterValueEClass = createEClass(PARAMETER_VALUE);
		createEReference(parameterValueEClass, PARAMETER_VALUE__VALUE_SNAPSHOT);

		expansionInputEClass = createEClass(EXPANSION_INPUT);
		createEReference(expansionInputEClass, EXPANSION_INPUT__EXPANSION_INPUT_VALUES);
		createEReference(expansionInputEClass, EXPANSION_INPUT__EXPANSION_NODE);

		expansionRegionExecutionEClass = createEClass(EXPANSION_REGION_EXECUTION);
		createEReference(expansionRegionExecutionEClass, EXPANSION_REGION_EXECUTION__EXPANSION_INPUTS);

		inputOutputValueEClass = createEClass(INPUT_OUTPUT_VALUE);
		createEReference(inputOutputValueEClass, INPUT_OUTPUT_VALUE__VALUE_SNAPSHOT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		KernelPackage theKernelPackage = (KernelPackage)EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		callActionExecutionEClass.getESuperTypes().add(this.getActionExecution());
		objectTokenInstanceEClass.getESuperTypes().add(this.getTokenInstance());
		controlTokenInstanceEClass.getESuperTypes().add(this.getTokenInstance());
		actionExecutionEClass.getESuperTypes().add(this.getActivityNodeExecution());
		controlNodeExecutionEClass.getESuperTypes().add(this.getActivityNodeExecution());
		decisionNodeExecutionEClass.getESuperTypes().add(this.getControlNodeExecution());
		structuredActivityNodeExecutionEClass.getESuperTypes().add(this.getActionExecution());
		inputValueEClass.getESuperTypes().add(this.getInputOutputValue());
		outputValueEClass.getESuperTypes().add(this.getInputOutputValue());
		inputParameterValueEClass.getESuperTypes().add(this.getParameterValue());
		inputParameterSettingEClass.getESuperTypes().add(this.getParameterSetting());
		outputParameterSettingEClass.getESuperTypes().add(this.getParameterSetting());
		outputParameterValueEClass.getESuperTypes().add(this.getParameterValue());
		initialNodeExecutionEClass.getESuperTypes().add(this.getControlNodeExecution());
		expansionRegionExecutionEClass.getESuperTypes().add(this.getStructuredActivityNodeExecution());

		// Initialize classes, features, and operations; add parameters
		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_ActivityExecutions(), this.getActivityExecution(), this.getActivityExecution_Trace(), "activityExecutions", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_ValueInstances(), this.getValueInstance(), null, "valueInstances", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_InitialLocusValueInstances(), this.getValueInstance(), null, "initialLocusValueInstances", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_RuntimeValues(), theKernelPackage.getValue(), null, "runtimeValues", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityExecutionEClass, ActivityExecution.class, "ActivityExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityExecution_ActivityInputs(), this.getInputParameterSetting(), null, "activityInputs", null, 0, -1, ActivityExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityExecution_NodeExecutions(), this.getActivityNodeExecution(), this.getActivityNodeExecution_ActivityExecution(), "nodeExecutions", null, 0, -1, ActivityExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityExecution_Caller(), this.getCallActionExecution(), this.getCallActionExecution_Callee(), "caller", null, 0, 1, ActivityExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityExecution_Activity(), theUMLPackage.getActivity(), null, "activity", null, 1, 1, ActivityExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityExecution_ActivityExecutionID(), ecorePackage.getEInt(), "activityExecutionID", null, 1, 1, ActivityExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityExecution_Trace(), this.getTrace(), this.getTrace_ActivityExecutions(), "trace", null, 1, 1, ActivityExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityExecution_ActivityOutputs(), this.getOutputParameterSetting(), null, "activityOutputs", null, 0, -1, ActivityExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityExecution_ContextValueSnapshot(), this.getValueSnapshot(), null, "contextValueSnapshot", null, 0, 1, ActivityExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityNodeExecutionEClass, ActivityNodeExecution.class, "ActivityNodeExecution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNodeExecution_LogicalSuccessor(), this.getActivityNodeExecution(), this.getActivityNodeExecution_LogicalPredecessor(), "logicalSuccessor", null, 0, -1, ActivityNodeExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNodeExecution_LogicalPredecessor(), this.getActivityNodeExecution(), this.getActivityNodeExecution_LogicalSuccessor(), "logicalPredecessor", null, 0, -1, ActivityNodeExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNodeExecution_ChronologicalSuccessor(), this.getActivityNodeExecution(), this.getActivityNodeExecution_ChronologicalPredecessor(), "chronologicalSuccessor", null, 0, 1, ActivityNodeExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNodeExecution_ChronologicalPredecessor(), this.getActivityNodeExecution(), this.getActivityNodeExecution_ChronologicalSuccessor(), "chronologicalPredecessor", null, 0, 1, ActivityNodeExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNodeExecution_Node(), theUMLPackage.getActivityNode(), null, "node", null, 1, 1, ActivityNodeExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNodeExecution_ActivityExecution(), this.getActivityExecution(), this.getActivityExecution_NodeExecutions(), "activityExecution", null, 1, 1, ActivityNodeExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActivityNodeExecution_Executed(), ecorePackage.getEBoolean(), "executed", "false", 1, 1, ActivityNodeExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityNodeExecution_UnderExecution(), ecorePackage.getEBoolean(), "underExecution", null, 1, 1, ActivityNodeExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callActionExecutionEClass, CallActionExecution.class, "CallActionExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallActionExecution_Callee(), this.getActivityExecution(), this.getActivityExecution_Caller(), "callee", null, 0, 1, CallActionExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterSettingEClass, ParameterSetting.class, "ParameterSetting", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterSetting_Parameter(), theUMLPackage.getParameter(), null, "parameter", null, 1, 1, ParameterSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInput_InputPin(), theUMLPackage.getInputPin(), null, "inputPin", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_InputValues(), this.getInputValue(), null, "inputValues", null, 0, -1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutput_OutputPin(), theUMLPackage.getOutputPin(), null, "outputPin", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_OutputValues(), this.getOutputValue(), null, "outputValues", null, 0, -1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenInstanceEClass, TokenInstance.class, "TokenInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTokenInstance_TraversedEdges(), theUMLPackage.getActivityEdge(), null, "traversedEdges", null, 0, -1, TokenInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectTokenInstanceEClass, ObjectTokenInstance.class, "ObjectTokenInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectTokenInstance_TransportedValue(), this.getValueInstance(), null, "transportedValue", null, 1, 1, ObjectTokenInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlTokenInstanceEClass, ControlTokenInstance.class, "ControlTokenInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionExecutionEClass, ActionExecution.class, "ActionExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionExecution_Inputs(), this.getInput(), null, "inputs", null, 0, -1, ActionExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionExecution_Outputs(), this.getOutput(), null, "outputs", null, 0, -1, ActionExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionExecution_IncomingControl(), this.getControlTokenInstance(), null, "incomingControl", null, 0, -1, ActionExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionExecution_OutgoingControl(), this.getControlTokenInstance(), null, "outgoingControl", null, 0, -1, ActionExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlNodeExecutionEClass, ControlNodeExecution.class, "ControlNodeExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlNodeExecution_RoutedTokens(), this.getTokenInstance(), null, "routedTokens", null, 1, -1, ControlNodeExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueInstanceEClass, ValueInstance.class, "ValueInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueInstance_RuntimeValue(), theKernelPackage.getValue(), null, "runtimeValue", null, 1, 1, ValueInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueInstance_Snapshots(), this.getValueSnapshot(), this.getValueSnapshot_ValueInstance(), "snapshots", null, 0, -1, ValueInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueInstance_Original(), this.getValueSnapshot(), null, "original", null, 0, 1, ValueInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueInstance_Creator(), this.getActivityNodeExecution(), null, "creator", null, 0, 1, ValueInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueInstance_Destroyer(), this.getActivityNodeExecution(), null, "destroyer", null, 0, 1, ValueInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueSnapshotEClass, ValueSnapshot.class, "ValueSnapshot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueSnapshot_Value(), theKernelPackage.getValue(), null, "value", null, 1, 1, ValueSnapshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueSnapshot_ValueInstance(), this.getValueInstance(), this.getValueInstance_Snapshots(), "valueInstance", null, 1, 1, ValueSnapshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decisionNodeExecutionEClass, DecisionNodeExecution.class, "DecisionNodeExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecisionNodeExecution_DecisionInputValue(), this.getInputValue(), null, "decisionInputValue", null, 0, 1, DecisionNodeExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuredActivityNodeExecutionEClass, StructuredActivityNodeExecution.class, "StructuredActivityNodeExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredActivityNodeExecution_NestedNodeExecutions(), this.getActivityNodeExecution(), null, "nestedNodeExecutions", null, 0, -1, StructuredActivityNodeExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputValueEClass, InputValue.class, "InputValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputValue_InputObjectToken(), this.getObjectTokenInstance(), null, "inputObjectToken", null, 1, 1, InputValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputValueEClass, OutputValue.class, "OutputValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputValue_OutputObjectToken(), this.getObjectTokenInstance(), null, "outputObjectToken", null, 1, 1, OutputValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputParameterValueEClass, InputParameterValue.class, "InputParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputParameterValue_ParameterInputObjectToken(), this.getObjectTokenInstance(), null, "parameterInputObjectToken", null, 1, 1, InputParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputParameterSettingEClass, InputParameterSetting.class, "InputParameterSetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputParameterSetting_ParameterValues(), this.getInputParameterValue(), null, "parameterValues", null, 0, -1, InputParameterSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputParameterSettingEClass, OutputParameterSetting.class, "OutputParameterSetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputParameterSetting_ParameterValues(), this.getOutputParameterValue(), null, "parameterValues", null, 0, -1, OutputParameterSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputParameterValueEClass, OutputParameterValue.class, "OutputParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputParameterValue_ParameterOutputObjectToken(), this.getObjectTokenInstance(), null, "parameterOutputObjectToken", null, 1, 1, OutputParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialNodeExecutionEClass, InitialNodeExecution.class, "InitialNodeExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitialNodeExecution_OutgoingControl(), this.getControlTokenInstance(), null, "outgoingControl", null, 0, 1, InitialNodeExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterValueEClass, ParameterValue.class, "ParameterValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterValue_ValueSnapshot(), this.getValueSnapshot(), null, "valueSnapshot", null, 1, 1, ParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expansionInputEClass, ExpansionInput.class, "ExpansionInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpansionInput_ExpansionInputValues(), this.getInputValue(), null, "expansionInputValues", null, 0, -1, ExpansionInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpansionInput_ExpansionNode(), theUMLPackage.getExpansionNode(), null, "expansionNode", null, 0, 1, ExpansionInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expansionRegionExecutionEClass, ExpansionRegionExecution.class, "ExpansionRegionExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpansionRegionExecution_ExpansionInputs(), this.getExpansionInput(), null, "expansionInputs", null, 0, -1, ExpansionRegionExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputOutputValueEClass, InputOutputValue.class, "InputOutputValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputOutputValue_ValueSnapshot(), this.getValueSnapshot(), null, "valueSnapshot", null, 1, 1, InputOutputValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TracemodelPackageImpl

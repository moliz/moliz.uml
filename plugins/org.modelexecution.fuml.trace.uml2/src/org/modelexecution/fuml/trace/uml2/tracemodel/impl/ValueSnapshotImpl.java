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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.modelexecution.fuml.trace.uml2.fuml.Semantics.Classes.Kernel.Value;

import org.modelexecution.fuml.trace.uml2.tracemodel.TracemodelPackage;
import org.modelexecution.fuml.trace.uml2.tracemodel.ValueInstance;
import org.modelexecution.fuml.trace.uml2.tracemodel.ValueSnapshot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Snapshot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.trace.uml2.tracemodel.impl.ValueSnapshotImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.modelexecution.fuml.trace.uml2.tracemodel.impl.ValueSnapshotImpl#getValueInstance <em>Value Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueSnapshotImpl extends MinimalEObjectImpl.Container implements ValueSnapshot {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Value value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSnapshotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracemodelPackage.Literals.VALUE_SNAPSHOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Value newValue, NotificationChain msgs) {
		Value oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TracemodelPackage.VALUE_SNAPSHOT__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Value newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TracemodelPackage.VALUE_SNAPSHOT__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TracemodelPackage.VALUE_SNAPSHOT__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracemodelPackage.VALUE_SNAPSHOT__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueInstance getValueInstance() {
		if (eContainerFeatureID() != TracemodelPackage.VALUE_SNAPSHOT__VALUE_INSTANCE) return null;
		return (ValueInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueInstance(ValueInstance newValueInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newValueInstance, TracemodelPackage.VALUE_SNAPSHOT__VALUE_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueInstance(ValueInstance newValueInstance) {
		if (newValueInstance != eInternalContainer() || (eContainerFeatureID() != TracemodelPackage.VALUE_SNAPSHOT__VALUE_INSTANCE && newValueInstance != null)) {
			if (EcoreUtil.isAncestor(this, newValueInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newValueInstance != null)
				msgs = ((InternalEObject)newValueInstance).eInverseAdd(this, TracemodelPackage.VALUE_INSTANCE__SNAPSHOTS, ValueInstance.class, msgs);
			msgs = basicSetValueInstance(newValueInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracemodelPackage.VALUE_SNAPSHOT__VALUE_INSTANCE, newValueInstance, newValueInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracemodelPackage.VALUE_SNAPSHOT__VALUE_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetValueInstance((ValueInstance)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracemodelPackage.VALUE_SNAPSHOT__VALUE:
				return basicSetValue(null, msgs);
			case TracemodelPackage.VALUE_SNAPSHOT__VALUE_INSTANCE:
				return basicSetValueInstance(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TracemodelPackage.VALUE_SNAPSHOT__VALUE_INSTANCE:
				return eInternalContainer().eInverseRemove(this, TracemodelPackage.VALUE_INSTANCE__SNAPSHOTS, ValueInstance.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracemodelPackage.VALUE_SNAPSHOT__VALUE:
				return getValue();
			case TracemodelPackage.VALUE_SNAPSHOT__VALUE_INSTANCE:
				return getValueInstance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TracemodelPackage.VALUE_SNAPSHOT__VALUE:
				setValue((Value)newValue);
				return;
			case TracemodelPackage.VALUE_SNAPSHOT__VALUE_INSTANCE:
				setValueInstance((ValueInstance)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TracemodelPackage.VALUE_SNAPSHOT__VALUE:
				setValue((Value)null);
				return;
			case TracemodelPackage.VALUE_SNAPSHOT__VALUE_INSTANCE:
				setValueInstance((ValueInstance)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TracemodelPackage.VALUE_SNAPSHOT__VALUE:
				return value != null;
			case TracemodelPackage.VALUE_SNAPSHOT__VALUE_INSTANCE:
				return getValueInstance() != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueSnapshotImpl

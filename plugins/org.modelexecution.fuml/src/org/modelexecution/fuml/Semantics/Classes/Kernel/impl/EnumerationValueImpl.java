/**
 */
package org.modelexecution.fuml.Semantics.Classes.Kernel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.modelexecution.fuml.Semantics.Classes.Kernel.EnumerationValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Enumeration;
import org.modelexecution.fuml.Syntax.Classes.Kernel.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.EnumerationValueImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.EnumerationValueImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationValueImpl extends ValueImpl implements EnumerationValue {
	/**
	 * The cached value of the '{@link #getLiteral() <em>Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected EnumerationLiteral literal;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Enumeration type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.ENUMERATION_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getLiteral() {
		if (literal != null && literal.eIsProxy()) {
			InternalEObject oldLiteral = (InternalEObject)literal;
			literal = (EnumerationLiteral)eResolveProxy(oldLiteral);
			if (literal != oldLiteral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KernelPackage.ENUMERATION_VALUE__LITERAL, oldLiteral, literal));
			}
		}
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral basicGetLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteral(EnumerationLiteral newLiteral) {
		EnumerationLiteral oldLiteral = literal;
		literal = newLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.ENUMERATION_VALUE__LITERAL, oldLiteral, literal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Enumeration)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KernelPackage.ENUMERATION_VALUE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Enumeration newType) {
		Enumeration oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.ENUMERATION_VALUE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KernelPackage.ENUMERATION_VALUE__LITERAL:
				if (resolve) return getLiteral();
				return basicGetLiteral();
			case KernelPackage.ENUMERATION_VALUE__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case KernelPackage.ENUMERATION_VALUE__LITERAL:
				setLiteral((EnumerationLiteral)newValue);
				return;
			case KernelPackage.ENUMERATION_VALUE__TYPE:
				setType((Enumeration)newValue);
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
			case KernelPackage.ENUMERATION_VALUE__LITERAL:
				setLiteral((EnumerationLiteral)null);
				return;
			case KernelPackage.ENUMERATION_VALUE__TYPE:
				setType((Enumeration)null);
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
			case KernelPackage.ENUMERATION_VALUE__LITERAL:
				return literal != null;
			case KernelPackage.ENUMERATION_VALUE__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumerationValueImpl

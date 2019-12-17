/**
 */
package com.copy.zenhtt_model.impl;

import com.copy.zenhtt_model.Person;
import com.copy.zenhtt_model.Zenhtt_modelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.copy.zenhtt_model.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.impl.PersonImpl#isLandlord <em>Landlord</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.impl.PersonImpl#isTenant <em>Tenant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends EntityImpl implements Person {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isLandlord() <em>Landlord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLandlord()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LANDLORD_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isLandlord() <em>Landlord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLandlord()
	 * @generated
	 * @ordered
	 */
	protected boolean landlord = LANDLORD_EDEFAULT;

	/**
	 * The default value of the '{@link #isTenant() <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTenant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TENANT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isTenant() <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTenant()
	 * @generated
	 * @ordered
	 */
	protected boolean tenant = TENANT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Zenhtt_modelPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Zenhtt_modelPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLandlord() {
		return landlord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLandlord(boolean newLandlord) {
		boolean oldLandlord = landlord;
		landlord = newLandlord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Zenhtt_modelPackage.PERSON__LANDLORD, oldLandlord,
					landlord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTenant() {
		return tenant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTenant(boolean newTenant) {
		boolean oldTenant = tenant;
		tenant = newTenant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Zenhtt_modelPackage.PERSON__TENANT, oldTenant,
					tenant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Zenhtt_modelPackage.PERSON__NAME:
			return getName();
		case Zenhtt_modelPackage.PERSON__LANDLORD:
			return isLandlord();
		case Zenhtt_modelPackage.PERSON__TENANT:
			return isTenant();
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
		case Zenhtt_modelPackage.PERSON__NAME:
			setName((String) newValue);
			return;
		case Zenhtt_modelPackage.PERSON__LANDLORD:
			setLandlord((Boolean) newValue);
			return;
		case Zenhtt_modelPackage.PERSON__TENANT:
			setTenant((Boolean) newValue);
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
		case Zenhtt_modelPackage.PERSON__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Zenhtt_modelPackage.PERSON__LANDLORD:
			setLandlord(LANDLORD_EDEFAULT);
			return;
		case Zenhtt_modelPackage.PERSON__TENANT:
			setTenant(TENANT_EDEFAULT);
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
		case Zenhtt_modelPackage.PERSON__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Zenhtt_modelPackage.PERSON__LANDLORD:
			return landlord != LANDLORD_EDEFAULT;
		case Zenhtt_modelPackage.PERSON__TENANT:
			return tenant != TENANT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", landlord: ");
		result.append(landlord);
		result.append(", tenant: ");
		result.append(tenant);
		result.append(')');
		return result.toString();
	}

} //PersonImpl

/**
 */
package com.copy.zenhtt_model.impl;

import com.copy.zenhtt_model.Asset;
import com.copy.zenhtt_model.Person;
import com.copy.zenhtt_model.RentalContract;
import com.copy.zenhtt_model.Zenhtt_modelPackage;

import java.sql.Timestamp;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rental Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.copy.zenhtt_model.impl.RentalContractImpl#getLandlord <em>Landlord</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.impl.RentalContractImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.impl.RentalContractImpl#getTenants <em>Tenants</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.impl.RentalContractImpl#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.impl.RentalContractImpl#getValidUntil <em>Valid Until</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.impl.RentalContractImpl#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RentalContractImpl extends EntityImpl implements RentalContract {
	/**
	 * The cached value of the '{@link #getLandlord() <em>Landlord</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandlord()
	 * @generated
	 * @ordered
	 */
	protected Person landlord;

	/**
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> assets;

	/**
	 * The cached value of the '{@link #getTenants() <em>Tenants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenants()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> tenants;

	/**
	 * The default value of the '{@link #getValidFrom() <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFrom()
	 * @generated
	 * @ordered
	 */
	protected static final Timestamp VALID_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidFrom() <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFrom()
	 * @generated
	 * @ordered
	 */
	protected Timestamp validFrom = new Timestamp(System.currentTimeMillis());

	/**
	 * The default value of the '{@link #getValidUntil() <em>Valid Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidUntil()
	 * @generated
	 * @ordered
	 */
	protected static final Timestamp VALID_UNTIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidUntil() <em>Valid Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidUntil()
	 * @generated
	 * @ordered
	 */
	protected Timestamp validUntil = new Timestamp(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(365));

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected String number = NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RentalContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Zenhtt_modelPackage.Literals.RENTAL_CONTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getLandlord() {
		if (landlord != null && landlord.eIsProxy()) {
			InternalEObject oldLandlord = (InternalEObject) landlord;
			landlord = (Person) eResolveProxy(oldLandlord);
			if (landlord != oldLandlord) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Zenhtt_modelPackage.RENTAL_CONTRACT__LANDLORD, oldLandlord, landlord));
			}
		}
		return landlord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetLandlord() {
		return landlord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLandlord(Person newLandlord) {
		Person oldLandlord = landlord;
		landlord = newLandlord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Zenhtt_modelPackage.RENTAL_CONTRACT__LANDLORD,
					oldLandlord, landlord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new EObjectResolvingEList<Asset>(Asset.class, this, Zenhtt_modelPackage.RENTAL_CONTRACT__ASSETS);
		}
		return assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getTenants() {
		if (tenants == null) {
			tenants = new EObjectResolvingEList<Person>(Person.class, this,
					Zenhtt_modelPackage.RENTAL_CONTRACT__TENANTS);
		}
		return tenants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timestamp getValidFrom() {
		return validFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidFrom(Timestamp newValidFrom) {
		Timestamp oldValidFrom = validFrom;
		validFrom = newValidFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Zenhtt_modelPackage.RENTAL_CONTRACT__VALID_FROM,
					oldValidFrom, validFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timestamp getValidUntil() {
		return validUntil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidUntil(Timestamp newValidUntil) {
		Timestamp oldValidUntil = validUntil;
		validUntil = newValidUntil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Zenhtt_modelPackage.RENTAL_CONTRACT__VALID_UNTIL,
					oldValidUntil, validUntil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber(String newNumber) {
		String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Zenhtt_modelPackage.RENTAL_CONTRACT__NUMBER,
					oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Zenhtt_modelPackage.RENTAL_CONTRACT__LANDLORD:
			if (resolve)
				return getLandlord();
			return basicGetLandlord();
		case Zenhtt_modelPackage.RENTAL_CONTRACT__ASSETS:
			return getAssets();
		case Zenhtt_modelPackage.RENTAL_CONTRACT__TENANTS:
			return getTenants();
		case Zenhtt_modelPackage.RENTAL_CONTRACT__VALID_FROM:
			return getValidFrom();
		case Zenhtt_modelPackage.RENTAL_CONTRACT__VALID_UNTIL:
			return getValidUntil();
		case Zenhtt_modelPackage.RENTAL_CONTRACT__NUMBER:
			return getNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Zenhtt_modelPackage.RENTAL_CONTRACT__LANDLORD:
			setLandlord((Person) newValue);
			return;
		case Zenhtt_modelPackage.RENTAL_CONTRACT__ASSETS:
			getAssets().clear();
			getAssets().addAll((Collection<? extends Asset>) newValue);
			return;
		case Zenhtt_modelPackage.RENTAL_CONTRACT__TENANTS:
			getTenants().clear();
			getTenants().addAll((Collection<? extends Person>) newValue);
			return;
		case Zenhtt_modelPackage.RENTAL_CONTRACT__VALID_FROM:
			setValidFrom((Timestamp) newValue);
			return;
		case Zenhtt_modelPackage.RENTAL_CONTRACT__VALID_UNTIL:
			setValidUntil((Timestamp) newValue);
			return;
		case Zenhtt_modelPackage.RENTAL_CONTRACT__NUMBER:
			setNumber((String) newValue);
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
		case Zenhtt_modelPackage.RENTAL_CONTRACT__LANDLORD:
			setLandlord((Person) null);
			return;
		case Zenhtt_modelPackage.RENTAL_CONTRACT__ASSETS:
			getAssets().clear();
			return;
		case Zenhtt_modelPackage.RENTAL_CONTRACT__TENANTS:
			getTenants().clear();
			return;
		case Zenhtt_modelPackage.RENTAL_CONTRACT__VALID_FROM:
			setValidFrom(VALID_FROM_EDEFAULT);
			return;
		case Zenhtt_modelPackage.RENTAL_CONTRACT__VALID_UNTIL:
			setValidUntil(VALID_UNTIL_EDEFAULT);
			return;
		case Zenhtt_modelPackage.RENTAL_CONTRACT__NUMBER:
			setNumber(NUMBER_EDEFAULT);
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
		case Zenhtt_modelPackage.RENTAL_CONTRACT__LANDLORD:
			return landlord != null;
		case Zenhtt_modelPackage.RENTAL_CONTRACT__ASSETS:
			return assets != null && !assets.isEmpty();
		case Zenhtt_modelPackage.RENTAL_CONTRACT__TENANTS:
			return tenants != null && !tenants.isEmpty();
		case Zenhtt_modelPackage.RENTAL_CONTRACT__VALID_FROM:
			return VALID_FROM_EDEFAULT == null ? validFrom != null : !VALID_FROM_EDEFAULT.equals(validFrom);
		case Zenhtt_modelPackage.RENTAL_CONTRACT__VALID_UNTIL:
			return VALID_UNTIL_EDEFAULT == null ? validUntil != null : !VALID_UNTIL_EDEFAULT.equals(validUntil);
		case Zenhtt_modelPackage.RENTAL_CONTRACT__NUMBER:
			return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
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
		result.append(" (validFrom: ");
		result.append(validFrom);
		result.append(", validUntil: ");
		result.append(validUntil);
		result.append(", number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //RentalContractImpl

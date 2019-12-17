/**
 */
package com.copy.zenhtt_model.impl;

import com.copy.zenhtt_model.Asset;
import com.copy.zenhtt_model.AssetType;
import com.copy.zenhtt_model.Domain;
import com.copy.zenhtt_model.Person;
import com.copy.zenhtt_model.RentalContract;
import com.copy.zenhtt_model.Zenhtt_modelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.copy.zenhtt_model.impl.DomainImpl#getAssetTypes <em>Asset Types</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.impl.DomainImpl#getRentalContracts <em>Rental Contracts</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.impl.DomainImpl#getPeople <em>People</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.impl.DomainImpl#getAssets <em>Assets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends EntityImpl implements Domain {
	/**
	 * The cached value of the '{@link #getAssetTypes() <em>Asset Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetType> assetTypes;

	/**
	 * The cached value of the '{@link #getRentalContracts() <em>Rental Contracts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRentalContracts()
	 * @generated
	 * @ordered
	 */
	protected EList<RentalContract> rentalContracts;

	/**
	 * The cached value of the '{@link #getPeople() <em>People</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeople()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> people;

	/**
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> assets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Zenhtt_modelPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssetType> getAssetTypes() {
		if (assetTypes == null) {
			assetTypes = new EObjectContainmentEList<AssetType>(AssetType.class, this,
					Zenhtt_modelPackage.DOMAIN__ASSET_TYPES);
		}
		return assetTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RentalContract> getRentalContracts() {
		if (rentalContracts == null) {
			rentalContracts = new EObjectContainmentEList<RentalContract>(RentalContract.class, this,
					Zenhtt_modelPackage.DOMAIN__RENTAL_CONTRACTS);
		}
		return rentalContracts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getPeople() {
		if (people == null) {
			people = new EObjectContainmentEList<Person>(Person.class, this, Zenhtt_modelPackage.DOMAIN__PEOPLE);
		}
		return people;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new EObjectContainmentEList<Asset>(Asset.class, this, Zenhtt_modelPackage.DOMAIN__ASSETS);
		}
		return assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Zenhtt_modelPackage.DOMAIN__ASSET_TYPES:
			return ((InternalEList<?>) getAssetTypes()).basicRemove(otherEnd, msgs);
		case Zenhtt_modelPackage.DOMAIN__RENTAL_CONTRACTS:
			return ((InternalEList<?>) getRentalContracts()).basicRemove(otherEnd, msgs);
		case Zenhtt_modelPackage.DOMAIN__PEOPLE:
			return ((InternalEList<?>) getPeople()).basicRemove(otherEnd, msgs);
		case Zenhtt_modelPackage.DOMAIN__ASSETS:
			return ((InternalEList<?>) getAssets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Zenhtt_modelPackage.DOMAIN__ASSET_TYPES:
			return getAssetTypes();
		case Zenhtt_modelPackage.DOMAIN__RENTAL_CONTRACTS:
			return getRentalContracts();
		case Zenhtt_modelPackage.DOMAIN__PEOPLE:
			return getPeople();
		case Zenhtt_modelPackage.DOMAIN__ASSETS:
			return getAssets();
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
		case Zenhtt_modelPackage.DOMAIN__ASSET_TYPES:
			getAssetTypes().clear();
			getAssetTypes().addAll((Collection<? extends AssetType>) newValue);
			return;
		case Zenhtt_modelPackage.DOMAIN__RENTAL_CONTRACTS:
			getRentalContracts().clear();
			getRentalContracts().addAll((Collection<? extends RentalContract>) newValue);
			return;
		case Zenhtt_modelPackage.DOMAIN__PEOPLE:
			getPeople().clear();
			getPeople().addAll((Collection<? extends Person>) newValue);
			return;
		case Zenhtt_modelPackage.DOMAIN__ASSETS:
			getAssets().clear();
			getAssets().addAll((Collection<? extends Asset>) newValue);
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
		case Zenhtt_modelPackage.DOMAIN__ASSET_TYPES:
			getAssetTypes().clear();
			return;
		case Zenhtt_modelPackage.DOMAIN__RENTAL_CONTRACTS:
			getRentalContracts().clear();
			return;
		case Zenhtt_modelPackage.DOMAIN__PEOPLE:
			getPeople().clear();
			return;
		case Zenhtt_modelPackage.DOMAIN__ASSETS:
			getAssets().clear();
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
		case Zenhtt_modelPackage.DOMAIN__ASSET_TYPES:
			return assetTypes != null && !assetTypes.isEmpty();
		case Zenhtt_modelPackage.DOMAIN__RENTAL_CONTRACTS:
			return rentalContracts != null && !rentalContracts.isEmpty();
		case Zenhtt_modelPackage.DOMAIN__PEOPLE:
			return people != null && !people.isEmpty();
		case Zenhtt_modelPackage.DOMAIN__ASSETS:
			return assets != null && !assets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl

/**
 */
package com.copy.zenhtt_model.impl;

import com.copy.zenhtt_model.Asset;
import com.copy.zenhtt_model.AssetType;
import com.copy.zenhtt_model.Zenhtt_modelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.copy.zenhtt_model.impl.AssetImpl#getChildAssets <em>Child Assets</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.impl.AssetImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.impl.AssetImpl#getAssettype <em>Assettype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetImpl extends EntityImpl implements Asset {
	/**
	 * The cached value of the '{@link #getChildAssets() <em>Child Assets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> childAssets;

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
	 * The cached value of the '{@link #getAssettype() <em>Assettype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssettype()
	 * @generated
	 * @ordered
	 */
	protected AssetType assettype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Zenhtt_modelPackage.Literals.ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Asset> getChildAssets() {
		if (childAssets == null) {
			childAssets = new EObjectContainmentEList<Asset>(Asset.class, this,
					Zenhtt_modelPackage.ASSET__CHILD_ASSETS);
		}
		return childAssets;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Zenhtt_modelPackage.ASSET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssetType getAssettype() {
		if (assettype != null && assettype.eIsProxy()) {
			InternalEObject oldAssettype = (InternalEObject) assettype;
			assettype = (AssetType) eResolveProxy(oldAssettype);
			if (assettype != oldAssettype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Zenhtt_modelPackage.ASSET__ASSETTYPE,
							oldAssettype, assettype));
			}
		}
		return assettype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetType basicGetAssettype() {
		return assettype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssettype(AssetType newAssettype) {
		AssetType oldAssettype = assettype;
		assettype = newAssettype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Zenhtt_modelPackage.ASSET__ASSETTYPE, oldAssettype,
					assettype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Zenhtt_modelPackage.ASSET__CHILD_ASSETS:
			return ((InternalEList<?>) getChildAssets()).basicRemove(otherEnd, msgs);
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
		case Zenhtt_modelPackage.ASSET__CHILD_ASSETS:
			return getChildAssets();
		case Zenhtt_modelPackage.ASSET__NAME:
			return getName();
		case Zenhtt_modelPackage.ASSET__ASSETTYPE:
			if (resolve)
				return getAssettype();
			return basicGetAssettype();
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
		case Zenhtt_modelPackage.ASSET__CHILD_ASSETS:
			getChildAssets().clear();
			getChildAssets().addAll((Collection<? extends Asset>) newValue);
			return;
		case Zenhtt_modelPackage.ASSET__NAME:
			setName((String) newValue);
			return;
		case Zenhtt_modelPackage.ASSET__ASSETTYPE:
			setAssettype((AssetType) newValue);
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
		case Zenhtt_modelPackage.ASSET__CHILD_ASSETS:
			getChildAssets().clear();
			return;
		case Zenhtt_modelPackage.ASSET__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Zenhtt_modelPackage.ASSET__ASSETTYPE:
			setAssettype((AssetType) null);
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
		case Zenhtt_modelPackage.ASSET__CHILD_ASSETS:
			return childAssets != null && !childAssets.isEmpty();
		case Zenhtt_modelPackage.ASSET__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Zenhtt_modelPackage.ASSET__ASSETTYPE:
			return assettype != null;
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
		result.append(')');
		return result.toString();
	}

} //AssetImpl

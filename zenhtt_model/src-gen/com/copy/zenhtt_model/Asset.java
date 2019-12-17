/**
 */
package com.copy.zenhtt_model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.copy.zenhtt_model.Asset#getChildAssets <em>Child Assets</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.Asset#getName <em>Name</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.Asset#getAssettype <em>Assettype</em>}</li>
 * </ul>
 *
 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getAsset()
 * @model
 * @generated
 */
public interface Asset extends Entity {
	/**
	 * Returns the value of the '<em><b>Child Assets</b></em>' containment reference list.
	 * The list contents are of type {@link com.copy.zenhtt_model.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Assets</em>' containment reference list.
	 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getAsset_ChildAssets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Asset> getChildAssets();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getAsset_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.copy.zenhtt_model.Asset#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Assettype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assettype</em>' reference.
	 * @see #setAssettype(AssetType)
	 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getAsset_Assettype()
	 * @model required="true"
	 * @generated
	 */
	AssetType getAssettype();

	/**
	 * Sets the value of the '{@link com.copy.zenhtt_model.Asset#getAssettype <em>Assettype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assettype</em>' reference.
	 * @see #getAssettype()
	 * @generated
	 */
	void setAssettype(AssetType value);

} // Asset

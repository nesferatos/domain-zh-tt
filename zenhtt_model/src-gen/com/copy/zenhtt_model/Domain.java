/**
 */
package com.copy.zenhtt_model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.copy.zenhtt_model.Domain#getAssetTypes <em>Asset Types</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.Domain#getRentalContracts <em>Rental Contracts</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.Domain#getPeople <em>People</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.Domain#getAssets <em>Assets</em>}</li>
 * </ul>
 *
 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends Entity {
	/**
	 * Returns the value of the '<em><b>Asset Types</b></em>' containment reference list.
	 * The list contents are of type {@link com.copy.zenhtt_model.AssetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Types</em>' containment reference list.
	 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getDomain_AssetTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssetType> getAssetTypes();

	/**
	 * Returns the value of the '<em><b>Rental Contracts</b></em>' containment reference list.
	 * The list contents are of type {@link com.copy.zenhtt_model.RentalContract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rental Contracts</em>' containment reference list.
	 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getDomain_RentalContracts()
	 * @model containment="true"
	 * @generated
	 */
	EList<RentalContract> getRentalContracts();

	/**
	 * Returns the value of the '<em><b>People</b></em>' containment reference list.
	 * The list contents are of type {@link com.copy.zenhtt_model.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>People</em>' containment reference list.
	 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getDomain_People()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPeople();

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' containment reference list.
	 * The list contents are of type {@link com.copy.zenhtt_model.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' containment reference list.
	 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getDomain_Assets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Asset> getAssets();

} // Domain

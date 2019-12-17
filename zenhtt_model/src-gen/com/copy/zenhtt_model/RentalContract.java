/**
 */
package com.copy.zenhtt_model;

import java.sql.Timestamp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rental Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.copy.zenhtt_model.RentalContract#getLandlord <em>Landlord</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.RentalContract#getAssets <em>Assets</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.RentalContract#getTenants <em>Tenants</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.RentalContract#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.RentalContract#getValidUntil <em>Valid Until</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.RentalContract#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getRentalContract()
 * @model
 * @generated
 */
public interface RentalContract extends Entity {
	/**
	 * Returns the value of the '<em><b>Landlord</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landlord</em>' reference.
	 * @see #setLandlord(Person)
	 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getRentalContract_Landlord()
	 * @model required="true"
	 * @generated
	 */
	Person getLandlord();

	/**
	 * Sets the value of the '{@link com.copy.zenhtt_model.RentalContract#getLandlord <em>Landlord</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Landlord</em>' reference.
	 * @see #getLandlord()
	 * @generated
	 */
	void setLandlord(Person value);

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link com.copy.zenhtt_model.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getRentalContract_Assets()
	 * @model
	 * @generated
	 */
	EList<Asset> getAssets();

	/**
	 * Returns the value of the '<em><b>Tenants</b></em>' reference list.
	 * The list contents are of type {@link com.copy.zenhtt_model.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenants</em>' reference list.
	 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getRentalContract_Tenants()
	 * @model required="true"
	 * @generated
	 */
	EList<Person> getTenants();

	/**
	 * Returns the value of the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid From</em>' attribute.
	 * @see #setValidFrom(Timestamp)
	 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getRentalContract_ValidFrom()
	 * @model dataType="com.copy.zenhtt_model.Timestamp"
	 * @generated
	 */
	Timestamp getValidFrom();

	/**
	 * Sets the value of the '{@link com.copy.zenhtt_model.RentalContract#getValidFrom <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid From</em>' attribute.
	 * @see #getValidFrom()
	 * @generated
	 */
	void setValidFrom(Timestamp value);

	/**
	 * Returns the value of the '<em><b>Valid Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Until</em>' attribute.
	 * @see #setValidUntil(Timestamp)
	 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getRentalContract_ValidUntil()
	 * @model dataType="com.copy.zenhtt_model.Timestamp"
	 * @generated
	 */
	Timestamp getValidUntil();

	/**
	 * Sets the value of the '{@link com.copy.zenhtt_model.RentalContract#getValidUntil <em>Valid Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Until</em>' attribute.
	 * @see #getValidUntil()
	 * @generated
	 */
	void setValidUntil(Timestamp value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getRentalContract_Number()
	 * @model
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link com.copy.zenhtt_model.RentalContract#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

} // RentalContract

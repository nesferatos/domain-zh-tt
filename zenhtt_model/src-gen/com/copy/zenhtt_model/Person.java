/**
 */
package com.copy.zenhtt_model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.copy.zenhtt_model.Person#getName <em>Name</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.Person#isLandlord <em>Landlord</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.Person#isTenant <em>Tenant</em>}</li>
 * </ul>
 *
 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends Entity {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.copy.zenhtt_model.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Landlord</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landlord</em>' attribute.
	 * @see #setLandlord(boolean)
	 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getPerson_Landlord()
	 * @model default="true"
	 * @generated
	 */
	boolean isLandlord();

	/**
	 * Sets the value of the '{@link com.copy.zenhtt_model.Person#isLandlord <em>Landlord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Landlord</em>' attribute.
	 * @see #isLandlord()
	 * @generated
	 */
	void setLandlord(boolean value);

	/**
	 * Returns the value of the '<em><b>Tenant</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant</em>' attribute.
	 * @see #setTenant(boolean)
	 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getPerson_Tenant()
	 * @model default="true"
	 * @generated
	 */
	boolean isTenant();

	/**
	 * Sets the value of the '{@link com.copy.zenhtt_model.Person#isTenant <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant</em>' attribute.
	 * @see #isTenant()
	 * @generated
	 */
	void setTenant(boolean value);

} // Person

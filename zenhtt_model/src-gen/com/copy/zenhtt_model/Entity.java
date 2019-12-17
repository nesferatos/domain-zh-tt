/**
 */
package com.copy.zenhtt_model;

import java.sql.Timestamp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.copy.zenhtt_model.Entity#getCreated <em>Created</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.Entity#getModified <em>Modified</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.Entity#isActive <em>Active</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.Entity#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getEntity()
 * @model abstract="true"
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(Timestamp)
	 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getEntity_Created()
	 * @model dataType="com.copy.zenhtt_model.Timestamp"
	 * @generated
	 */
	Timestamp getCreated();

	/**
	 * Sets the value of the '{@link com.copy.zenhtt_model.Entity#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(Timestamp value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' attribute.
	 * @see #setModified(Timestamp)
	 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getEntity_Modified()
	 * @model dataType="com.copy.zenhtt_model.Timestamp"
	 * @generated
	 */
	Timestamp getModified();

	/**
	 * Sets the value of the '{@link com.copy.zenhtt_model.Entity#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(Timestamp value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getEntity_Active()
	 * @model default="true"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link com.copy.zenhtt_model.Entity#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see com.copy.zenhtt_model.Zenhtt_modelPackage#getEntity_Code()
	 * @model id="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link com.copy.zenhtt_model.Entity#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // Entity

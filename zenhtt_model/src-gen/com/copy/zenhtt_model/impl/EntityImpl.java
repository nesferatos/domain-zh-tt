/**
 */
package com.copy.zenhtt_model.impl;

import com.copy.zenhtt_model.Entity;
import com.copy.zenhtt_model.Zenhtt_modelPackage;

import java.sql.Timestamp;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.copy.zenhtt_model.impl.EntityImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.impl.EntityImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.impl.EntityImpl#isActive <em>Active</em>}</li>
 *   <li>{@link com.copy.zenhtt_model.impl.EntityImpl#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Timestamp CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated NOT
	 * @ordered
	 */
	protected Timestamp created = new Timestamp(System.currentTimeMillis());

	/**
	 * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected static final Timestamp MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected Timestamp modified = MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated NOT
	 * @ordered
	 */
	protected String code = EcoreUtil.generateUUID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Zenhtt_modelPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timestamp getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreated(Timestamp newCreated) {
		Timestamp oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Zenhtt_modelPackage.ENTITY__CREATED, oldCreated,
					created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timestamp getModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModified(Timestamp newModified) {
		Timestamp oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Zenhtt_modelPackage.ENTITY__MODIFIED, oldModified,
					modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Zenhtt_modelPackage.ENTITY__ACTIVE, oldActive,
					active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Zenhtt_modelPackage.ENTITY__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Zenhtt_modelPackage.ENTITY__CREATED:
			return getCreated();
		case Zenhtt_modelPackage.ENTITY__MODIFIED:
			return getModified();
		case Zenhtt_modelPackage.ENTITY__ACTIVE:
			return isActive();
		case Zenhtt_modelPackage.ENTITY__CODE:
			return getCode();
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
		case Zenhtt_modelPackage.ENTITY__CREATED:
			setCreated((Timestamp) newValue);
			return;
		case Zenhtt_modelPackage.ENTITY__MODIFIED:
			setModified((Timestamp) newValue);
			return;
		case Zenhtt_modelPackage.ENTITY__ACTIVE:
			setActive((Boolean) newValue);
			return;
		case Zenhtt_modelPackage.ENTITY__CODE:
			setCode((String) newValue);
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
		case Zenhtt_modelPackage.ENTITY__CREATED:
			setCreated(CREATED_EDEFAULT);
			return;
		case Zenhtt_modelPackage.ENTITY__MODIFIED:
			setModified(MODIFIED_EDEFAULT);
			return;
		case Zenhtt_modelPackage.ENTITY__ACTIVE:
			setActive(ACTIVE_EDEFAULT);
			return;
		case Zenhtt_modelPackage.ENTITY__CODE:
			setCode(CODE_EDEFAULT);
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
		case Zenhtt_modelPackage.ENTITY__CREATED:
			return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
		case Zenhtt_modelPackage.ENTITY__MODIFIED:
			return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
		case Zenhtt_modelPackage.ENTITY__ACTIVE:
			return active != ACTIVE_EDEFAULT;
		case Zenhtt_modelPackage.ENTITY__CODE:
			return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
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
		result.append(" (created: ");
		result.append(created);
		result.append(", modified: ");
		result.append(modified);
		result.append(", active: ");
		result.append(active);
		result.append(", code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //EntityImpl

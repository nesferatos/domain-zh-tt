/**
 */
package com.copy.zenhtt_model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.copy.zenhtt_model.Zenhtt_modelFactory
 * @model kind="package"
 * @generated
 */
public interface Zenhtt_modelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "zenhtt_model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/zenhtt_model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "zenhtt_model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Zenhtt_modelPackage eINSTANCE = com.copy.zenhtt_model.impl.Zenhtt_modelPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.copy.zenhtt_model.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.copy.zenhtt_model.impl.EntityImpl
	 * @see com.copy.zenhtt_model.impl.Zenhtt_modelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CREATED = 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__MODIFIED = 1;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ACTIVE = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CODE = 3;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.copy.zenhtt_model.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.copy.zenhtt_model.impl.PersonImpl
	 * @see com.copy.zenhtt_model.impl.Zenhtt_modelPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 0;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CREATED = ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MODIFIED = ENTITY__MODIFIED;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ACTIVE = ENTITY__ACTIVE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CODE = ENTITY__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Landlord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LANDLORD = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TENANT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.copy.zenhtt_model.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.copy.zenhtt_model.impl.AssetImpl
	 * @see com.copy.zenhtt_model.impl.Zenhtt_modelPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 2;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__CREATED = ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__MODIFIED = ENTITY__MODIFIED;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ACTIVE = ENTITY__ACTIVE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__CODE = ENTITY__CODE;

	/**
	 * The feature id for the '<em><b>Child Assets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__CHILD_ASSETS = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__NAME = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assettype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ASSETTYPE = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.copy.zenhtt_model.impl.AssetTypeImpl <em>Asset Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.copy.zenhtt_model.impl.AssetTypeImpl
	 * @see com.copy.zenhtt_model.impl.Zenhtt_modelPackageImpl#getAssetType()
	 * @generated
	 */
	int ASSET_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_TYPE__CREATED = ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_TYPE__MODIFIED = ENTITY__MODIFIED;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_TYPE__ACTIVE = ENTITY__ACTIVE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_TYPE__CODE = ENTITY__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_TYPE__NAME = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Asset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_TYPE_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Asset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_TYPE_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.copy.zenhtt_model.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.copy.zenhtt_model.impl.DomainImpl
	 * @see com.copy.zenhtt_model.impl.Zenhtt_modelPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 4;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__CREATED = ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__MODIFIED = ENTITY__MODIFIED;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__ACTIVE = ENTITY__ACTIVE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__CODE = ENTITY__CODE;

	/**
	 * The feature id for the '<em><b>Asset Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__ASSET_TYPES = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rental Contracts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__RENTAL_CONTRACTS = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>People</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__PEOPLE = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__ASSETS = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.copy.zenhtt_model.impl.RentalContractImpl <em>Rental Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.copy.zenhtt_model.impl.RentalContractImpl
	 * @see com.copy.zenhtt_model.impl.Zenhtt_modelPackageImpl#getRentalContract()
	 * @generated
	 */
	int RENTAL_CONTRACT = 5;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_CONTRACT__CREATED = ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_CONTRACT__MODIFIED = ENTITY__MODIFIED;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_CONTRACT__ACTIVE = ENTITY__ACTIVE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_CONTRACT__CODE = ENTITY__CODE;

	/**
	 * The feature id for the '<em><b>Landlord</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_CONTRACT__LANDLORD = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_CONTRACT__ASSETS = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tenants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_CONTRACT__TENANTS = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_CONTRACT__VALID_FROM = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Valid Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_CONTRACT__VALID_UNTIL = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_CONTRACT__NUMBER = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Rental Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_CONTRACT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Rental Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_CONTRACT_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Timestamp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.Timestamp
	 * @see com.copy.zenhtt_model.impl.Zenhtt_modelPackageImpl#getTimestamp()
	 * @generated
	 */
	int TIMESTAMP = 6;

	/**
	 * Returns the meta object for class '{@link com.copy.zenhtt_model.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see com.copy.zenhtt_model.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link com.copy.zenhtt_model.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.copy.zenhtt_model.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.copy.zenhtt_model.Person#isLandlord <em>Landlord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Landlord</em>'.
	 * @see com.copy.zenhtt_model.Person#isLandlord()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Landlord();

	/**
	 * Returns the meta object for the attribute '{@link com.copy.zenhtt_model.Person#isTenant <em>Tenant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant</em>'.
	 * @see com.copy.zenhtt_model.Person#isTenant()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Tenant();

	/**
	 * Returns the meta object for class '{@link com.copy.zenhtt_model.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see com.copy.zenhtt_model.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link com.copy.zenhtt_model.Entity#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see com.copy.zenhtt_model.Entity#getCreated()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Created();

	/**
	 * Returns the meta object for the attribute '{@link com.copy.zenhtt_model.Entity#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see com.copy.zenhtt_model.Entity#getModified()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Modified();

	/**
	 * Returns the meta object for the attribute '{@link com.copy.zenhtt_model.Entity#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see com.copy.zenhtt_model.Entity#isActive()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Active();

	/**
	 * Returns the meta object for the attribute '{@link com.copy.zenhtt_model.Entity#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.copy.zenhtt_model.Entity#getCode()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Code();

	/**
	 * Returns the meta object for class '{@link com.copy.zenhtt_model.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see com.copy.zenhtt_model.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the containment reference list '{@link com.copy.zenhtt_model.Asset#getChildAssets <em>Child Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Assets</em>'.
	 * @see com.copy.zenhtt_model.Asset#getChildAssets()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_ChildAssets();

	/**
	 * Returns the meta object for the attribute '{@link com.copy.zenhtt_model.Asset#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.copy.zenhtt_model.Asset#getName()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Name();

	/**
	 * Returns the meta object for the reference '{@link com.copy.zenhtt_model.Asset#getAssettype <em>Assettype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assettype</em>'.
	 * @see com.copy.zenhtt_model.Asset#getAssettype()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Assettype();

	/**
	 * Returns the meta object for class '{@link com.copy.zenhtt_model.AssetType <em>Asset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Type</em>'.
	 * @see com.copy.zenhtt_model.AssetType
	 * @generated
	 */
	EClass getAssetType();

	/**
	 * Returns the meta object for the attribute '{@link com.copy.zenhtt_model.AssetType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.copy.zenhtt_model.AssetType#getName()
	 * @see #getAssetType()
	 * @generated
	 */
	EAttribute getAssetType_Name();

	/**
	 * Returns the meta object for class '{@link com.copy.zenhtt_model.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see com.copy.zenhtt_model.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link com.copy.zenhtt_model.Domain#getAssetTypes <em>Asset Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asset Types</em>'.
	 * @see com.copy.zenhtt_model.Domain#getAssetTypes()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_AssetTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.copy.zenhtt_model.Domain#getRentalContracts <em>Rental Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rental Contracts</em>'.
	 * @see com.copy.zenhtt_model.Domain#getRentalContracts()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_RentalContracts();

	/**
	 * Returns the meta object for the containment reference list '{@link com.copy.zenhtt_model.Domain#getPeople <em>People</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>People</em>'.
	 * @see com.copy.zenhtt_model.Domain#getPeople()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_People();

	/**
	 * Returns the meta object for the containment reference list '{@link com.copy.zenhtt_model.Domain#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assets</em>'.
	 * @see com.copy.zenhtt_model.Domain#getAssets()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Assets();

	/**
	 * Returns the meta object for class '{@link com.copy.zenhtt_model.RentalContract <em>Rental Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rental Contract</em>'.
	 * @see com.copy.zenhtt_model.RentalContract
	 * @generated
	 */
	EClass getRentalContract();

	/**
	 * Returns the meta object for the reference '{@link com.copy.zenhtt_model.RentalContract#getLandlord <em>Landlord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Landlord</em>'.
	 * @see com.copy.zenhtt_model.RentalContract#getLandlord()
	 * @see #getRentalContract()
	 * @generated
	 */
	EReference getRentalContract_Landlord();

	/**
	 * Returns the meta object for the reference list '{@link com.copy.zenhtt_model.RentalContract#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see com.copy.zenhtt_model.RentalContract#getAssets()
	 * @see #getRentalContract()
	 * @generated
	 */
	EReference getRentalContract_Assets();

	/**
	 * Returns the meta object for the reference list '{@link com.copy.zenhtt_model.RentalContract#getTenants <em>Tenants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tenants</em>'.
	 * @see com.copy.zenhtt_model.RentalContract#getTenants()
	 * @see #getRentalContract()
	 * @generated
	 */
	EReference getRentalContract_Tenants();

	/**
	 * Returns the meta object for the attribute '{@link com.copy.zenhtt_model.RentalContract#getValidFrom <em>Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From</em>'.
	 * @see com.copy.zenhtt_model.RentalContract#getValidFrom()
	 * @see #getRentalContract()
	 * @generated
	 */
	EAttribute getRentalContract_ValidFrom();

	/**
	 * Returns the meta object for the attribute '{@link com.copy.zenhtt_model.RentalContract#getValidUntil <em>Valid Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Until</em>'.
	 * @see com.copy.zenhtt_model.RentalContract#getValidUntil()
	 * @see #getRentalContract()
	 * @generated
	 */
	EAttribute getRentalContract_ValidUntil();

	/**
	 * Returns the meta object for the attribute '{@link com.copy.zenhtt_model.RentalContract#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see com.copy.zenhtt_model.RentalContract#getNumber()
	 * @see #getRentalContract()
	 * @generated
	 */
	EAttribute getRentalContract_Number();

	/**
	 * Returns the meta object for data type '{@link java.sql.Timestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Timestamp</em>'.
	 * @see java.sql.Timestamp
	 * @model instanceClass="java.sql.Timestamp"
	 * @generated
	 */
	EDataType getTimestamp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Zenhtt_modelFactory getZenhtt_modelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.copy.zenhtt_model.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.copy.zenhtt_model.impl.PersonImpl
		 * @see com.copy.zenhtt_model.impl.Zenhtt_modelPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Landlord</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LANDLORD = eINSTANCE.getPerson_Landlord();

		/**
		 * The meta object literal for the '<em><b>Tenant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__TENANT = eINSTANCE.getPerson_Tenant();

		/**
		 * The meta object literal for the '{@link com.copy.zenhtt_model.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.copy.zenhtt_model.impl.EntityImpl
		 * @see com.copy.zenhtt_model.impl.Zenhtt_modelPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__CREATED = eINSTANCE.getEntity_Created();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__MODIFIED = eINSTANCE.getEntity_Modified();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__ACTIVE = eINSTANCE.getEntity_Active();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__CODE = eINSTANCE.getEntity_Code();

		/**
		 * The meta object literal for the '{@link com.copy.zenhtt_model.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.copy.zenhtt_model.impl.AssetImpl
		 * @see com.copy.zenhtt_model.impl.Zenhtt_modelPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Child Assets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__CHILD_ASSETS = eINSTANCE.getAsset_ChildAssets();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__NAME = eINSTANCE.getAsset_Name();

		/**
		 * The meta object literal for the '<em><b>Assettype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__ASSETTYPE = eINSTANCE.getAsset_Assettype();

		/**
		 * The meta object literal for the '{@link com.copy.zenhtt_model.impl.AssetTypeImpl <em>Asset Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.copy.zenhtt_model.impl.AssetTypeImpl
		 * @see com.copy.zenhtt_model.impl.Zenhtt_modelPackageImpl#getAssetType()
		 * @generated
		 */
		EClass ASSET_TYPE = eINSTANCE.getAssetType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_TYPE__NAME = eINSTANCE.getAssetType_Name();

		/**
		 * The meta object literal for the '{@link com.copy.zenhtt_model.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.copy.zenhtt_model.impl.DomainImpl
		 * @see com.copy.zenhtt_model.impl.Zenhtt_modelPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Asset Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__ASSET_TYPES = eINSTANCE.getDomain_AssetTypes();

		/**
		 * The meta object literal for the '<em><b>Rental Contracts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__RENTAL_CONTRACTS = eINSTANCE.getDomain_RentalContracts();

		/**
		 * The meta object literal for the '<em><b>People</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__PEOPLE = eINSTANCE.getDomain_People();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__ASSETS = eINSTANCE.getDomain_Assets();

		/**
		 * The meta object literal for the '{@link com.copy.zenhtt_model.impl.RentalContractImpl <em>Rental Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.copy.zenhtt_model.impl.RentalContractImpl
		 * @see com.copy.zenhtt_model.impl.Zenhtt_modelPackageImpl#getRentalContract()
		 * @generated
		 */
		EClass RENTAL_CONTRACT = eINSTANCE.getRentalContract();

		/**
		 * The meta object literal for the '<em><b>Landlord</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENTAL_CONTRACT__LANDLORD = eINSTANCE.getRentalContract_Landlord();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENTAL_CONTRACT__ASSETS = eINSTANCE.getRentalContract_Assets();

		/**
		 * The meta object literal for the '<em><b>Tenants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENTAL_CONTRACT__TENANTS = eINSTANCE.getRentalContract_Tenants();

		/**
		 * The meta object literal for the '<em><b>Valid From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL_CONTRACT__VALID_FROM = eINSTANCE.getRentalContract_ValidFrom();

		/**
		 * The meta object literal for the '<em><b>Valid Until</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL_CONTRACT__VALID_UNTIL = eINSTANCE.getRentalContract_ValidUntil();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL_CONTRACT__NUMBER = eINSTANCE.getRentalContract_Number();

		/**
		 * The meta object literal for the '<em>Timestamp</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.sql.Timestamp
		 * @see com.copy.zenhtt_model.impl.Zenhtt_modelPackageImpl#getTimestamp()
		 * @generated
		 */
		EDataType TIMESTAMP = eINSTANCE.getTimestamp();

	}

} //Zenhtt_modelPackage

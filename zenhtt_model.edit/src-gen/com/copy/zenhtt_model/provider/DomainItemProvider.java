/**
 */
package com.copy.zenhtt_model.provider;

import com.copy.zenhtt_model.Domain;
import com.copy.zenhtt_model.Zenhtt_modelFactory;
import com.copy.zenhtt_model.Zenhtt_modelPackage;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.copy.zenhtt_model.Domain} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAssetTypesPropertyDescriptor(object);
			addRentalContractsPropertyDescriptor(object);
			addPeoplePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Asset Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssetTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Domain_assetTypes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Domain_assetTypes_feature",
								"_UI_Domain_type"),
						Zenhtt_modelPackage.Literals.DOMAIN__ASSET_TYPES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Rental Contracts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRentalContractsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Domain_rentalContracts_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Domain_rentalContracts_feature",
								"_UI_Domain_type"),
						Zenhtt_modelPackage.Literals.DOMAIN__RENTAL_CONTRACTS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the People feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPeoplePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Domain_people_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Domain_people_feature", "_UI_Domain_type"),
						Zenhtt_modelPackage.Literals.DOMAIN__PEOPLE, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Zenhtt_modelPackage.Literals.DOMAIN__ASSET_TYPES);
			childrenFeatures.add(Zenhtt_modelPackage.Literals.DOMAIN__RENTAL_CONTRACTS);
			childrenFeatures.add(Zenhtt_modelPackage.Literals.DOMAIN__PEOPLE);
			childrenFeatures.add(Zenhtt_modelPackage.Literals.DOMAIN__ASSETS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Domain.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Domain"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Timestamp labelValue = ((Domain) object).getCreated();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_Domain_type")
				: getString("_UI_Domain_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Domain.class)) {
		case Zenhtt_modelPackage.DOMAIN__ASSET_TYPES:
		case Zenhtt_modelPackage.DOMAIN__RENTAL_CONTRACTS:
		case Zenhtt_modelPackage.DOMAIN__PEOPLE:
		case Zenhtt_modelPackage.DOMAIN__ASSETS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(Zenhtt_modelPackage.Literals.DOMAIN__ASSET_TYPES,
				Zenhtt_modelFactory.eINSTANCE.createAssetType()));

		newChildDescriptors.add(createChildParameter(Zenhtt_modelPackage.Literals.DOMAIN__RENTAL_CONTRACTS,
				Zenhtt_modelFactory.eINSTANCE.createRentalContract()));

		newChildDescriptors.add(createChildParameter(Zenhtt_modelPackage.Literals.DOMAIN__PEOPLE,
				Zenhtt_modelFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add(createChildParameter(Zenhtt_modelPackage.Literals.DOMAIN__ASSETS,
				Zenhtt_modelFactory.eINSTANCE.createAsset()));
	}

}

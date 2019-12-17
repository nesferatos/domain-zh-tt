/**
 */
package com.copy.zenhtt_model.provider;

import com.copy.zenhtt_model.RentalContract;
import com.copy.zenhtt_model.Zenhtt_modelPackage;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.copy.zenhtt_model.RentalContract} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RentalContractItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RentalContractItemProvider(AdapterFactory adapterFactory) {
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

			addLandlordPropertyDescriptor(object);
			addAssetsPropertyDescriptor(object);
			addTenantsPropertyDescriptor(object);
			addValidFromPropertyDescriptor(object);
			addValidUntilPropertyDescriptor(object);
			addNumberPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Landlord feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLandlordPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RentalContract_landlord_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RentalContract_landlord_feature",
								"_UI_RentalContract_type"),
						Zenhtt_modelPackage.Literals.RENTAL_CONTRACT__LANDLORD, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Assets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssetsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RentalContract_assets_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RentalContract_assets_feature",
								"_UI_RentalContract_type"),
						Zenhtt_modelPackage.Literals.RENTAL_CONTRACT__ASSETS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Tenants feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTenantsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RentalContract_tenants_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RentalContract_tenants_feature",
								"_UI_RentalContract_type"),
						Zenhtt_modelPackage.Literals.RENTAL_CONTRACT__TENANTS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Valid From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RentalContract_validFrom_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RentalContract_validFrom_feature",
								"_UI_RentalContract_type"),
						Zenhtt_modelPackage.Literals.RENTAL_CONTRACT__VALID_FROM, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Valid Until feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidUntilPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RentalContract_validUntil_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RentalContract_validUntil_feature",
								"_UI_RentalContract_type"),
						Zenhtt_modelPackage.Literals.RENTAL_CONTRACT__VALID_UNTIL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RentalContract_number_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RentalContract_number_feature",
								"_UI_RentalContract_type"),
						Zenhtt_modelPackage.Literals.RENTAL_CONTRACT__NUMBER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns RentalContract.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RentalContract"));
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
		Timestamp labelValue = ((RentalContract) object).getCreated();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_RentalContract_type")
				: getString("_UI_RentalContract_type") + " " + label;
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

		switch (notification.getFeatureID(RentalContract.class)) {
		case Zenhtt_modelPackage.RENTAL_CONTRACT__VALID_FROM:
		case Zenhtt_modelPackage.RENTAL_CONTRACT__VALID_UNTIL:
		case Zenhtt_modelPackage.RENTAL_CONTRACT__NUMBER:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}

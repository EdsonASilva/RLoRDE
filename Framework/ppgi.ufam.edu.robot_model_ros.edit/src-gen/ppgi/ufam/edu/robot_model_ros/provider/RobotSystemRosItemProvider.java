/**
 */
package ppgi.ufam.edu.robot_model_ros.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ppgi.ufam.edu.robot_model_ros.RobotSystemRos;
import ppgi.ufam.edu.robot_model_ros.Robot_model_rosFactory;
import ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage;

/**
 * This is the item provider adapter for a {@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotSystemRosItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotSystemRosItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addType_architecturePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addLengthPropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
			addWeightPropertyDescriptor(object);
			addInitial_positionXPropertyDescriptor(object);
			addInitial_positionZPropertyDescriptor(object);
			addInitial_positionYPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RobotSystemRos_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RobotSystemRos_name_feature",
								"_UI_RobotSystemRos_type"),
						Robot_model_rosPackage.Literals.ROBOT_SYSTEM_ROS__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Type architecture feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addType_architecturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RobotSystemRos_type_architecture_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RobotSystemRos_type_architecture_feature",
						"_UI_RobotSystemRos_type"),
				Robot_model_rosPackage.Literals.ROBOT_SYSTEM_ROS__TYPE_ARCHITECTURE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RobotSystemRos_description_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RobotSystemRos_description_feature",
						"_UI_RobotSystemRos_type"),
				Robot_model_rosPackage.Literals.ROBOT_SYSTEM_ROS__DESCRIPTION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RobotSystemRos_height_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RobotSystemRos_height_feature",
								"_UI_RobotSystemRos_type"),
						Robot_model_rosPackage.Literals.ROBOT_SYSTEM_ROS__HEIGHT, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RobotSystemRos_length_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RobotSystemRos_length_feature",
								"_UI_RobotSystemRos_type"),
						Robot_model_rosPackage.Literals.ROBOT_SYSTEM_ROS__LENGTH, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RobotSystemRos_width_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RobotSystemRos_width_feature",
								"_UI_RobotSystemRos_type"),
						Robot_model_rosPackage.Literals.ROBOT_SYSTEM_ROS__WIDTH, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RobotSystemRos_weight_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RobotSystemRos_weight_feature",
								"_UI_RobotSystemRos_type"),
						Robot_model_rosPackage.Literals.ROBOT_SYSTEM_ROS__WEIGHT, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Initial position X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitial_positionXPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RobotSystemRos_initial_positionX_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RobotSystemRos_initial_positionX_feature",
								"_UI_RobotSystemRos_type"),
						Robot_model_rosPackage.Literals.ROBOT_SYSTEM_ROS__INITIAL_POSITION_X, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Initial position Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitial_positionZPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RobotSystemRos_initial_positionZ_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RobotSystemRos_initial_positionZ_feature",
								"_UI_RobotSystemRos_type"),
						Robot_model_rosPackage.Literals.ROBOT_SYSTEM_ROS__INITIAL_POSITION_Z, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Initial position Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitial_positionYPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RobotSystemRos_initial_positionY_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RobotSystemRos_initial_positionY_feature",
								"_UI_RobotSystemRos_type"),
						Robot_model_rosPackage.Literals.ROBOT_SYSTEM_ROS__INITIAL_POSITION_Y, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(Robot_model_rosPackage.Literals.ROBOT_SYSTEM_ROS__ROS_TO_NODE);
			childrenFeatures.add(Robot_model_rosPackage.Literals.ROBOT_SYSTEM_ROS__ROS_TO_INCLUDE);
			childrenFeatures.add(Robot_model_rosPackage.Literals.ROBOT_SYSTEM_ROS__ROS_TO_ARGUMENT);
			childrenFeatures.add(Robot_model_rosPackage.Literals.ROBOT_SYSTEM_ROS__ROS_TO_PARAMETER);
			childrenFeatures.add(Robot_model_rosPackage.Literals.ROBOT_SYSTEM_ROS__ROS_TO_SERVICE);
			childrenFeatures.add(Robot_model_rosPackage.Literals.ROBOT_SYSTEM_ROS__ROS_TO_TOPIC);
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
	 * This returns RobotSystemRos.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RobotSystemRos"));
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
		String label = ((RobotSystemRos) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_RobotSystemRos_type")
				: getString("_UI_RobotSystemRos_type") + " " + label;
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

		switch (notification.getFeatureID(RobotSystemRos.class)) {
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__NAME:
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__TYPE_ARCHITECTURE:
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__DESCRIPTION:
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__HEIGHT:
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__LENGTH:
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__WIDTH:
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__WEIGHT:
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__INITIAL_POSITION_X:
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__INITIAL_POSITION_Z:
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__INITIAL_POSITION_Y:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_NODE:
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_INCLUDE:
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_ARGUMENT:
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_PARAMETER:
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_SERVICE:
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_TOPIC:
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

		newChildDescriptors.add(createChildParameter(Robot_model_rosPackage.Literals.ROBOT_SYSTEM_ROS__ROS_TO_NODE,
				Robot_model_rosFactory.eINSTANCE.createNode()));

		newChildDescriptors.add(createChildParameter(Robot_model_rosPackage.Literals.ROBOT_SYSTEM_ROS__ROS_TO_INCLUDE,
				Robot_model_rosFactory.eINSTANCE.createinclude()));

		newChildDescriptors.add(createChildParameter(Robot_model_rosPackage.Literals.ROBOT_SYSTEM_ROS__ROS_TO_ARGUMENT,
				Robot_model_rosFactory.eINSTANCE.createargument()));

		newChildDescriptors.add(createChildParameter(Robot_model_rosPackage.Literals.ROBOT_SYSTEM_ROS__ROS_TO_PARAMETER,
				Robot_model_rosFactory.eINSTANCE.createparameter()));

		newChildDescriptors.add(createChildParameter(Robot_model_rosPackage.Literals.ROBOT_SYSTEM_ROS__ROS_TO_SERVICE,
				Robot_model_rosFactory.eINSTANCE.createservice()));

		newChildDescriptors.add(createChildParameter(Robot_model_rosPackage.Literals.ROBOT_SYSTEM_ROS__ROS_TO_TOPIC,
				Robot_model_rosFactory.eINSTANCE.createtopic()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Robot_model_rosEditPlugin.INSTANCE;
	}

}

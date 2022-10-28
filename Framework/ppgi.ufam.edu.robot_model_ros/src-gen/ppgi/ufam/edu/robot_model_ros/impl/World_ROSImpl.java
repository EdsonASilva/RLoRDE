/**
 */
package ppgi.ufam.edu.robot_model_ros.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ppgi.ufam.edu.robot_model_ros.RobotSystemRos;
import ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage;
import ppgi.ufam.edu.robot_model_ros.World_ROS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>World ROS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.World_ROSImpl#getWorld_name <em>World name</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.World_ROSImpl#isSimulator <em>Simulator</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.World_ROSImpl#getWorld_to_robotsystem <em>World to robotsystem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class World_ROSImpl extends MinimalEObjectImpl.Container implements World_ROS {
	/**
	 * The default value of the '{@link #getWorld_name() <em>World name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorld_name()
	 * @generated
	 * @ordered
	 */
	protected static final String WORLD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorld_name() <em>World name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorld_name()
	 * @generated
	 * @ordered
	 */
	protected String world_name = WORLD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isSimulator() <em>Simulator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSimulator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SIMULATOR_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSimulator() <em>Simulator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSimulator()
	 * @generated
	 * @ordered
	 */
	protected boolean simulator = SIMULATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorld_to_robotsystem() <em>World to robotsystem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorld_to_robotsystem()
	 * @generated
	 * @ordered
	 */
	protected EList<RobotSystemRos> world_to_robotsystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected World_ROSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Robot_model_rosPackage.Literals.WORLD_ROS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorld_name() {
		return world_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorld_name(String newWorld_name) {
		String oldWorld_name = world_name;
		world_name = newWorld_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_model_rosPackage.WORLD_ROS__WORLD_NAME,
					oldWorld_name, world_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSimulator() {
		return simulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulator(boolean newSimulator) {
		boolean oldSimulator = simulator;
		simulator = newSimulator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_model_rosPackage.WORLD_ROS__SIMULATOR,
					oldSimulator, simulator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RobotSystemRos> getWorld_to_robotsystem() {
		if (world_to_robotsystem == null) {
			world_to_robotsystem = new EObjectContainmentEList<RobotSystemRos>(RobotSystemRos.class, this,
					Robot_model_rosPackage.WORLD_ROS__WORLD_TO_ROBOTSYSTEM);
		}
		return world_to_robotsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Robot_model_rosPackage.WORLD_ROS__WORLD_TO_ROBOTSYSTEM:
			return ((InternalEList<?>) getWorld_to_robotsystem()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Robot_model_rosPackage.WORLD_ROS__WORLD_NAME:
			return getWorld_name();
		case Robot_model_rosPackage.WORLD_ROS__SIMULATOR:
			return isSimulator();
		case Robot_model_rosPackage.WORLD_ROS__WORLD_TO_ROBOTSYSTEM:
			return getWorld_to_robotsystem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Robot_model_rosPackage.WORLD_ROS__WORLD_NAME:
			setWorld_name((String) newValue);
			return;
		case Robot_model_rosPackage.WORLD_ROS__SIMULATOR:
			setSimulator((Boolean) newValue);
			return;
		case Robot_model_rosPackage.WORLD_ROS__WORLD_TO_ROBOTSYSTEM:
			getWorld_to_robotsystem().clear();
			getWorld_to_robotsystem().addAll((Collection<? extends RobotSystemRos>) newValue);
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
		case Robot_model_rosPackage.WORLD_ROS__WORLD_NAME:
			setWorld_name(WORLD_NAME_EDEFAULT);
			return;
		case Robot_model_rosPackage.WORLD_ROS__SIMULATOR:
			setSimulator(SIMULATOR_EDEFAULT);
			return;
		case Robot_model_rosPackage.WORLD_ROS__WORLD_TO_ROBOTSYSTEM:
			getWorld_to_robotsystem().clear();
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
		case Robot_model_rosPackage.WORLD_ROS__WORLD_NAME:
			return WORLD_NAME_EDEFAULT == null ? world_name != null : !WORLD_NAME_EDEFAULT.equals(world_name);
		case Robot_model_rosPackage.WORLD_ROS__SIMULATOR:
			return simulator != SIMULATOR_EDEFAULT;
		case Robot_model_rosPackage.WORLD_ROS__WORLD_TO_ROBOTSYSTEM:
			return world_to_robotsystem != null && !world_to_robotsystem.isEmpty();
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
		result.append(" (world_name: ");
		result.append(world_name);
		result.append(", simulator: ");
		result.append(simulator);
		result.append(')');
		return result.toString();
	}

} //World_ROSImpl

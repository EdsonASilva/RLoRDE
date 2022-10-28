/**
 */
package ppgi.ufam.edu.robot_system.impl;

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

import ppgi.ufam.edu.robot_system.Robot_System;
import ppgi.ufam.edu.robot_system.Robot_systemPackage;
import ppgi.ufam.edu.robot_system.World_System;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>World System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.World_SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.World_SystemImpl#getHas_robot_system <em>Has robot system</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.World_SystemImpl#isSimulator <em>Simulator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class World_SystemImpl extends MinimalEObjectImpl.Container implements World_System {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "World System";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHas_robot_system() <em>Has robot system</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_robot_system()
	 * @generated
	 * @ordered
	 */
	protected EList<Robot_System> has_robot_system;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected World_SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Robot_systemPackage.Literals.WORLD_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_systemPackage.WORLD_SYSTEM__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Robot_System> getHas_robot_system() {
		if (has_robot_system == null) {
			has_robot_system = new EObjectContainmentEList<Robot_System>(Robot_System.class, this,
					Robot_systemPackage.WORLD_SYSTEM__HAS_ROBOT_SYSTEM);
		}
		return has_robot_system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSimulator() {
		return simulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSimulator(boolean newSimulator) {
		boolean oldSimulator = simulator;
		simulator = newSimulator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_systemPackage.WORLD_SYSTEM__SIMULATOR,
					oldSimulator, simulator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Robot_systemPackage.WORLD_SYSTEM__HAS_ROBOT_SYSTEM:
			return ((InternalEList<?>) getHas_robot_system()).basicRemove(otherEnd, msgs);
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
		case Robot_systemPackage.WORLD_SYSTEM__NAME:
			return getName();
		case Robot_systemPackage.WORLD_SYSTEM__HAS_ROBOT_SYSTEM:
			return getHas_robot_system();
		case Robot_systemPackage.WORLD_SYSTEM__SIMULATOR:
			return isSimulator();
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
		case Robot_systemPackage.WORLD_SYSTEM__NAME:
			setName((String) newValue);
			return;
		case Robot_systemPackage.WORLD_SYSTEM__HAS_ROBOT_SYSTEM:
			getHas_robot_system().clear();
			getHas_robot_system().addAll((Collection<? extends Robot_System>) newValue);
			return;
		case Robot_systemPackage.WORLD_SYSTEM__SIMULATOR:
			setSimulator((Boolean) newValue);
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
		case Robot_systemPackage.WORLD_SYSTEM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Robot_systemPackage.WORLD_SYSTEM__HAS_ROBOT_SYSTEM:
			getHas_robot_system().clear();
			return;
		case Robot_systemPackage.WORLD_SYSTEM__SIMULATOR:
			setSimulator(SIMULATOR_EDEFAULT);
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
		case Robot_systemPackage.WORLD_SYSTEM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Robot_systemPackage.WORLD_SYSTEM__HAS_ROBOT_SYSTEM:
			return has_robot_system != null && !has_robot_system.isEmpty();
		case Robot_systemPackage.WORLD_SYSTEM__SIMULATOR:
			return simulator != SIMULATOR_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", simulator: ");
		result.append(simulator);
		result.append(')');
		return result.toString();
	}

} //World_SystemImpl

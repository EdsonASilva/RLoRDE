/**
 */
package ppgi.ufam.edu.robot_model_ros.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage;
import ppgi.ufam.edu.robot_model_ros.argument;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.argumentImpl#getArg_name <em>Arg name</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.argumentImpl#getArg_value <em>Arg value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class argumentImpl extends MinimalEObjectImpl.Container implements argument {
	/**
	 * The default value of the '{@link #getArg_name() <em>Arg name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArg_name()
	 * @generated
	 * @ordered
	 */
	protected static final String ARG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArg_name() <em>Arg name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArg_name()
	 * @generated
	 * @ordered
	 */
	protected String arg_name = ARG_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getArg_value() <em>Arg value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArg_value()
	 * @generated
	 * @ordered
	 */
	protected static final String ARG_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArg_value() <em>Arg value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArg_value()
	 * @generated
	 * @ordered
	 */
	protected String arg_value = ARG_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected argumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Robot_model_rosPackage.Literals.ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArg_name() {
		return arg_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArg_name(String newArg_name) {
		String oldArg_name = arg_name;
		arg_name = newArg_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_model_rosPackage.ARGUMENT__ARG_NAME,
					oldArg_name, arg_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArg_value() {
		return arg_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArg_value(String newArg_value) {
		String oldArg_value = arg_value;
		arg_value = newArg_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_model_rosPackage.ARGUMENT__ARG_VALUE,
					oldArg_value, arg_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Robot_model_rosPackage.ARGUMENT__ARG_NAME:
			return getArg_name();
		case Robot_model_rosPackage.ARGUMENT__ARG_VALUE:
			return getArg_value();
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
		case Robot_model_rosPackage.ARGUMENT__ARG_NAME:
			setArg_name((String) newValue);
			return;
		case Robot_model_rosPackage.ARGUMENT__ARG_VALUE:
			setArg_value((String) newValue);
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
		case Robot_model_rosPackage.ARGUMENT__ARG_NAME:
			setArg_name(ARG_NAME_EDEFAULT);
			return;
		case Robot_model_rosPackage.ARGUMENT__ARG_VALUE:
			setArg_value(ARG_VALUE_EDEFAULT);
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
		case Robot_model_rosPackage.ARGUMENT__ARG_NAME:
			return ARG_NAME_EDEFAULT == null ? arg_name != null : !ARG_NAME_EDEFAULT.equals(arg_name);
		case Robot_model_rosPackage.ARGUMENT__ARG_VALUE:
			return ARG_VALUE_EDEFAULT == null ? arg_value != null : !ARG_VALUE_EDEFAULT.equals(arg_value);
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
		result.append(" (arg_name: ");
		result.append(arg_name);
		result.append(", arg_value: ");
		result.append(arg_value);
		result.append(')');
		return result.toString();
	}

} //argumentImpl

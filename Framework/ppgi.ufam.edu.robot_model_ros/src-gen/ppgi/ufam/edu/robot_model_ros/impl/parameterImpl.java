/**
 */
package ppgi.ufam.edu.robot_model_ros.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage;
import ppgi.ufam.edu.robot_model_ros.parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.parameterImpl#getName_param <em>Name param</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.parameterImpl#getValue_param <em>Value param</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.parameterImpl#getType_param <em>Type param</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.parameterImpl#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class parameterImpl extends MinimalEObjectImpl.Container implements parameter {
	/**
	 * The default value of the '{@link #getName_param() <em>Name param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_param()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_PARAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_param() <em>Name param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_param()
	 * @generated
	 * @ordered
	 */
	protected String name_param = NAME_PARAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue_param() <em>Value param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue_param()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_PARAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue_param() <em>Value param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue_param()
	 * @generated
	 * @ordered
	 */
	protected String value_param = VALUE_PARAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getType_param() <em>Type param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_param()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_PARAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType_param() <em>Type param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_param()
	 * @generated
	 * @ordered
	 */
	protected String type_param = TYPE_PARAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected String command = COMMAND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected parameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Robot_model_rosPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName_param() {
		return name_param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_param(String newName_param) {
		String oldName_param = name_param;
		name_param = newName_param;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_model_rosPackage.PARAMETER__NAME_PARAM,
					oldName_param, name_param));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue_param() {
		return value_param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue_param(String newValue_param) {
		String oldValue_param = value_param;
		value_param = newValue_param;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_model_rosPackage.PARAMETER__VALUE_PARAM,
					oldValue_param, value_param));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType_param() {
		return type_param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType_param(String newType_param) {
		String oldType_param = type_param;
		type_param = newType_param;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_model_rosPackage.PARAMETER__TYPE_PARAM,
					oldType_param, type_param));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(String newCommand) {
		String oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_model_rosPackage.PARAMETER__COMMAND, oldCommand,
					command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Robot_model_rosPackage.PARAMETER__NAME_PARAM:
			return getName_param();
		case Robot_model_rosPackage.PARAMETER__VALUE_PARAM:
			return getValue_param();
		case Robot_model_rosPackage.PARAMETER__TYPE_PARAM:
			return getType_param();
		case Robot_model_rosPackage.PARAMETER__COMMAND:
			return getCommand();
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
		case Robot_model_rosPackage.PARAMETER__NAME_PARAM:
			setName_param((String) newValue);
			return;
		case Robot_model_rosPackage.PARAMETER__VALUE_PARAM:
			setValue_param((String) newValue);
			return;
		case Robot_model_rosPackage.PARAMETER__TYPE_PARAM:
			setType_param((String) newValue);
			return;
		case Robot_model_rosPackage.PARAMETER__COMMAND:
			setCommand((String) newValue);
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
		case Robot_model_rosPackage.PARAMETER__NAME_PARAM:
			setName_param(NAME_PARAM_EDEFAULT);
			return;
		case Robot_model_rosPackage.PARAMETER__VALUE_PARAM:
			setValue_param(VALUE_PARAM_EDEFAULT);
			return;
		case Robot_model_rosPackage.PARAMETER__TYPE_PARAM:
			setType_param(TYPE_PARAM_EDEFAULT);
			return;
		case Robot_model_rosPackage.PARAMETER__COMMAND:
			setCommand(COMMAND_EDEFAULT);
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
		case Robot_model_rosPackage.PARAMETER__NAME_PARAM:
			return NAME_PARAM_EDEFAULT == null ? name_param != null : !NAME_PARAM_EDEFAULT.equals(name_param);
		case Robot_model_rosPackage.PARAMETER__VALUE_PARAM:
			return VALUE_PARAM_EDEFAULT == null ? value_param != null : !VALUE_PARAM_EDEFAULT.equals(value_param);
		case Robot_model_rosPackage.PARAMETER__TYPE_PARAM:
			return TYPE_PARAM_EDEFAULT == null ? type_param != null : !TYPE_PARAM_EDEFAULT.equals(type_param);
		case Robot_model_rosPackage.PARAMETER__COMMAND:
			return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
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
		result.append(" (name_param: ");
		result.append(name_param);
		result.append(", value_param: ");
		result.append(value_param);
		result.append(", type_param: ");
		result.append(type_param);
		result.append(", command: ");
		result.append(command);
		result.append(')');
		return result.toString();
	}

} //parameterImpl

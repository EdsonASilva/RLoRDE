/**
 */
package ppgi.ufam.edu.robot_system.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ppgi.ufam.edu.robot_system.Controller;
import ppgi.ufam.edu.robot_system.Robot_systemPackage;
import ppgi.ufam.edu.robot_system.Rules;
import ppgi.ufam.edu.robot_system.Type_rules;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rules</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.RulesImpl#getId <em>Id</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.RulesImpl#isEnable <em>Enable</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.RulesImpl#getMin_value <em>Min value</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.RulesImpl#getMax_value <em>Max value</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.RulesImpl#getType_rule <em>Type rule</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.RulesImpl#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RulesImpl extends MinimalEObjectImpl.Container implements Rules {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnable() <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEnable() <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnable()
	 * @generated
	 * @ordered
	 */
	protected boolean enable = ENABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin_value() <em>Min value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_value()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMin_value() <em>Min value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_value()
	 * @generated
	 * @ordered
	 */
	protected int min_value = MIN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_value() <em>Max value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_value()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMax_value() <em>Max value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_value()
	 * @generated
	 * @ordered
	 */
	protected int max_value = MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType_rule() <em>Type rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_rule()
	 * @generated
	 * @ordered
	 */
	protected static final Type_rules TYPE_RULE_EDEFAULT = Type_rules.BIGGER_THAN;

	/**
	 * The cached value of the '{@link #getType_rule() <em>Type rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_rule()
	 * @generated
	 * @ordered
	 */
	protected Type_rules type_rule = TYPE_RULE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getController() <em>Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected Controller controller;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RulesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Robot_systemPackage.Literals.RULES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_systemPackage.RULES__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnable() {
		return enable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnable(boolean newEnable) {
		boolean oldEnable = enable;
		enable = newEnable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_systemPackage.RULES__ENABLE, oldEnable,
					enable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMin_value() {
		return min_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin_value(int newMin_value) {
		int oldMin_value = min_value;
		min_value = newMin_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_systemPackage.RULES__MIN_VALUE, oldMin_value,
					min_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMax_value() {
		return max_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax_value(int newMax_value) {
		int oldMax_value = max_value;
		max_value = newMax_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_systemPackage.RULES__MAX_VALUE, oldMax_value,
					max_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type_rules getType_rule() {
		return type_rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType_rule(Type_rules newType_rule) {
		Type_rules oldType_rule = type_rule;
		type_rule = newType_rule == null ? TYPE_RULE_EDEFAULT : newType_rule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_systemPackage.RULES__TYPE_RULE, oldType_rule,
					type_rule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Controller getController() {
		if (controller != null && controller.eIsProxy()) {
			InternalEObject oldController = (InternalEObject) controller;
			controller = (Controller) eResolveProxy(oldController);
			if (controller != oldController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Robot_systemPackage.RULES__CONTROLLER,
							oldController, controller));
			}
		}
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller basicGetController() {
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setController(Controller newController) {
		Controller oldController = controller;
		controller = newController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_systemPackage.RULES__CONTROLLER, oldController,
					controller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Robot_systemPackage.RULES__ID:
			return getId();
		case Robot_systemPackage.RULES__ENABLE:
			return isEnable();
		case Robot_systemPackage.RULES__MIN_VALUE:
			return getMin_value();
		case Robot_systemPackage.RULES__MAX_VALUE:
			return getMax_value();
		case Robot_systemPackage.RULES__TYPE_RULE:
			return getType_rule();
		case Robot_systemPackage.RULES__CONTROLLER:
			if (resolve)
				return getController();
			return basicGetController();
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
		case Robot_systemPackage.RULES__ID:
			setId((String) newValue);
			return;
		case Robot_systemPackage.RULES__ENABLE:
			setEnable((Boolean) newValue);
			return;
		case Robot_systemPackage.RULES__MIN_VALUE:
			setMin_value((Integer) newValue);
			return;
		case Robot_systemPackage.RULES__MAX_VALUE:
			setMax_value((Integer) newValue);
			return;
		case Robot_systemPackage.RULES__TYPE_RULE:
			setType_rule((Type_rules) newValue);
			return;
		case Robot_systemPackage.RULES__CONTROLLER:
			setController((Controller) newValue);
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
		case Robot_systemPackage.RULES__ID:
			setId(ID_EDEFAULT);
			return;
		case Robot_systemPackage.RULES__ENABLE:
			setEnable(ENABLE_EDEFAULT);
			return;
		case Robot_systemPackage.RULES__MIN_VALUE:
			setMin_value(MIN_VALUE_EDEFAULT);
			return;
		case Robot_systemPackage.RULES__MAX_VALUE:
			setMax_value(MAX_VALUE_EDEFAULT);
			return;
		case Robot_systemPackage.RULES__TYPE_RULE:
			setType_rule(TYPE_RULE_EDEFAULT);
			return;
		case Robot_systemPackage.RULES__CONTROLLER:
			setController((Controller) null);
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
		case Robot_systemPackage.RULES__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Robot_systemPackage.RULES__ENABLE:
			return enable != ENABLE_EDEFAULT;
		case Robot_systemPackage.RULES__MIN_VALUE:
			return min_value != MIN_VALUE_EDEFAULT;
		case Robot_systemPackage.RULES__MAX_VALUE:
			return max_value != MAX_VALUE_EDEFAULT;
		case Robot_systemPackage.RULES__TYPE_RULE:
			return type_rule != TYPE_RULE_EDEFAULT;
		case Robot_systemPackage.RULES__CONTROLLER:
			return controller != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", enable: ");
		result.append(enable);
		result.append(", min_value: ");
		result.append(min_value);
		result.append(", max_value: ");
		result.append(max_value);
		result.append(", type_rule: ");
		result.append(type_rule);
		result.append(')');
		return result.toString();
	}

} //RulesImpl

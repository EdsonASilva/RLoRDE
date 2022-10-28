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
import ppgi.ufam.edu.robot_system.Actuator;
import ppgi.ufam.edu.robot_system.Analyzer;
import ppgi.ufam.edu.robot_system.Controller;
import ppgi.ufam.edu.robot_system.Discretize;
import ppgi.ufam.edu.robot_system.Robot_System;
import ppgi.ufam.edu.robot_system.Robot_systemPackage;
import ppgi.ufam.edu.robot_system.Sensor;
import ppgi.ufam.edu.robot_system.Type_architecture;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.Robot_SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.Robot_SystemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.Robot_SystemImpl#getHas_actuator <em>Has actuator</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.Robot_SystemImpl#getHas_sensor <em>Has sensor</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.Robot_SystemImpl#getHas_controller <em>Has controller</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.Robot_SystemImpl#getType_archicture <em>Type archicture</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.Robot_SystemImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.Robot_SystemImpl#getLength <em>Length</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.Robot_SystemImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.Robot_SystemImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.Robot_SystemImpl#getInitial_positionX <em>Initial position X</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.Robot_SystemImpl#getInitial_positionY <em>Initial position Y</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.Robot_SystemImpl#getInitial_positionZ <em>Initial position Z</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.Robot_SystemImpl#getHas_discretize <em>Has discretize</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.Robot_SystemImpl#getHas_analyzer <em>Has analyzer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Robot_SystemImpl extends MinimalEObjectImpl.Container implements Robot_System {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHas_actuator() <em>Has actuator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_actuator()
	 * @generated
	 * @ordered
	 */
	protected EList<Actuator> has_actuator;

	/**
	 * The cached value of the '{@link #getHas_sensor() <em>Has sensor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_sensor()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> has_sensor;

	/**
	 * The cached value of the '{@link #getHas_controller() <em>Has controller</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_controller()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller> has_controller;

	/**
	 * The default value of the '{@link #getType_archicture() <em>Type archicture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_archicture()
	 * @generated
	 * @ordered
	 */
	protected static final Type_architecture TYPE_ARCHICTURE_EDEFAULT = Type_architecture.GENERIC;

	/**
	 * The cached value of the '{@link #getType_archicture() <em>Type archicture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_archicture()
	 * @generated
	 * @ordered
	 */
	protected Type_architecture type_archicture = TYPE_ARCHICTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final double LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected double length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected double weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitial_positionX() <em>Initial position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial_positionX()
	 * @generated
	 * @ordered
	 */
	protected static final double INITIAL_POSITION_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInitial_positionX() <em>Initial position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial_positionX()
	 * @generated
	 * @ordered
	 */
	protected double initial_positionX = INITIAL_POSITION_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitial_positionY() <em>Initial position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial_positionY()
	 * @generated
	 * @ordered
	 */
	protected static final double INITIAL_POSITION_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInitial_positionY() <em>Initial position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial_positionY()
	 * @generated
	 * @ordered
	 */
	protected double initial_positionY = INITIAL_POSITION_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitial_positionZ() <em>Initial position Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial_positionZ()
	 * @generated
	 * @ordered
	 */
	protected static final double INITIAL_POSITION_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInitial_positionZ() <em>Initial position Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial_positionZ()
	 * @generated
	 * @ordered
	 */
	protected double initial_positionZ = INITIAL_POSITION_Z_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHas_discretize() <em>Has discretize</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_discretize()
	 * @generated
	 * @ordered
	 */
	protected EList<Discretize> has_discretize;

	/**
	 * The cached value of the '{@link #getHas_analyzer() <em>Has analyzer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_analyzer()
	 * @generated
	 * @ordered
	 */
	protected EList<Analyzer> has_analyzer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Robot_SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Robot_systemPackage.Literals.ROBOT_SYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_systemPackage.ROBOT_SYSTEM__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_systemPackage.ROBOT_SYSTEM__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Actuator> getHas_actuator() {
		if (has_actuator == null) {
			has_actuator = new EObjectContainmentEList<Actuator>(Actuator.class, this,
					Robot_systemPackage.ROBOT_SYSTEM__HAS_ACTUATOR);
		}
		return has_actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sensor> getHas_sensor() {
		if (has_sensor == null) {
			has_sensor = new EObjectContainmentEList<Sensor>(Sensor.class, this,
					Robot_systemPackage.ROBOT_SYSTEM__HAS_SENSOR);
		}
		return has_sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Controller> getHas_controller() {
		if (has_controller == null) {
			has_controller = new EObjectContainmentEList<Controller>(Controller.class, this,
					Robot_systemPackage.ROBOT_SYSTEM__HAS_CONTROLLER);
		}
		return has_controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type_architecture getType_archicture() {
		return type_archicture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType_archicture(Type_architecture newType_archicture) {
		Type_architecture oldType_archicture = type_archicture;
		type_archicture = newType_archicture == null ? TYPE_ARCHICTURE_EDEFAULT : newType_archicture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_systemPackage.ROBOT_SYSTEM__TYPE_ARCHICTURE,
					oldType_archicture, type_archicture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_systemPackage.ROBOT_SYSTEM__WIDTH, oldWidth,
					width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(double newLength) {
		double oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_systemPackage.ROBOT_SYSTEM__LENGTH, oldLength,
					length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(double newHeight) {
		double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_systemPackage.ROBOT_SYSTEM__HEIGHT, oldHeight,
					height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(double newWeight) {
		double oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_systemPackage.ROBOT_SYSTEM__WEIGHT, oldWeight,
					weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getInitial_positionX() {
		return initial_positionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitial_positionX(double newInitial_positionX) {
		double oldInitial_positionX = initial_positionX;
		initial_positionX = newInitial_positionX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_systemPackage.ROBOT_SYSTEM__INITIAL_POSITION_X,
					oldInitial_positionX, initial_positionX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getInitial_positionY() {
		return initial_positionY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitial_positionY(double newInitial_positionY) {
		double oldInitial_positionY = initial_positionY;
		initial_positionY = newInitial_positionY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_systemPackage.ROBOT_SYSTEM__INITIAL_POSITION_Y,
					oldInitial_positionY, initial_positionY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getInitial_positionZ() {
		return initial_positionZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitial_positionZ(double newInitial_positionZ) {
		double oldInitial_positionZ = initial_positionZ;
		initial_positionZ = newInitial_positionZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_systemPackage.ROBOT_SYSTEM__INITIAL_POSITION_Z,
					oldInitial_positionZ, initial_positionZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Discretize> getHas_discretize() {
		if (has_discretize == null) {
			has_discretize = new EObjectContainmentEList<Discretize>(Discretize.class, this,
					Robot_systemPackage.ROBOT_SYSTEM__HAS_DISCRETIZE);
		}
		return has_discretize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Analyzer> getHas_analyzer() {
		if (has_analyzer == null) {
			has_analyzer = new EObjectContainmentEList<Analyzer>(Analyzer.class, this,
					Robot_systemPackage.ROBOT_SYSTEM__HAS_ANALYZER);
		}
		return has_analyzer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_ACTUATOR:
			return ((InternalEList<?>) getHas_actuator()).basicRemove(otherEnd, msgs);
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_SENSOR:
			return ((InternalEList<?>) getHas_sensor()).basicRemove(otherEnd, msgs);
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_CONTROLLER:
			return ((InternalEList<?>) getHas_controller()).basicRemove(otherEnd, msgs);
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_DISCRETIZE:
			return ((InternalEList<?>) getHas_discretize()).basicRemove(otherEnd, msgs);
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_ANALYZER:
			return ((InternalEList<?>) getHas_analyzer()).basicRemove(otherEnd, msgs);
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
		case Robot_systemPackage.ROBOT_SYSTEM__NAME:
			return getName();
		case Robot_systemPackage.ROBOT_SYSTEM__DESCRIPTION:
			return getDescription();
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_ACTUATOR:
			return getHas_actuator();
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_SENSOR:
			return getHas_sensor();
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_CONTROLLER:
			return getHas_controller();
		case Robot_systemPackage.ROBOT_SYSTEM__TYPE_ARCHICTURE:
			return getType_archicture();
		case Robot_systemPackage.ROBOT_SYSTEM__WIDTH:
			return getWidth();
		case Robot_systemPackage.ROBOT_SYSTEM__LENGTH:
			return getLength();
		case Robot_systemPackage.ROBOT_SYSTEM__HEIGHT:
			return getHeight();
		case Robot_systemPackage.ROBOT_SYSTEM__WEIGHT:
			return getWeight();
		case Robot_systemPackage.ROBOT_SYSTEM__INITIAL_POSITION_X:
			return getInitial_positionX();
		case Robot_systemPackage.ROBOT_SYSTEM__INITIAL_POSITION_Y:
			return getInitial_positionY();
		case Robot_systemPackage.ROBOT_SYSTEM__INITIAL_POSITION_Z:
			return getInitial_positionZ();
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_DISCRETIZE:
			return getHas_discretize();
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_ANALYZER:
			return getHas_analyzer();
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
		case Robot_systemPackage.ROBOT_SYSTEM__NAME:
			setName((String) newValue);
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_ACTUATOR:
			getHas_actuator().clear();
			getHas_actuator().addAll((Collection<? extends Actuator>) newValue);
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_SENSOR:
			getHas_sensor().clear();
			getHas_sensor().addAll((Collection<? extends Sensor>) newValue);
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_CONTROLLER:
			getHas_controller().clear();
			getHas_controller().addAll((Collection<? extends Controller>) newValue);
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__TYPE_ARCHICTURE:
			setType_archicture((Type_architecture) newValue);
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__WIDTH:
			setWidth((Double) newValue);
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__LENGTH:
			setLength((Double) newValue);
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__HEIGHT:
			setHeight((Double) newValue);
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__WEIGHT:
			setWeight((Double) newValue);
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__INITIAL_POSITION_X:
			setInitial_positionX((Double) newValue);
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__INITIAL_POSITION_Y:
			setInitial_positionY((Double) newValue);
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__INITIAL_POSITION_Z:
			setInitial_positionZ((Double) newValue);
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_DISCRETIZE:
			getHas_discretize().clear();
			getHas_discretize().addAll((Collection<? extends Discretize>) newValue);
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_ANALYZER:
			getHas_analyzer().clear();
			getHas_analyzer().addAll((Collection<? extends Analyzer>) newValue);
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
		case Robot_systemPackage.ROBOT_SYSTEM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_ACTUATOR:
			getHas_actuator().clear();
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_SENSOR:
			getHas_sensor().clear();
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_CONTROLLER:
			getHas_controller().clear();
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__TYPE_ARCHICTURE:
			setType_archicture(TYPE_ARCHICTURE_EDEFAULT);
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__LENGTH:
			setLength(LENGTH_EDEFAULT);
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__WEIGHT:
			setWeight(WEIGHT_EDEFAULT);
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__INITIAL_POSITION_X:
			setInitial_positionX(INITIAL_POSITION_X_EDEFAULT);
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__INITIAL_POSITION_Y:
			setInitial_positionY(INITIAL_POSITION_Y_EDEFAULT);
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__INITIAL_POSITION_Z:
			setInitial_positionZ(INITIAL_POSITION_Z_EDEFAULT);
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_DISCRETIZE:
			getHas_discretize().clear();
			return;
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_ANALYZER:
			getHas_analyzer().clear();
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
		case Robot_systemPackage.ROBOT_SYSTEM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Robot_systemPackage.ROBOT_SYSTEM__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_ACTUATOR:
			return has_actuator != null && !has_actuator.isEmpty();
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_SENSOR:
			return has_sensor != null && !has_sensor.isEmpty();
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_CONTROLLER:
			return has_controller != null && !has_controller.isEmpty();
		case Robot_systemPackage.ROBOT_SYSTEM__TYPE_ARCHICTURE:
			return type_archicture != TYPE_ARCHICTURE_EDEFAULT;
		case Robot_systemPackage.ROBOT_SYSTEM__WIDTH:
			return width != WIDTH_EDEFAULT;
		case Robot_systemPackage.ROBOT_SYSTEM__LENGTH:
			return length != LENGTH_EDEFAULT;
		case Robot_systemPackage.ROBOT_SYSTEM__HEIGHT:
			return height != HEIGHT_EDEFAULT;
		case Robot_systemPackage.ROBOT_SYSTEM__WEIGHT:
			return weight != WEIGHT_EDEFAULT;
		case Robot_systemPackage.ROBOT_SYSTEM__INITIAL_POSITION_X:
			return initial_positionX != INITIAL_POSITION_X_EDEFAULT;
		case Robot_systemPackage.ROBOT_SYSTEM__INITIAL_POSITION_Y:
			return initial_positionY != INITIAL_POSITION_Y_EDEFAULT;
		case Robot_systemPackage.ROBOT_SYSTEM__INITIAL_POSITION_Z:
			return initial_positionZ != INITIAL_POSITION_Z_EDEFAULT;
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_DISCRETIZE:
			return has_discretize != null && !has_discretize.isEmpty();
		case Robot_systemPackage.ROBOT_SYSTEM__HAS_ANALYZER:
			return has_analyzer != null && !has_analyzer.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(", type_archicture: ");
		result.append(type_archicture);
		result.append(", width: ");
		result.append(width);
		result.append(", length: ");
		result.append(length);
		result.append(", height: ");
		result.append(height);
		result.append(", weight: ");
		result.append(weight);
		result.append(", initial_positionX: ");
		result.append(initial_positionX);
		result.append(", initial_positionY: ");
		result.append(initial_positionY);
		result.append(", initial_positionZ: ");
		result.append(initial_positionZ);
		result.append(')');
		return result.toString();
	}

} //Robot_SystemImpl

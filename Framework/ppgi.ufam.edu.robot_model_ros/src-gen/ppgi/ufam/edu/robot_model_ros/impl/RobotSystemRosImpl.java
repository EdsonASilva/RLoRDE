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

import ppgi.ufam.edu.robot_model_ros.Node;
import ppgi.ufam.edu.robot_model_ros.RobotSystemRos;
import ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage;
import ppgi.ufam.edu.robot_model_ros.argument;
import ppgi.ufam.edu.robot_model_ros.include;
import ppgi.ufam.edu.robot_model_ros.parameter;
import ppgi.ufam.edu.robot_model_ros.service;
import ppgi.ufam.edu.robot_model_ros.topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot System Ros</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.RobotSystemRosImpl#getName <em>Name</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.RobotSystemRosImpl#getType_architecture <em>Type architecture</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.RobotSystemRosImpl#getRos_to_node <em>Ros to node</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.RobotSystemRosImpl#getRos_to_include <em>Ros to include</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.RobotSystemRosImpl#getRos_to_argument <em>Ros to argument</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.RobotSystemRosImpl#getRos_to_parameter <em>Ros to parameter</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.RobotSystemRosImpl#getRos_to_service <em>Ros to service</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.RobotSystemRosImpl#getRos_to_topic <em>Ros to topic</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.RobotSystemRosImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.RobotSystemRosImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.RobotSystemRosImpl#getLength <em>Length</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.RobotSystemRosImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.RobotSystemRosImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.RobotSystemRosImpl#getInitial_positionX <em>Initial position X</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.RobotSystemRosImpl#getInitial_positionZ <em>Initial position Z</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.RobotSystemRosImpl#getInitial_positionY <em>Initial position Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotSystemRosImpl extends MinimalEObjectImpl.Container implements RobotSystemRos {
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
	 * The default value of the '{@link #getType_architecture() <em>Type architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_architecture()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_ARCHITECTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType_architecture() <em>Type architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_architecture()
	 * @generated
	 * @ordered
	 */
	protected String type_architecture = TYPE_ARCHITECTURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRos_to_node() <em>Ros to node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRos_to_node()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> ros_to_node;

	/**
	 * The cached value of the '{@link #getRos_to_include() <em>Ros to include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRos_to_include()
	 * @generated
	 * @ordered
	 */
	protected EList<include> ros_to_include;

	/**
	 * The cached value of the '{@link #getRos_to_argument() <em>Ros to argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRos_to_argument()
	 * @generated
	 * @ordered
	 */
	protected EList<argument> ros_to_argument;

	/**
	 * The cached value of the '{@link #getRos_to_parameter() <em>Ros to parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRos_to_parameter()
	 * @generated
	 * @ordered
	 */
	protected EList<parameter> ros_to_parameter;

	/**
	 * The cached value of the '{@link #getRos_to_service() <em>Ros to service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRos_to_service()
	 * @generated
	 * @ordered
	 */
	protected EList<service> ros_to_service;

	/**
	 * The cached value of the '{@link #getRos_to_topic() <em>Ros to topic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRos_to_topic()
	 * @generated
	 * @ordered
	 */
	protected EList<topic> ros_to_topic;

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
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.1;

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
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final double LENGTH_EDEFAULT = 0.22;

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
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.15;

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
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 2.6;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotSystemRosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Robot_model_rosPackage.Literals.ROBOT_SYSTEM_ROS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_model_rosPackage.ROBOT_SYSTEM_ROS__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType_architecture() {
		return type_architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType_architecture(String newType_architecture) {
		String oldType_architecture = type_architecture;
		type_architecture = newType_architecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Robot_model_rosPackage.ROBOT_SYSTEM_ROS__TYPE_ARCHITECTURE, oldType_architecture,
					type_architecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getRos_to_node() {
		if (ros_to_node == null) {
			ros_to_node = new EObjectContainmentEList<Node>(Node.class, this,
					Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_NODE);
		}
		return ros_to_node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<include> getRos_to_include() {
		if (ros_to_include == null) {
			ros_to_include = new EObjectContainmentEList<include>(include.class, this,
					Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_INCLUDE);
		}
		return ros_to_include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<argument> getRos_to_argument() {
		if (ros_to_argument == null) {
			ros_to_argument = new EObjectContainmentEList<argument>(argument.class, this,
					Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_ARGUMENT);
		}
		return ros_to_argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<parameter> getRos_to_parameter() {
		if (ros_to_parameter == null) {
			ros_to_parameter = new EObjectContainmentEList<parameter>(parameter.class, this,
					Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_PARAMETER);
		}
		return ros_to_parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<service> getRos_to_service() {
		if (ros_to_service == null) {
			ros_to_service = new EObjectContainmentEList<service>(service.class, this,
					Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_SERVICE);
		}
		return ros_to_service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<topic> getRos_to_topic() {
		if (ros_to_topic == null) {
			ros_to_topic = new EObjectContainmentEList<topic>(topic.class, this,
					Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_TOPIC);
		}
		return ros_to_topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_model_rosPackage.ROBOT_SYSTEM_ROS__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(double newHeight) {
		double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_model_rosPackage.ROBOT_SYSTEM_ROS__HEIGHT,
					oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(double newLength) {
		double oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_model_rosPackage.ROBOT_SYSTEM_ROS__LENGTH,
					oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_model_rosPackage.ROBOT_SYSTEM_ROS__WIDTH,
					oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(double newWeight) {
		double oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_model_rosPackage.ROBOT_SYSTEM_ROS__WEIGHT,
					oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInitial_positionX() {
		return initial_positionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial_positionX(double newInitial_positionX) {
		double oldInitial_positionX = initial_positionX;
		initial_positionX = newInitial_positionX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Robot_model_rosPackage.ROBOT_SYSTEM_ROS__INITIAL_POSITION_X, oldInitial_positionX,
					initial_positionX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInitial_positionZ() {
		return initial_positionZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial_positionZ(double newInitial_positionZ) {
		double oldInitial_positionZ = initial_positionZ;
		initial_positionZ = newInitial_positionZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Robot_model_rosPackage.ROBOT_SYSTEM_ROS__INITIAL_POSITION_Z, oldInitial_positionZ,
					initial_positionZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInitial_positionY() {
		return initial_positionY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial_positionY(double newInitial_positionY) {
		double oldInitial_positionY = initial_positionY;
		initial_positionY = newInitial_positionY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Robot_model_rosPackage.ROBOT_SYSTEM_ROS__INITIAL_POSITION_Y, oldInitial_positionY,
					initial_positionY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_NODE:
			return ((InternalEList<?>) getRos_to_node()).basicRemove(otherEnd, msgs);
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_INCLUDE:
			return ((InternalEList<?>) getRos_to_include()).basicRemove(otherEnd, msgs);
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_ARGUMENT:
			return ((InternalEList<?>) getRos_to_argument()).basicRemove(otherEnd, msgs);
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_PARAMETER:
			return ((InternalEList<?>) getRos_to_parameter()).basicRemove(otherEnd, msgs);
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_SERVICE:
			return ((InternalEList<?>) getRos_to_service()).basicRemove(otherEnd, msgs);
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_TOPIC:
			return ((InternalEList<?>) getRos_to_topic()).basicRemove(otherEnd, msgs);
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
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__NAME:
			return getName();
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__TYPE_ARCHITECTURE:
			return getType_architecture();
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_NODE:
			return getRos_to_node();
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_INCLUDE:
			return getRos_to_include();
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_ARGUMENT:
			return getRos_to_argument();
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_PARAMETER:
			return getRos_to_parameter();
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_SERVICE:
			return getRos_to_service();
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_TOPIC:
			return getRos_to_topic();
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__DESCRIPTION:
			return getDescription();
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__HEIGHT:
			return getHeight();
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__LENGTH:
			return getLength();
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__WIDTH:
			return getWidth();
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__WEIGHT:
			return getWeight();
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__INITIAL_POSITION_X:
			return getInitial_positionX();
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__INITIAL_POSITION_Z:
			return getInitial_positionZ();
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__INITIAL_POSITION_Y:
			return getInitial_positionY();
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
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__NAME:
			setName((String) newValue);
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__TYPE_ARCHITECTURE:
			setType_architecture((String) newValue);
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_NODE:
			getRos_to_node().clear();
			getRos_to_node().addAll((Collection<? extends Node>) newValue);
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_INCLUDE:
			getRos_to_include().clear();
			getRos_to_include().addAll((Collection<? extends include>) newValue);
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_ARGUMENT:
			getRos_to_argument().clear();
			getRos_to_argument().addAll((Collection<? extends argument>) newValue);
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_PARAMETER:
			getRos_to_parameter().clear();
			getRos_to_parameter().addAll((Collection<? extends parameter>) newValue);
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_SERVICE:
			getRos_to_service().clear();
			getRos_to_service().addAll((Collection<? extends service>) newValue);
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_TOPIC:
			getRos_to_topic().clear();
			getRos_to_topic().addAll((Collection<? extends topic>) newValue);
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__HEIGHT:
			setHeight((Double) newValue);
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__LENGTH:
			setLength((Double) newValue);
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__WIDTH:
			setWidth((Double) newValue);
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__WEIGHT:
			setWeight((Double) newValue);
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__INITIAL_POSITION_X:
			setInitial_positionX((Double) newValue);
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__INITIAL_POSITION_Z:
			setInitial_positionZ((Double) newValue);
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__INITIAL_POSITION_Y:
			setInitial_positionY((Double) newValue);
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
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__TYPE_ARCHITECTURE:
			setType_architecture(TYPE_ARCHITECTURE_EDEFAULT);
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_NODE:
			getRos_to_node().clear();
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_INCLUDE:
			getRos_to_include().clear();
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_ARGUMENT:
			getRos_to_argument().clear();
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_PARAMETER:
			getRos_to_parameter().clear();
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_SERVICE:
			getRos_to_service().clear();
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_TOPIC:
			getRos_to_topic().clear();
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__LENGTH:
			setLength(LENGTH_EDEFAULT);
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__WEIGHT:
			setWeight(WEIGHT_EDEFAULT);
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__INITIAL_POSITION_X:
			setInitial_positionX(INITIAL_POSITION_X_EDEFAULT);
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__INITIAL_POSITION_Z:
			setInitial_positionZ(INITIAL_POSITION_Z_EDEFAULT);
			return;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__INITIAL_POSITION_Y:
			setInitial_positionY(INITIAL_POSITION_Y_EDEFAULT);
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
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__TYPE_ARCHITECTURE:
			return TYPE_ARCHITECTURE_EDEFAULT == null ? type_architecture != null
					: !TYPE_ARCHITECTURE_EDEFAULT.equals(type_architecture);
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_NODE:
			return ros_to_node != null && !ros_to_node.isEmpty();
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_INCLUDE:
			return ros_to_include != null && !ros_to_include.isEmpty();
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_ARGUMENT:
			return ros_to_argument != null && !ros_to_argument.isEmpty();
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_PARAMETER:
			return ros_to_parameter != null && !ros_to_parameter.isEmpty();
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_SERVICE:
			return ros_to_service != null && !ros_to_service.isEmpty();
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__ROS_TO_TOPIC:
			return ros_to_topic != null && !ros_to_topic.isEmpty();
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__HEIGHT:
			return height != HEIGHT_EDEFAULT;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__LENGTH:
			return length != LENGTH_EDEFAULT;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__WIDTH:
			return width != WIDTH_EDEFAULT;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__WEIGHT:
			return weight != WEIGHT_EDEFAULT;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__INITIAL_POSITION_X:
			return initial_positionX != INITIAL_POSITION_X_EDEFAULT;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__INITIAL_POSITION_Z:
			return initial_positionZ != INITIAL_POSITION_Z_EDEFAULT;
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS__INITIAL_POSITION_Y:
			return initial_positionY != INITIAL_POSITION_Y_EDEFAULT;
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
		result.append(", type_architecture: ");
		result.append(type_architecture);
		result.append(", description: ");
		result.append(description);
		result.append(", height: ");
		result.append(height);
		result.append(", length: ");
		result.append(length);
		result.append(", width: ");
		result.append(width);
		result.append(", weight: ");
		result.append(weight);
		result.append(", initial_positionX: ");
		result.append(initial_positionX);
		result.append(", initial_positionZ: ");
		result.append(initial_positionZ);
		result.append(", initial_positionY: ");
		result.append(initial_positionY);
		result.append(')');
		return result.toString();
	}

} //RobotSystemRosImpl

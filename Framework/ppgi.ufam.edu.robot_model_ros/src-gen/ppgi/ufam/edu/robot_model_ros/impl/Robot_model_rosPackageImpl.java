/**
 */
package ppgi.ufam.edu.robot_model_ros.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ppgi.ufam.edu.robot_model_ros.Node;
import ppgi.ufam.edu.robot_model_ros.RobotSystemRos;
import ppgi.ufam.edu.robot_model_ros.Robot_model_rosFactory;
import ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage;
import ppgi.ufam.edu.robot_model_ros.World_ROS;
import ppgi.ufam.edu.robot_model_ros.argument;
import ppgi.ufam.edu.robot_model_ros.include;
import ppgi.ufam.edu.robot_model_ros.parameter;
import ppgi.ufam.edu.robot_model_ros.service;
import ppgi.ufam.edu.robot_model_ros.topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Robot_model_rosPackageImpl extends EPackageImpl implements Robot_model_rosPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotSystemRosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass world_ROSEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Robot_model_rosPackageImpl() {
		super(eNS_URI, Robot_model_rosFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Robot_model_rosPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Robot_model_rosPackage init() {
		if (isInited)
			return (Robot_model_rosPackage) EPackage.Registry.INSTANCE.getEPackage(Robot_model_rosPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRobot_model_rosPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Robot_model_rosPackageImpl theRobot_model_rosPackage = registeredRobot_model_rosPackage instanceof Robot_model_rosPackageImpl
				? (Robot_model_rosPackageImpl) registeredRobot_model_rosPackage
				: new Robot_model_rosPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRobot_model_rosPackage.createPackageContents();

		// Initialize created meta-data
		theRobot_model_rosPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRobot_model_rosPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Robot_model_rosPackage.eNS_URI, theRobot_model_rosPackage);
		return theRobot_model_rosPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getinclude() {
		return includeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getinclude_File() {
		return (EAttribute) includeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getinclude_Include_to_argument() {
		return (EReference) includeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getinclude_Include_name() {
		return (EAttribute) includeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getservice() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getservice_Name_serv() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getservice_Value_serv() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getservice_Service_subscribe() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getservice_Service_pub() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getparameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getparameter_Name_param() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getparameter_Value_param() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getparameter_Type_param() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getparameter_Command() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRobotSystemRos() {
		return robotSystemRosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotSystemRos_Name() {
		return (EAttribute) robotSystemRosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotSystemRos_Type_architecture() {
		return (EAttribute) robotSystemRosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobotSystemRos_Ros_to_node() {
		return (EReference) robotSystemRosEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobotSystemRos_Ros_to_include() {
		return (EReference) robotSystemRosEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobotSystemRos_Ros_to_argument() {
		return (EReference) robotSystemRosEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobotSystemRos_Ros_to_parameter() {
		return (EReference) robotSystemRosEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobotSystemRos_Ros_to_service() {
		return (EReference) robotSystemRosEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobotSystemRos_Ros_to_topic() {
		return (EReference) robotSystemRosEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotSystemRos_Description() {
		return (EAttribute) robotSystemRosEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotSystemRos_Height() {
		return (EAttribute) robotSystemRosEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotSystemRos_Length() {
		return (EAttribute) robotSystemRosEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotSystemRos_Width() {
		return (EAttribute) robotSystemRosEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotSystemRos_Weight() {
		return (EAttribute) robotSystemRosEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotSystemRos_Initial_positionX() {
		return (EAttribute) robotSystemRosEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotSystemRos_Initial_positionZ() {
		return (EAttribute) robotSystemRosEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotSystemRos_Initial_positionY() {
		return (EAttribute) robotSystemRosEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getargument() {
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getargument_Arg_name() {
		return (EAttribute) argumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getargument_Arg_value() {
		return (EAttribute) argumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettopic() {
		return topicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettopic_Topic_name() {
		return (EAttribute) topicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Name_node() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Package_name() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Type_node() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Publish() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Node_to_argument() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Subscribe() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Node_to_node() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Type_controller() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorld_ROS() {
		return world_ROSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorld_ROS_World_name() {
		return (EAttribute) world_ROSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorld_ROS_Simulator() {
		return (EAttribute) world_ROSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorld_ROS_World_to_robotsystem() {
		return (EReference) world_ROSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robot_model_rosFactory getRobot_model_rosFactory() {
		return (Robot_model_rosFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		includeEClass = createEClass(INCLUDE);
		createEAttribute(includeEClass, INCLUDE__FILE);
		createEReference(includeEClass, INCLUDE__INCLUDE_TO_ARGUMENT);
		createEAttribute(includeEClass, INCLUDE__INCLUDE_NAME);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__NAME_SERV);
		createEAttribute(serviceEClass, SERVICE__VALUE_SERV);
		createEReference(serviceEClass, SERVICE__SERVICE_SUBSCRIBE);
		createEReference(serviceEClass, SERVICE__SERVICE_PUB);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME_PARAM);
		createEAttribute(parameterEClass, PARAMETER__VALUE_PARAM);
		createEAttribute(parameterEClass, PARAMETER__TYPE_PARAM);
		createEAttribute(parameterEClass, PARAMETER__COMMAND);

		robotSystemRosEClass = createEClass(ROBOT_SYSTEM_ROS);
		createEAttribute(robotSystemRosEClass, ROBOT_SYSTEM_ROS__NAME);
		createEAttribute(robotSystemRosEClass, ROBOT_SYSTEM_ROS__TYPE_ARCHITECTURE);
		createEReference(robotSystemRosEClass, ROBOT_SYSTEM_ROS__ROS_TO_NODE);
		createEReference(robotSystemRosEClass, ROBOT_SYSTEM_ROS__ROS_TO_INCLUDE);
		createEReference(robotSystemRosEClass, ROBOT_SYSTEM_ROS__ROS_TO_ARGUMENT);
		createEReference(robotSystemRosEClass, ROBOT_SYSTEM_ROS__ROS_TO_PARAMETER);
		createEReference(robotSystemRosEClass, ROBOT_SYSTEM_ROS__ROS_TO_SERVICE);
		createEReference(robotSystemRosEClass, ROBOT_SYSTEM_ROS__ROS_TO_TOPIC);
		createEAttribute(robotSystemRosEClass, ROBOT_SYSTEM_ROS__DESCRIPTION);
		createEAttribute(robotSystemRosEClass, ROBOT_SYSTEM_ROS__HEIGHT);
		createEAttribute(robotSystemRosEClass, ROBOT_SYSTEM_ROS__LENGTH);
		createEAttribute(robotSystemRosEClass, ROBOT_SYSTEM_ROS__WIDTH);
		createEAttribute(robotSystemRosEClass, ROBOT_SYSTEM_ROS__WEIGHT);
		createEAttribute(robotSystemRosEClass, ROBOT_SYSTEM_ROS__INITIAL_POSITION_X);
		createEAttribute(robotSystemRosEClass, ROBOT_SYSTEM_ROS__INITIAL_POSITION_Z);
		createEAttribute(robotSystemRosEClass, ROBOT_SYSTEM_ROS__INITIAL_POSITION_Y);

		argumentEClass = createEClass(ARGUMENT);
		createEAttribute(argumentEClass, ARGUMENT__ARG_NAME);
		createEAttribute(argumentEClass, ARGUMENT__ARG_VALUE);

		topicEClass = createEClass(TOPIC);
		createEAttribute(topicEClass, TOPIC__TOPIC_NAME);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME_NODE);
		createEAttribute(nodeEClass, NODE__PACKAGE_NAME);
		createEAttribute(nodeEClass, NODE__TYPE_NODE);
		createEReference(nodeEClass, NODE__PUBLISH);
		createEReference(nodeEClass, NODE__NODE_TO_ARGUMENT);
		createEReference(nodeEClass, NODE__SUBSCRIBE);
		createEReference(nodeEClass, NODE__NODE_TO_NODE);
		createEAttribute(nodeEClass, NODE__TYPE_CONTROLLER);

		world_ROSEClass = createEClass(WORLD_ROS);
		createEAttribute(world_ROSEClass, WORLD_ROS__WORLD_NAME);
		createEAttribute(world_ROSEClass, WORLD_ROS__SIMULATOR);
		createEReference(world_ROSEClass, WORLD_ROS__WORLD_TO_ROBOTSYSTEM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(includeEClass, include.class, "include", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getinclude_File(), ecorePackage.getEString(), "file", null, 0, 1, include.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getinclude_Include_to_argument(), this.getargument(), null, "include_to_argument", null, 0, -1,
				include.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getinclude_Include_name(), ecorePackage.getEString(), "include_name", null, 0, 1, include.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, service.class, "service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getservice_Name_serv(), ecorePackage.getEString(), "name_serv", null, 0, 1, service.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getservice_Value_serv(), ecorePackage.getEString(), "value_serv", null, 0, 1, service.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getservice_Service_subscribe(), this.gettopic(), null, "service_subscribe", null, 0, 1,
				service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getservice_Service_pub(), this.getNode(), null, "service_pub", null, 0, -1, service.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, parameter.class, "parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getparameter_Name_param(), ecorePackage.getEString(), "name_param", null, 0, 1, parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getparameter_Value_param(), ecorePackage.getEString(), "value_param", null, 0, 1,
				parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getparameter_Type_param(), ecorePackage.getEString(), "type_param", null, 0, 1, parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getparameter_Command(), ecorePackage.getEString(), "command", null, 0, 1, parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(robotSystemRosEClass, RobotSystemRos.class, "RobotSystemRos", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRobotSystemRos_Name(), ecorePackage.getEString(), "name", null, 0, 1, RobotSystemRos.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobotSystemRos_Type_architecture(), ecorePackage.getEString(), "type_architecture", null, 0,
				1, RobotSystemRos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRobotSystemRos_Ros_to_node(), this.getNode(), null, "ros_to_node", null, 0, -1,
				RobotSystemRos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobotSystemRos_Ros_to_include(), this.getinclude(), null, "ros_to_include", null, 0, -1,
				RobotSystemRos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobotSystemRos_Ros_to_argument(), this.getargument(), null, "ros_to_argument", null, 0, -1,
				RobotSystemRos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobotSystemRos_Ros_to_parameter(), this.getparameter(), null, "ros_to_parameter", null, 0, -1,
				RobotSystemRos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobotSystemRos_Ros_to_service(), this.getservice(), null, "ros_to_service", null, 0, -1,
				RobotSystemRos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobotSystemRos_Ros_to_topic(), this.gettopic(), null, "ros_to_topic", null, 0, -1,
				RobotSystemRos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobotSystemRos_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				RobotSystemRos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobotSystemRos_Height(), ecorePackage.getEDouble(), "height", "0.10", 0, 1,
				RobotSystemRos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobotSystemRos_Length(), ecorePackage.getEDouble(), "length", "0.22", 0, 1,
				RobotSystemRos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobotSystemRos_Width(), ecorePackage.getEDouble(), "width", "0.15", 0, 1,
				RobotSystemRos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobotSystemRos_Weight(), ecorePackage.getEDouble(), "weight", "2.6", 0, 1,
				RobotSystemRos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobotSystemRos_Initial_positionX(), ecorePackage.getEDouble(), "initial_positionX", "0", 1, 1,
				RobotSystemRos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobotSystemRos_Initial_positionZ(), ecorePackage.getEDouble(), "initial_positionZ", "0", 1, 1,
				RobotSystemRos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobotSystemRos_Initial_positionY(), ecorePackage.getEDouble(), "initial_positionY", "0", 1, 1,
				RobotSystemRos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(argumentEClass, argument.class, "argument", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getargument_Arg_name(), ecorePackage.getEString(), "arg_name", null, 0, 1, argument.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getargument_Arg_value(), ecorePackage.getEString(), "arg_value", null, 0, 1, argument.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topicEClass, topic.class, "topic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(gettopic_Topic_name(), ecorePackage.getEString(), "topic_name", null, 0, 1, topic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name_node(), ecorePackage.getEString(), "name_node", null, 0, 1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Package_name(), ecorePackage.getEString(), "package_name", null, 0, 1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Type_node(), ecorePackage.getEString(), "type_node", null, 0, 1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Publish(), this.gettopic(), null, "publish", null, 0, -1, Node.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getNode_Node_to_argument(), this.getargument(), null, "node_to_argument", null, 0, -1,
				Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Subscribe(), this.gettopic(), null, "subscribe", null, 0, -1, Node.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getNode_Node_to_node(), this.getNode(), null, "node_to_node", null, 0, -1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Type_controller(), ecorePackage.getEString(), "type_controller", null, 0, 1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(world_ROSEClass, World_ROS.class, "World_ROS", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorld_ROS_World_name(), ecorePackage.getEString(), "world_name", null, 1, 1, World_ROS.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorld_ROS_Simulator(), ecorePackage.getEBoolean(), "simulator", "true", 1, 1, World_ROS.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorld_ROS_World_to_robotsystem(), this.getRobotSystemRos(), null, "world_to_robotsystem",
				null, 0, -1, World_ROS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Robot_model_rosPackageImpl

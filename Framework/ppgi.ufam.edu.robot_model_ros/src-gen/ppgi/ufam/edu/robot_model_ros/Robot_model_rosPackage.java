/**
 */
package ppgi.ufam.edu.robot_model_ros;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosFactory
 * @model kind="package"
 * @generated
 */
public interface Robot_model_rosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "robot_model_ros";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ppgi.ufam.edu/robot_model_ros";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "robot_model_ros";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Robot_model_rosPackage eINSTANCE = ppgi.ufam.edu.robot_model_ros.impl.Robot_model_rosPackageImpl.init();

	/**
	 * The meta object id for the '{@link ppgi.ufam.edu.robot_model_ros.impl.includeImpl <em>include</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppgi.ufam.edu.robot_model_ros.impl.includeImpl
	 * @see ppgi.ufam.edu.robot_model_ros.impl.Robot_model_rosPackageImpl#getinclude()
	 * @generated
	 */
	int INCLUDE = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__FILE = 0;

	/**
	 * The feature id for the '<em><b>Include to argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__INCLUDE_TO_ARGUMENT = 1;

	/**
	 * The feature id for the '<em><b>Include name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__INCLUDE_NAME = 2;

	/**
	 * The number of structural features of the '<em>include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ppgi.ufam.edu.robot_model_ros.impl.serviceImpl <em>service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppgi.ufam.edu.robot_model_ros.impl.serviceImpl
	 * @see ppgi.ufam.edu.robot_model_ros.impl.Robot_model_rosPackageImpl#getservice()
	 * @generated
	 */
	int SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Name serv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME_SERV = 0;

	/**
	 * The feature id for the '<em><b>Value serv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__VALUE_SERV = 1;

	/**
	 * The feature id for the '<em><b>Service subscribe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICE_SUBSCRIBE = 2;

	/**
	 * The feature id for the '<em><b>Service pub</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICE_PUB = 3;

	/**
	 * The number of structural features of the '<em>service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ppgi.ufam.edu.robot_model_ros.impl.parameterImpl <em>parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppgi.ufam.edu.robot_model_ros.impl.parameterImpl
	 * @see ppgi.ufam.edu.robot_model_ros.impl.Robot_model_rosPackageImpl#getparameter()
	 * @generated
	 */
	int PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Name param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME_PARAM = 0;

	/**
	 * The feature id for the '<em><b>Value param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE_PARAM = 1;

	/**
	 * The feature id for the '<em><b>Type param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE_PARAM = 2;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__COMMAND = 3;

	/**
	 * The number of structural features of the '<em>parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ppgi.ufam.edu.robot_model_ros.impl.RobotSystemRosImpl <em>Robot System Ros</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppgi.ufam.edu.robot_model_ros.impl.RobotSystemRosImpl
	 * @see ppgi.ufam.edu.robot_model_ros.impl.Robot_model_rosPackageImpl#getRobotSystemRos()
	 * @generated
	 */
	int ROBOT_SYSTEM_ROS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM_ROS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM_ROS__TYPE_ARCHITECTURE = 1;

	/**
	 * The feature id for the '<em><b>Ros to node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM_ROS__ROS_TO_NODE = 2;

	/**
	 * The feature id for the '<em><b>Ros to include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM_ROS__ROS_TO_INCLUDE = 3;

	/**
	 * The feature id for the '<em><b>Ros to argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM_ROS__ROS_TO_ARGUMENT = 4;

	/**
	 * The feature id for the '<em><b>Ros to parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM_ROS__ROS_TO_PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Ros to service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM_ROS__ROS_TO_SERVICE = 6;

	/**
	 * The feature id for the '<em><b>Ros to topic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM_ROS__ROS_TO_TOPIC = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM_ROS__DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM_ROS__HEIGHT = 9;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM_ROS__LENGTH = 10;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM_ROS__WIDTH = 11;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM_ROS__WEIGHT = 12;

	/**
	 * The feature id for the '<em><b>Initial position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM_ROS__INITIAL_POSITION_X = 13;

	/**
	 * The feature id for the '<em><b>Initial position Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM_ROS__INITIAL_POSITION_Z = 14;

	/**
	 * The feature id for the '<em><b>Initial position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM_ROS__INITIAL_POSITION_Y = 15;

	/**
	 * The number of structural features of the '<em>Robot System Ros</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM_ROS_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Robot System Ros</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM_ROS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ppgi.ufam.edu.robot_model_ros.impl.argumentImpl <em>argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppgi.ufam.edu.robot_model_ros.impl.argumentImpl
	 * @see ppgi.ufam.edu.robot_model_ros.impl.Robot_model_rosPackageImpl#getargument()
	 * @generated
	 */
	int ARGUMENT = 4;

	/**
	 * The feature id for the '<em><b>Arg name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ARG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Arg value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ARG_VALUE = 1;

	/**
	 * The number of structural features of the '<em>argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ppgi.ufam.edu.robot_model_ros.impl.topicImpl <em>topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppgi.ufam.edu.robot_model_ros.impl.topicImpl
	 * @see ppgi.ufam.edu.robot_model_ros.impl.Robot_model_rosPackageImpl#gettopic()
	 * @generated
	 */
	int TOPIC = 5;

	/**
	 * The feature id for the '<em><b>Topic name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__TOPIC_NAME = 0;

	/**
	 * The number of structural features of the '<em>topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ppgi.ufam.edu.robot_model_ros.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppgi.ufam.edu.robot_model_ros.impl.NodeImpl
	 * @see ppgi.ufam.edu.robot_model_ros.impl.Robot_model_rosPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 6;

	/**
	 * The feature id for the '<em><b>Name node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME_NODE = 0;

	/**
	 * The feature id for the '<em><b>Package name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PACKAGE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Type node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TYPE_NODE = 2;

	/**
	 * The feature id for the '<em><b>Publish</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PUBLISH = 3;

	/**
	 * The feature id for the '<em><b>Node to argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODE_TO_ARGUMENT = 4;

	/**
	 * The feature id for the '<em><b>Subscribe</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SUBSCRIBE = 5;

	/**
	 * The feature id for the '<em><b>Node to node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODE_TO_NODE = 6;

	/**
	 * The feature id for the '<em><b>Type controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TYPE_CONTROLLER = 7;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ppgi.ufam.edu.robot_model_ros.impl.World_ROSImpl <em>World ROS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppgi.ufam.edu.robot_model_ros.impl.World_ROSImpl
	 * @see ppgi.ufam.edu.robot_model_ros.impl.Robot_model_rosPackageImpl#getWorld_ROS()
	 * @generated
	 */
	int WORLD_ROS = 7;

	/**
	 * The feature id for the '<em><b>World name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_ROS__WORLD_NAME = 0;

	/**
	 * The feature id for the '<em><b>Simulator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_ROS__SIMULATOR = 1;

	/**
	 * The feature id for the '<em><b>World to robotsystem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_ROS__WORLD_TO_ROBOTSYSTEM = 2;

	/**
	 * The number of structural features of the '<em>World ROS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_ROS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>World ROS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_ROS_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link ppgi.ufam.edu.robot_model_ros.include <em>include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>include</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.include
	 * @generated
	 */
	EClass getinclude();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.include#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.include#getFile()
	 * @see #getinclude()
	 * @generated
	 */
	EAttribute getinclude_File();

	/**
	 * Returns the meta object for the containment reference list '{@link ppgi.ufam.edu.robot_model_ros.include#getInclude_to_argument <em>Include to argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include to argument</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.include#getInclude_to_argument()
	 * @see #getinclude()
	 * @generated
	 */
	EReference getinclude_Include_to_argument();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.include#getInclude_name <em>Include name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include name</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.include#getInclude_name()
	 * @see #getinclude()
	 * @generated
	 */
	EAttribute getinclude_Include_name();

	/**
	 * Returns the meta object for class '{@link ppgi.ufam.edu.robot_model_ros.service <em>service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>service</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.service
	 * @generated
	 */
	EClass getservice();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.service#getName_serv <em>Name serv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name serv</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.service#getName_serv()
	 * @see #getservice()
	 * @generated
	 */
	EAttribute getservice_Name_serv();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.service#getValue_serv <em>Value serv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value serv</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.service#getValue_serv()
	 * @see #getservice()
	 * @generated
	 */
	EAttribute getservice_Value_serv();

	/**
	 * Returns the meta object for the reference '{@link ppgi.ufam.edu.robot_model_ros.service#getService_subscribe <em>Service subscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service subscribe</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.service#getService_subscribe()
	 * @see #getservice()
	 * @generated
	 */
	EReference getservice_Service_subscribe();

	/**
	 * Returns the meta object for the reference list '{@link ppgi.ufam.edu.robot_model_ros.service#getService_pub <em>Service pub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service pub</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.service#getService_pub()
	 * @see #getservice()
	 * @generated
	 */
	EReference getservice_Service_pub();

	/**
	 * Returns the meta object for class '{@link ppgi.ufam.edu.robot_model_ros.parameter <em>parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>parameter</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.parameter
	 * @generated
	 */
	EClass getparameter();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.parameter#getName_param <em>Name param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name param</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.parameter#getName_param()
	 * @see #getparameter()
	 * @generated
	 */
	EAttribute getparameter_Name_param();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.parameter#getValue_param <em>Value param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value param</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.parameter#getValue_param()
	 * @see #getparameter()
	 * @generated
	 */
	EAttribute getparameter_Value_param();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.parameter#getType_param <em>Type param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type param</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.parameter#getType_param()
	 * @see #getparameter()
	 * @generated
	 */
	EAttribute getparameter_Type_param();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.parameter#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.parameter#getCommand()
	 * @see #getparameter()
	 * @generated
	 */
	EAttribute getparameter_Command();

	/**
	 * Returns the meta object for class '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos <em>Robot System Ros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot System Ros</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.RobotSystemRos
	 * @generated
	 */
	EClass getRobotSystemRos();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getName()
	 * @see #getRobotSystemRos()
	 * @generated
	 */
	EAttribute getRobotSystemRos_Name();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getType_architecture <em>Type architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type architecture</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getType_architecture()
	 * @see #getRobotSystemRos()
	 * @generated
	 */
	EAttribute getRobotSystemRos_Type_architecture();

	/**
	 * Returns the meta object for the containment reference list '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getRos_to_node <em>Ros to node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ros to node</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getRos_to_node()
	 * @see #getRobotSystemRos()
	 * @generated
	 */
	EReference getRobotSystemRos_Ros_to_node();

	/**
	 * Returns the meta object for the containment reference list '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getRos_to_include <em>Ros to include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ros to include</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getRos_to_include()
	 * @see #getRobotSystemRos()
	 * @generated
	 */
	EReference getRobotSystemRos_Ros_to_include();

	/**
	 * Returns the meta object for the containment reference list '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getRos_to_argument <em>Ros to argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ros to argument</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getRos_to_argument()
	 * @see #getRobotSystemRos()
	 * @generated
	 */
	EReference getRobotSystemRos_Ros_to_argument();

	/**
	 * Returns the meta object for the containment reference list '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getRos_to_parameter <em>Ros to parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ros to parameter</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getRos_to_parameter()
	 * @see #getRobotSystemRos()
	 * @generated
	 */
	EReference getRobotSystemRos_Ros_to_parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getRos_to_service <em>Ros to service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ros to service</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getRos_to_service()
	 * @see #getRobotSystemRos()
	 * @generated
	 */
	EReference getRobotSystemRos_Ros_to_service();

	/**
	 * Returns the meta object for the containment reference list '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getRos_to_topic <em>Ros to topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ros to topic</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getRos_to_topic()
	 * @see #getRobotSystemRos()
	 * @generated
	 */
	EReference getRobotSystemRos_Ros_to_topic();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getDescription()
	 * @see #getRobotSystemRos()
	 * @generated
	 */
	EAttribute getRobotSystemRos_Description();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getHeight()
	 * @see #getRobotSystemRos()
	 * @generated
	 */
	EAttribute getRobotSystemRos_Height();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getLength()
	 * @see #getRobotSystemRos()
	 * @generated
	 */
	EAttribute getRobotSystemRos_Length();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getWidth()
	 * @see #getRobotSystemRos()
	 * @generated
	 */
	EAttribute getRobotSystemRos_Width();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getWeight()
	 * @see #getRobotSystemRos()
	 * @generated
	 */
	EAttribute getRobotSystemRos_Weight();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getInitial_positionX <em>Initial position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial position X</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getInitial_positionX()
	 * @see #getRobotSystemRos()
	 * @generated
	 */
	EAttribute getRobotSystemRos_Initial_positionX();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getInitial_positionZ <em>Initial position Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial position Z</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getInitial_positionZ()
	 * @see #getRobotSystemRos()
	 * @generated
	 */
	EAttribute getRobotSystemRos_Initial_positionZ();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getInitial_positionY <em>Initial position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial position Y</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getInitial_positionY()
	 * @see #getRobotSystemRos()
	 * @generated
	 */
	EAttribute getRobotSystemRos_Initial_positionY();

	/**
	 * Returns the meta object for class '{@link ppgi.ufam.edu.robot_model_ros.argument <em>argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>argument</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.argument
	 * @generated
	 */
	EClass getargument();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.argument#getArg_name <em>Arg name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arg name</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.argument#getArg_name()
	 * @see #getargument()
	 * @generated
	 */
	EAttribute getargument_Arg_name();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.argument#getArg_value <em>Arg value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arg value</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.argument#getArg_value()
	 * @see #getargument()
	 * @generated
	 */
	EAttribute getargument_Arg_value();

	/**
	 * Returns the meta object for class '{@link ppgi.ufam.edu.robot_model_ros.topic <em>topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>topic</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.topic
	 * @generated
	 */
	EClass gettopic();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.topic#getTopic_name <em>Topic name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic name</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.topic#getTopic_name()
	 * @see #gettopic()
	 * @generated
	 */
	EAttribute gettopic_Topic_name();

	/**
	 * Returns the meta object for class '{@link ppgi.ufam.edu.robot_model_ros.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.Node#getName_node <em>Name node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name node</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.Node#getName_node()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name_node();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.Node#getPackage_name <em>Package name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package name</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.Node#getPackage_name()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Package_name();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.Node#getType_node <em>Type node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type node</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.Node#getType_node()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Type_node();

	/**
	 * Returns the meta object for the reference list '{@link ppgi.ufam.edu.robot_model_ros.Node#getPublish <em>Publish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Publish</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.Node#getPublish()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Publish();

	/**
	 * Returns the meta object for the containment reference list '{@link ppgi.ufam.edu.robot_model_ros.Node#getNode_to_argument <em>Node to argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node to argument</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.Node#getNode_to_argument()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Node_to_argument();

	/**
	 * Returns the meta object for the reference list '{@link ppgi.ufam.edu.robot_model_ros.Node#getSubscribe <em>Subscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subscribe</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.Node#getSubscribe()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Subscribe();

	/**
	 * Returns the meta object for the reference list '{@link ppgi.ufam.edu.robot_model_ros.Node#getNode_to_node <em>Node to node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Node to node</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.Node#getNode_to_node()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Node_to_node();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.Node#getType_controller <em>Type controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type controller</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.Node#getType_controller()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Type_controller();

	/**
	 * Returns the meta object for class '{@link ppgi.ufam.edu.robot_model_ros.World_ROS <em>World ROS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>World ROS</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.World_ROS
	 * @generated
	 */
	EClass getWorld_ROS();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.World_ROS#getWorld_name <em>World name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>World name</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.World_ROS#getWorld_name()
	 * @see #getWorld_ROS()
	 * @generated
	 */
	EAttribute getWorld_ROS_World_name();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_model_ros.World_ROS#isSimulator <em>Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulator</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.World_ROS#isSimulator()
	 * @see #getWorld_ROS()
	 * @generated
	 */
	EAttribute getWorld_ROS_Simulator();

	/**
	 * Returns the meta object for the containment reference list '{@link ppgi.ufam.edu.robot_model_ros.World_ROS#getWorld_to_robotsystem <em>World to robotsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>World to robotsystem</em>'.
	 * @see ppgi.ufam.edu.robot_model_ros.World_ROS#getWorld_to_robotsystem()
	 * @see #getWorld_ROS()
	 * @generated
	 */
	EReference getWorld_ROS_World_to_robotsystem();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Robot_model_rosFactory getRobot_model_rosFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ppgi.ufam.edu.robot_model_ros.impl.includeImpl <em>include</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppgi.ufam.edu.robot_model_ros.impl.includeImpl
		 * @see ppgi.ufam.edu.robot_model_ros.impl.Robot_model_rosPackageImpl#getinclude()
		 * @generated
		 */
		EClass INCLUDE = eINSTANCE.getinclude();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE__FILE = eINSTANCE.getinclude_File();

		/**
		 * The meta object literal for the '<em><b>Include to argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDE__INCLUDE_TO_ARGUMENT = eINSTANCE.getinclude_Include_to_argument();

		/**
		 * The meta object literal for the '<em><b>Include name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE__INCLUDE_NAME = eINSTANCE.getinclude_Include_name();

		/**
		 * The meta object literal for the '{@link ppgi.ufam.edu.robot_model_ros.impl.serviceImpl <em>service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppgi.ufam.edu.robot_model_ros.impl.serviceImpl
		 * @see ppgi.ufam.edu.robot_model_ros.impl.Robot_model_rosPackageImpl#getservice()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getservice();

		/**
		 * The meta object literal for the '<em><b>Name serv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME_SERV = eINSTANCE.getservice_Name_serv();

		/**
		 * The meta object literal for the '<em><b>Value serv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__VALUE_SERV = eINSTANCE.getservice_Value_serv();

		/**
		 * The meta object literal for the '<em><b>Service subscribe</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SERVICE_SUBSCRIBE = eINSTANCE.getservice_Service_subscribe();

		/**
		 * The meta object literal for the '<em><b>Service pub</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SERVICE_PUB = eINSTANCE.getservice_Service_pub();

		/**
		 * The meta object literal for the '{@link ppgi.ufam.edu.robot_model_ros.impl.parameterImpl <em>parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppgi.ufam.edu.robot_model_ros.impl.parameterImpl
		 * @see ppgi.ufam.edu.robot_model_ros.impl.Robot_model_rosPackageImpl#getparameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getparameter();

		/**
		 * The meta object literal for the '<em><b>Name param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME_PARAM = eINSTANCE.getparameter_Name_param();

		/**
		 * The meta object literal for the '<em><b>Value param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE_PARAM = eINSTANCE.getparameter_Value_param();

		/**
		 * The meta object literal for the '<em><b>Type param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE_PARAM = eINSTANCE.getparameter_Type_param();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__COMMAND = eINSTANCE.getparameter_Command();

		/**
		 * The meta object literal for the '{@link ppgi.ufam.edu.robot_model_ros.impl.RobotSystemRosImpl <em>Robot System Ros</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppgi.ufam.edu.robot_model_ros.impl.RobotSystemRosImpl
		 * @see ppgi.ufam.edu.robot_model_ros.impl.Robot_model_rosPackageImpl#getRobotSystemRos()
		 * @generated
		 */
		EClass ROBOT_SYSTEM_ROS = eINSTANCE.getRobotSystemRos();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_SYSTEM_ROS__NAME = eINSTANCE.getRobotSystemRos_Name();

		/**
		 * The meta object literal for the '<em><b>Type architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_SYSTEM_ROS__TYPE_ARCHITECTURE = eINSTANCE.getRobotSystemRos_Type_architecture();

		/**
		 * The meta object literal for the '<em><b>Ros to node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_SYSTEM_ROS__ROS_TO_NODE = eINSTANCE.getRobotSystemRos_Ros_to_node();

		/**
		 * The meta object literal for the '<em><b>Ros to include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_SYSTEM_ROS__ROS_TO_INCLUDE = eINSTANCE.getRobotSystemRos_Ros_to_include();

		/**
		 * The meta object literal for the '<em><b>Ros to argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_SYSTEM_ROS__ROS_TO_ARGUMENT = eINSTANCE.getRobotSystemRos_Ros_to_argument();

		/**
		 * The meta object literal for the '<em><b>Ros to parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_SYSTEM_ROS__ROS_TO_PARAMETER = eINSTANCE.getRobotSystemRos_Ros_to_parameter();

		/**
		 * The meta object literal for the '<em><b>Ros to service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_SYSTEM_ROS__ROS_TO_SERVICE = eINSTANCE.getRobotSystemRos_Ros_to_service();

		/**
		 * The meta object literal for the '<em><b>Ros to topic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_SYSTEM_ROS__ROS_TO_TOPIC = eINSTANCE.getRobotSystemRos_Ros_to_topic();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_SYSTEM_ROS__DESCRIPTION = eINSTANCE.getRobotSystemRos_Description();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_SYSTEM_ROS__HEIGHT = eINSTANCE.getRobotSystemRos_Height();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_SYSTEM_ROS__LENGTH = eINSTANCE.getRobotSystemRos_Length();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_SYSTEM_ROS__WIDTH = eINSTANCE.getRobotSystemRos_Width();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_SYSTEM_ROS__WEIGHT = eINSTANCE.getRobotSystemRos_Weight();

		/**
		 * The meta object literal for the '<em><b>Initial position X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_SYSTEM_ROS__INITIAL_POSITION_X = eINSTANCE.getRobotSystemRos_Initial_positionX();

		/**
		 * The meta object literal for the '<em><b>Initial position Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_SYSTEM_ROS__INITIAL_POSITION_Z = eINSTANCE.getRobotSystemRos_Initial_positionZ();

		/**
		 * The meta object literal for the '<em><b>Initial position Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_SYSTEM_ROS__INITIAL_POSITION_Y = eINSTANCE.getRobotSystemRos_Initial_positionY();

		/**
		 * The meta object literal for the '{@link ppgi.ufam.edu.robot_model_ros.impl.argumentImpl <em>argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppgi.ufam.edu.robot_model_ros.impl.argumentImpl
		 * @see ppgi.ufam.edu.robot_model_ros.impl.Robot_model_rosPackageImpl#getargument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getargument();

		/**
		 * The meta object literal for the '<em><b>Arg name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__ARG_NAME = eINSTANCE.getargument_Arg_name();

		/**
		 * The meta object literal for the '<em><b>Arg value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__ARG_VALUE = eINSTANCE.getargument_Arg_value();

		/**
		 * The meta object literal for the '{@link ppgi.ufam.edu.robot_model_ros.impl.topicImpl <em>topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppgi.ufam.edu.robot_model_ros.impl.topicImpl
		 * @see ppgi.ufam.edu.robot_model_ros.impl.Robot_model_rosPackageImpl#gettopic()
		 * @generated
		 */
		EClass TOPIC = eINSTANCE.gettopic();

		/**
		 * The meta object literal for the '<em><b>Topic name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__TOPIC_NAME = eINSTANCE.gettopic_Topic_name();

		/**
		 * The meta object literal for the '{@link ppgi.ufam.edu.robot_model_ros.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppgi.ufam.edu.robot_model_ros.impl.NodeImpl
		 * @see ppgi.ufam.edu.robot_model_ros.impl.Robot_model_rosPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME_NODE = eINSTANCE.getNode_Name_node();

		/**
		 * The meta object literal for the '<em><b>Package name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__PACKAGE_NAME = eINSTANCE.getNode_Package_name();

		/**
		 * The meta object literal for the '<em><b>Type node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__TYPE_NODE = eINSTANCE.getNode_Type_node();

		/**
		 * The meta object literal for the '<em><b>Publish</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PUBLISH = eINSTANCE.getNode_Publish();

		/**
		 * The meta object literal for the '<em><b>Node to argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__NODE_TO_ARGUMENT = eINSTANCE.getNode_Node_to_argument();

		/**
		 * The meta object literal for the '<em><b>Subscribe</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SUBSCRIBE = eINSTANCE.getNode_Subscribe();

		/**
		 * The meta object literal for the '<em><b>Node to node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__NODE_TO_NODE = eINSTANCE.getNode_Node_to_node();

		/**
		 * The meta object literal for the '<em><b>Type controller</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__TYPE_CONTROLLER = eINSTANCE.getNode_Type_controller();

		/**
		 * The meta object literal for the '{@link ppgi.ufam.edu.robot_model_ros.impl.World_ROSImpl <em>World ROS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppgi.ufam.edu.robot_model_ros.impl.World_ROSImpl
		 * @see ppgi.ufam.edu.robot_model_ros.impl.Robot_model_rosPackageImpl#getWorld_ROS()
		 * @generated
		 */
		EClass WORLD_ROS = eINSTANCE.getWorld_ROS();

		/**
		 * The meta object literal for the '<em><b>World name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORLD_ROS__WORLD_NAME = eINSTANCE.getWorld_ROS_World_name();

		/**
		 * The meta object literal for the '<em><b>Simulator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORLD_ROS__SIMULATOR = eINSTANCE.getWorld_ROS_Simulator();

		/**
		 * The meta object literal for the '<em><b>World to robotsystem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_ROS__WORLD_TO_ROBOTSYSTEM = eINSTANCE.getWorld_ROS_World_to_robotsystem();

	}

} //Robot_model_rosPackage

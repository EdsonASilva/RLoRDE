/**
 */
package ppgi.ufam.edu.robot_system;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see ppgi.ufam.edu.robot_system.Robot_systemFactory
 * @model kind="package"
 * @generated
 */
public interface Robot_systemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "robot_system";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ppgi.ufam.edu.br/robot_system";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "robot_system";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Robot_systemPackage eINSTANCE = ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl.init();

	/**
	 * The meta object id for the '{@link ppgi.ufam.edu.robot_system.impl.Robot_SystemImpl <em>Robot System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppgi.ufam.edu.robot_system.impl.Robot_SystemImpl
	 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getRobot_System()
	 * @generated
	 */
	int ROBOT_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Has actuator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM__HAS_ACTUATOR = 2;

	/**
	 * The feature id for the '<em><b>Has sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM__HAS_SENSOR = 3;

	/**
	 * The feature id for the '<em><b>Has controller</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM__HAS_CONTROLLER = 4;

	/**
	 * The feature id for the '<em><b>Type archicture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM__TYPE_ARCHICTURE = 5;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM__WIDTH = 6;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM__LENGTH = 7;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM__HEIGHT = 8;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM__WEIGHT = 9;

	/**
	 * The feature id for the '<em><b>Initial position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM__INITIAL_POSITION_X = 10;

	/**
	 * The feature id for the '<em><b>Initial position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM__INITIAL_POSITION_Y = 11;

	/**
	 * The feature id for the '<em><b>Initial position Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM__INITIAL_POSITION_Z = 12;

	/**
	 * The feature id for the '<em><b>Has discretize</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM__HAS_DISCRETIZE = 13;

	/**
	 * The feature id for the '<em><b>Has analyzer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM__HAS_ANALYZER = 14;

	/**
	 * The number of structural features of the '<em>Robot System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Robot System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ppgi.ufam.edu.robot_system.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppgi.ufam.edu.robot_system.impl.ActuatorImpl
	 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ID = 1;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ppgi.ufam.edu.robot_system.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppgi.ufam.edu.robot_system.impl.SensorImpl
	 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Discretize</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DISCRETIZE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ID = 2;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ppgi.ufam.edu.robot_system.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppgi.ufam.edu.robot_system.impl.ControllerImpl
	 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__ID = 1;

	/**
	 * The feature id for the '<em><b>Control actuator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__CONTROL_ACTUATOR = 2;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ppgi.ufam.edu.robot_system.impl.World_SystemImpl <em>World System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppgi.ufam.edu.robot_system.impl.World_SystemImpl
	 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getWorld_System()
	 * @generated
	 */
	int WORLD_SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has robot system</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_SYSTEM__HAS_ROBOT_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Simulator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_SYSTEM__SIMULATOR = 2;

	/**
	 * The number of structural features of the '<em>World System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>World System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ppgi.ufam.edu.robot_system.impl.DiscretizeImpl <em>Discretize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppgi.ufam.edu.robot_system.impl.DiscretizeImpl
	 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getDiscretize()
	 * @generated
	 */
	int DISCRETIZE = 5;

	/**
	 * The feature id for the '<em><b>Reduction percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETIZE__REDUCTION_PERCENT = 0;

	/**
	 * The feature id for the '<em><b>Analyzer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETIZE__ANALYZER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETIZE__ID = 2;

	/**
	 * The number of structural features of the '<em>Discretize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETIZE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Discretize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETIZE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ppgi.ufam.edu.robot_system.impl.AnalyzerImpl <em>Analyzer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppgi.ufam.edu.robot_system.impl.AnalyzerImpl
	 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getAnalyzer()
	 * @generated
	 */
	int ANALYZER = 6;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZER__ENABLE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZER__ID = 1;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZER__RULES = 2;

	/**
	 * The number of structural features of the '<em>Analyzer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Analyzer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ppgi.ufam.edu.robot_system.impl.RulesImpl <em>Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppgi.ufam.edu.robot_system.impl.RulesImpl
	 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getRules()
	 * @generated
	 */
	int RULES = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__ID = 0;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__ENABLE = 1;

	/**
	 * The feature id for the '<em><b>Min value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__MIN_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Max value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__MAX_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Type rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__TYPE_RULE = 4;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__CONTROLLER = 5;

	/**
	 * The number of structural features of the '<em>Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ppgi.ufam.edu.robot_system.Type_actuator <em>Type actuator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppgi.ufam.edu.robot_system.Type_actuator
	 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getType_actuator()
	 * @generated
	 */
	int TYPE_ACTUATOR = 8;

	/**
	 * The meta object id for the '{@link ppgi.ufam.edu.robot_system.Type_sensor <em>Type sensor</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppgi.ufam.edu.robot_system.Type_sensor
	 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getType_sensor()
	 * @generated
	 */
	int TYPE_SENSOR = 9;

	/**
	 * The meta object id for the '{@link ppgi.ufam.edu.robot_system.Type_architecture <em>Type architecture</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppgi.ufam.edu.robot_system.Type_architecture
	 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getType_architecture()
	 * @generated
	 */
	int TYPE_ARCHITECTURE = 10;

	/**
	 * The meta object id for the '{@link ppgi.ufam.edu.robot_system.Type_controller <em>Type controller</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppgi.ufam.edu.robot_system.Type_controller
	 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getType_controller()
	 * @generated
	 */
	int TYPE_CONTROLLER = 11;

	/**
	 * The meta object id for the '{@link ppgi.ufam.edu.robot_system.Type_rules <em>Type rules</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppgi.ufam.edu.robot_system.Type_rules
	 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getType_rules()
	 * @generated
	 */
	int TYPE_RULES = 12;

	/**
	 * Returns the meta object for class '{@link ppgi.ufam.edu.robot_system.Robot_System <em>Robot System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot System</em>'.
	 * @see ppgi.ufam.edu.robot_system.Robot_System
	 * @generated
	 */
	EClass getRobot_System();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Robot_System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ppgi.ufam.edu.robot_system.Robot_System#getName()
	 * @see #getRobot_System()
	 * @generated
	 */
	EAttribute getRobot_System_Name();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Robot_System#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ppgi.ufam.edu.robot_system.Robot_System#getDescription()
	 * @see #getRobot_System()
	 * @generated
	 */
	EAttribute getRobot_System_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link ppgi.ufam.edu.robot_system.Robot_System#getHas_actuator <em>Has actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has actuator</em>'.
	 * @see ppgi.ufam.edu.robot_system.Robot_System#getHas_actuator()
	 * @see #getRobot_System()
	 * @generated
	 */
	EReference getRobot_System_Has_actuator();

	/**
	 * Returns the meta object for the containment reference list '{@link ppgi.ufam.edu.robot_system.Robot_System#getHas_sensor <em>Has sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has sensor</em>'.
	 * @see ppgi.ufam.edu.robot_system.Robot_System#getHas_sensor()
	 * @see #getRobot_System()
	 * @generated
	 */
	EReference getRobot_System_Has_sensor();

	/**
	 * Returns the meta object for the containment reference list '{@link ppgi.ufam.edu.robot_system.Robot_System#getHas_controller <em>Has controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has controller</em>'.
	 * @see ppgi.ufam.edu.robot_system.Robot_System#getHas_controller()
	 * @see #getRobot_System()
	 * @generated
	 */
	EReference getRobot_System_Has_controller();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Robot_System#getType_archicture <em>Type archicture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type archicture</em>'.
	 * @see ppgi.ufam.edu.robot_system.Robot_System#getType_archicture()
	 * @see #getRobot_System()
	 * @generated
	 */
	EAttribute getRobot_System_Type_archicture();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Robot_System#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see ppgi.ufam.edu.robot_system.Robot_System#getWidth()
	 * @see #getRobot_System()
	 * @generated
	 */
	EAttribute getRobot_System_Width();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Robot_System#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see ppgi.ufam.edu.robot_system.Robot_System#getLength()
	 * @see #getRobot_System()
	 * @generated
	 */
	EAttribute getRobot_System_Length();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Robot_System#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see ppgi.ufam.edu.robot_system.Robot_System#getHeight()
	 * @see #getRobot_System()
	 * @generated
	 */
	EAttribute getRobot_System_Height();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Robot_System#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see ppgi.ufam.edu.robot_system.Robot_System#getWeight()
	 * @see #getRobot_System()
	 * @generated
	 */
	EAttribute getRobot_System_Weight();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Robot_System#getInitial_positionX <em>Initial position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial position X</em>'.
	 * @see ppgi.ufam.edu.robot_system.Robot_System#getInitial_positionX()
	 * @see #getRobot_System()
	 * @generated
	 */
	EAttribute getRobot_System_Initial_positionX();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Robot_System#getInitial_positionY <em>Initial position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial position Y</em>'.
	 * @see ppgi.ufam.edu.robot_system.Robot_System#getInitial_positionY()
	 * @see #getRobot_System()
	 * @generated
	 */
	EAttribute getRobot_System_Initial_positionY();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Robot_System#getInitial_positionZ <em>Initial position Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial position Z</em>'.
	 * @see ppgi.ufam.edu.robot_system.Robot_System#getInitial_positionZ()
	 * @see #getRobot_System()
	 * @generated
	 */
	EAttribute getRobot_System_Initial_positionZ();

	/**
	 * Returns the meta object for the containment reference list '{@link ppgi.ufam.edu.robot_system.Robot_System#getHas_discretize <em>Has discretize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has discretize</em>'.
	 * @see ppgi.ufam.edu.robot_system.Robot_System#getHas_discretize()
	 * @see #getRobot_System()
	 * @generated
	 */
	EReference getRobot_System_Has_discretize();

	/**
	 * Returns the meta object for the containment reference list '{@link ppgi.ufam.edu.robot_system.Robot_System#getHas_analyzer <em>Has analyzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has analyzer</em>'.
	 * @see ppgi.ufam.edu.robot_system.Robot_System#getHas_analyzer()
	 * @see #getRobot_System()
	 * @generated
	 */
	EReference getRobot_System_Has_analyzer();

	/**
	 * Returns the meta object for class '{@link ppgi.ufam.edu.robot_system.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see ppgi.ufam.edu.robot_system.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Actuator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ppgi.ufam.edu.robot_system.Actuator#getType()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_Type();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Actuator#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ppgi.ufam.edu.robot_system.Actuator#getId()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_Id();

	/**
	 * Returns the meta object for class '{@link ppgi.ufam.edu.robot_system.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see ppgi.ufam.edu.robot_system.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Sensor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ppgi.ufam.edu.robot_system.Sensor#getType()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Type();

	/**
	 * Returns the meta object for the reference list '{@link ppgi.ufam.edu.robot_system.Sensor#getDiscretize <em>Discretize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Discretize</em>'.
	 * @see ppgi.ufam.edu.robot_system.Sensor#getDiscretize()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Discretize();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Sensor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ppgi.ufam.edu.robot_system.Sensor#getId()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Id();

	/**
	 * Returns the meta object for class '{@link ppgi.ufam.edu.robot_system.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see ppgi.ufam.edu.robot_system.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Controller#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ppgi.ufam.edu.robot_system.Controller#getType()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Type();

	/**
	 * Returns the meta object for class '{@link ppgi.ufam.edu.robot_system.World_System <em>World System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>World System</em>'.
	 * @see ppgi.ufam.edu.robot_system.World_System
	 * @generated
	 */
	EClass getWorld_System();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.World_System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ppgi.ufam.edu.robot_system.World_System#getName()
	 * @see #getWorld_System()
	 * @generated
	 */
	EAttribute getWorld_System_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ppgi.ufam.edu.robot_system.World_System#getHas_robot_system <em>Has robot system</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has robot system</em>'.
	 * @see ppgi.ufam.edu.robot_system.World_System#getHas_robot_system()
	 * @see #getWorld_System()
	 * @generated
	 */
	EReference getWorld_System_Has_robot_system();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.World_System#isSimulator <em>Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulator</em>'.
	 * @see ppgi.ufam.edu.robot_system.World_System#isSimulator()
	 * @see #getWorld_System()
	 * @generated
	 */
	EAttribute getWorld_System_Simulator();

	/**
	 * Returns the meta object for class '{@link ppgi.ufam.edu.robot_system.Discretize <em>Discretize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discretize</em>'.
	 * @see ppgi.ufam.edu.robot_system.Discretize
	 * @generated
	 */
	EClass getDiscretize();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Discretize#getReduction_percent <em>Reduction percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reduction percent</em>'.
	 * @see ppgi.ufam.edu.robot_system.Discretize#getReduction_percent()
	 * @see #getDiscretize()
	 * @generated
	 */
	EAttribute getDiscretize_Reduction_percent();

	/**
	 * Returns the meta object for the reference list '{@link ppgi.ufam.edu.robot_system.Discretize#getAnalyzer <em>Analyzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Analyzer</em>'.
	 * @see ppgi.ufam.edu.robot_system.Discretize#getAnalyzer()
	 * @see #getDiscretize()
	 * @generated
	 */
	EReference getDiscretize_Analyzer();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Discretize#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ppgi.ufam.edu.robot_system.Discretize#getId()
	 * @see #getDiscretize()
	 * @generated
	 */
	EAttribute getDiscretize_Id();

	/**
	 * Returns the meta object for class '{@link ppgi.ufam.edu.robot_system.Analyzer <em>Analyzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analyzer</em>'.
	 * @see ppgi.ufam.edu.robot_system.Analyzer
	 * @generated
	 */
	EClass getAnalyzer();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Analyzer#isEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see ppgi.ufam.edu.robot_system.Analyzer#isEnable()
	 * @see #getAnalyzer()
	 * @generated
	 */
	EAttribute getAnalyzer_Enable();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Analyzer#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ppgi.ufam.edu.robot_system.Analyzer#getId()
	 * @see #getAnalyzer()
	 * @generated
	 */
	EAttribute getAnalyzer_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link ppgi.ufam.edu.robot_system.Analyzer#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see ppgi.ufam.edu.robot_system.Analyzer#getRules()
	 * @see #getAnalyzer()
	 * @generated
	 */
	EReference getAnalyzer_Rules();

	/**
	 * Returns the meta object for class '{@link ppgi.ufam.edu.robot_system.Rules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rules</em>'.
	 * @see ppgi.ufam.edu.robot_system.Rules
	 * @generated
	 */
	EClass getRules();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Rules#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ppgi.ufam.edu.robot_system.Rules#getId()
	 * @see #getRules()
	 * @generated
	 */
	EAttribute getRules_Id();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Rules#isEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see ppgi.ufam.edu.robot_system.Rules#isEnable()
	 * @see #getRules()
	 * @generated
	 */
	EAttribute getRules_Enable();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Rules#getMin_value <em>Min value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value</em>'.
	 * @see ppgi.ufam.edu.robot_system.Rules#getMin_value()
	 * @see #getRules()
	 * @generated
	 */
	EAttribute getRules_Min_value();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Rules#getMax_value <em>Max value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value</em>'.
	 * @see ppgi.ufam.edu.robot_system.Rules#getMax_value()
	 * @see #getRules()
	 * @generated
	 */
	EAttribute getRules_Max_value();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Rules#getType_rule <em>Type rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type rule</em>'.
	 * @see ppgi.ufam.edu.robot_system.Rules#getType_rule()
	 * @see #getRules()
	 * @generated
	 */
	EAttribute getRules_Type_rule();

	/**
	 * Returns the meta object for the reference '{@link ppgi.ufam.edu.robot_system.Rules#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controller</em>'.
	 * @see ppgi.ufam.edu.robot_system.Rules#getController()
	 * @see #getRules()
	 * @generated
	 */
	EReference getRules_Controller();

	/**
	 * Returns the meta object for the attribute '{@link ppgi.ufam.edu.robot_system.Controller#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ppgi.ufam.edu.robot_system.Controller#getId()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Id();

	/**
	 * Returns the meta object for the reference list '{@link ppgi.ufam.edu.robot_system.Controller#getControl_actuator <em>Control actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Control actuator</em>'.
	 * @see ppgi.ufam.edu.robot_system.Controller#getControl_actuator()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Control_actuator();

	/**
	 * Returns the meta object for enum '{@link ppgi.ufam.edu.robot_system.Type_actuator <em>Type actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type actuator</em>'.
	 * @see ppgi.ufam.edu.robot_system.Type_actuator
	 * @generated
	 */
	EEnum getType_actuator();

	/**
	 * Returns the meta object for enum '{@link ppgi.ufam.edu.robot_system.Type_sensor <em>Type sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type sensor</em>'.
	 * @see ppgi.ufam.edu.robot_system.Type_sensor
	 * @generated
	 */
	EEnum getType_sensor();

	/**
	 * Returns the meta object for enum '{@link ppgi.ufam.edu.robot_system.Type_architecture <em>Type architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type architecture</em>'.
	 * @see ppgi.ufam.edu.robot_system.Type_architecture
	 * @generated
	 */
	EEnum getType_architecture();

	/**
	 * Returns the meta object for enum '{@link ppgi.ufam.edu.robot_system.Type_controller <em>Type controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type controller</em>'.
	 * @see ppgi.ufam.edu.robot_system.Type_controller
	 * @generated
	 */
	EEnum getType_controller();

	/**
	 * Returns the meta object for enum '{@link ppgi.ufam.edu.robot_system.Type_rules <em>Type rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type rules</em>'.
	 * @see ppgi.ufam.edu.robot_system.Type_rules
	 * @generated
	 */
	EEnum getType_rules();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Robot_systemFactory getRobot_systemFactory();

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
		 * The meta object literal for the '{@link ppgi.ufam.edu.robot_system.impl.Robot_SystemImpl <em>Robot System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppgi.ufam.edu.robot_system.impl.Robot_SystemImpl
		 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getRobot_System()
		 * @generated
		 */
		EClass ROBOT_SYSTEM = eINSTANCE.getRobot_System();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_SYSTEM__NAME = eINSTANCE.getRobot_System_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_SYSTEM__DESCRIPTION = eINSTANCE.getRobot_System_Description();

		/**
		 * The meta object literal for the '<em><b>Has actuator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_SYSTEM__HAS_ACTUATOR = eINSTANCE.getRobot_System_Has_actuator();

		/**
		 * The meta object literal for the '<em><b>Has sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_SYSTEM__HAS_SENSOR = eINSTANCE.getRobot_System_Has_sensor();

		/**
		 * The meta object literal for the '<em><b>Has controller</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_SYSTEM__HAS_CONTROLLER = eINSTANCE.getRobot_System_Has_controller();

		/**
		 * The meta object literal for the '<em><b>Type archicture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_SYSTEM__TYPE_ARCHICTURE = eINSTANCE.getRobot_System_Type_archicture();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_SYSTEM__WIDTH = eINSTANCE.getRobot_System_Width();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_SYSTEM__LENGTH = eINSTANCE.getRobot_System_Length();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_SYSTEM__HEIGHT = eINSTANCE.getRobot_System_Height();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_SYSTEM__WEIGHT = eINSTANCE.getRobot_System_Weight();

		/**
		 * The meta object literal for the '<em><b>Initial position X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_SYSTEM__INITIAL_POSITION_X = eINSTANCE.getRobot_System_Initial_positionX();

		/**
		 * The meta object literal for the '<em><b>Initial position Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_SYSTEM__INITIAL_POSITION_Y = eINSTANCE.getRobot_System_Initial_positionY();

		/**
		 * The meta object literal for the '<em><b>Initial position Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_SYSTEM__INITIAL_POSITION_Z = eINSTANCE.getRobot_System_Initial_positionZ();

		/**
		 * The meta object literal for the '<em><b>Has discretize</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_SYSTEM__HAS_DISCRETIZE = eINSTANCE.getRobot_System_Has_discretize();

		/**
		 * The meta object literal for the '<em><b>Has analyzer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_SYSTEM__HAS_ANALYZER = eINSTANCE.getRobot_System_Has_analyzer();

		/**
		 * The meta object literal for the '{@link ppgi.ufam.edu.robot_system.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppgi.ufam.edu.robot_system.impl.ActuatorImpl
		 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__TYPE = eINSTANCE.getActuator_Type();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__ID = eINSTANCE.getActuator_Id();

		/**
		 * The meta object literal for the '{@link ppgi.ufam.edu.robot_system.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppgi.ufam.edu.robot_system.impl.SensorImpl
		 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__TYPE = eINSTANCE.getSensor_Type();

		/**
		 * The meta object literal for the '<em><b>Discretize</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__DISCRETIZE = eINSTANCE.getSensor_Discretize();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__ID = eINSTANCE.getSensor_Id();

		/**
		 * The meta object literal for the '{@link ppgi.ufam.edu.robot_system.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppgi.ufam.edu.robot_system.impl.ControllerImpl
		 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__TYPE = eINSTANCE.getController_Type();

		/**
		 * The meta object literal for the '{@link ppgi.ufam.edu.robot_system.impl.World_SystemImpl <em>World System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppgi.ufam.edu.robot_system.impl.World_SystemImpl
		 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getWorld_System()
		 * @generated
		 */
		EClass WORLD_SYSTEM = eINSTANCE.getWorld_System();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORLD_SYSTEM__NAME = eINSTANCE.getWorld_System_Name();

		/**
		 * The meta object literal for the '<em><b>Has robot system</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_SYSTEM__HAS_ROBOT_SYSTEM = eINSTANCE.getWorld_System_Has_robot_system();

		/**
		 * The meta object literal for the '<em><b>Simulator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORLD_SYSTEM__SIMULATOR = eINSTANCE.getWorld_System_Simulator();

		/**
		 * The meta object literal for the '{@link ppgi.ufam.edu.robot_system.impl.DiscretizeImpl <em>Discretize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppgi.ufam.edu.robot_system.impl.DiscretizeImpl
		 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getDiscretize()
		 * @generated
		 */
		EClass DISCRETIZE = eINSTANCE.getDiscretize();

		/**
		 * The meta object literal for the '<em><b>Reduction percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETIZE__REDUCTION_PERCENT = eINSTANCE.getDiscretize_Reduction_percent();

		/**
		 * The meta object literal for the '<em><b>Analyzer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETIZE__ANALYZER = eINSTANCE.getDiscretize_Analyzer();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETIZE__ID = eINSTANCE.getDiscretize_Id();

		/**
		 * The meta object literal for the '{@link ppgi.ufam.edu.robot_system.impl.AnalyzerImpl <em>Analyzer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppgi.ufam.edu.robot_system.impl.AnalyzerImpl
		 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getAnalyzer()
		 * @generated
		 */
		EClass ANALYZER = eINSTANCE.getAnalyzer();

		/**
		 * The meta object literal for the '<em><b>Enable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYZER__ENABLE = eINSTANCE.getAnalyzer_Enable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYZER__ID = eINSTANCE.getAnalyzer_Id();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYZER__RULES = eINSTANCE.getAnalyzer_Rules();

		/**
		 * The meta object literal for the '{@link ppgi.ufam.edu.robot_system.impl.RulesImpl <em>Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppgi.ufam.edu.robot_system.impl.RulesImpl
		 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getRules()
		 * @generated
		 */
		EClass RULES = eINSTANCE.getRules();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULES__ID = eINSTANCE.getRules_Id();

		/**
		 * The meta object literal for the '<em><b>Enable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULES__ENABLE = eINSTANCE.getRules_Enable();

		/**
		 * The meta object literal for the '<em><b>Min value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULES__MIN_VALUE = eINSTANCE.getRules_Min_value();

		/**
		 * The meta object literal for the '<em><b>Max value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULES__MAX_VALUE = eINSTANCE.getRules_Max_value();

		/**
		 * The meta object literal for the '<em><b>Type rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULES__TYPE_RULE = eINSTANCE.getRules_Type_rule();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULES__CONTROLLER = eINSTANCE.getRules_Controller();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__ID = eINSTANCE.getController_Id();

		/**
		 * The meta object literal for the '<em><b>Control actuator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__CONTROL_ACTUATOR = eINSTANCE.getController_Control_actuator();

		/**
		 * The meta object literal for the '{@link ppgi.ufam.edu.robot_system.Type_actuator <em>Type actuator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppgi.ufam.edu.robot_system.Type_actuator
		 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getType_actuator()
		 * @generated
		 */
		EEnum TYPE_ACTUATOR = eINSTANCE.getType_actuator();

		/**
		 * The meta object literal for the '{@link ppgi.ufam.edu.robot_system.Type_sensor <em>Type sensor</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppgi.ufam.edu.robot_system.Type_sensor
		 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getType_sensor()
		 * @generated
		 */
		EEnum TYPE_SENSOR = eINSTANCE.getType_sensor();

		/**
		 * The meta object literal for the '{@link ppgi.ufam.edu.robot_system.Type_architecture <em>Type architecture</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppgi.ufam.edu.robot_system.Type_architecture
		 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getType_architecture()
		 * @generated
		 */
		EEnum TYPE_ARCHITECTURE = eINSTANCE.getType_architecture();

		/**
		 * The meta object literal for the '{@link ppgi.ufam.edu.robot_system.Type_controller <em>Type controller</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppgi.ufam.edu.robot_system.Type_controller
		 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getType_controller()
		 * @generated
		 */
		EEnum TYPE_CONTROLLER = eINSTANCE.getType_controller();

		/**
		 * The meta object literal for the '{@link ppgi.ufam.edu.robot_system.Type_rules <em>Type rules</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppgi.ufam.edu.robot_system.Type_rules
		 * @see ppgi.ufam.edu.robot_system.impl.Robot_systemPackageImpl#getType_rules()
		 * @generated
		 */
		EEnum TYPE_RULES = eINSTANCE.getType_rules();

	}

} //Robot_systemPackage

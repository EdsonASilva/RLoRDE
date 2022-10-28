/**
 */
package ppgi.ufam.edu.robot_model_ros.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ppgi.ufam.edu.robot_model_ros.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Robot_model_rosFactoryImpl extends EFactoryImpl implements Robot_model_rosFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Robot_model_rosFactory init() {
		try {
			Robot_model_rosFactory theRobot_model_rosFactory = (Robot_model_rosFactory) EPackage.Registry.INSTANCE
					.getEFactory(Robot_model_rosPackage.eNS_URI);
			if (theRobot_model_rosFactory != null) {
				return theRobot_model_rosFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Robot_model_rosFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robot_model_rosFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Robot_model_rosPackage.INCLUDE:
			return createinclude();
		case Robot_model_rosPackage.SERVICE:
			return createservice();
		case Robot_model_rosPackage.PARAMETER:
			return createparameter();
		case Robot_model_rosPackage.ROBOT_SYSTEM_ROS:
			return createRobotSystemRos();
		case Robot_model_rosPackage.ARGUMENT:
			return createargument();
		case Robot_model_rosPackage.TOPIC:
			return createtopic();
		case Robot_model_rosPackage.NODE:
			return createNode();
		case Robot_model_rosPackage.WORLD_ROS:
			return createWorld_ROS();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public include createinclude() {
		includeImpl include = new includeImpl();
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public service createservice() {
		serviceImpl service = new serviceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public parameter createparameter() {
		parameterImpl parameter = new parameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotSystemRos createRobotSystemRos() {
		RobotSystemRosImpl robotSystemRos = new RobotSystemRosImpl();
		return robotSystemRos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public argument createargument() {
		argumentImpl argument = new argumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public topic createtopic() {
		topicImpl topic = new topicImpl();
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public World_ROS createWorld_ROS() {
		World_ROSImpl world_ROS = new World_ROSImpl();
		return world_ROS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robot_model_rosPackage getRobot_model_rosPackage() {
		return (Robot_model_rosPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Robot_model_rosPackage getPackage() {
		return Robot_model_rosPackage.eINSTANCE;
	}

} //Robot_model_rosFactoryImpl

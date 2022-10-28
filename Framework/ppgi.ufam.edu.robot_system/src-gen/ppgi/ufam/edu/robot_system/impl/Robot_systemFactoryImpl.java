/**
 */
package ppgi.ufam.edu.robot_system.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ppgi.ufam.edu.robot_system.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Robot_systemFactoryImpl extends EFactoryImpl implements Robot_systemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Robot_systemFactory init() {
		try {
			Robot_systemFactory theRobot_systemFactory = (Robot_systemFactory) EPackage.Registry.INSTANCE
					.getEFactory(Robot_systemPackage.eNS_URI);
			if (theRobot_systemFactory != null) {
				return theRobot_systemFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Robot_systemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robot_systemFactoryImpl() {
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
		case Robot_systemPackage.ROBOT_SYSTEM:
			return createRobot_System();
		case Robot_systemPackage.ACTUATOR:
			return createActuator();
		case Robot_systemPackage.SENSOR:
			return createSensor();
		case Robot_systemPackage.CONTROLLER:
			return createController();
		case Robot_systemPackage.WORLD_SYSTEM:
			return createWorld_System();
		case Robot_systemPackage.DISCRETIZE:
			return createDiscretize();
		case Robot_systemPackage.ANALYZER:
			return createAnalyzer();
		case Robot_systemPackage.RULES:
			return createRules();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Robot_systemPackage.TYPE_ACTUATOR:
			return createType_actuatorFromString(eDataType, initialValue);
		case Robot_systemPackage.TYPE_SENSOR:
			return createType_sensorFromString(eDataType, initialValue);
		case Robot_systemPackage.TYPE_ARCHITECTURE:
			return createType_architectureFromString(eDataType, initialValue);
		case Robot_systemPackage.TYPE_CONTROLLER:
			return createType_controllerFromString(eDataType, initialValue);
		case Robot_systemPackage.TYPE_RULES:
			return createType_rulesFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Robot_systemPackage.TYPE_ACTUATOR:
			return convertType_actuatorToString(eDataType, instanceValue);
		case Robot_systemPackage.TYPE_SENSOR:
			return convertType_sensorToString(eDataType, instanceValue);
		case Robot_systemPackage.TYPE_ARCHITECTURE:
			return convertType_architectureToString(eDataType, instanceValue);
		case Robot_systemPackage.TYPE_CONTROLLER:
			return convertType_controllerToString(eDataType, instanceValue);
		case Robot_systemPackage.TYPE_RULES:
			return convertType_rulesToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Robot_System createRobot_System() {
		Robot_SystemImpl robot_System = new Robot_SystemImpl();
		return robot_System;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Controller createController() {
		ControllerImpl controller = new ControllerImpl();
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public World_System createWorld_System() {
		World_SystemImpl world_System = new World_SystemImpl();
		return world_System;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Discretize createDiscretize() {
		DiscretizeImpl discretize = new DiscretizeImpl();
		return discretize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Analyzer createAnalyzer() {
		AnalyzerImpl analyzer = new AnalyzerImpl();
		return analyzer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rules createRules() {
		RulesImpl rules = new RulesImpl();
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type_actuator createType_actuatorFromString(EDataType eDataType, String initialValue) {
		Type_actuator result = Type_actuator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertType_actuatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type_sensor createType_sensorFromString(EDataType eDataType, String initialValue) {
		Type_sensor result = Type_sensor.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertType_sensorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type_architecture createType_architectureFromString(EDataType eDataType, String initialValue) {
		Type_architecture result = Type_architecture.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertType_architectureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type_controller createType_controllerFromString(EDataType eDataType, String initialValue) {
		Type_controller result = Type_controller.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertType_controllerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type_rules createType_rulesFromString(EDataType eDataType, String initialValue) {
		Type_rules result = Type_rules.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertType_rulesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Robot_systemPackage getRobot_systemPackage() {
		return (Robot_systemPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Robot_systemPackage getPackage() {
		return Robot_systemPackage.eINSTANCE;
	}

} //Robot_systemFactoryImpl

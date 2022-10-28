/**
 */
package ppgi.ufam.edu.robot_system.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ppgi.ufam.edu.robot_system.Actuator;
import ppgi.ufam.edu.robot_system.Analyzer;
import ppgi.ufam.edu.robot_system.Controller;
import ppgi.ufam.edu.robot_system.Discretize;
import ppgi.ufam.edu.robot_system.Robot_System;
import ppgi.ufam.edu.robot_system.Robot_systemFactory;
import ppgi.ufam.edu.robot_system.Robot_systemPackage;
import ppgi.ufam.edu.robot_system.Rules;
import ppgi.ufam.edu.robot_system.Sensor;
import ppgi.ufam.edu.robot_system.Type_actuator;
import ppgi.ufam.edu.robot_system.Type_architecture;
import ppgi.ufam.edu.robot_system.Type_controller;
import ppgi.ufam.edu.robot_system.Type_rules;
import ppgi.ufam.edu.robot_system.Type_sensor;
import ppgi.ufam.edu.robot_system.World_System;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Robot_systemPackageImpl extends EPackageImpl implements Robot_systemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robot_SystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass world_SystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discretizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analyzerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum type_actuatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum type_sensorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum type_architectureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum type_controllerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum type_rulesEEnum = null;

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
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Robot_systemPackageImpl() {
		super(eNS_URI, Robot_systemFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Robot_systemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Robot_systemPackage init() {
		if (isInited)
			return (Robot_systemPackage) EPackage.Registry.INSTANCE.getEPackage(Robot_systemPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRobot_systemPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Robot_systemPackageImpl theRobot_systemPackage = registeredRobot_systemPackage instanceof Robot_systemPackageImpl
				? (Robot_systemPackageImpl) registeredRobot_systemPackage
				: new Robot_systemPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRobot_systemPackage.createPackageContents();

		// Initialize created meta-data
		theRobot_systemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRobot_systemPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Robot_systemPackage.eNS_URI, theRobot_systemPackage);
		return theRobot_systemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRobot_System() {
		return robot_SystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRobot_System_Name() {
		return (EAttribute) robot_SystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRobot_System_Description() {
		return (EAttribute) robot_SystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRobot_System_Has_actuator() {
		return (EReference) robot_SystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRobot_System_Has_sensor() {
		return (EReference) robot_SystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRobot_System_Has_controller() {
		return (EReference) robot_SystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRobot_System_Type_archicture() {
		return (EAttribute) robot_SystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRobot_System_Width() {
		return (EAttribute) robot_SystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRobot_System_Length() {
		return (EAttribute) robot_SystemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRobot_System_Height() {
		return (EAttribute) robot_SystemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRobot_System_Weight() {
		return (EAttribute) robot_SystemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRobot_System_Initial_positionX() {
		return (EAttribute) robot_SystemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRobot_System_Initial_positionY() {
		return (EAttribute) robot_SystemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRobot_System_Initial_positionZ() {
		return (EAttribute) robot_SystemEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRobot_System_Has_discretize() {
		return (EReference) robot_SystemEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRobot_System_Has_analyzer() {
		return (EReference) robot_SystemEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActuator_Type() {
		return (EAttribute) actuatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActuator_Id() {
		return (EAttribute) actuatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensor_Type() {
		return (EAttribute) sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSensor_Discretize() {
		return (EReference) sensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensor_Id() {
		return (EAttribute) sensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getController_Type() {
		return (EAttribute) controllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorld_System() {
		return world_SystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorld_System_Name() {
		return (EAttribute) world_SystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorld_System_Has_robot_system() {
		return (EReference) world_SystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorld_System_Simulator() {
		return (EAttribute) world_SystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscretize() {
		return discretizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiscretize_Reduction_percent() {
		return (EAttribute) discretizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiscretize_Analyzer() {
		return (EReference) discretizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiscretize_Id() {
		return (EAttribute) discretizeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnalyzer() {
		return analyzerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnalyzer_Enable() {
		return (EAttribute) analyzerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnalyzer_Id() {
		return (EAttribute) analyzerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnalyzer_Rules() {
		return (EReference) analyzerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRules() {
		return rulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRules_Id() {
		return (EAttribute) rulesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRules_Enable() {
		return (EAttribute) rulesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRules_Min_value() {
		return (EAttribute) rulesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRules_Max_value() {
		return (EAttribute) rulesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRules_Type_rule() {
		return (EAttribute) rulesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRules_Controller() {
		return (EReference) rulesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getController_Id() {
		return (EAttribute) controllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getController_Control_actuator() {
		return (EReference) controllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getType_actuator() {
		return type_actuatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getType_sensor() {
		return type_sensorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getType_architecture() {
		return type_architectureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getType_controller() {
		return type_controllerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getType_rules() {
		return type_rulesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Robot_systemFactory getRobot_systemFactory() {
		return (Robot_systemFactory) getEFactoryInstance();
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
		robot_SystemEClass = createEClass(ROBOT_SYSTEM);
		createEAttribute(robot_SystemEClass, ROBOT_SYSTEM__NAME);
		createEAttribute(robot_SystemEClass, ROBOT_SYSTEM__DESCRIPTION);
		createEReference(robot_SystemEClass, ROBOT_SYSTEM__HAS_ACTUATOR);
		createEReference(robot_SystemEClass, ROBOT_SYSTEM__HAS_SENSOR);
		createEReference(robot_SystemEClass, ROBOT_SYSTEM__HAS_CONTROLLER);
		createEAttribute(robot_SystemEClass, ROBOT_SYSTEM__TYPE_ARCHICTURE);
		createEAttribute(robot_SystemEClass, ROBOT_SYSTEM__WIDTH);
		createEAttribute(robot_SystemEClass, ROBOT_SYSTEM__LENGTH);
		createEAttribute(robot_SystemEClass, ROBOT_SYSTEM__HEIGHT);
		createEAttribute(robot_SystemEClass, ROBOT_SYSTEM__WEIGHT);
		createEAttribute(robot_SystemEClass, ROBOT_SYSTEM__INITIAL_POSITION_X);
		createEAttribute(robot_SystemEClass, ROBOT_SYSTEM__INITIAL_POSITION_Y);
		createEAttribute(robot_SystemEClass, ROBOT_SYSTEM__INITIAL_POSITION_Z);
		createEReference(robot_SystemEClass, ROBOT_SYSTEM__HAS_DISCRETIZE);
		createEReference(robot_SystemEClass, ROBOT_SYSTEM__HAS_ANALYZER);

		actuatorEClass = createEClass(ACTUATOR);
		createEAttribute(actuatorEClass, ACTUATOR__TYPE);
		createEAttribute(actuatorEClass, ACTUATOR__ID);

		sensorEClass = createEClass(SENSOR);
		createEAttribute(sensorEClass, SENSOR__TYPE);
		createEReference(sensorEClass, SENSOR__DISCRETIZE);
		createEAttribute(sensorEClass, SENSOR__ID);

		controllerEClass = createEClass(CONTROLLER);
		createEAttribute(controllerEClass, CONTROLLER__TYPE);
		createEAttribute(controllerEClass, CONTROLLER__ID);
		createEReference(controllerEClass, CONTROLLER__CONTROL_ACTUATOR);

		world_SystemEClass = createEClass(WORLD_SYSTEM);
		createEAttribute(world_SystemEClass, WORLD_SYSTEM__NAME);
		createEReference(world_SystemEClass, WORLD_SYSTEM__HAS_ROBOT_SYSTEM);
		createEAttribute(world_SystemEClass, WORLD_SYSTEM__SIMULATOR);

		discretizeEClass = createEClass(DISCRETIZE);
		createEAttribute(discretizeEClass, DISCRETIZE__REDUCTION_PERCENT);
		createEReference(discretizeEClass, DISCRETIZE__ANALYZER);
		createEAttribute(discretizeEClass, DISCRETIZE__ID);

		analyzerEClass = createEClass(ANALYZER);
		createEAttribute(analyzerEClass, ANALYZER__ENABLE);
		createEAttribute(analyzerEClass, ANALYZER__ID);
		createEReference(analyzerEClass, ANALYZER__RULES);

		rulesEClass = createEClass(RULES);
		createEAttribute(rulesEClass, RULES__ID);
		createEAttribute(rulesEClass, RULES__ENABLE);
		createEAttribute(rulesEClass, RULES__MIN_VALUE);
		createEAttribute(rulesEClass, RULES__MAX_VALUE);
		createEAttribute(rulesEClass, RULES__TYPE_RULE);
		createEReference(rulesEClass, RULES__CONTROLLER);

		// Create enums
		type_actuatorEEnum = createEEnum(TYPE_ACTUATOR);
		type_sensorEEnum = createEEnum(TYPE_SENSOR);
		type_architectureEEnum = createEEnum(TYPE_ARCHITECTURE);
		type_controllerEEnum = createEEnum(TYPE_CONTROLLER);
		type_rulesEEnum = createEEnum(TYPE_RULES);
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
		initEClass(robot_SystemEClass, Robot_System.class, "Robot_System", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRobot_System_Name(), ecorePackage.getEString(), "name", null, 1, 1, Robot_System.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobot_System_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Robot_System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRobot_System_Has_actuator(), this.getActuator(), null, "has_actuator", null, 0, -1,
				Robot_System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobot_System_Has_sensor(), this.getSensor(), null, "has_sensor", null, 0, -1,
				Robot_System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobot_System_Has_controller(), this.getController(), null, "has_controller", null, 0, -1,
				Robot_System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobot_System_Type_archicture(), this.getType_architecture(), "type_archicture",
				"Differencial Drive", 1, 1, Robot_System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobot_System_Width(), ecorePackage.getEDouble(), "width", "0", 0, 1, Robot_System.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobot_System_Length(), ecorePackage.getEDouble(), "length", "0", 0, 1, Robot_System.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobot_System_Height(), ecorePackage.getEDouble(), "height", "0", 0, 1, Robot_System.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobot_System_Weight(), ecorePackage.getEDouble(), "weight", "0", 0, 1, Robot_System.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobot_System_Initial_positionX(), ecorePackage.getEDouble(), "initial_positionX", "0", 1, 1,
				Robot_System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobot_System_Initial_positionY(), ecorePackage.getEDouble(), "initial_positionY", "0", 1, 1,
				Robot_System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobot_System_Initial_positionZ(), ecorePackage.getEDouble(), "initial_positionZ", "0", 1, 1,
				Robot_System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRobot_System_Has_discretize(), this.getDiscretize(), null, "has_discretize", null, 0, -1,
				Robot_System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobot_System_Has_analyzer(), this.getAnalyzer(), null, "has_analyzer", null, 0, -1,
				Robot_System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActuator_Type(), this.getType_actuator(), "type", "Generic", 1, 1, Actuator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActuator_Id(), ecorePackage.getEString(), "id", null, 1, 1, Actuator.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensor_Type(), this.getType_sensor(), "type", null, 1, 1, Sensor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensor_Discretize(), this.getDiscretize(), null, "discretize", null, 0, -1, Sensor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Id(), ecorePackage.getEString(), "id", null, 1, 1, Sensor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getController_Type(), this.getType_controller(), "type", "Generic", 0, 1, Controller.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getController_Id(), ecorePackage.getEString(), "id", null, 1, 1, Controller.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getController_Control_actuator(), this.getActuator(), null, "control_actuator", null, 0, -1,
				Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(world_SystemEClass, World_System.class, "World_System", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorld_System_Name(), ecorePackage.getEString(), "name", "World System", 1, 1,
				World_System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getWorld_System_Has_robot_system(), this.getRobot_System(), null, "has_robot_system", null, 0,
				-1, World_System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorld_System_Simulator(), ecorePackage.getEBoolean(), "simulator", "true", 1, 1,
				World_System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(discretizeEClass, Discretize.class, "Discretize", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscretize_Reduction_percent(), ecorePackage.getEFloat(), "reduction_percent", null, 0, 1,
				Discretize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDiscretize_Analyzer(), this.getAnalyzer(), null, "analyzer", null, 0, -1, Discretize.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscretize_Id(), ecorePackage.getEString(), "id", null, 1, 1, Discretize.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analyzerEClass, Analyzer.class, "Analyzer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalyzer_Enable(), ecorePackage.getEBoolean(), "enable", "true", 1, 1, Analyzer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalyzer_Id(), ecorePackage.getEString(), "id", null, 1, 1, Analyzer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalyzer_Rules(), this.getRules(), null, "rules", null, 0, -1, Analyzer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(rulesEClass, Rules.class, "Rules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRules_Id(), ecorePackage.getEString(), "id", null, 1, 1, Rules.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRules_Enable(), ecorePackage.getEBoolean(), "enable", "true", 1, 1, Rules.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRules_Min_value(), ecorePackage.getEInt(), "min_value", null, 0, 1, Rules.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRules_Max_value(), ecorePackage.getEInt(), "max_value", null, 0, 1, Rules.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRules_Type_rule(), this.getType_rules(), "type_rule", "Bigger_than", 1, 1, Rules.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRules_Controller(), this.getController(), null, "controller", null, 0, 1, Rules.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(type_actuatorEEnum, Type_actuator.class, "Type_actuator");
		addEEnumLiteral(type_actuatorEEnum, Type_actuator.GENERIC);
		addEEnumLiteral(type_actuatorEEnum, Type_actuator.JOINT);
		addEEnumLiteral(type_actuatorEEnum, Type_actuator.MOTOR);
		addEEnumLiteral(type_actuatorEEnum, Type_actuator.PAN_TILT);

		initEEnum(type_sensorEEnum, Type_sensor.class, "Type_sensor");
		addEEnumLiteral(type_sensorEEnum, Type_sensor.GENERIC);
		addEEnumLiteral(type_sensorEEnum, Type_sensor.CAMERA);
		addEEnumLiteral(type_sensorEEnum, Type_sensor.SONAR);
		addEEnumLiteral(type_sensorEEnum, Type_sensor.LASER);

		initEEnum(type_architectureEEnum, Type_architecture.class, "Type_architecture");
		addEEnumLiteral(type_architectureEEnum, Type_architecture.GENERIC);
		addEEnumLiteral(type_architectureEEnum, Type_architecture.DIFFERENCIAL_DRIVE);
		addEEnumLiteral(type_architectureEEnum, Type_architecture.SKID_STEER_DRIVE);
		addEEnumLiteral(type_architectureEEnum, Type_architecture.OMNIDIRECTIONAL);
		addEEnumLiteral(type_architectureEEnum, Type_architecture.ACKERMAN_DRIVE);
		addEEnumLiteral(type_architectureEEnum, Type_architecture.QUADROTOR);

		initEEnum(type_controllerEEnum, Type_controller.class, "Type_controller");
		addEEnumLiteral(type_controllerEEnum, Type_controller.GENERIC);
		addEEnumLiteral(type_controllerEEnum, Type_controller.TELEOPERATED);
		addEEnumLiteral(type_controllerEEnum, Type_controller.DQN);
		addEEnumLiteral(type_controllerEEnum, Type_controller.A2C);
		addEEnumLiteral(type_controllerEEnum, Type_controller.DDPG);

		initEEnum(type_rulesEEnum, Type_rules.class, "Type_rules");
		addEEnumLiteral(type_rulesEEnum, Type_rules.BIGGER_THAN);
		addEEnumLiteral(type_rulesEEnum, Type_rules.LESS_THAN);
		addEEnumLiteral(type_rulesEEnum, Type_rules.BETWEEN);
		addEEnumLiteral(type_rulesEEnum, Type_rules.EQUAL);

		// Create resource
		createResource(eNS_URI);
	}

} //Robot_systemPackageImpl

/**
 */
package ppgi.ufam.edu.robot_model_ros.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ppgi.ufam.edu.robot_model_ros.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage
 * @generated
 */
public class Robot_model_rosAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Robot_model_rosPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robot_model_rosAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Robot_model_rosPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Robot_model_rosSwitch<Adapter> modelSwitch = new Robot_model_rosSwitch<Adapter>() {
		@Override
		public Adapter caseinclude(include object) {
			return createincludeAdapter();
		}

		@Override
		public Adapter caseservice(service object) {
			return createserviceAdapter();
		}

		@Override
		public Adapter caseparameter(parameter object) {
			return createparameterAdapter();
		}

		@Override
		public Adapter caseRobotSystemRos(RobotSystemRos object) {
			return createRobotSystemRosAdapter();
		}

		@Override
		public Adapter caseargument(argument object) {
			return createargumentAdapter();
		}

		@Override
		public Adapter casetopic(topic object) {
			return createtopicAdapter();
		}

		@Override
		public Adapter caseNode(Node object) {
			return createNodeAdapter();
		}

		@Override
		public Adapter caseWorld_ROS(World_ROS object) {
			return createWorld_ROSAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link ppgi.ufam.edu.robot_model_ros.include <em>include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ppgi.ufam.edu.robot_model_ros.include
	 * @generated
	 */
	public Adapter createincludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ppgi.ufam.edu.robot_model_ros.service <em>service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ppgi.ufam.edu.robot_model_ros.service
	 * @generated
	 */
	public Adapter createserviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ppgi.ufam.edu.robot_model_ros.parameter <em>parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ppgi.ufam.edu.robot_model_ros.parameter
	 * @generated
	 */
	public Adapter createparameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos <em>Robot System Ros</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ppgi.ufam.edu.robot_model_ros.RobotSystemRos
	 * @generated
	 */
	public Adapter createRobotSystemRosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ppgi.ufam.edu.robot_model_ros.argument <em>argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ppgi.ufam.edu.robot_model_ros.argument
	 * @generated
	 */
	public Adapter createargumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ppgi.ufam.edu.robot_model_ros.topic <em>topic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ppgi.ufam.edu.robot_model_ros.topic
	 * @generated
	 */
	public Adapter createtopicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ppgi.ufam.edu.robot_model_ros.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ppgi.ufam.edu.robot_model_ros.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ppgi.ufam.edu.robot_model_ros.World_ROS <em>World ROS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ppgi.ufam.edu.robot_model_ros.World_ROS
	 * @generated
	 */
	public Adapter createWorld_ROSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Robot_model_rosAdapterFactory

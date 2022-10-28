/**
 */
package ppgi.ufam.edu.robot_model_ros;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage
 * @generated
 */
public interface Robot_model_rosFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Robot_model_rosFactory eINSTANCE = ppgi.ufam.edu.robot_model_ros.impl.Robot_model_rosFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>include</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>include</em>'.
	 * @generated
	 */
	include createinclude();

	/**
	 * Returns a new object of class '<em>service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>service</em>'.
	 * @generated
	 */
	service createservice();

	/**
	 * Returns a new object of class '<em>parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>parameter</em>'.
	 * @generated
	 */
	parameter createparameter();

	/**
	 * Returns a new object of class '<em>Robot System Ros</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot System Ros</em>'.
	 * @generated
	 */
	RobotSystemRos createRobotSystemRos();

	/**
	 * Returns a new object of class '<em>argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>argument</em>'.
	 * @generated
	 */
	argument createargument();

	/**
	 * Returns a new object of class '<em>topic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>topic</em>'.
	 * @generated
	 */
	topic createtopic();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>World ROS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>World ROS</em>'.
	 * @generated
	 */
	World_ROS createWorld_ROS();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Robot_model_rosPackage getRobot_model_rosPackage();

} //Robot_model_rosFactory

/**
 */
package ppgi.ufam.edu.robot_model_ros;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>World ROS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.World_ROS#getWorld_name <em>World name</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.World_ROS#isSimulator <em>Simulator</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.World_ROS#getWorld_to_robotsystem <em>World to robotsystem</em>}</li>
 * </ul>
 *
 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getWorld_ROS()
 * @model
 * @generated
 */
public interface World_ROS extends EObject {
	/**
	 * Returns the value of the '<em><b>World name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>World name</em>' attribute.
	 * @see #setWorld_name(String)
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getWorld_ROS_World_name()
	 * @model required="true"
	 * @generated
	 */
	String getWorld_name();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_model_ros.World_ROS#getWorld_name <em>World name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>World name</em>' attribute.
	 * @see #getWorld_name()
	 * @generated
	 */
	void setWorld_name(String value);

	/**
	 * Returns the value of the '<em><b>Simulator</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulator</em>' attribute.
	 * @see #setSimulator(boolean)
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getWorld_ROS_Simulator()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isSimulator();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_model_ros.World_ROS#isSimulator <em>Simulator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulator</em>' attribute.
	 * @see #isSimulator()
	 * @generated
	 */
	void setSimulator(boolean value);

	/**
	 * Returns the value of the '<em><b>World to robotsystem</b></em>' containment reference list.
	 * The list contents are of type {@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>World to robotsystem</em>' containment reference list.
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getWorld_ROS_World_to_robotsystem()
	 * @model containment="true"
	 * @generated
	 */
	EList<RobotSystemRos> getWorld_to_robotsystem();

} // World_ROS

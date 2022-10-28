/**
 */
package ppgi.ufam.edu.robot_model_ros;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.topic#getTopic_name <em>Topic name</em>}</li>
 * </ul>
 *
 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#gettopic()
 * @model
 * @generated
 */
public interface topic extends EObject {
	/**
	 * Returns the value of the '<em><b>Topic name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic name</em>' attribute.
	 * @see #setTopic_name(String)
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#gettopic_Topic_name()
	 * @model
	 * @generated
	 */
	String getTopic_name();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_model_ros.topic#getTopic_name <em>Topic name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic name</em>' attribute.
	 * @see #getTopic_name()
	 * @generated
	 */
	void setTopic_name(String value);

} // topic

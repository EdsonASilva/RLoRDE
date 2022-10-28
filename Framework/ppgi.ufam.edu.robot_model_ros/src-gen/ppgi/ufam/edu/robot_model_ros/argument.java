/**
 */
package ppgi.ufam.edu.robot_model_ros;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.argument#getArg_name <em>Arg name</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.argument#getArg_value <em>Arg value</em>}</li>
 * </ul>
 *
 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getargument()
 * @model
 * @generated
 */
public interface argument extends EObject {
	/**
	 * Returns the value of the '<em><b>Arg name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg name</em>' attribute.
	 * @see #setArg_name(String)
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getargument_Arg_name()
	 * @model
	 * @generated
	 */
	String getArg_name();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_model_ros.argument#getArg_name <em>Arg name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg name</em>' attribute.
	 * @see #getArg_name()
	 * @generated
	 */
	void setArg_name(String value);

	/**
	 * Returns the value of the '<em><b>Arg value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg value</em>' attribute.
	 * @see #setArg_value(String)
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getargument_Arg_value()
	 * @model
	 * @generated
	 */
	String getArg_value();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_model_ros.argument#getArg_value <em>Arg value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg value</em>' attribute.
	 * @see #getArg_value()
	 * @generated
	 */
	void setArg_value(String value);

} // argument

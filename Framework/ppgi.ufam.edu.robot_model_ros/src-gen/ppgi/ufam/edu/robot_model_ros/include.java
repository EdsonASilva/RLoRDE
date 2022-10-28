/**
 */
package ppgi.ufam.edu.robot_model_ros;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.include#getFile <em>File</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.include#getInclude_to_argument <em>Include to argument</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.include#getInclude_name <em>Include name</em>}</li>
 * </ul>
 *
 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getinclude()
 * @model
 * @generated
 */
public interface include extends EObject {
	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getinclude_File()
	 * @model
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_model_ros.include#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

	/**
	 * Returns the value of the '<em><b>Include to argument</b></em>' containment reference list.
	 * The list contents are of type {@link ppgi.ufam.edu.robot_model_ros.argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include to argument</em>' containment reference list.
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getinclude_Include_to_argument()
	 * @model containment="true"
	 * @generated
	 */
	EList<argument> getInclude_to_argument();

	/**
	 * Returns the value of the '<em><b>Include name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include name</em>' attribute.
	 * @see #setInclude_name(String)
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getinclude_Include_name()
	 * @model
	 * @generated
	 */
	String getInclude_name();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_model_ros.include#getInclude_name <em>Include name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include name</em>' attribute.
	 * @see #getInclude_name()
	 * @generated
	 */
	void setInclude_name(String value);

} // include

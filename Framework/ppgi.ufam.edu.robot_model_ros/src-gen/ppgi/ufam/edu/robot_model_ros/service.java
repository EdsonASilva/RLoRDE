/**
 */
package ppgi.ufam.edu.robot_model_ros;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.service#getName_serv <em>Name serv</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.service#getValue_serv <em>Value serv</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.service#getService_subscribe <em>Service subscribe</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.service#getService_pub <em>Service pub</em>}</li>
 * </ul>
 *
 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getservice()
 * @model
 * @generated
 */
public interface service extends EObject {
	/**
	 * Returns the value of the '<em><b>Name serv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name serv</em>' attribute.
	 * @see #setName_serv(String)
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getservice_Name_serv()
	 * @model
	 * @generated
	 */
	String getName_serv();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_model_ros.service#getName_serv <em>Name serv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name serv</em>' attribute.
	 * @see #getName_serv()
	 * @generated
	 */
	void setName_serv(String value);

	/**
	 * Returns the value of the '<em><b>Value serv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value serv</em>' attribute.
	 * @see #setValue_serv(String)
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getservice_Value_serv()
	 * @model
	 * @generated
	 */
	String getValue_serv();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_model_ros.service#getValue_serv <em>Value serv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value serv</em>' attribute.
	 * @see #getValue_serv()
	 * @generated
	 */
	void setValue_serv(String value);

	/**
	 * Returns the value of the '<em><b>Service subscribe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service subscribe</em>' reference.
	 * @see #setService_subscribe(topic)
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getservice_Service_subscribe()
	 * @model
	 * @generated
	 */
	topic getService_subscribe();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_model_ros.service#getService_subscribe <em>Service subscribe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service subscribe</em>' reference.
	 * @see #getService_subscribe()
	 * @generated
	 */
	void setService_subscribe(topic value);

	/**
	 * Returns the value of the '<em><b>Service pub</b></em>' reference list.
	 * The list contents are of type {@link ppgi.ufam.edu.robot_model_ros.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service pub</em>' reference list.
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getservice_Service_pub()
	 * @model
	 * @generated
	 */
	EList<Node> getService_pub();

} // service

/**
 */
package ppgi.ufam.edu.robot_system;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_system.Controller#getType <em>Type</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Controller#getId <em>Id</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Controller#getControl_actuator <em>Control actuator</em>}</li>
 * </ul>
 *
 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Generic"</code>.
	 * The literals are from the enumeration {@link ppgi.ufam.edu.robot_system.Type_controller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ppgi.ufam.edu.robot_system.Type_controller
	 * @see #setType(Type_controller)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getController_Type()
	 * @model default="Generic"
	 * @generated
	 */
	Type_controller getType();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Controller#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ppgi.ufam.edu.robot_system.Type_controller
	 * @see #getType()
	 * @generated
	 */
	void setType(Type_controller value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getController_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Controller#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Control actuator</b></em>' reference list.
	 * The list contents are of type {@link ppgi.ufam.edu.robot_system.Actuator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control actuator</em>' reference list.
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getController_Control_actuator()
	 * @model
	 * @generated
	 */
	EList<Actuator> getControl_actuator();

} // Controller

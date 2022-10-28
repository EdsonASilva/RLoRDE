/**
 */
package ppgi.ufam.edu.robot_system;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_system.Actuator#getType <em>Type</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Actuator#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Generic"</code>.
	 * The literals are from the enumeration {@link ppgi.ufam.edu.robot_system.Type_actuator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ppgi.ufam.edu.robot_system.Type_actuator
	 * @see #setType(Type_actuator)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getActuator_Type()
	 * @model default="Generic" required="true"
	 * @generated
	 */
	Type_actuator getType();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Actuator#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ppgi.ufam.edu.robot_system.Type_actuator
	 * @see #getType()
	 * @generated
	 */
	void setType(Type_actuator value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getActuator_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Actuator#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Actuator

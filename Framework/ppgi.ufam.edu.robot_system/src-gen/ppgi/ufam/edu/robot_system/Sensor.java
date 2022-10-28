/**
 */
package ppgi.ufam.edu.robot_system;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_system.Sensor#getType <em>Type</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Sensor#getDiscretize <em>Discretize</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Sensor#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ppgi.ufam.edu.robot_system.Type_sensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ppgi.ufam.edu.robot_system.Type_sensor
	 * @see #setType(Type_sensor)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getSensor_Type()
	 * @model required="true"
	 * @generated
	 */
	Type_sensor getType();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Sensor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ppgi.ufam.edu.robot_system.Type_sensor
	 * @see #getType()
	 * @generated
	 */
	void setType(Type_sensor value);

	/**
	 * Returns the value of the '<em><b>Discretize</b></em>' reference list.
	 * The list contents are of type {@link ppgi.ufam.edu.robot_system.Discretize}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discretize</em>' reference list.
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getSensor_Discretize()
	 * @model
	 * @generated
	 */
	EList<Discretize> getDiscretize();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getSensor_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Sensor#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Sensor

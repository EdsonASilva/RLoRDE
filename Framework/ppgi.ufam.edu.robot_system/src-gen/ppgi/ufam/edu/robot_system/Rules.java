/**
 */
package ppgi.ufam.edu.robot_system;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_system.Rules#getId <em>Id</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Rules#isEnable <em>Enable</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Rules#getMin_value <em>Min value</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Rules#getMax_value <em>Max value</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Rules#getType_rule <em>Type rule</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Rules#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getRules()
 * @model
 * @generated
 */
public interface Rules extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getRules_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Rules#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Min value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min value</em>' attribute.
	 * @see #setMin_value(int)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getRules_Min_value()
	 * @model
	 * @generated
	 */
	int getMin_value();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Rules#getMin_value <em>Min value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min value</em>' attribute.
	 * @see #getMin_value()
	 * @generated
	 */
	void setMin_value(int value);

	/**
	 * Returns the value of the '<em><b>Max value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max value</em>' attribute.
	 * @see #setMax_value(int)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getRules_Max_value()
	 * @model
	 * @generated
	 */
	int getMax_value();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Rules#getMax_value <em>Max value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max value</em>' attribute.
	 * @see #getMax_value()
	 * @generated
	 */
	void setMax_value(int value);

	/**
	 * Returns the value of the '<em><b>Type rule</b></em>' attribute.
	 * The default value is <code>"Bigger_than"</code>.
	 * The literals are from the enumeration {@link ppgi.ufam.edu.robot_system.Type_rules}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type rule</em>' attribute.
	 * @see ppgi.ufam.edu.robot_system.Type_rules
	 * @see #setType_rule(Type_rules)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getRules_Type_rule()
	 * @model default="Bigger_than" required="true"
	 * @generated
	 */
	Type_rules getType_rule();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Rules#getType_rule <em>Type rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type rule</em>' attribute.
	 * @see ppgi.ufam.edu.robot_system.Type_rules
	 * @see #getType_rule()
	 * @generated
	 */
	void setType_rule(Type_rules value);

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' reference.
	 * @see #setController(Controller)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getRules_Controller()
	 * @model
	 * @generated
	 */
	Controller getController();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Rules#getController <em>Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' reference.
	 * @see #getController()
	 * @generated
	 */
	void setController(Controller value);

	/**
	 * Returns the value of the '<em><b>Enable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable</em>' attribute.
	 * @see #setEnable(boolean)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getRules_Enable()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isEnable();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Rules#isEnable <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable</em>' attribute.
	 * @see #isEnable()
	 * @generated
	 */
	void setEnable(boolean value);

} // Rules

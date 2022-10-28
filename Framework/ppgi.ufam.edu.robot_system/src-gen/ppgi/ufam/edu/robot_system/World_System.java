/**
 */
package ppgi.ufam.edu.robot_system;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>World System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_system.World_System#getName <em>Name</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.World_System#getHas_robot_system <em>Has robot system</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.World_System#isSimulator <em>Simulator</em>}</li>
 * </ul>
 *
 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getWorld_System()
 * @model
 * @generated
 */
public interface World_System extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"World System"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getWorld_System_Name()
	 * @model default="World System" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.World_System#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has robot system</b></em>' containment reference list.
	 * The list contents are of type {@link ppgi.ufam.edu.robot_system.Robot_System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has robot system</em>' containment reference list.
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getWorld_System_Has_robot_system()
	 * @model containment="true"
	 * @generated
	 */
	EList<Robot_System> getHas_robot_system();

	/**
	 * Returns the value of the '<em><b>Simulator</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulator</em>' attribute.
	 * @see #setSimulator(boolean)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getWorld_System_Simulator()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isSimulator();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.World_System#isSimulator <em>Simulator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulator</em>' attribute.
	 * @see #isSimulator()
	 * @generated
	 */
	void setSimulator(boolean value);

} // World_System

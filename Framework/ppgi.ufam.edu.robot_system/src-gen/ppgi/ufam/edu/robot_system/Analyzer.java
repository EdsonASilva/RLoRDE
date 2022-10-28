/**
 */
package ppgi.ufam.edu.robot_system;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analyzer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_system.Analyzer#isEnable <em>Enable</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Analyzer#getId <em>Id</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Analyzer#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getAnalyzer()
 * @model
 * @generated
 */
public interface Analyzer extends EObject {
	/**
	 * Returns the value of the '<em><b>Enable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable</em>' attribute.
	 * @see #setEnable(boolean)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getAnalyzer_Enable()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isEnable();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Analyzer#isEnable <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable</em>' attribute.
	 * @see #isEnable()
	 * @generated
	 */
	void setEnable(boolean value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getAnalyzer_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Analyzer#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ppgi.ufam.edu.robot_system.Rules}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getAnalyzer_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rules> getRules();

} // Analyzer

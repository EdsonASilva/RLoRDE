/**
 */
package ppgi.ufam.edu.robot_system;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_system.Element#getId <em>Id</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Element#isFault_tolerant <em>Fault tolerant</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Element#isEssential <em>Essential</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Element#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getElement_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Element#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Fault tolerant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault tolerant</em>' attribute.
	 * @see #setFault_tolerant(boolean)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getElement_Fault_tolerant()
	 * @model required="true"
	 * @generated
	 */
	boolean isFault_tolerant();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Element#isFault_tolerant <em>Fault tolerant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault tolerant</em>' attribute.
	 * @see #isFault_tolerant()
	 * @generated
	 */
	void setFault_tolerant(boolean value);

	/**
	 * Returns the value of the '<em><b>Essential</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Essential</em>' attribute.
	 * @see #setEssential(boolean)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getElement_Essential()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isEssential();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Element#isEssential <em>Essential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Essential</em>' attribute.
	 * @see #isEssential()
	 * @generated
	 */
	void setEssential(boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Element#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Element

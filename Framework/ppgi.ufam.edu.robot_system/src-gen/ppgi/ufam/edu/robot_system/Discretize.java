/**
 */
package ppgi.ufam.edu.robot_system;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discretize</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_system.Discretize#getReduction_percent <em>Reduction percent</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Discretize#getAnalyzer <em>Analyzer</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Discretize#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getDiscretize()
 * @model
 * @generated
 */
public interface Discretize extends EObject {
	/**
	 * Returns the value of the '<em><b>Reduction percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reduction percent</em>' attribute.
	 * @see #setReduction_percent(float)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getDiscretize_Reduction_percent()
	 * @model
	 * @generated
	 */
	float getReduction_percent();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Discretize#getReduction_percent <em>Reduction percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reduction percent</em>' attribute.
	 * @see #getReduction_percent()
	 * @generated
	 */
	void setReduction_percent(float value);

	/**
	 * Returns the value of the '<em><b>Analyzer</b></em>' reference list.
	 * The list contents are of type {@link ppgi.ufam.edu.robot_system.Analyzer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analyzer</em>' reference list.
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getDiscretize_Analyzer()
	 * @model
	 * @generated
	 */
	EList<Analyzer> getAnalyzer();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getDiscretize_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Discretize#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Discretize

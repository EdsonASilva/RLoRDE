/**
 */
package ppgi.ufam.edu.robot_system;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_system.Robot_System#getName <em>Name</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Robot_System#getDescription <em>Description</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Robot_System#getHas_actuator <em>Has actuator</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Robot_System#getHas_sensor <em>Has sensor</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Robot_System#getHas_controller <em>Has controller</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Robot_System#getType_archicture <em>Type archicture</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Robot_System#getWidth <em>Width</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Robot_System#getLength <em>Length</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Robot_System#getHeight <em>Height</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Robot_System#getWeight <em>Weight</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Robot_System#getInitial_positionX <em>Initial position X</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Robot_System#getInitial_positionY <em>Initial position Y</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Robot_System#getInitial_positionZ <em>Initial position Z</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Robot_System#getHas_discretize <em>Has discretize</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.Robot_System#getHas_analyzer <em>Has analyzer</em>}</li>
 * </ul>
 *
 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getRobot_System()
 * @model
 * @generated
 */
public interface Robot_System extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getRobot_System_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Robot_System#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getRobot_System_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Robot_System#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has actuator</b></em>' containment reference list.
	 * The list contents are of type {@link ppgi.ufam.edu.robot_system.Actuator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has actuator</em>' containment reference list.
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getRobot_System_Has_actuator()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actuator> getHas_actuator();

	/**
	 * Returns the value of the '<em><b>Has sensor</b></em>' containment reference list.
	 * The list contents are of type {@link ppgi.ufam.edu.robot_system.Sensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has sensor</em>' containment reference list.
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getRobot_System_Has_sensor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sensor> getHas_sensor();

	/**
	 * Returns the value of the '<em><b>Has controller</b></em>' containment reference list.
	 * The list contents are of type {@link ppgi.ufam.edu.robot_system.Controller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has controller</em>' containment reference list.
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getRobot_System_Has_controller()
	 * @model containment="true"
	 * @generated
	 */
	EList<Controller> getHas_controller();

	/**
	 * Returns the value of the '<em><b>Type archicture</b></em>' attribute.
	 * The default value is <code>"Differencial Drive"</code>.
	 * The literals are from the enumeration {@link ppgi.ufam.edu.robot_system.Type_architecture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type archicture</em>' attribute.
	 * @see ppgi.ufam.edu.robot_system.Type_architecture
	 * @see #setType_archicture(Type_architecture)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getRobot_System_Type_archicture()
	 * @model default="Differencial Drive" required="true"
	 * @generated
	 */
	Type_architecture getType_archicture();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Robot_System#getType_archicture <em>Type archicture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type archicture</em>' attribute.
	 * @see ppgi.ufam.edu.robot_system.Type_architecture
	 * @see #getType_archicture()
	 * @generated
	 */
	void setType_archicture(Type_architecture value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getRobot_System_Width()
	 * @model default="0"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Robot_System#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(double)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getRobot_System_Length()
	 * @model default="0"
	 * @generated
	 */
	double getLength();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Robot_System#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(double value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getRobot_System_Height()
	 * @model default="0"
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Robot_System#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getRobot_System_Weight()
	 * @model default="0"
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Robot_System#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Initial position X</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial position X</em>' attribute.
	 * @see #setInitial_positionX(double)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getRobot_System_Initial_positionX()
	 * @model default="0" required="true"
	 * @generated
	 */
	double getInitial_positionX();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Robot_System#getInitial_positionX <em>Initial position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial position X</em>' attribute.
	 * @see #getInitial_positionX()
	 * @generated
	 */
	void setInitial_positionX(double value);

	/**
	 * Returns the value of the '<em><b>Initial position Y</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial position Y</em>' attribute.
	 * @see #setInitial_positionY(double)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getRobot_System_Initial_positionY()
	 * @model default="0" required="true"
	 * @generated
	 */
	double getInitial_positionY();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Robot_System#getInitial_positionY <em>Initial position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial position Y</em>' attribute.
	 * @see #getInitial_positionY()
	 * @generated
	 */
	void setInitial_positionY(double value);

	/**
	 * Returns the value of the '<em><b>Initial position Z</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial position Z</em>' attribute.
	 * @see #setInitial_positionZ(double)
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getRobot_System_Initial_positionZ()
	 * @model default="0" required="true"
	 * @generated
	 */
	double getInitial_positionZ();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_system.Robot_System#getInitial_positionZ <em>Initial position Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial position Z</em>' attribute.
	 * @see #getInitial_positionZ()
	 * @generated
	 */
	void setInitial_positionZ(double value);

	/**
	 * Returns the value of the '<em><b>Has discretize</b></em>' containment reference list.
	 * The list contents are of type {@link ppgi.ufam.edu.robot_system.Discretize}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has discretize</em>' containment reference list.
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getRobot_System_Has_discretize()
	 * @model containment="true"
	 * @generated
	 */
	EList<Discretize> getHas_discretize();

	/**
	 * Returns the value of the '<em><b>Has analyzer</b></em>' containment reference list.
	 * The list contents are of type {@link ppgi.ufam.edu.robot_system.Analyzer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has analyzer</em>' containment reference list.
	 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getRobot_System_Has_analyzer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Analyzer> getHas_analyzer();

} // Robot_System

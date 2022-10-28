/**
 */
package ppgi.ufam.edu.robot_model_ros;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot System Ros</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getName <em>Name</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getType_architecture <em>Type architecture</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getRos_to_node <em>Ros to node</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getRos_to_include <em>Ros to include</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getRos_to_argument <em>Ros to argument</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getRos_to_parameter <em>Ros to parameter</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getRos_to_service <em>Ros to service</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getRos_to_topic <em>Ros to topic</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getDescription <em>Description</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getHeight <em>Height</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getLength <em>Length</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getWidth <em>Width</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getWeight <em>Weight</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getInitial_positionX <em>Initial position X</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getInitial_positionZ <em>Initial position Z</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getInitial_positionY <em>Initial position Y</em>}</li>
 * </ul>
 *
 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getRobotSystemRos()
 * @model
 * @generated
 */
public interface RobotSystemRos extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getRobotSystemRos_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type architecture</em>' attribute.
	 * @see #setType_architecture(String)
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getRobotSystemRos_Type_architecture()
	 * @model
	 * @generated
	 */
	String getType_architecture();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getType_architecture <em>Type architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type architecture</em>' attribute.
	 * @see #getType_architecture()
	 * @generated
	 */
	void setType_architecture(String value);

	/**
	 * Returns the value of the '<em><b>Ros to node</b></em>' containment reference list.
	 * The list contents are of type {@link ppgi.ufam.edu.robot_model_ros.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ros to node</em>' containment reference list.
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getRobotSystemRos_Ros_to_node()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getRos_to_node();

	/**
	 * Returns the value of the '<em><b>Ros to include</b></em>' containment reference list.
	 * The list contents are of type {@link ppgi.ufam.edu.robot_model_ros.include}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ros to include</em>' containment reference list.
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getRobotSystemRos_Ros_to_include()
	 * @model containment="true"
	 * @generated
	 */
	EList<include> getRos_to_include();

	/**
	 * Returns the value of the '<em><b>Ros to argument</b></em>' containment reference list.
	 * The list contents are of type {@link ppgi.ufam.edu.robot_model_ros.argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ros to argument</em>' containment reference list.
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getRobotSystemRos_Ros_to_argument()
	 * @model containment="true"
	 * @generated
	 */
	EList<argument> getRos_to_argument();

	/**
	 * Returns the value of the '<em><b>Ros to parameter</b></em>' containment reference list.
	 * The list contents are of type {@link ppgi.ufam.edu.robot_model_ros.parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ros to parameter</em>' containment reference list.
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getRobotSystemRos_Ros_to_parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<parameter> getRos_to_parameter();

	/**
	 * Returns the value of the '<em><b>Ros to service</b></em>' containment reference list.
	 * The list contents are of type {@link ppgi.ufam.edu.robot_model_ros.service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ros to service</em>' containment reference list.
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getRobotSystemRos_Ros_to_service()
	 * @model containment="true"
	 * @generated
	 */
	EList<service> getRos_to_service();

	/**
	 * Returns the value of the '<em><b>Ros to topic</b></em>' containment reference list.
	 * The list contents are of type {@link ppgi.ufam.edu.robot_model_ros.topic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ros to topic</em>' containment reference list.
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getRobotSystemRos_Ros_to_topic()
	 * @model containment="true"
	 * @generated
	 */
	EList<topic> getRos_to_topic();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getRobotSystemRos_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"0.10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getRobotSystemRos_Height()
	 * @model default="0.10"
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * The default value is <code>"0.22"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(double)
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getRobotSystemRos_Length()
	 * @model default="0.22"
	 * @generated
	 */
	double getLength();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(double value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"0.15"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getRobotSystemRos_Width()
	 * @model default="0.15"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"2.6"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getRobotSystemRos_Weight()
	 * @model default="2.6"
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getWeight <em>Weight</em>}' attribute.
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
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getRobotSystemRos_Initial_positionX()
	 * @model default="0" required="true"
	 * @generated
	 */
	double getInitial_positionX();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getInitial_positionX <em>Initial position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial position X</em>' attribute.
	 * @see #getInitial_positionX()
	 * @generated
	 */
	void setInitial_positionX(double value);

	/**
	 * Returns the value of the '<em><b>Initial position Z</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial position Z</em>' attribute.
	 * @see #setInitial_positionZ(double)
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getRobotSystemRos_Initial_positionZ()
	 * @model default="0" required="true"
	 * @generated
	 */
	double getInitial_positionZ();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getInitial_positionZ <em>Initial position Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial position Z</em>' attribute.
	 * @see #getInitial_positionZ()
	 * @generated
	 */
	void setInitial_positionZ(double value);

	/**
	 * Returns the value of the '<em><b>Initial position Y</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial position Y</em>' attribute.
	 * @see #setInitial_positionY(double)
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getRobotSystemRos_Initial_positionY()
	 * @model default="0" required="true"
	 * @generated
	 */
	double getInitial_positionY();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_model_ros.RobotSystemRos#getInitial_positionY <em>Initial position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial position Y</em>' attribute.
	 * @see #getInitial_positionY()
	 * @generated
	 */
	void setInitial_positionY(double value);

} // RobotSystemRos

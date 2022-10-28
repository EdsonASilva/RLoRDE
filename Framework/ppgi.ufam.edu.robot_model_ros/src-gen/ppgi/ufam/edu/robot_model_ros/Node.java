/**
 */
package ppgi.ufam.edu.robot_model_ros;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.Node#getName_node <em>Name node</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.Node#getPackage_name <em>Package name</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.Node#getType_node <em>Type node</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.Node#getPublish <em>Publish</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.Node#getNode_to_argument <em>Node to argument</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.Node#getSubscribe <em>Subscribe</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.Node#getNode_to_node <em>Node to node</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.Node#getType_controller <em>Type controller</em>}</li>
 * </ul>
 *
 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Name node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name node</em>' attribute.
	 * @see #setName_node(String)
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getNode_Name_node()
	 * @model
	 * @generated
	 */
	String getName_node();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_model_ros.Node#getName_node <em>Name node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name node</em>' attribute.
	 * @see #getName_node()
	 * @generated
	 */
	void setName_node(String value);

	/**
	 * Returns the value of the '<em><b>Package name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package name</em>' attribute.
	 * @see #setPackage_name(String)
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getNode_Package_name()
	 * @model
	 * @generated
	 */
	String getPackage_name();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_model_ros.Node#getPackage_name <em>Package name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package name</em>' attribute.
	 * @see #getPackage_name()
	 * @generated
	 */
	void setPackage_name(String value);

	/**
	 * Returns the value of the '<em><b>Type node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type node</em>' attribute.
	 * @see #setType_node(String)
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getNode_Type_node()
	 * @model
	 * @generated
	 */
	String getType_node();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_model_ros.Node#getType_node <em>Type node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type node</em>' attribute.
	 * @see #getType_node()
	 * @generated
	 */
	void setType_node(String value);

	/**
	 * Returns the value of the '<em><b>Publish</b></em>' reference list.
	 * The list contents are of type {@link ppgi.ufam.edu.robot_model_ros.topic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish</em>' reference list.
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getNode_Publish()
	 * @model
	 * @generated
	 */
	EList<topic> getPublish();

	/**
	 * Returns the value of the '<em><b>Node to argument</b></em>' containment reference list.
	 * The list contents are of type {@link ppgi.ufam.edu.robot_model_ros.argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node to argument</em>' containment reference list.
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getNode_Node_to_argument()
	 * @model containment="true"
	 * @generated
	 */
	EList<argument> getNode_to_argument();

	/**
	 * Returns the value of the '<em><b>Subscribe</b></em>' reference list.
	 * The list contents are of type {@link ppgi.ufam.edu.robot_model_ros.topic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribe</em>' reference list.
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getNode_Subscribe()
	 * @model
	 * @generated
	 */
	EList<topic> getSubscribe();

	/**
	 * Returns the value of the '<em><b>Node to node</b></em>' reference list.
	 * The list contents are of type {@link ppgi.ufam.edu.robot_model_ros.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node to node</em>' reference list.
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getNode_Node_to_node()
	 * @model
	 * @generated
	 */
	EList<Node> getNode_to_node();

	/**
	 * Returns the value of the '<em><b>Type controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type controller</em>' attribute.
	 * @see #setType_controller(String)
	 * @see ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage#getNode_Type_controller()
	 * @model
	 * @generated
	 */
	String getType_controller();

	/**
	 * Sets the value of the '{@link ppgi.ufam.edu.robot_model_ros.Node#getType_controller <em>Type controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type controller</em>' attribute.
	 * @see #getType_controller()
	 * @generated
	 */
	void setType_controller(String value);

} // Node

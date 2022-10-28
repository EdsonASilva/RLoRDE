/**
 */
package ppgi.ufam.edu.robot_model_ros.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ppgi.ufam.edu.robot_model_ros.Node;
import ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage;
import ppgi.ufam.edu.robot_model_ros.argument;
import ppgi.ufam.edu.robot_model_ros.topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.NodeImpl#getName_node <em>Name node</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.NodeImpl#getPackage_name <em>Package name</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.NodeImpl#getType_node <em>Type node</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.NodeImpl#getPublish <em>Publish</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.NodeImpl#getNode_to_argument <em>Node to argument</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.NodeImpl#getSubscribe <em>Subscribe</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.NodeImpl#getNode_to_node <em>Node to node</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.NodeImpl#getType_controller <em>Type controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * The default value of the '{@link #getName_node() <em>Name node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_node()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_node() <em>Name node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_node()
	 * @generated
	 * @ordered
	 */
	protected String name_node = NAME_NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackage_name() <em>Package name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage_name()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackage_name() <em>Package name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage_name()
	 * @generated
	 * @ordered
	 */
	protected String package_name = PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType_node() <em>Type node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_node()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType_node() <em>Type node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_node()
	 * @generated
	 * @ordered
	 */
	protected String type_node = TYPE_NODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPublish() <em>Publish</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublish()
	 * @generated
	 * @ordered
	 */
	protected EList<topic> publish;

	/**
	 * The cached value of the '{@link #getNode_to_argument() <em>Node to argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode_to_argument()
	 * @generated
	 * @ordered
	 */
	protected EList<argument> node_to_argument;

	/**
	 * The cached value of the '{@link #getSubscribe() <em>Subscribe</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribe()
	 * @generated
	 * @ordered
	 */
	protected EList<topic> subscribe;

	/**
	 * The cached value of the '{@link #getNode_to_node() <em>Node to node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode_to_node()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> node_to_node;

	/**
	 * The default value of the '{@link #getType_controller() <em>Type controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_controller()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_CONTROLLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType_controller() <em>Type controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_controller()
	 * @generated
	 * @ordered
	 */
	protected String type_controller = TYPE_CONTROLLER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Robot_model_rosPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName_node() {
		return name_node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_node(String newName_node) {
		String oldName_node = name_node;
		name_node = newName_node;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_model_rosPackage.NODE__NAME_NODE, oldName_node,
					name_node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackage_name() {
		return package_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage_name(String newPackage_name) {
		String oldPackage_name = package_name;
		package_name = newPackage_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_model_rosPackage.NODE__PACKAGE_NAME,
					oldPackage_name, package_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType_node() {
		return type_node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType_node(String newType_node) {
		String oldType_node = type_node;
		type_node = newType_node;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_model_rosPackage.NODE__TYPE_NODE, oldType_node,
					type_node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<topic> getPublish() {
		if (publish == null) {
			publish = new EObjectResolvingEList<topic>(topic.class, this, Robot_model_rosPackage.NODE__PUBLISH);
		}
		return publish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<argument> getNode_to_argument() {
		if (node_to_argument == null) {
			node_to_argument = new EObjectContainmentEList<argument>(argument.class, this,
					Robot_model_rosPackage.NODE__NODE_TO_ARGUMENT);
		}
		return node_to_argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<topic> getSubscribe() {
		if (subscribe == null) {
			subscribe = new EObjectResolvingEList<topic>(topic.class, this, Robot_model_rosPackage.NODE__SUBSCRIBE);
		}
		return subscribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNode_to_node() {
		if (node_to_node == null) {
			node_to_node = new EObjectResolvingEList<Node>(Node.class, this, Robot_model_rosPackage.NODE__NODE_TO_NODE);
		}
		return node_to_node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType_controller() {
		return type_controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType_controller(String newType_controller) {
		String oldType_controller = type_controller;
		type_controller = newType_controller;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_model_rosPackage.NODE__TYPE_CONTROLLER,
					oldType_controller, type_controller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Robot_model_rosPackage.NODE__NODE_TO_ARGUMENT:
			return ((InternalEList<?>) getNode_to_argument()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Robot_model_rosPackage.NODE__NAME_NODE:
			return getName_node();
		case Robot_model_rosPackage.NODE__PACKAGE_NAME:
			return getPackage_name();
		case Robot_model_rosPackage.NODE__TYPE_NODE:
			return getType_node();
		case Robot_model_rosPackage.NODE__PUBLISH:
			return getPublish();
		case Robot_model_rosPackage.NODE__NODE_TO_ARGUMENT:
			return getNode_to_argument();
		case Robot_model_rosPackage.NODE__SUBSCRIBE:
			return getSubscribe();
		case Robot_model_rosPackage.NODE__NODE_TO_NODE:
			return getNode_to_node();
		case Robot_model_rosPackage.NODE__TYPE_CONTROLLER:
			return getType_controller();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Robot_model_rosPackage.NODE__NAME_NODE:
			setName_node((String) newValue);
			return;
		case Robot_model_rosPackage.NODE__PACKAGE_NAME:
			setPackage_name((String) newValue);
			return;
		case Robot_model_rosPackage.NODE__TYPE_NODE:
			setType_node((String) newValue);
			return;
		case Robot_model_rosPackage.NODE__PUBLISH:
			getPublish().clear();
			getPublish().addAll((Collection<? extends topic>) newValue);
			return;
		case Robot_model_rosPackage.NODE__NODE_TO_ARGUMENT:
			getNode_to_argument().clear();
			getNode_to_argument().addAll((Collection<? extends argument>) newValue);
			return;
		case Robot_model_rosPackage.NODE__SUBSCRIBE:
			getSubscribe().clear();
			getSubscribe().addAll((Collection<? extends topic>) newValue);
			return;
		case Robot_model_rosPackage.NODE__NODE_TO_NODE:
			getNode_to_node().clear();
			getNode_to_node().addAll((Collection<? extends Node>) newValue);
			return;
		case Robot_model_rosPackage.NODE__TYPE_CONTROLLER:
			setType_controller((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Robot_model_rosPackage.NODE__NAME_NODE:
			setName_node(NAME_NODE_EDEFAULT);
			return;
		case Robot_model_rosPackage.NODE__PACKAGE_NAME:
			setPackage_name(PACKAGE_NAME_EDEFAULT);
			return;
		case Robot_model_rosPackage.NODE__TYPE_NODE:
			setType_node(TYPE_NODE_EDEFAULT);
			return;
		case Robot_model_rosPackage.NODE__PUBLISH:
			getPublish().clear();
			return;
		case Robot_model_rosPackage.NODE__NODE_TO_ARGUMENT:
			getNode_to_argument().clear();
			return;
		case Robot_model_rosPackage.NODE__SUBSCRIBE:
			getSubscribe().clear();
			return;
		case Robot_model_rosPackage.NODE__NODE_TO_NODE:
			getNode_to_node().clear();
			return;
		case Robot_model_rosPackage.NODE__TYPE_CONTROLLER:
			setType_controller(TYPE_CONTROLLER_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Robot_model_rosPackage.NODE__NAME_NODE:
			return NAME_NODE_EDEFAULT == null ? name_node != null : !NAME_NODE_EDEFAULT.equals(name_node);
		case Robot_model_rosPackage.NODE__PACKAGE_NAME:
			return PACKAGE_NAME_EDEFAULT == null ? package_name != null : !PACKAGE_NAME_EDEFAULT.equals(package_name);
		case Robot_model_rosPackage.NODE__TYPE_NODE:
			return TYPE_NODE_EDEFAULT == null ? type_node != null : !TYPE_NODE_EDEFAULT.equals(type_node);
		case Robot_model_rosPackage.NODE__PUBLISH:
			return publish != null && !publish.isEmpty();
		case Robot_model_rosPackage.NODE__NODE_TO_ARGUMENT:
			return node_to_argument != null && !node_to_argument.isEmpty();
		case Robot_model_rosPackage.NODE__SUBSCRIBE:
			return subscribe != null && !subscribe.isEmpty();
		case Robot_model_rosPackage.NODE__NODE_TO_NODE:
			return node_to_node != null && !node_to_node.isEmpty();
		case Robot_model_rosPackage.NODE__TYPE_CONTROLLER:
			return TYPE_CONTROLLER_EDEFAULT == null ? type_controller != null
					: !TYPE_CONTROLLER_EDEFAULT.equals(type_controller);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name_node: ");
		result.append(name_node);
		result.append(", package_name: ");
		result.append(package_name);
		result.append(", type_node: ");
		result.append(type_node);
		result.append(", type_controller: ");
		result.append(type_controller);
		result.append(')');
		return result.toString();
	}

} //NodeImpl

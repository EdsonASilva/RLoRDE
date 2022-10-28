/**
 */
package ppgi.ufam.edu.robot_model_ros.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import ppgi.ufam.edu.robot_model_ros.Node;
import ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage;
import ppgi.ufam.edu.robot_model_ros.service;
import ppgi.ufam.edu.robot_model_ros.topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.serviceImpl#getName_serv <em>Name serv</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.serviceImpl#getValue_serv <em>Value serv</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.serviceImpl#getService_subscribe <em>Service subscribe</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.serviceImpl#getService_pub <em>Service pub</em>}</li>
 * </ul>
 *
 * @generated
 */
public class serviceImpl extends MinimalEObjectImpl.Container implements service {
	/**
	 * The default value of the '{@link #getName_serv() <em>Name serv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_serv()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_SERV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_serv() <em>Name serv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_serv()
	 * @generated
	 * @ordered
	 */
	protected String name_serv = NAME_SERV_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue_serv() <em>Value serv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue_serv()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_SERV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue_serv() <em>Value serv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue_serv()
	 * @generated
	 * @ordered
	 */
	protected String value_serv = VALUE_SERV_EDEFAULT;

	/**
	 * The cached value of the '{@link #getService_subscribe() <em>Service subscribe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService_subscribe()
	 * @generated
	 * @ordered
	 */
	protected topic service_subscribe;

	/**
	 * The cached value of the '{@link #getService_pub() <em>Service pub</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService_pub()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> service_pub;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected serviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Robot_model_rosPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName_serv() {
		return name_serv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_serv(String newName_serv) {
		String oldName_serv = name_serv;
		name_serv = newName_serv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_model_rosPackage.SERVICE__NAME_SERV,
					oldName_serv, name_serv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue_serv() {
		return value_serv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue_serv(String newValue_serv) {
		String oldValue_serv = value_serv;
		value_serv = newValue_serv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_model_rosPackage.SERVICE__VALUE_SERV,
					oldValue_serv, value_serv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public topic getService_subscribe() {
		if (service_subscribe != null && service_subscribe.eIsProxy()) {
			InternalEObject oldService_subscribe = (InternalEObject) service_subscribe;
			service_subscribe = (topic) eResolveProxy(oldService_subscribe);
			if (service_subscribe != oldService_subscribe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Robot_model_rosPackage.SERVICE__SERVICE_SUBSCRIBE, oldService_subscribe,
							service_subscribe));
			}
		}
		return service_subscribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public topic basicGetService_subscribe() {
		return service_subscribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService_subscribe(topic newService_subscribe) {
		topic oldService_subscribe = service_subscribe;
		service_subscribe = newService_subscribe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_model_rosPackage.SERVICE__SERVICE_SUBSCRIBE,
					oldService_subscribe, service_subscribe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getService_pub() {
		if (service_pub == null) {
			service_pub = new EObjectResolvingEList<Node>(Node.class, this,
					Robot_model_rosPackage.SERVICE__SERVICE_PUB);
		}
		return service_pub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Robot_model_rosPackage.SERVICE__NAME_SERV:
			return getName_serv();
		case Robot_model_rosPackage.SERVICE__VALUE_SERV:
			return getValue_serv();
		case Robot_model_rosPackage.SERVICE__SERVICE_SUBSCRIBE:
			if (resolve)
				return getService_subscribe();
			return basicGetService_subscribe();
		case Robot_model_rosPackage.SERVICE__SERVICE_PUB:
			return getService_pub();
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
		case Robot_model_rosPackage.SERVICE__NAME_SERV:
			setName_serv((String) newValue);
			return;
		case Robot_model_rosPackage.SERVICE__VALUE_SERV:
			setValue_serv((String) newValue);
			return;
		case Robot_model_rosPackage.SERVICE__SERVICE_SUBSCRIBE:
			setService_subscribe((topic) newValue);
			return;
		case Robot_model_rosPackage.SERVICE__SERVICE_PUB:
			getService_pub().clear();
			getService_pub().addAll((Collection<? extends Node>) newValue);
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
		case Robot_model_rosPackage.SERVICE__NAME_SERV:
			setName_serv(NAME_SERV_EDEFAULT);
			return;
		case Robot_model_rosPackage.SERVICE__VALUE_SERV:
			setValue_serv(VALUE_SERV_EDEFAULT);
			return;
		case Robot_model_rosPackage.SERVICE__SERVICE_SUBSCRIBE:
			setService_subscribe((topic) null);
			return;
		case Robot_model_rosPackage.SERVICE__SERVICE_PUB:
			getService_pub().clear();
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
		case Robot_model_rosPackage.SERVICE__NAME_SERV:
			return NAME_SERV_EDEFAULT == null ? name_serv != null : !NAME_SERV_EDEFAULT.equals(name_serv);
		case Robot_model_rosPackage.SERVICE__VALUE_SERV:
			return VALUE_SERV_EDEFAULT == null ? value_serv != null : !VALUE_SERV_EDEFAULT.equals(value_serv);
		case Robot_model_rosPackage.SERVICE__SERVICE_SUBSCRIBE:
			return service_subscribe != null;
		case Robot_model_rosPackage.SERVICE__SERVICE_PUB:
			return service_pub != null && !service_pub.isEmpty();
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
		result.append(" (name_serv: ");
		result.append(name_serv);
		result.append(", value_serv: ");
		result.append(value_serv);
		result.append(')');
		return result.toString();
	}

} //serviceImpl

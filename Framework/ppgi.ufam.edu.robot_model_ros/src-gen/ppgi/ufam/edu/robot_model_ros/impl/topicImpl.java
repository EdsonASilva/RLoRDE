/**
 */
package ppgi.ufam.edu.robot_model_ros.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage;
import ppgi.ufam.edu.robot_model_ros.topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>topic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.topicImpl#getTopic_name <em>Topic name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class topicImpl extends MinimalEObjectImpl.Container implements topic {
	/**
	 * The default value of the '{@link #getTopic_name() <em>Topic name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic_name()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopic_name() <em>Topic name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic_name()
	 * @generated
	 * @ordered
	 */
	protected String topic_name = TOPIC_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected topicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Robot_model_rosPackage.Literals.TOPIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopic_name() {
		return topic_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopic_name(String newTopic_name) {
		String oldTopic_name = topic_name;
		topic_name = newTopic_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_model_rosPackage.TOPIC__TOPIC_NAME,
					oldTopic_name, topic_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Robot_model_rosPackage.TOPIC__TOPIC_NAME:
			return getTopic_name();
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
		case Robot_model_rosPackage.TOPIC__TOPIC_NAME:
			setTopic_name((String) newValue);
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
		case Robot_model_rosPackage.TOPIC__TOPIC_NAME:
			setTopic_name(TOPIC_NAME_EDEFAULT);
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
		case Robot_model_rosPackage.TOPIC__TOPIC_NAME:
			return TOPIC_NAME_EDEFAULT == null ? topic_name != null : !TOPIC_NAME_EDEFAULT.equals(topic_name);
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
		result.append(" (topic_name: ");
		result.append(topic_name);
		result.append(')');
		return result.toString();
	}

} //topicImpl

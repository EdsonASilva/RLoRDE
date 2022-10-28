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
import org.eclipse.emf.ecore.util.InternalEList;
import ppgi.ufam.edu.robot_model_ros.Robot_model_rosPackage;
import ppgi.ufam.edu.robot_model_ros.argument;
import ppgi.ufam.edu.robot_model_ros.include;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.includeImpl#getFile <em>File</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.includeImpl#getInclude_to_argument <em>Include to argument</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_model_ros.impl.includeImpl#getInclude_name <em>Include name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class includeImpl extends MinimalEObjectImpl.Container implements include {
	/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected String file = FILE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInclude_to_argument() <em>Include to argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude_to_argument()
	 * @generated
	 * @ordered
	 */
	protected EList<argument> include_to_argument;

	/**
	 * The default value of the '{@link #getInclude_name() <em>Include name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude_name()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInclude_name() <em>Include name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude_name()
	 * @generated
	 * @ordered
	 */
	protected String include_name = INCLUDE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected includeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Robot_model_rosPackage.Literals.INCLUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(String newFile) {
		String oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_model_rosPackage.INCLUDE__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<argument> getInclude_to_argument() {
		if (include_to_argument == null) {
			include_to_argument = new EObjectContainmentEList<argument>(argument.class, this,
					Robot_model_rosPackage.INCLUDE__INCLUDE_TO_ARGUMENT);
		}
		return include_to_argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInclude_name() {
		return include_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclude_name(String newInclude_name) {
		String oldInclude_name = include_name;
		include_name = newInclude_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_model_rosPackage.INCLUDE__INCLUDE_NAME,
					oldInclude_name, include_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Robot_model_rosPackage.INCLUDE__INCLUDE_TO_ARGUMENT:
			return ((InternalEList<?>) getInclude_to_argument()).basicRemove(otherEnd, msgs);
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
		case Robot_model_rosPackage.INCLUDE__FILE:
			return getFile();
		case Robot_model_rosPackage.INCLUDE__INCLUDE_TO_ARGUMENT:
			return getInclude_to_argument();
		case Robot_model_rosPackage.INCLUDE__INCLUDE_NAME:
			return getInclude_name();
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
		case Robot_model_rosPackage.INCLUDE__FILE:
			setFile((String) newValue);
			return;
		case Robot_model_rosPackage.INCLUDE__INCLUDE_TO_ARGUMENT:
			getInclude_to_argument().clear();
			getInclude_to_argument().addAll((Collection<? extends argument>) newValue);
			return;
		case Robot_model_rosPackage.INCLUDE__INCLUDE_NAME:
			setInclude_name((String) newValue);
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
		case Robot_model_rosPackage.INCLUDE__FILE:
			setFile(FILE_EDEFAULT);
			return;
		case Robot_model_rosPackage.INCLUDE__INCLUDE_TO_ARGUMENT:
			getInclude_to_argument().clear();
			return;
		case Robot_model_rosPackage.INCLUDE__INCLUDE_NAME:
			setInclude_name(INCLUDE_NAME_EDEFAULT);
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
		case Robot_model_rosPackage.INCLUDE__FILE:
			return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
		case Robot_model_rosPackage.INCLUDE__INCLUDE_TO_ARGUMENT:
			return include_to_argument != null && !include_to_argument.isEmpty();
		case Robot_model_rosPackage.INCLUDE__INCLUDE_NAME:
			return INCLUDE_NAME_EDEFAULT == null ? include_name != null : !INCLUDE_NAME_EDEFAULT.equals(include_name);
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
		result.append(" (file: ");
		result.append(file);
		result.append(", include_name: ");
		result.append(include_name);
		result.append(')');
		return result.toString();
	}

} //includeImpl

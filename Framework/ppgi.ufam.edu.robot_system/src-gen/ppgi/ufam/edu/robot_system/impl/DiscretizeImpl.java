/**
 */
package ppgi.ufam.edu.robot_system.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ppgi.ufam.edu.robot_system.Analyzer;
import ppgi.ufam.edu.robot_system.Discretize;
import ppgi.ufam.edu.robot_system.Robot_systemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discretize</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.DiscretizeImpl#getReduction_percent <em>Reduction percent</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.DiscretizeImpl#getAnalyzer <em>Analyzer</em>}</li>
 *   <li>{@link ppgi.ufam.edu.robot_system.impl.DiscretizeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscretizeImpl extends MinimalEObjectImpl.Container implements Discretize {
	/**
	 * The default value of the '{@link #getReduction_percent() <em>Reduction percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReduction_percent()
	 * @generated
	 * @ordered
	 */
	protected static final float REDUCTION_PERCENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReduction_percent() <em>Reduction percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReduction_percent()
	 * @generated
	 * @ordered
	 */
	protected float reduction_percent = REDUCTION_PERCENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnalyzer() <em>Analyzer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalyzer()
	 * @generated
	 * @ordered
	 */
	protected EList<Analyzer> analyzer;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscretizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Robot_systemPackage.Literals.DISCRETIZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getReduction_percent() {
		return reduction_percent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReduction_percent(float newReduction_percent) {
		float oldReduction_percent = reduction_percent;
		reduction_percent = newReduction_percent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_systemPackage.DISCRETIZE__REDUCTION_PERCENT,
					oldReduction_percent, reduction_percent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Analyzer> getAnalyzer() {
		if (analyzer == null) {
			analyzer = new EObjectResolvingEList<Analyzer>(Analyzer.class, this,
					Robot_systemPackage.DISCRETIZE__ANALYZER);
		}
		return analyzer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Robot_systemPackage.DISCRETIZE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Robot_systemPackage.DISCRETIZE__REDUCTION_PERCENT:
			return getReduction_percent();
		case Robot_systemPackage.DISCRETIZE__ANALYZER:
			return getAnalyzer();
		case Robot_systemPackage.DISCRETIZE__ID:
			return getId();
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
		case Robot_systemPackage.DISCRETIZE__REDUCTION_PERCENT:
			setReduction_percent((Float) newValue);
			return;
		case Robot_systemPackage.DISCRETIZE__ANALYZER:
			getAnalyzer().clear();
			getAnalyzer().addAll((Collection<? extends Analyzer>) newValue);
			return;
		case Robot_systemPackage.DISCRETIZE__ID:
			setId((String) newValue);
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
		case Robot_systemPackage.DISCRETIZE__REDUCTION_PERCENT:
			setReduction_percent(REDUCTION_PERCENT_EDEFAULT);
			return;
		case Robot_systemPackage.DISCRETIZE__ANALYZER:
			getAnalyzer().clear();
			return;
		case Robot_systemPackage.DISCRETIZE__ID:
			setId(ID_EDEFAULT);
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
		case Robot_systemPackage.DISCRETIZE__REDUCTION_PERCENT:
			return reduction_percent != REDUCTION_PERCENT_EDEFAULT;
		case Robot_systemPackage.DISCRETIZE__ANALYZER:
			return analyzer != null && !analyzer.isEmpty();
		case Robot_systemPackage.DISCRETIZE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (reduction_percent: ");
		result.append(reduction_percent);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //DiscretizeImpl

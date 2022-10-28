/**
 */
package ppgi.ufam.edu.robot_system;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type actuator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getType_actuator()
 * @model
 * @generated
 */
public enum Type_actuator implements Enumerator {
	/**
	 * The '<em><b>Generic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC_VALUE
	 * @generated
	 * @ordered
	 */
	GENERIC(0, "Generic", "Generic"),
	/**
	 * The '<em><b>Joint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #JOINT_VALUE
	 * @generated
	 * @ordered
	 */
	JOINT(1, "Joint", "Joint"),
	/**
	 * The '<em><b>Motor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #MOTOR_VALUE
	 * @generated
	 * @ordered
	 */
	MOTOR(2, "Motor", "Motor"),
	/**
	 * The '<em><b>Pan Tilt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #PAN_TILT_VALUE
	 * @generated
	 * @ordered
	 */
	PAN_TILT(3, "Pan_Tilt", "Pan_Tilt");

	/**
	 * The '<em><b>Generic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC
	 * @model name="Generic"
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_VALUE = 0;

	/**
	 * The '<em><b>Joint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOINT
	 * @model name="Joint"
	 * @generated
	 * @ordered
	 */
	public static final int JOINT_VALUE = 1;

	/**
	 * The '<em><b>Motor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTOR
	 * @model name="Motor"
	 * @generated
	 * @ordered
	 */
	public static final int MOTOR_VALUE = 2;

	/**
	 * The '<em><b>Pan Tilt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAN_TILT
	 * @model name="Pan_Tilt"
	 * @generated
	 * @ordered
	 */
	public static final int PAN_TILT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type actuator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Type_actuator[] VALUES_ARRAY = new Type_actuator[] { GENERIC, JOINT, MOTOR, PAN_TILT, };

	/**
	 * A public read-only list of all the '<em><b>Type actuator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Type_actuator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type actuator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Type_actuator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Type_actuator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type actuator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Type_actuator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Type_actuator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type actuator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Type_actuator get(int value) {
		switch (value) {
		case GENERIC_VALUE:
			return GENERIC;
		case JOINT_VALUE:
			return JOINT;
		case MOTOR_VALUE:
			return MOTOR;
		case PAN_TILT_VALUE:
			return PAN_TILT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Type_actuator(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Type_actuator

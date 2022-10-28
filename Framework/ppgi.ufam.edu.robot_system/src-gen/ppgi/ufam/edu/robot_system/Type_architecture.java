/**
 */
package ppgi.ufam.edu.robot_system;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type architecture</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getType_architecture()
 * @model
 * @generated
 */
public enum Type_architecture implements Enumerator {
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
	 * The '<em><b>Differencial Drive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #DIFFERENCIAL_DRIVE_VALUE
	 * @generated
	 * @ordered
	 */
	DIFFERENCIAL_DRIVE(1, "Differencial_Drive", "Differencial_Drive"),
	/**
	 * The '<em><b>Skid Steer Drive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SKID_STEER_DRIVE_VALUE
	 * @generated
	 * @ordered
	 */
	SKID_STEER_DRIVE(2, "Skid_Steer_Drive", "Skid_Steer_Drive"),
	/**
	 * The '<em><b>Omnidirectional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #OMNIDIRECTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	OMNIDIRECTIONAL(3, "Omnidirectional", "Omnidirectional"),

	/**
	 * The '<em><b>Ackerman Drive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACKERMAN_DRIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ACKERMAN_DRIVE(4, "Ackerman_Drive", "Ackerman_Drive"),
	/**
	 * The '<em><b>Quadrotor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #QUADROTOR_VALUE
	 * @generated
	 * @ordered
	 */
	QUADROTOR(5, "Quadrotor", "Quadrotor");

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
	 * The '<em><b>Differencial Drive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIFFERENCIAL_DRIVE
	 * @model name="Differencial_Drive"
	 * @generated
	 * @ordered
	 */
	public static final int DIFFERENCIAL_DRIVE_VALUE = 1;

	/**
	 * The '<em><b>Skid Steer Drive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SKID_STEER_DRIVE
	 * @model name="Skid_Steer_Drive"
	 * @generated
	 * @ordered
	 */
	public static final int SKID_STEER_DRIVE_VALUE = 2;

	/**
	 * The '<em><b>Omnidirectional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OMNIDIRECTIONAL
	 * @model name="Omnidirectional"
	 * @generated
	 * @ordered
	 */
	public static final int OMNIDIRECTIONAL_VALUE = 3;

	/**
	 * The '<em><b>Ackerman Drive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACKERMAN_DRIVE
	 * @model name="Ackerman_Drive"
	 * @generated
	 * @ordered
	 */
	public static final int ACKERMAN_DRIVE_VALUE = 4;

	/**
	 * The '<em><b>Quadrotor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUADROTOR
	 * @model name="Quadrotor"
	 * @generated
	 * @ordered
	 */
	public static final int QUADROTOR_VALUE = 5;

	/**
	 * An array of all the '<em><b>Type architecture</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Type_architecture[] VALUES_ARRAY = new Type_architecture[] { GENERIC, DIFFERENCIAL_DRIVE,
			SKID_STEER_DRIVE, OMNIDIRECTIONAL, ACKERMAN_DRIVE, QUADROTOR, };

	/**
	 * A public read-only list of all the '<em><b>Type architecture</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Type_architecture> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type architecture</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Type_architecture get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Type_architecture result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type architecture</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Type_architecture getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Type_architecture result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type architecture</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Type_architecture get(int value) {
		switch (value) {
		case GENERIC_VALUE:
			return GENERIC;
		case DIFFERENCIAL_DRIVE_VALUE:
			return DIFFERENCIAL_DRIVE;
		case SKID_STEER_DRIVE_VALUE:
			return SKID_STEER_DRIVE;
		case OMNIDIRECTIONAL_VALUE:
			return OMNIDIRECTIONAL;
		case ACKERMAN_DRIVE_VALUE:
			return ACKERMAN_DRIVE;
		case QUADROTOR_VALUE:
			return QUADROTOR;
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
	private Type_architecture(int value, String name, String literal) {
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

} //Type_architecture

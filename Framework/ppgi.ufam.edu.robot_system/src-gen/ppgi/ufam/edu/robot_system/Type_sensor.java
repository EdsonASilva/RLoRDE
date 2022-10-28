/**
 */
package ppgi.ufam.edu.robot_system;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type sensor</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getType_sensor()
 * @model
 * @generated
 */
public enum Type_sensor implements Enumerator {
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
	 * The '<em><b>Camera</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #CAMERA_VALUE
	 * @generated
	 * @ordered
	 */
	CAMERA(1, "Camera", "Camera"),

	/**
	 * The '<em><b>Sonar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SONAR_VALUE
	 * @generated
	 * @ordered
	 */
	SONAR(2, "Sonar", "Sonar"),
	/**
	 * The '<em><b>Laser</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #LASER_VALUE
	 * @generated
	 * @ordered
	 */
	LASER(3, "Laser", "Laser");

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
	 * The '<em><b>Camera</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAMERA
	 * @model name="Camera"
	 * @generated
	 * @ordered
	 */
	public static final int CAMERA_VALUE = 1;

	/**
	 * The '<em><b>Sonar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SONAR
	 * @model name="Sonar"
	 * @generated
	 * @ordered
	 */
	public static final int SONAR_VALUE = 2;

	/**
	 * The '<em><b>Laser</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LASER
	 * @model name="Laser"
	 * @generated
	 * @ordered
	 */
	public static final int LASER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type sensor</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Type_sensor[] VALUES_ARRAY = new Type_sensor[] { GENERIC, CAMERA, SONAR, LASER, };

	/**
	 * A public read-only list of all the '<em><b>Type sensor</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Type_sensor> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type sensor</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Type_sensor get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Type_sensor result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type sensor</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Type_sensor getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Type_sensor result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type sensor</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Type_sensor get(int value) {
		switch (value) {
		case GENERIC_VALUE:
			return GENERIC;
		case CAMERA_VALUE:
			return CAMERA;
		case SONAR_VALUE:
			return SONAR;
		case LASER_VALUE:
			return LASER;
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
	private Type_sensor(int value, String name, String literal) {
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

} //Type_sensor

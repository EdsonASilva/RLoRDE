/**
 */
package ppgi.ufam.edu.robot_system;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type controller</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ppgi.ufam.edu.robot_system.Robot_systemPackage#getType_controller()
 * @model
 * @generated
 */
public enum Type_controller implements Enumerator {
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
	 * The '<em><b>Teleoperated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #TELEOPERATED_VALUE
	 * @generated
	 * @ordered
	 */
	TELEOPERATED(1, "Teleoperated", "Teleoperated"),
	/**
	 * The '<em><b>DQN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #DQN_VALUE
	 * @generated
	 * @ordered
	 */
	DQN(2, "DQN", "DQN"),
	/**
	 * The '<em><b>A2C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #A2C_VALUE
	 * @generated
	 * @ordered
	 */
	A2C(3, "A2C", "A2C"),
	/**
	 * The '<em><b>DDPG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #DDPG_VALUE
	 * @generated
	 * @ordered
	 */
	DDPG(4, "DDPG", "DDPG");

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
	 * The '<em><b>Teleoperated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TELEOPERATED
	 * @model name="Teleoperated"
	 * @generated
	 * @ordered
	 */
	public static final int TELEOPERATED_VALUE = 1;

	/**
	 * The '<em><b>DQN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DQN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DQN_VALUE = 2;

	/**
	 * The '<em><b>A2C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A2C
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int A2C_VALUE = 3;

	/**
	 * The '<em><b>DDPG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DDPG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DDPG_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type controller</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Type_controller[] VALUES_ARRAY = new Type_controller[] { GENERIC, TELEOPERATED, DQN, A2C,
			DDPG, };

	/**
	 * A public read-only list of all the '<em><b>Type controller</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Type_controller> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type controller</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Type_controller get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Type_controller result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type controller</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Type_controller getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Type_controller result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type controller</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Type_controller get(int value) {
		switch (value) {
		case GENERIC_VALUE:
			return GENERIC;
		case TELEOPERATED_VALUE:
			return TELEOPERATED;
		case DQN_VALUE:
			return DQN;
		case A2C_VALUE:
			return A2C;
		case DDPG_VALUE:
			return DDPG;
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
	private Type_controller(int value, String name, String literal) {
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

} //Type_controller

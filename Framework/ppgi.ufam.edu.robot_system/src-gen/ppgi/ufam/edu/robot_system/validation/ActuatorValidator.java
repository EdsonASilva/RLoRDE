/**
 *
 * $Id$
 */
package ppgi.ufam.edu.robot_system.validation;

import ppgi.ufam.edu.robot_system.Type_actuator;

/**
 * A sample validator interface for {@link ppgi.ufam.edu.robot_system.Actuator}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ActuatorValidator {
	boolean validate();

	boolean validateId(String value);

	boolean validateType(Type_actuator value);

	boolean validateFault_tolerant(boolean value);
}

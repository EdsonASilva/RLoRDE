/**
 *
 * $Id$
 */
package ppgi.ufam.edu.robot_system.validation;

import org.eclipse.emf.common.util.EList;

import ppgi.ufam.edu.robot_system.Actuator;
import ppgi.ufam.edu.robot_system.Controller;
import ppgi.ufam.edu.robot_system.Sensor;
import ppgi.ufam.edu.robot_system.Type_architecture;

/**
 * A sample validator interface for {@link ppgi.ufam.edu.robot_system.Robot_System}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface Robot_SystemValidator {
	boolean validate();

	boolean validateName(String value);

	boolean validateDescription(String value);

	boolean validateActuator(EList<Actuator> value);

	boolean validateSensor(EList<Sensor> value);

	boolean validateController(EList<Controller> value);

	boolean validateSimulator(boolean value);

	boolean validateType_archicture(Type_architecture value);
}

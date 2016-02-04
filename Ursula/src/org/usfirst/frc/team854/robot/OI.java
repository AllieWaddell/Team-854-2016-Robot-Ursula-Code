package org.usfirst.frc.team854.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team854.robot.commands.IntakeCommand;

//Commands to import

im

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	//Set-up code for joystick and buttons
	private Joystick joystick = new Joystick(0);
	private Button highShootButton = new JoystickButton(joystick, 1),
			lowShootButton = new JoystickButton(joystick,2),
			armUpButton = new JoystickButton(joystick,2),
			armDownButton = new JoystickButton(joystick,3),
			intakeOnButton = new JoystickButton(joystick,4);
	
	//Attach buttons to their respective commands
	intakeOnButton.whenReleased(new IntakeCommand());
	
	public double getSpeed() {
		double rawSpeed = - joystick.getRawAxis(1);
		double squareSpeed = rawSpeed * Math.abs(rawSpeed);
		if (Math.abs(squareSpeed) < 0.03) { return 0; }
		return squareSpeed;
	}
	
	public double getTurn() {
		double rawTurn = joystick.getRawAxis(4);
		double squareTurn = rawTurn * Math.abs(rawTurn);
		if (Math.abs(squareTurn) < 0.03) { return 0.0; }
		return squareTurn;
	}
}


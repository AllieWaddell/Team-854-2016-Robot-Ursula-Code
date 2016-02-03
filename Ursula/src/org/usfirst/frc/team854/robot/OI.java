package org.usfirst.frc.team854.robot;

import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team854.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private Joystick joystick = new Joystick(0);
	
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


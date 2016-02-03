package org.usfirst.frc.team854.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team854.robot.Robot;

public class JoystickCommand extends Command{
	
	public JoystickCommand() {
		requires(Robot.driveSubsystem);
	}
	
	protected void initialize() {
		
	}
	
	protected void execute() {
		double speed = Robot.oi.getSpeed();
    	double turn = Robot.oi.getTurn();
    	
    	double leftSpeed = speed;
    	double rightSpeed = speed;
    	
    	// To the right (forwards and backwards)
    	if (turn > 0) {
    		rightSpeed = speed * (1.0 - turn);
    		leftSpeed  = speed;
    	}
    	
    	// To the left (forwards and backwards)
    	if (turn < 0) {
    		leftSpeed  = speed * (1.0 + turn);
    		rightSpeed = speed;
    	}
    	
    	if (speed == 0.0) {
    		rightSpeed = - turn;
    		leftSpeed  =   turn;
    	}
    	
    	SmartDashboard.putNumber("Left Motor", leftSpeed);
    	SmartDashboard.putNumber("Right Motor", rightSpeed);
    	Robot.driveSubsystem.setMotorSpeed(leftSpeed, rightSpeed);
	}
	
	protected boolean isFinished() {
		return false;
	}
	
	protected void end() {
		
	}
	
	protected void interrupted() {
		end();
	}
}

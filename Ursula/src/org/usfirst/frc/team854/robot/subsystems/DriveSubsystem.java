package org.usfirst.frc.team854.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team854.robot.commands.JoystickCommand;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSubsystem extends Subsystem{
	
	private Talon rightMotor = new Talon(1);
    private Talon leftMotor  = new Talon(0);
    
    public void setMotorSpeed(double leftSpeed,double rightSpeed){
    	leftMotor.set(leftSpeed);
    	rightMotor.set(rightSpeed);
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new JoystickCommand());
        
      }
      
      public void updateSmartDashboard() {
      }
    
}

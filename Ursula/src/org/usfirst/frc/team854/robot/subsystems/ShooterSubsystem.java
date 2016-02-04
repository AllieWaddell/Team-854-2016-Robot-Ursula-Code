
package org.usfirst.frc.team854.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;

/**
 *
 */
public class ShooterSubsystem extends Subsystem {
    
	private Victor leftShooterMotor = new Victor(2);
	private Victor rightShooterMotor = new Victor(3);
	private Victor intakeMotor = new Victor(4);
	
	private DigitalInput ballOpticalSensor = new DigitalInput(0);
	
    public void initDefaultCommand() {
        setDefaultCommand(new shooterSetupCommand());
    }
    
    public void intakeOn() {
    	if(!ballOpticalSensor.get()) {
    		intakeMotor.set(1.0);
    	}
    	if(ballOpticalSensor.get()) {
    		intakeOff();
    	}
    }
    
    public void intakeOff() {
    	intakeMotor.set(0);
    }
    
    public void intakeReverse() {
    	intakeMotor.set(-1.0);
    }
    
    public void shootHigh() {
    	intakeMotor.set(1.0);
    }
    
    public void shooterWheelsOn() {
    	//NOTE: Add smartdashboard part to modify these while testing!!!
    	leftShooterMotor.set(1.0);
    	rightShooterMotor.set(1.0);
    }
    
    public void shooterWheelsOff() {
    	leftShooterMotor.set(0);
    	rightShooterMotor.set(0);
    }
}


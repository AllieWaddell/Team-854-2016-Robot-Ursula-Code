package constants;

public class ShooterConstants {
	//Edit these variables to change constants
	//Constants not visible to other classes, only accessible through methods below
	private double intakeMotorSpeed = 1.0;
	private double intakeMotorStopSpeed = 0;
	private double intakeMotorFeedSpeed = 1.0;
	
	private double lowGoalShotMotorSpeed = -1.0;
	
	private double leftShooterMotorSpeed = 1.0;
	private double rightShooterMotorSpeed = 1.0;
	private double leftShooterMotorStopSpeed = 0;
	private double rightShooterMotorStopSpeed = 0;
	
	private double lowGoalShotRotationTime = 0.5;
	
	//Returns the intakeMotorSpeed
	public double intakeSpeed() {
		return intakeMotorSpeed;
	}
	
	public double intakeStopSpeed() {
		return intakeMotorStopSpeed;
	}
	
	public double leftShooterSpeed() {
		return leftShooterMotorSpeed;
	}
	
	public double rightShooterSpeed() {
		return rightShooterMotorSpeed;
	}
	
	public double leftShooterStopSpeed() {
		return leftShooterMotorStopSpeed;
	}
	
	public double rightShooterStopSpeed() {
		return rightShooterMotorStopSpeed;
	}
	
	public double lowGoalShotSpeed() {
		return lowGoalShotMotorSpeed;
	}
	
	public double intakeFeedSpeed() {
		return intakeMotorFeedSpeed;
	}
	
	public double lowGoalShotTime() {
		return lowGoalShotRotationTime;
	}
}

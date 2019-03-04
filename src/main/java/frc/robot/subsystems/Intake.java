package frc.robot.subsystems;

//import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
//import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import frc.robot.RobotMap;
//import frc.robot.commands.ArmUp;

public class Intake extends Subsystem {

    public Spark intake_motors = RobotMap.m_intake;

    public void initDefaultCommand() {
        
    }
//Speed when picking up/sucking in ball
    public void pickup() {
        intake_motors.set(-.7);
    }
//Speed when shooting
    public void shoot() {
        intake_motors.set(.7);
    }
//Stops intake
    public void stop() {
        intake_motors.set(0);
    }

}
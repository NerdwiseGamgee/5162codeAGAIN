package frc.robot.subsystems;

//import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
//import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import frc.robot.RobotMap;
//import frc.robot.commands.ArmUp;

public class Arm extends Subsystem {

    public Spark motors = RobotMap.m_arm;
    //public Spark top_motor = RobotMap.m_arm_top;

    public void initDefaultCommand() {
        
    }
//Speed when Lowering Arm
    public void forward() {
        motors.set(.4);
        //top_motor.set(.4);
    }
//Speed when Raising Arm
    public void reverse() {
        motors.set(-.5);
        //top_motor.set(-.5);
    }
//Holds Arm at Current Position
    public void stop() {
        motors.set(-.05);
        //top_motor.set(-.05);
    }

}
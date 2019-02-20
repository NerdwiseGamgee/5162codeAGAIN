package frc.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import frc.robot.RobotMap;
import frc.robot.commands.ArmUp;

public class Basket extends Subsystem {

    public Solenoid drive = RobotMap.driveSolenoid;
    public Solenoid shoot = RobotMap.shootSolenoid;
    public DoubleSolenoid dblSol = RobotMap.doubleSolenoid;
    public Compressor c = RobotMap.compressor;

    public void initDefaultCommand() {
        
    }
    //boot up the dang compressor
    public void start() {
        c.setClosedLoopControl(true);
    }
//Speed when Lowering Basket
    public void forward() {
        dblSol.set(DoubleSolenoid.Value.kForward);
    }
//Speed when Raising Basket
    public void reverse() {
        dblSol.set(DoubleSolenoid.Value.kReverse);
    }
//Holds Basket at Current Position
    public void stop() {
        dblSol.set(DoubleSolenoid.Value.kOff);
    }

}
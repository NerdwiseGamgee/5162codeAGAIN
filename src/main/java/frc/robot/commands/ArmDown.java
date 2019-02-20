package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
/**
 *
 */
public class ArmDown extends Command {

    public ArmDown() {
        requires(Robot.arm);
       // setTimeout(0.9);
    }

    protected void initialize() {
    	Robot.arm.forward();
    }

    protected void execute() {
        Robot.arm.forward();
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    	Robot.arm.stop();
    }

    protected void interrupted() {
    	end();
    }
}

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
/**
 *
 */
public class ArmUp extends Command {

    public ArmUp() {
        requires(Robot.arm);
       // setTimeout(0.9);
    }

    protected void initialize() {
    	Robot.arm.stop();
    }

    protected void execute() {
        Robot.arm.reverse();
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

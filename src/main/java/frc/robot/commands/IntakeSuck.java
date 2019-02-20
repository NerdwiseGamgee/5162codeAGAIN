package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
/**
 *
 */
public class IntakeSuck extends Command {

    public IntakeSuck() {
        requires(Robot.arm);
       // setTimeout(0.9);
    }

    protected void initialize() {
    	Robot.intake.stop();
    }

    protected void execute() {
        Robot.intake.pickup();
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    	Robot.intake.stop();
    }

    protected void interrupted() {
    	end();
    }
}

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
/**
 *
 */
public class IntakeShoot extends Command {

    public IntakeShoot() {
        requires(Robot.intake);
       // setTimeout(0.9);
    }

    protected void initialize() {
        //Robot.intake.stop();
        Robot.intake.shoot();
    }

    protected void execute() {
        Robot.intake.shoot();
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

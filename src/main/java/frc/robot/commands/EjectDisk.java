package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
/**
 *
 */
public class EjectDisk extends Command {

    public EjectDisk() {
        requires(Robot.basket);
       // setTimeout(0.9);
    }

    protected void initialize() {
        Robot.basket.reverse();
        Robot.basket.eject();
    }

    protected void execute() {
        Robot.basket.eject();
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    	Robot.basket.resetEject();
    }

    protected void interrupted() {
    	end();
    }
}

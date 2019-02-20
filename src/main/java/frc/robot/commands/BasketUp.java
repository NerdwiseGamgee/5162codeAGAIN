package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
/**
 *
 */
public class BasketUp extends Command {

    public BasketUp() {
        requires(Robot.basket);
       // setTimeout(0.9);
    }

    protected void initialize() {
        Robot.basket.reverse();
        Robot.basket.start();
    }

    protected void execute() {
        Robot.basket.reverse();
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    	Robot.basket.stop();
    }

    protected void interrupted() {
    	end();
    }
}

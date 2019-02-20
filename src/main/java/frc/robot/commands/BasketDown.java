package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
/**
 *
 */
public class BasketDown extends Command {

    public BasketDown() {
        requires(Robot.basket);
       // setTimeout(0.9);
    }

    protected void initialize() {
        Robot.basket.forward();
        Robot.basket.start();
    }

    protected void execute() {
        Robot.basket.forward();
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

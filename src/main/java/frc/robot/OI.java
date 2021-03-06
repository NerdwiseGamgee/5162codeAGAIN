/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);'a''a'
  // Button button = new JoystickButton(stick, buttonNumber);
  public Joystick left_stick = new Joystick(0);
  public Joystick right_stick = new Joystick(1);
  public Button armUpButton = new JoystickButton(right_stick, 5);
  public Button armDownButton = new JoystickButton(right_stick, 3);
  public Button ejectButton = new JoystickButton(right_stick, 2);
  public Button basketUpButton = new JoystickButton(left_stick, 3); 
  public Button basketDownButton = new JoystickButton(left_stick, 2);
  public Button intakeInButton = new JoystickButton(left_stick, 1);
  public Button intakeOutButton = new JoystickButton(right_stick, 1);





  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.
  public OI(){
    armUpButton.whileHeld(new ArmUp());
    armDownButton.whileHeld(new ArmDown());
    basketUpButton.whileHeld(new BasketUp());
    basketDownButton.whileHeld(new BasketDown());
    intakeInButton.whileHeld(new IntakeSuck());
    intakeOutButton.whileHeld(new IntakeShoot());
    //ejectButton.whileHeld(new EjectDisk());
    //c.setClosedLoopControl(true);
    //c.setClosedLoopControl(false);
    //exampleSolenoid.set(true);
    //exampleSolenoid.set(false);
  }
  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());

}
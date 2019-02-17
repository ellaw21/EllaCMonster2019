/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
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
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

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



  // JoystickButton ShooterButton;

  // JoystickButton HatchButton;

  // JoystickButton openHatchButton;
  // JoystickButton closeHatchButton;

  public Joystick rightJoystick;
  public Joystick leftJoystick;
  public Joystick logitech;

  public JoystickButton launchCatapultButton;
  public JoystickButton retractCatapultButton;

  public JoystickButton IntakeButton;
  public JoystickButton flapOpenButton;
  public JoystickButton flapReverseButton;

  public JoystickButton pushHatchButton;
  public JoystickButton retractHatchButton;


  public OI() {
    // ShooterButton = new JoystickButton(logitech, 1);

    // HatchButton = new JoystickButton(logitech, 3);

    // openHatchButton = new JoystickButton(logitech, 9);
    // closeHatchButton = new JoystickButton(logitech, 10);

  rightJoystick = new Joystick(0);
  leftJoystick = new Joystick(1);
  logitech = new Joystick(2);

    launchCatapultButton = new JoystickButton(logitech, 5);
    retractCatapultButton = new JoystickButton(logitech, 7);

    // flapOpenButton = new JoystickButton(logitech, 4);
    // flapReverseButton = new JoystickButton(logitech, 2);

    pushHatchButton = new JoystickButton(logitech, 6);
    retractHatchButton = new JoystickButton(logitech, 8);

    IntakeButton = new JoystickButton(logitech, 2);


// MOST IMPORTANT PART: Link the button to the command
// ShooterButton.whileHeld(new StartCommand());

// ShooterButton.whenReleased(new StopCommand());

// HatchButton.whileHeld(new StartHatchCommand());

// HatchButton.whenReleased(new StopHatchCommand());

IntakeButton.whileHeld(new StartIntakeCommand());

IntakeButton.whenReleased(new StopIntakeCommand());

launchCatapultButton.whenPressed(new LaunchCatapult());

retractCatapultButton.whenPressed(new RetractCatapult());

pushHatchButton.whenPressed(new ShootHatch());

retractHatchButton.whenPressed(new RetractHatch());



    
  }

public Joystick getRightJoystick(){
  return rightJoystick;
}
public Joystick getLeftJoystick(){
  return leftJoystick;
}
public Joystick getLogitech(){
  return logitech;
}



}

/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.*;
import frc.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

/**
 * Add your docs here.
 */
public class DriveBase extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from CommaPnds.
  WPI_TalonSRX rightTalon = RobotMap.rightFront;
  WPI_TalonSRX leftTalon = RobotMap.leftFront;
  WPI_VictorSPX rightVictor = RobotMap.rightBack;
  WPI_VictorSPX leftVictor = RobotMap.leftBack;

  double rightMotorSpeed = 0;
  double leftMotorSpeed = 0;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new DriveWithJoystick());
  }
  public void DriveAutonomous(){

  }
  public void JoystickInputs(Joystick rightJoystick, Joystick leftJoystick, Joystick logiTech){

    rightMotorSpeed = rightJoystick.getY() * -1;
    leftMotorSpeed = leftJoystick.getY();

    rightTalon.set(rightMotorSpeed);
    leftTalon.set(leftMotorSpeed);

    rightVictor.follow(rightTalon);
    leftVictor.follow(leftTalon);


//Assign values for joysticks to motor controllers
  } 
}


/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;

/**
 * Add your docs here.
 */
public class HatchBase extends Subsystem {

  private final Compressor compressor = RobotMap.theCompressor;
  // private final DoubleSolenoid shootSolenoid = RobotMap.shootHatchSolenoid;
  private final Solenoid pushSolenoid = RobotMap.pushHatchSolenoid;


  // public void OpenHatch() {

  //   shootSolenoid.set(DoubleSolenoid.Value.kForward);
  // }

  // public void CloseHatch() {

  //   shootSolenoid.set(DoubleSolenoid.Value.kReverse);
  // }

  public void PushHatch() {

    pushSolenoid.set(true);
  }

  public void RetractHatch() {

    pushSolenoid.set(false);
  }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}

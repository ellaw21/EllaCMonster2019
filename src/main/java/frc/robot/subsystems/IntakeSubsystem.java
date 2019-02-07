/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class IntakeSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private final Compressor compressor = RobotMap.theCompressor;
  private final DoubleSolenoid flapSolenoid = RobotMap.flapOpenSolenoid;

  public void FlapOpen() {

    flapSolenoid.set(DoubleSolenoid.Value.kForward);
  }

  public void FlapReverse() {

    flapSolenoid.set(DoubleSolenoid.Value.kReverse);
  }

  //Spark intakeSpark = RobotMap.IntakeSpark;

  public void StartIntake() {

    //intakeSpark.set(1);
  }

  public void StopIntake() {

    //intakeSpark.set(0);
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}

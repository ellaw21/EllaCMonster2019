/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Spark;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

public static Compressor theCompressor = new Compressor(0);
// public static DoubleSolenoid shootHatchSolenoid = new DoubleSolenoid(0,1);
public static Solenoid launchCatapultSolenoid = new Solenoid(0);
// public static DoubleSolenoid flapOpenSolenoid = new DoubleSolenoid(1,2);
public static DoubleSolenoid pushHatchSolenoid = new DoubleSolenoid(1,2);




  public static WPI_TalonSRX leftFront = new WPI_TalonSRX(2); //should be 2 for 2019
  public static WPI_TalonSRX rightFront = new WPI_TalonSRX(3); //should be 3 for 2019
  public static WPI_VictorSPX leftBack = new WPI_VictorSPX(4);
  public static WPI_VictorSPX rightBack = new WPI_VictorSPX(5);

  //public static Spark IntakeSpark = new Spark(0);
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

public static SpeedController shooterSpark = new Spark(2);
public static SpeedController hatchSpark = new Spark(1);
public static Spark intakeSpark = new Spark(0);

boolean enabled = theCompressor.enabled();
boolean pressureSwitch = theCompressor.getPressureSwitchValue();
double current = theCompressor.getCompressorCurrent();
}

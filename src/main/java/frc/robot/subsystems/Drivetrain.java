// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
  //Define motor objects
  private CANSparkMax frontStarboardDriveMotor, frontPortDriveMotor, backStarboardDriveMotor, backPortDriveMotor;

  /** Creates a new Drivetrain. */
  public Drivetrain() {
    //Asigning can port to motor objects
    frontStarboardDriveMotor = new CANSparkMax( Constants.CANIds.frontStarboardDriveMotor, MotorType.kBrushless);
    frontPortDriveMotor = new CANSparkMax( Constants.CANIds.frontPortDriveMotor, MotorType.kBrushless);
    backStarboardDriveMotor = new CANSparkMax( Constants.CANIds.backStarboardDriveMotor, MotorType.kBrushless);
    backPortDriveMotor = new CANSparkMax( Constants.CANIds.backPortDriveMotor, MotorType.kBrushless);

    //Restore factory defaults
    frontStarboardDriveMotor.restoreFactoryDefaults();
    frontPortDriveMotor.restoreFactoryDefaults();
    backStarboardDriveMotor.restoreFactoryDefaults();
    backPortDriveMotor.restoreFactoryDefaults();

    //Invert port side motors
    frontPortDriveMotor.setInverted(true);
    backPortDriveMotor.setInverted(true);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

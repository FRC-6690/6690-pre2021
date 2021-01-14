// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class OperatorControl extends CommandBase {
  private final Drivetrain drivetrain;
  private final DoubleSupplier port_thro, starboard_thro;
  /**
   * Construct a new operator control comand
   * @author Dylan
   * @param _drivetrain 
   * @param _port_thro
   * @param _starboard_thro
   */
  public OperatorControl(Drivetrain _drivetrain, DoubleSupplier _port_thro, DoubleSupplier _starboard_thro ) {
    addRequirements(_drivetrain);
    drivetrain = _drivetrain;
    port_thro = _port_thro;
    starboard_thro = _starboard_thro;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    drivetrain.tankDrive( port_thro.getAsDouble(), starboard_thro.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

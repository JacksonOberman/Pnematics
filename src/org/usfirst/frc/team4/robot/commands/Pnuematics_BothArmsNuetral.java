package org.usfirst.frc.team4.robot.commands;

import org.usfirst.frc.team4.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Pnuematics_BothArmsNuetral extends Command {

    public Pnuematics_BothArmsNuetral() {}

    protected void initialize() {
    	Robot.pnuematics.bothArmsNuetral();
    }

    protected void execute() {}

    protected boolean isFinished() {
        return true;
    }

    protected void end() {}

    protected void interrupted() {
    	end();
    }
}

package org.usfirst.frc.team4.robot.commands;

import org.usfirst.frc.team4.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Pnuematics_RightArmOpen extends Command {

    public Pnuematics_RightArmOpen() {}

    protected void initialize() {
    	Robot.pnuematics.rightArmOpen();
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

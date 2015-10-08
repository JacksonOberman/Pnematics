package org.usfirst.frc.team4.robot.commands;

import org.usfirst.frc.team4.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Pnuematics_RightArmClose extends Command {

    public Pnuematics_RightArmClose(){}

    protected void initialize() {
    	Robot.pnuematics.rightArmClose();
    }

    protected void execute(){}

    protected boolean isFinished() {
        return true;
    }

    protected void end() {}

    protected void interrupted() {
    	end();
    }
}

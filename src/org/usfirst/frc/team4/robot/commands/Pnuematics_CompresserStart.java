package org.usfirst.frc.team4.robot.commands;

import org.usfirst.frc.team4.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Pnuematics_CompresserStart extends Command {

    public Pnuematics_CompresserStart() {}

    protected void initialize() {
    	Robot.pnuematics.compressorStart();
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

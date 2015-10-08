package org.usfirst.frc.team4.robot.commands;

import org.usfirst.frc.team4.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Pnuematics_CompresserStop extends Command {

    public Pnuematics_CompresserStop() {}

    protected void initialize() {
    	Robot.pnuematics.compressorStop();
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

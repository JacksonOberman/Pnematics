package org.usfirst.frc.team4.robot.commands;

import org.usfirst.frc.team4.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Pnuematics_LeftArmClose extends Command {

    public Pnuematics_LeftArmClose(){}
    
    protected void initialize() {
    	Robot.pnuematics.leftArmClose();
    }

    protected void execute() {}

    protected boolean isFinished() {
        return true;
    }
    protected void end(){}

    protected void interrupted() {
    	end();
    }
}

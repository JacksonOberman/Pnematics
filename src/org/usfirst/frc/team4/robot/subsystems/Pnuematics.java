package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pnuematics extends Subsystem {
    
   private Compressor compressor = new Compressor ();
   private DoubleSolenoid LeftArm = new DoubleSolenoid(RobotMap.PNEUMATICS_ARM_LEFT_FWD, RobotMap.PNEUMATICS_ARM_LEFT_BWD);
   private DoubleSolenoid RightArm = new DoubleSolenoid(RobotMap.PNEUMATICS_ARM_RIGHT_FWD, RobotMap.PNEUMATICS_ARM_RIGHT_BWD);

   public void compressorStart(){
	   compressor.start();
   }
   
   public void compressorStop() {
	   compressor.stop();
   }
   
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void leftArmOpen(){
    	LeftArm.set(DoubleSolenoid.Value.kForward);
    }
    public void rightArmOpen(){
    	RightArm.set(DoubleSolenoid.Value.kForward);
    }
    public void leftArmClose(){
    	LeftArm.set(DoubleSolenoid.Value.kReverse);
    }
    public void rightArmClose(){
    	RightArm.set(DoubleSolenoid.Value.kReverse);
    }
    public void leftArmOff(){
    	LeftArm.set(DoubleSolenoid.Value.kOff);
    }
    public void rightArmOff(){
    	RightArm.set(DoubleSolenoid.Value.kOff);
    }
    public void bothArmsNuetral(){
    	LeftArm.set(DoubleSolenoid.Value.kOff);
    	RightArm.set(DoubleSolenoid.Value.kOff);
    }
}


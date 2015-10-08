package org.usfirst.frc.team4.robot;

import org.usfirst.frc.team4.robot.commands.Pnuematics_BothArmsNuetral;
import org.usfirst.frc.team4.robot.commands.Pnuematics_CompresserStart;
import org.usfirst.frc.team4.robot.commands.Pnuematics_CompresserStop;
import org.usfirst.frc.team4.robot.commands.Pnuematics_LeftArmClose;
import org.usfirst.frc.team4.robot.commands.Pnuematics_LeftArmOff;
import org.usfirst.frc.team4.robot.commands.Pnuematics_LeftArmOpen;
import org.usfirst.frc.team4.robot.commands.Pnuematics_RightArmClose;
import org.usfirst.frc.team4.robot.commands.Pnuematics_RightArmOff;
import org.usfirst.frc.team4.robot.commands.Pnuematics_RightArmOpen;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static Joystick one = new Joystick(RobotMap.JOYSTICKS);
	public static final int
	A_Button = 1,
	B_Button = 2,
	X_Button = 3,
	Y_Button = 4,
	L_Bumper = 5,
	R_Bumper = 6,
	Back_Button = 7,
	Start_Button = 8,
	L_Stick = 9,
	R_Stick = 10;
	
	public static JoystickButton
	driverController_A_Button = new JoystickButton(one, A_Button),
	driverController_B_Button = new JoystickButton(one, B_Button),
	driverController_X_Button = new JoystickButton(one, X_Button),
	driverController_Y_Button = new JoystickButton(one, Y_Button),
	driverController_L_Bumper = new JoystickButton(one, L_Bumper),
	driverController_R_Bumper = new JoystickButton(one, R_Bumper),
	driverController_Back_Button = new JoystickButton(one, Back_Button),
	driverController_Start_Button = new JoystickButton(one, Start_Button),
	driverController_L_Stick = new JoystickButton(one, L_Stick),
	driverController_R_Stick = new JoystickButton(one, R_Stick);
	
	public OI(){
		driverController_A_Button.whenPressed(new Pnuematics_BothArmsNuetral());
		driverController_B_Button.whenPressed(new Pnuematics_CompresserStop());
		driverController_X_Button.whenPressed(new Pnuematics_CompresserStart());
		driverController_Y_Button.whenPressed(new Pnuematics_LeftArmClose());
		driverController_L_Bumper.whenPressed(new Pnuematics_LeftArmOpen());
		driverController_R_Bumper.whenPressed(new Pnuematics_LeftArmOff());
		driverController_Back_Button.whenPressed(new Pnuematics_RightArmClose());
		driverController_Start_Button.whenPressed(new Pnuematics_RightArmOff());
		driverController_L_Stick.whenPressed(new Pnuematics_RightArmOpen());
	}
	
}


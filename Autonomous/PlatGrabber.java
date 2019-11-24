package org.firstinspires.ftc.teamcode.skystone;

import org.firstinspires.ftc.teamcode.common.RobotConfig;
import com.qualcomm.robotcore.util.Hardware;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Blinker;
import com.qualcomm.robotcore.hardware.Gyroscope;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;


@Autonomous(name="Mecanum Drive", group="Linear Opmode")

public class AutoPlatform extends LinearOpMode {    
  
    RobotConfig robotConfig = new RobotConfig(this);
    
    @Override
    public void runOpMode() throws InterruptedException {
    
        robotConfig.init();

        telemetry.addData("Status: ", "Hardware Configured");
        telemetry.update();

        robotConfig.frontleftDrive.setDirection(DcMotor.Direction.FORWARD);
      	robotConfig.frontrightDrive.setDirection(DcMotor.Direction.FORWARD);
      	robotConfig.backleftDrive.setDirection(DcMotor.Direction.FORWARD);
      	robotConfig.backrightDrive.setDirection(DcMotor.Direction.FORWARD);
        waitForStart();

        while (opModeIsActive()) {
          
        		// For Going Forward and Backward
            robotConfig.frontleftDrive.setPower(0.5);
            robotConfig.frontrightDrive.setPower(0.5);
            robotConfig.backleftDrive.setPower(0.5);
            robotConfig.backrightDrive.setPower(0.5);
          	
          	sleep(1000);
          	
          	robotConfig.platGrabber.setDirection(0.5);
          
          	robotConfig.frontleftDrive.setPower(-0.5);
            robotConfig.frontrightDrive.setPower(-0.5);
            robotConfig.backleftDrive.setPower(-0.5);
            robotConfig.backrightDrive.setPower(-0.5);
          	
          	sleep(1000);

            robotConfig.frontleftDrive.setPower(-0.5);
            robotConfig.frontrightDrive.setPower(0.5);
	  				robotConfig.backrightDrive.setPower(-0.5);
     	  	  robotConfig.backleftDrive.setPower(0.5);
          
          	sleep(1000);

        }
    }
}

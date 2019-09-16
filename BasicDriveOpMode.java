package org.firstinspires.ftc.robotcontroller.external.samples;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Drive With Gamepads", group="Linear Opmode")
public class BasicDriveOpMode extends LinearOpMode {

    // Declare OpMode members.
    private DcMotor leftDrive;
    private DcMotor rightDrive;
    
    
    @Override
    public void init() {
        leftDrive = hardwareMap.get(DcMotor.class, "leftDrive");
        rightDrive = hardwareMap.get(DcMotor.class, "rightDrive");
        /* When you mount motors they usually run in different directions */
        rightDrive.setDirection(DcMotor.Direction.REVERSE);
    }


    @Override
    public void runOpMode() {
        while (opModeIsActive()) {
            leftDrive.setPower(-gamepade1.left_stick_y);
            rightDrive.setPower(-gamepad1.right_sitck_y);
        }
    }
}

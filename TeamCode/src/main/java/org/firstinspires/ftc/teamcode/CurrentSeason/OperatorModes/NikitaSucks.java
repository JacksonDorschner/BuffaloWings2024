package org.firstinspires.ftc.teamcode.CurrentSeason.OperatorModes;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.roboctopi.cuttlefish.utils.Pose;

import org.firstinspires.ftc.teamcode.AbstractClasses.AbstractRobot;
import org.firstinspires.ftc.teamcode.AbstractClasses.AbstractTeleOp;
import org.firstinspires.ftc.teamcode.CurrentSeason.Robots.PeppyFeetFiend;

@TeleOp(name="TeleOperator")
public class NikitaSucks extends AbstractTeleOp {
    PeppyFeetFiend robot;
    public String clawPos;


    @Override
    public AbstractRobot instantiateRobot() {
        robot = new PeppyFeetFiend(this);
        return robot;
    }

    @Override
    public void onInit() {
        super.onInit();
        instantiateRobot();
        robot.initializeRobot();
        telemetry.addData("ClawState: ", clawPos);

    }

    @Override
    public void main() {
    }

    @Override
    public void mainLoop() {
        if (gamepad2.right_bumper) {
            claw.setPosition(0.0);
            clawPos = "closed";
        }
        if (gamepad2.left_bumper) {
            clawPos = "open";
            claw.setPosition(.6);
        }

        super.drive.setVec(new Pose(gamepad1.left_stick_x, -gamepad1.left_stick_y, -gamepad1.right_stick_x));
        armMotor.setPower(gamepad2.right_stick_y);


        robot.driverLoop();
        telemetry.update();
    }


}

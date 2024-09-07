package org.firstinspires.ftc.teamcode.CurrentSeason.Subsystem;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad2;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.roboctopi.cuttlefishftcbridge.devices.CuttleMotor;
import com.roboctopi.cuttlefishftcbridge.devices.CuttleRevHub;
import com.roboctopi.cuttlefishftcbridge.devices.CuttleServo;

import org.firstinspires.ftc.teamcode.AbstractClasses.AbstractSubsystem;
import org.firstinspires.ftc.teamcode.CurrentSeason.Robots.PeppyFeetFiend;

public class Intake extends AbstractSubsystem {
    PeppyFeetFiend robot;
    CuttleMotor arm;
    CuttleServo claw;
    CuttleRevHub ctrlHub;
    CuttleRevHub expHub;
    int motorPort;
    int servoPort;

    public String clawPos;

    public Intake(PeppyFeetFiend robot, int motorPort, int servoPort) {
        super(robot);
        this.robot = robot;
        this.motorPort = motorPort;
        this.servoPort = servoPort;
        //ctrlHub = new CuttleRevHub(robot.hardwareMap, CuttleRevHub.HubTypes.CONTROL_HUB);
        //expHub = new CuttleRevHub(robot.hardwareMap, CuttleRevHub.HubTypes.EXPANSION_HUB);

        arm =  expHub.getMotor(0);
        claw = ctrlHub.getServo(0);

    }

    @Override
    public void init() {
        arm.setZeroPowerBehaviour(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    @Override
    public void start() {

    }

    @Override
    public void driverLoop() {
        if (gamepad2.right_bumper) {
            claw.setPosition(0);
            clawPos = "closed";
        }
        if (gamepad2.left_bumper) {
            clawPos = "open";
            claw.setPosition(.8);
        }

        arm.setPower(gamepad2.right_stick_y);
        telemetry.update();

    }

    @Override
    public void stop() {

    }
}
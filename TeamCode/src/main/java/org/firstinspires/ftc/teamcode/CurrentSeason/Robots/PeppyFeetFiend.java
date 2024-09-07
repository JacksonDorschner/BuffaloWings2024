package org.firstinspires.ftc.teamcode.CurrentSeason.Robots;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.AbstractClasses.AbstractRobot;
import org.firstinspires.ftc.teamcode.CurrentSeason.Subsystem.Outtake;

public class PeppyFeetFiend extends AbstractRobot {
    //public Intake intake;
    public Outtake outtake;

    int intakeMotorPort0 = 0;
    int intakeServoPort0 = 0;


    public PeppyFeetFiend(OpMode opMode) {
        super(opMode);

        outtake = new Outtake(this);
        //   intake = new Intake(this, intakeMotorPort0, intakeServoPort0);
    }
    @Override
    public void initializeRobot()
    {
        //intake.init();
        //subsystems.add(intake);
    }


}
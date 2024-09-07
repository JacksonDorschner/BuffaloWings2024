package org.firstinspires.ftc.teamcode.AbstractClasses;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.roboctopi.cuttlefishftcbridge.devices.CuttleRevHub;

import org.firstinspires.ftc.robotcore.external.Telemetry;

import java.util.ArrayList;

public abstract class AbstractRobot {
    public ArrayList<AbstractSubsystem> subsystems;
    public final HardwareMap hardwareMap;
    public final OpMode opMode;
    public final Telemetry telemetry;
    CuttleRevHub cuttleRevHub;

    public AbstractRobot(OpMode opMode) {

        this.opMode = opMode;
        this.telemetry = opMode.telemetry;
        this.hardwareMap = opMode.hardwareMap;

        subsystems = new ArrayList<>();

    }
    public void driverLoop()
    {
        for(AbstractSubsystem  system : subsystems)
        {
            system.driverLoop();
        }
    }
    public abstract void initializeRobot();
}
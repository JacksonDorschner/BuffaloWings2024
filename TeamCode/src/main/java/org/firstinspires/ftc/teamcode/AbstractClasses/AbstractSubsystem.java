package org.firstinspires.ftc.teamcode.AbstractClasses;

import org.firstinspires.ftc.robotcore.external.Telemetry;

import java.io.IOException;

public abstract class AbstractSubsystem {
    public AbstractRobot robot;
    public final Telemetry telemetry;
    public AbstractSubsystem(AbstractRobot robot) {
        this.robot = robot;
        this.telemetry = robot.telemetry;
    }

    public abstract void init() throws IOException;


    public abstract void start();

    public abstract void driverLoop(

    );

    public abstract void stop();
}

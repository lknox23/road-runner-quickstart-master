package org.firstinspires.ftc.teamcode;
import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import com.acmerobotics.roadrunner.geometry.Vector2d;
public class MyOpMode extends LinearOpMode {
    @Override
    public void runOpMode () {
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);

        drive.setPoseEstimate(new Pose2d(-72, 50, 90));

        Trajectory trajectory1 = drive.trajectoryBuilder(new Pose2d())
                .splineTo(new Vector2d(30, 10), -120)
                .build();

        waitForStart();

        if(isStopRequested()) return;

        drive.followTrajectory(trajectory1);
    }
}

import com.acmerobotics.roadrunner.geometry.Pose2d
import com.acmerobotics.roadrunner.geometry.Vector2d
import com.acmerobotics.roadrunner.trajectory.Trajectory
import com.acmerobotics.roadrunner.trajectory.TrajectoryBuilder
import com.acmerobotics.roadrunner.trajectory.constraints.DriveConstraints

object TrajectoryGen {
    private val constraints = DriveConstraints(45.0, 45.0, 0.0, 180.0.toRadians, 180.0.toRadians, 0.0)
    private val startPose = Pose2d(0.0, 0.0, 0.0)

    fun createTrajectory(): Trajectory {
        val builder = TrajectoryBuilder(startPose, constraints)

        builder.splineTo(Pose2d(24.0, 24.0, 90.0.toRadians))
        builder.splineTo(Pose2d(0.0, 48.0, 45.0.toRadians))

        return builder.build()
    }

    fun drawOffbounds() {
        GraphicsUtil.fillRect(Vector2d(0.0, -63.0), 18.0, 18.0) // robot against the wall
    }
}

val Double.toRadians get() = (Math.toRadians(this))
package frc.robot.inheritance;

import io.github.oblarg.oblog.Loggable;
import monologue.Annotations.*;

public interface Neighbor extends Loggable {
    @Log.NT
    double neighborRand();
}

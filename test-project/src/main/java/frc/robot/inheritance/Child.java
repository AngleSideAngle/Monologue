package frc.robot.inheritance;

import monologue.Annotations.*;

public class Child extends Parent {
    @Log.NT
    public boolean childPublicTrue = true;
    @Log.NT
    private boolean childPrivateTrue = true;
    @Log.NT
    protected boolean childProtectedTrue = true;

    @Log.NT
    public double childPublicRand() {
        return Math.random();
    }

    @Log.NT
    private double childPrivateRand() {
        return Math.random();
    }

    @Log.NT
    protected double childProtectedRand() {
        return Math.random();
    }
}

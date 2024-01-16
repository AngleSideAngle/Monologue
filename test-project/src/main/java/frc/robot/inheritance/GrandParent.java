package frc.robot.inheritance;

import monologue.Annotations.*;

public abstract class GrandParent {
    @Log.NT
    public boolean grandparentPublicTrue = true;
    @Log.NT
    private boolean grandparentPrivateTrue = true;
    @Log.NT
    protected boolean grandparentProtectedTrue = true;

    @Log.NT
    public double grandparentPublicRand() {
        return Math.random();
    }

    @Log.NT
    private double grandparentPrivateRand() {
        return Math.random();
    }

    @Log.NT
    protected double grandparentProtectedRand() {
        return Math.random();
    }
}

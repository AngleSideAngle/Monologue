package frc.robot.inheritance;

import monologue.Annotations.*;
import monologue.Logged;

public class Parent extends GrandParent implements Logged {
    @Log.NT
    public boolean parentPublicTrue = true;
    @Log.NT
    private boolean parentPrivateTrue = true;
    @Log.NT
    protected boolean parentProtectedTrue = true;

    @Log.NT
    public double parentPublicRand() {
        return Math.random();
    }

    @Log.NT
    private double parentPrivateRand() {
        return Math.random();
    }

    @Log.NT
    protected double parentProtectedRand() {
        return Math.random();
    }
}

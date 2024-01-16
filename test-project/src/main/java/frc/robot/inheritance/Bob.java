package frc.robot.inheritance;

import frc.robot.inheritance.Neighbor;

public class Bob implements Neighbor {
    @Override
    public double neighborRand() {
        return Math.random();
    }
}

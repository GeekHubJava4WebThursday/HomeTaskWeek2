package com.geekhub.hw2.parts.carsParts;


import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.interfaces.RunMechanism;

public class Wheels implements RunMechanism {

    private static final float K = 1;
    private static final float MINIMAL_WHEEL_DIAMETER = 0.2F;

    private final float diameter;

    public Wheels(float diameter) {
        if (diameter < MINIMAL_WHEEL_DIAMETER) {
            throw new IllegalArgumentException("Wrong wheel diameter");
        }
        this.diameter = diameter;
    }

    public float getDiameter() {
        return diameter;
    }

    @Override
    public float go(Force force) {
        return (float) (Math.PI * diameter * diameter / 4 * force.getAmount() * K);
    }
}

package com.geekhub.hw2.parts.boatParts;

import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.interfaces.RunMechanism;

public class Screw implements RunMechanism {

    private static final float K = 0.35F;

    @Override
    public float go(Force force) {
        return (force.getAmount() * K);
    }

}

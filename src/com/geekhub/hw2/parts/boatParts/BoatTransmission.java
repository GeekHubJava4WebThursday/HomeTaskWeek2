package com.geekhub.hw2.parts.boatParts;

import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.interfaces.Gear;
import com.geekhub.hw2.parts.interfaces.RunMechanism;
import com.sun.istack.internal.NotNull;

public class BoatTransmission implements Gear {

    private RunMechanism runMechanism;

    public BoatTransmission(@NotNull RunMechanism runMechanism) {
        this.runMechanism = runMechanism;
    }

    @Override
    public void consume(Force force) {
        float distance = runMechanism.go(force);
        System.out.println("Boat sailed " + distance + " meters");
    }

}

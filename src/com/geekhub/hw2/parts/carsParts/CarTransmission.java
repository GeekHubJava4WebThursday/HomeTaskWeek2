package com.geekhub.hw2.parts.carsParts;

import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.interfaces.Gear;
import com.geekhub.hw2.parts.interfaces.RunMechanism;
import com.sun.istack.internal.NotNull;

public class CarTransmission implements Gear {

    private RunMechanism runMechanism;

    public CarTransmission(@NotNull RunMechanism runMechanism) {
        this.runMechanism = runMechanism;
    }

    @Override
    public void consume(Force force) {
        float distance = runMechanism.go(force);
        System.out.println("Car traveled " + distance + " meters");
    }

}

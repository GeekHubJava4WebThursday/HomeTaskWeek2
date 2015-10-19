package com.geekhub.hw2.car;

import com.geekhub.hw2.Force;
import com.geekhub.hw2.Torque;
import com.geekhub.hw2.parts.Gear;

public class Transmission implements Gear {

    public final int CONVERSION_FACTOR = 3;

    public Transmission() {
        System.out.println(getClass().toString() + " - creating...");
    }

    @Override
    public Torque transmit(Force force) {
        System.out.println(getClass().toString() + " - transmit...");
        return new Torque(force.getAmount() * CONVERSION_FACTOR);
    }
}

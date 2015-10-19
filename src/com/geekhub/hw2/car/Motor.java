package com.geekhub.hw2.car;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.Engine;

public class Motor implements Engine {

    public final int CONVERSION_FACTOR = 2;

    public Motor() {
        System.out.println(getClass().toString() + " - creating...");
    }

    @Override
    public Force transform(Energy energy) {
        System.out.println(getClass().toString() + " - transform...");
        return new Force(energy.getAmount() * CONVERSION_FACTOR);
    }
}

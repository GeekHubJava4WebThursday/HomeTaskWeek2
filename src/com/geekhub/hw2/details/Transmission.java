package com.geekhub.hw2.details;

import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.Gear;

public class Transmission implements Gear {

    @Override
    public void consume(Force force) {
        System.out.println(force != null ? "Transmission consumed " + force.getAmount() + " kW" : "");
    }
}

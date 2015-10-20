package com.geekhub.hw2.vehicle.car;

import com.geekhub.hw2.parts.Gear;
import com.geekhub.hw2.Force;

public class CarGearbox implements Gear {

    @Override
    public void consume(Force force) {
        try {
            Thread.sleep(force.getAmount() * 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
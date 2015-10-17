package com.geekhub.hw2.vehicle.Boat.boatPart;

import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.Gear;

/**
 * Created by COMRADE on 17.10.2015.
 */
public class BoatTransmission implements Gear {

    @Override
    public void consume(Force force) {
        try {
            Thread.sleep(force.getAmount() * 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

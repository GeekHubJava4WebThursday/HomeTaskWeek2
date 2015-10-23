package com.geekhub.hw2.vehicle.boat;

import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.Gear;
import com.geekhub.hw2.vehicle.car.Wheels;

/**
 * Created by Mistes on 23.10.2015.
 */
public class BoatGear implements Gear {
    @Override
    public void consume(Force force, Wheels wheels, BoatPropeller boatPropeller) {
        if (force.getAmount() != 0) {
            boatPropeller.propellerspin();

        }


    }
}
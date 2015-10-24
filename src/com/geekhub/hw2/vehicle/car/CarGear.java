package com.geekhub.hw2.vehicle.car;

import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.Gear;
import com.geekhub.hw2.vehicle.boat.BoatPropeller;

/**
 * Created by Mistes on 23.10.2015.
 */
public class CarGear implements Gear {
    @Override
    public void consume(Force force, Wheels wheels,BoatPropeller boatPropeller ) {
        if (force.getAmount() != 0) {
            wheels.spin();

        }

    }
}

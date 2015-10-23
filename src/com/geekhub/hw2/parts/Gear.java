package com.geekhub.hw2.parts;

import com.geekhub.hw2.Force;
import com.geekhub.hw2.vehicle.boat.BoatPropeller;
import com.geekhub.hw2.vehicle.car.Wheels;

public interface Gear {

    void consume(Force force,Wheels wheels,BoatPropeller boatPropeller);
}

package com.geekhub.hw2.vehicle.boat;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.Engine;



public class BoatEngine implements Engine {
    @Override
    public Force transform(Energy energy) {
        return new Force(energy.getAmount());
    }
}

package com.geekhub.hw2.vehicle.car;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.Engine;

/**
 * Created by Mistes on 23.10.2015.
 */

public class CarEngine implements Engine {
    @Override
    public Force transform (Energy energy) {
        return new Force (energy.getAmount());
    }

}

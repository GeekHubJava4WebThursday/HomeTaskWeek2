package com.geekhub.hw2.vehicle.Car.carPart;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.vehicle.Detail;

/**
 * Created by COMRADE on 17.10.2015.
 */
public class CarEngine implements Engine {
    @Override
    public Force transform(Energy energy, Detail detail) {
        return new Force(energy.getAmount() / detail.square());
    }
}

package com.geekhub.hw2.vehicle.car;

import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;

import java.lang.Override;

public class CarEngine implements Engine {

    @Override
    public Force transform(Energy energy) {
        return new Force(energy.getAmount());
    }
}
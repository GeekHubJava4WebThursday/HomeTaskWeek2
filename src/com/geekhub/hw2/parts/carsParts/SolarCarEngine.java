package com.geekhub.hw2.parts.carsParts;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.interfaces.Engine;

public class SolarCarEngine implements Engine {

    private final float transformCoefficient;

    public SolarCarEngine(float k) {
        this.transformCoefficient = k;
    }

    @Override
    public Force transform(Energy energy) {
        return new Force(Math.round(energy.getAmount() * transformCoefficient));
    }

}

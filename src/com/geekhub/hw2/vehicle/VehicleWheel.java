package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;
import com.geekhub.hw2.parts.MovingPart;

public abstract class VehicleWheel extends Vehicle {

    private final MovingPart movingPart;

    public VehicleWheel(EnergySource energySource, Engine engine, Gear gear, MovingPart movingPart) {
        super(energySource, engine, gear);
        this.movingPart = movingPart;
    }

    public MovingPart getMovingPart() {
        return movingPart;
    }

}

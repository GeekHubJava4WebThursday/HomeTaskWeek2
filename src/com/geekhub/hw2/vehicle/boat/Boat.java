package com.geekhub.hw2.vehicle.boat;

import com.geekhub.hw2.parts.energy.EnergySource;
import com.geekhub.hw2.parts.engine.Engine;
import com.geekhub.hw2.parts.gear.AutomaticTransmission;
import com.geekhub.hw2.parts.gear.Screw;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Vehicle;

public class Boat extends Vehicle {
    private final Screw screw;

    public Boat(EnergySource energySource, Engine engine, AutomaticTransmission transmission, Screw screw) {
        super(energySource, engine, transmission);
        this.screw = screw;
    }

    @Override
    public void accelerate() {
        System.out.println("Boat accelerate");
        gear.consume(engine.transform(energySource.get()));
    }

    @Override
    public void brake() {
        System.out.println("Try to stop screw");
        screw.stop();
    }

    @Override
    public void turn(Direction direction) {
        screw.turn(direction);
    }
}

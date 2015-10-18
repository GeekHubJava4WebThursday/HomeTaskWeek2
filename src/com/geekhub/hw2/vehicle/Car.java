package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;
import com.geekhub.hw2.parts.RunDevice;

/**
 * Class for Car
 */

public class Car extends Vehicle{

    public Car(EnergySource energySource, Engine engine, Gear gear, RunDevice wheel) {
        super(energySource, engine, gear, wheel);
    }

    @Override
    public void accelerate() {
        super.accelerate();
        Force force = engine.transform(energySource.get());
        gear.consume(force);
        System.out.println("accelerated car");
    }

    @Override
    public void brake() {
        super.brake();
        System.out.println("stop car");
    }

    @Override
    public void turn(Direction direction) {
        super.turn(direction);
        System.out.println(" car");
    }
}

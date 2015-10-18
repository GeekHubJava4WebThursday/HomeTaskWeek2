package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;
import com.geekhub.hw2.parts.RunDevice;

/**
 * Class for Solar Car
 *
 * */

public class SolarCar extends Vehicle{

    public SolarCar(EnergySource energySource, Engine engine, Gear gear, RunDevice wheel) {
        super(energySource, engine, gear, wheel);
    }

    @Override
    public void accelerate() {
        super.accelerate();
        Force force = engine.transform(energySource.get());
        gear.consume(force);
        System.out.println("accelerated solar car");
    }

    @Override
    public void brake() {
        super.brake();
        System.out.println("stop solar car");
    }

    @Override
    public void turn(Direction direction) {
        super.turn(direction);
        System.out.println(" solar car");
    }
}

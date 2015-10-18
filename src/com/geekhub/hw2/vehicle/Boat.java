package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.RunDevice;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Vehicle;
import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;

/**
 * Class for Boat
 */
public class Boat extends Vehicle{

    public Boat(EnergySource energySource, Engine engine, Gear gear, RunDevice blade) {
        super(energySource, engine, gear, blade);
    }

    @Override
    public void accelerate() {
        super.accelerate();
        Force force = engine.transform(energySource.get());
        gear.consume(force);
        System.out.println("accelerated boat");
    }

    @Override
    public void brake() {
        super.brake();
        System.out.println("stop boat");
    }

    @Override
    public void turn(Direction direction) {
        super.turn(direction);
        System.out.println(" boat");
    }
}

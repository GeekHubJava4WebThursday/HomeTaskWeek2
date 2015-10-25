package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.parts.BoatGear;
import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;

/**
 * Created by kvart on 17.10.15.
 */
public class Boat extends Vehicle{
    public Boat(EnergySource energySource, Engine engine,  BoatGear gear) {
        super(energySource, engine, gear);
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println(" BOAT");

    }

    @Override
    public void turn(Direction direction) {
        super.turn(direction);
        System.out.println(" BOAT");

    }

    @Override
    public void brake() {
        super.brake();
        System.out.println(" BOAT");

    }
}

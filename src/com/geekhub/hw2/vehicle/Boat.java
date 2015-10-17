package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;

public class Boat extends Vehicle{

    public Boat(EnergySource energySource, Engine engine, Gear gear) {
        super(energySource, engine, gear);
    }

    @Override
    public void accelerate() {
        System.out.println("boat accelerate");
        super.accelerate();
    }

    @Override
    public void turn(Direction direction) {
        System.out.print("boat ");
        super.turn(direction);
    }

    @Override
    public void brake() {
        super.brake();
    }
}

package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;

public class SolarCar extends Car {
    public SolarCar(EnergySource energySource, Engine engine, Gear gear) {
        super(energySource, engine, gear);
    }

    @Override
    public void accelerate() {
        System.out.print("solar ");
        super.accelerate();
    }

    @Override
    public void turn(Direction direction) {
        System.out.print("solar ");
        super.turn(direction);
    }

    @Override
    public void brake() {
        super.brake();
    }
}

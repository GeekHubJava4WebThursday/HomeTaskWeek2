package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;

public class Car extends Vehicle {
    public Car(EnergySource energySource, Engine engine, Gear gear) {
        super(energySource, engine, gear);
    }

    @Override
    public void accelerate() {
        System.out.println("car accelerate");
        super.accelerate();
    }

    @Override
    public void turn(Direction direction) {
        System.out.print("car ");
        super.turn(direction);
    }

    @Override
    public void brake() {
        super.brake();
    }
}

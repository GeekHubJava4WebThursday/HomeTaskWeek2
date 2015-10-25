package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.parts.*;

/**
 * Created by kvart on 25.10.15.
 */
public class Car extends Vehicle {
    public Car(EnergySource energySource, Engine engine, CarGear gear) {
        super(energySource, engine, gear);
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println(" CAR");

    }

    @Override
    public void turn(Direction direction) {
        super.turn(direction);
        System.out.println(" CAR");

    }

    @Override
    public void brake() {
        super.brake();
        System.out.println(" CAR");

    }
}
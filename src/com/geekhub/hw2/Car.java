package com.geekhub.hw2;

import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Vehicle;

/**
 * Created by Вадимка on 17.10.2015.
 */
public class Car extends Vehicle {
    String engine;
    String wheels;
    String brakes;


    public Car(EnergySource energySource, Engine engine, Gear gear) {
        super(energySource, engine, gear);
    }

    @Override
    public void accelerate() {
        System.out.println("Car starts to move ");
        super.accelerate();
    }

    @Override
    public void turn(Direction direction) {
        System.out.println("Car starts to turn");
        super.turn(direction);
    }

    @Override
    public void brake() {
        System.out.println("Car starts to brake");
        super.brake();
    }
}

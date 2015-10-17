package com.geekhub.hw2.cars;

import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.interfaces.EnergySource;
import com.geekhub.hw2.parts.interfaces.Engine;
import com.geekhub.hw2.parts.interfaces.Gear;
import com.geekhub.hw2.parts.interfaces.RunMechanism;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Vehicle;

public class Car extends Vehicle {

    public Car(EnergySource energySource, Engine engine, Gear gear, RunMechanism runMechanism) {
        super(energySource, engine, gear, runMechanism);
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerated");
        Force force = engine.transform(energySource.get());
        gear.consume(force);
    }

    @Override
    public void turn(Direction direction) {
        System.out.println("Car turning " + direction.toString().toLowerCase());
    }

    @Override
    public void brake() {
        System.out.println("Car braked");
    }

}

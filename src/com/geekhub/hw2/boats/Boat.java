package com.geekhub.hw2.boats;

import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.interfaces.EnergySource;
import com.geekhub.hw2.parts.interfaces.Engine;
import com.geekhub.hw2.parts.interfaces.Gear;
import com.geekhub.hw2.parts.interfaces.RunMechanism;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Vehicle;

public class Boat extends Vehicle {

    public Boat(EnergySource energySource, Engine engine, Gear gear, RunMechanism runMechanism) {
        super(energySource, engine, gear, runMechanism);
    }

    @Override
    public void accelerate() {
        System.out.println("Boat accelerated");
        Force force = engine.transform(energySource.get());
        gear.consume(force);
    }

    @Override
    public void turn(Direction direction) {
        System.out.println("Boat turning " + direction.toString().toLowerCase());
    }

    @Override
    public void brake() {
        System.out.println("Boat braked/reversed");
        Force force = engine.transform(energySource.get());
        Force reverseForce = new Force(- force.getAmount());
        gear.consume(reverseForce);
    }

}

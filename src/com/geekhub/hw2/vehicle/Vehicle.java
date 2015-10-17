package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;

public abstract class Vehicle implements Driveable {

    private final EnergySource energySource;
    private final Engine engine;
    private final Gear gear;
    private int speed = 0;

    public Vehicle(EnergySource energySource, Engine engine, Gear gear) {
        this.energySource = energySource;
        this.engine = engine;
        this.gear = gear;
    }

    public void accelerate() {
        Energy energy = energySource.get();
        Force force = engine.transform(energy);
        gear.consume(force);
        speed = speed + force.getAmount();
        System.out.println("speed: " + speed + " km/h");
    }

    public void turn(Direction direction) {
        switch (direction) {
            case LEFT:
                System.out.println("turns left");
                break;

            case RIGHT:
                System.out.println("turns right");
                break;
        }
    }

    public void brake() {
        speed = 0;
        System.out.println("stop");
        System.out.println("speed: "+ speed + " km/h");
    }

}

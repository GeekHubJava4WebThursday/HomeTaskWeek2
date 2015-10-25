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

    public Vehicle(EnergySource energySource, Engine engine, Gear gear) {
        this.energySource = energySource;
        this.engine = engine;
        this.gear = gear;
    }

    public void accelerate(){
        Energy energy = energySource.get();
        Force force = engine.transform(energy);
        gear.consume(force);
        System.out.print("ACCELERATE");

    }
    public void turn(Direction direction){
        switch (direction){
            case LEFT :
                System.out.print("LEFT");
                break;
            case RIGHT :
                System.out.print("RIGHT");
                break;
        }

    }
    public void brake(){
        System.out.print("STOP");
    }
}

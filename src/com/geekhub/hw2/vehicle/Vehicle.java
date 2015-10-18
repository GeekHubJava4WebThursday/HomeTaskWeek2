package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;
import com.geekhub.hw2.parts.RunDevice;

public abstract class Vehicle implements Driveable {

    protected final EnergySource energySource;
    protected final Engine engine;
    protected final Gear gear;
    protected final RunDevice runDevice;

    public Vehicle(EnergySource energySource, Engine engine, Gear gear, RunDevice runDevice) {

        // check availability of the necessary equipment
        if (energySource == null) {
            System.out.println("Error: We don't have energy source!");
            throw new IllegalArgumentException();
        }
        if (engine == null) {
            System.out.println("Error: We don't have engine!");
            throw new IllegalArgumentException();
        }
        if (gear == null) {
            System.out.println("Error: We don't have gear!");
            throw new IllegalArgumentException();
        }
        if (runDevice == null) {
            System.out.println("Error: We don't have devide for run!");
            throw new IllegalArgumentException();
        }

        // Initial installation of equipment
        this.energySource = energySource;
        this.engine = engine;
        this.gear = gear;
        this.runDevice = runDevice;
    }


    public void accelerate(){

    }

    public void turn(Direction direction) {
        switch (direction) {
           case LEFT:
               System.out.print("turn left");
                break;

           case RIGHT:
                System.out.print("turn right");
                break;
            }
    }

    public void brake(){

    }
}

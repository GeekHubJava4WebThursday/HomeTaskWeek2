package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.parts.*;

public abstract class Vehicle implements Driveable {

    private final EnergySource energySource;
    private final GasTank gasTank;
    private final Engine engine;
    private final Gear gear;
    private final Wheels wheels;

    public Vehicle(GasTank gasTank, Engine engine, Gear gear, Wheels wheels) {
        this.gasTank = gasTank;
        this.engine = engine;
        this.gear = gear;
        this.wheels = wheels;
        energySource = gasTank.get();
    }

    public Vehicle(GasTank gasTank, Engine engine, Gear gear) {
        this.gasTank = gasTank;
        this.engine = engine;
        this.gear = gear;
        wheels = null;
        energySource = gasTank.get();
    }

    public Vehicle(EnergySource energySource, Engine engine, Gear gear, Wheels wheels) {
        this.energySource = energySource;
        this.engine = engine;
        this.gear = gear;
        this.wheels = wheels;
        gasTank = null;
    }
}

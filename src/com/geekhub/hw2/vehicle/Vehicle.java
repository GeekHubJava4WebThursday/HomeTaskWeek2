package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.parts.*;

public abstract class Vehicle implements Driveable {

    private final EnergySource energySource;
    private final Engine engine;
    private final Gear gear;

    public Vehicle(EnergySource energySource, Engine engine, Gear gear) {
        System.out.println(getClass().toString() + " - creating...");
        this.energySource = energySource;
        this.engine = engine;
        this.gear = gear;
    }

    public Engine getEngine() {
        return engine;
    }

    public EnergySource getEnergySource() {
        return energySource;
    }

    public Gear getGear() {
        return gear;
    }
}

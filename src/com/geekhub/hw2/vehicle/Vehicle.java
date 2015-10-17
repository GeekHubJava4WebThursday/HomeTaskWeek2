package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.details.BoatEngineDecorator;
import com.geekhub.hw2.parts.*;

public abstract class Vehicle implements Driveable {

    private final EnergySource energySource;
    private final FuelTank fuelTank;
    private final Engine engine;
    private final BoatEngineDecorator boatEngine;
    private final Gear gear;
    private final Wheels wheels;

    public Vehicle(FuelTank fuelTank, Engine engine, Gear gear, Wheels wheels) {
        this.fuelTank = fuelTank;
        this.engine = engine;
        this.gear = gear;
        this.wheels = wheels;
        boatEngine = null;
        energySource = fuelTank.get();
    }

    public Vehicle(FuelTank fuelTank, BoatEngineDecorator boatEngine) {
        this.fuelTank = fuelTank;
        this.boatEngine = boatEngine;
        engine = null;
        gear = null;
        wheels = null;
        energySource = fuelTank.get();
    }

    public EnergySource getEnergySource() {
        return energySource;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public Engine getEngine() {
        return engine;
    }

    public BoatEngineDecorator getBoatEngine() {
        return boatEngine;
    }

    public Gear getGear() {
        return gear;
    }

    public Wheels getWheels() {
        return wheels;
    }
}

package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;
import com.geekhub.hw2.vehicle.Car.carPart.Wheel;
import com.geekhub.hw2.vehicle.Boat.boatPart.Screw;

public abstract class Vehicle implements Driveable {

    protected final EnergySource energySource;
    protected final Engine engine;
    protected final Gear gear;
    protected final Detail screw;

    public Vehicle(EnergySource energySource, Engine engine, Gear gear, Detail wheel) {
        this.energySource = energySource;
        this.engine = engine;
        this.gear = gear;
        this.screw = wheel;
    }



}

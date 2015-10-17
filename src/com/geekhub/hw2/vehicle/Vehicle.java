package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.parts.interfaces.EnergySource;
import com.geekhub.hw2.parts.interfaces.Engine;
import com.geekhub.hw2.parts.interfaces.Gear;
import com.geekhub.hw2.parts.interfaces.RunMechanism;

public abstract class Vehicle implements Driveable {

    protected final EnergySource energySource;
    protected final Engine engine;
    protected final Gear gear;
    protected final RunMechanism runMechanism;

    public Vehicle(EnergySource energySource, Engine engine, Gear gear, RunMechanism runMechanism) {
        if (energySource == null) {
            System.out.println("Vehicle can not go without energy source!");
            throw new IllegalArgumentException();
        }
        if (engine == null) {
            System.out.println("Vehicle can not go without engine!");
            throw new IllegalArgumentException();
        }
        if (gear == null) {
            System.out.println("Gear must be set");
            throw new IllegalArgumentException();
        }
        if (runMechanism == null) {
            System.out.println("Vehicle must have run mechanism");
            throw new IllegalArgumentException();
        }

        this.energySource = energySource;
        this.engine = engine;
        this.gear = gear;
        this.runMechanism = runMechanism;
    }
}

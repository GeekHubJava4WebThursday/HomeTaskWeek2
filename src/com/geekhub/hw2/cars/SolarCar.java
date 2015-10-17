package com.geekhub.hw2.cars;

import com.geekhub.hw2.parts.interfaces.EnergySource;
import com.geekhub.hw2.parts.interfaces.Engine;
import com.geekhub.hw2.parts.interfaces.Gear;
import com.geekhub.hw2.parts.interfaces.RunMechanism;

public class SolarCar extends Car {

    public SolarCar(EnergySource energySource, Engine engine, Gear gear, RunMechanism runMechanism) {
        super(energySource, engine, gear, runMechanism);
    }

    @Override
    public void accelerate() {
        System.out.print("Solar ");
        super.accelerate();
    }

}

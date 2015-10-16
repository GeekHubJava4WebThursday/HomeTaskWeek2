package com.geekhub.hw2.garage;

import com.geekhub.hw2.parts.*;

public class SolarCar extends Car {

    public SolarCar(EnergySource energySource, Engine engine, Gear gear, Wheels wheels) {
        super(null, engine, gear, wheels);
    }
}

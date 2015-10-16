package com.geekhub.hw2.garage;

import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.GasTank;
import com.geekhub.hw2.parts.Gear;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Vehicle;

public class Boat extends Vehicle {

    public Boat(EnergySource energySource, GasTank gasTank, Engine engine, Gear gear) {
        super(gasTank, engine, gear);
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void turn(Direction direction) {

    }

    @Override
    public void brake() {

    }
}

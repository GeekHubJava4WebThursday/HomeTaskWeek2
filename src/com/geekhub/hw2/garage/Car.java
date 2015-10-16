package com.geekhub.hw2.garage;

import com.geekhub.hw2.parts.*;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Vehicle;

public class Car extends Vehicle {

    public Car(EnergySource energySource, GasTank gasTank, Engine engine, Gear gear, Wheels wheels) {
        super(energySource, gasTank, engine, gear, wheels);
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

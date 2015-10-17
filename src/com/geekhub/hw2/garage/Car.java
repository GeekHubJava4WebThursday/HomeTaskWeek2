package com.geekhub.hw2.garage;

import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.*;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Vehicle;

public class Car extends Vehicle {

    public Car(FuelTank fuelTank, Engine engine, Gear gear, Wheels wheels) {
        super(fuelTank, engine, gear, wheels);
    }

    @Override
    public void accelerate() {
        useEnergy(10);
    }

    @Override
    public void turn(Direction direction) {
        getWheels().turnFrontWheels(direction);
    }

    @Override
    public void brake() {
        useEnergy(1);
    }

    private void useEnergy(int amount) {
        EnergySource gas = getFuelTank().get();
        Force force = getEngine().transform(gas.get(amount));
        getGear().consume(force);
        System.out.println("Fuel level: " + gas.getAmount());
    }

    @Override
    public String toString() {
        return "Car";
    }
}
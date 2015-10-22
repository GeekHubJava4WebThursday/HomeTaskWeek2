package com.geekhub.hw2.garage;

import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.*;
import com.geekhub.hw2.vehicle.Direction;

public class SolarCar extends Car {

    public SolarCar(FuelTank fuelTank, Engine engine, Gear gear, Wheels wheels) {
        super(fuelTank, engine, gear, wheels);
    }

    @Override
    public void accelerate() {
        useEnergy(10);
    }

    @Override
    public void turn(Direction direction) {
        super.turn(direction);
    }

    @Override
    public void brake() {
        useEnergy(1);
    }

    private void useEnergy(int amount) {
        Force force = getEngine().transform(getEnergySource().get(amount));
        getGear().consume(force);
        getFuelTank().add(5);
        System.out.println("Charge level: " + getEnergySource().getAmount());
    }

    @Override
    public String toString() {
        return "Solar Car";
    }


}

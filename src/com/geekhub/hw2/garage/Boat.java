package com.geekhub.hw2.garage;

import com.geekhub.hw2.Force;
import com.geekhub.hw2.details.BoatEngineDecorator;
import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.FuelTank;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Vehicle;

public class Boat extends Vehicle {

    public Boat(FuelTank fuelTank, BoatEngineDecorator engine) {
        super(fuelTank, engine);
    }

    @Override
    public void accelerate() {
        useEnergy(15);
    }

    @Override
    public void turn(Direction direction) {
        getBoatEngine().turn(direction);
    }

    @Override
    public void brake() {
        useEnergy(3);
    }

    private void useEnergy(int amount) {
        EnergySource gas = getFuelTank().get();
        Force force = getBoatEngine().transform(gas.get(amount));
        getBoatEngine().consume(force);
        System.out.println("Fuel level: " + gas.getAmount());
    }

    @Override
    public String toString() {
        return "Boat";
    }
}

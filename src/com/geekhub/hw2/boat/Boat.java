package com.geekhub.hw2.boat;

import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Vehicle;

public class Boat extends Vehicle{

    private String model;
    private Direction direction;
    private int speed;

    public Boat(EnergySource energySource, Engine engine, Gear gear) {
        super(energySource, engine, gear);
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().toString() + " - accelerating:");
        this.speed = (getGear().transmit(getEngine().transform(getEnergySource().get()))).getAmount();
        System.out.println(getClass().toString() + " - Current speed - " + getSpeed());
    }

    @Override
    public void turn(Direction direction) {
        System.out.println(getClass().toString() + " - turn:");
        this.direction = direction;
        System.out.println(getClass().toString() + " - New direction - " + direction);
    }

    @Override
    public void brake() {
        System.out.println(getClass().toString() + " - brake:");
        this.speed --;
        System.out.println(getClass().toString() + " - Current speed - " + getSpeed());
    }

    public String getModel() {
        return model;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getSpeed() {
        return speed;
    }
}

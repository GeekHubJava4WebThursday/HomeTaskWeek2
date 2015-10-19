package com.geekhub.hw2.car;

import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;
import com.geekhub.hw2.parts.MovingPart;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.VehicleWheel;

public class Car extends VehicleWheel {

    protected String model;

    public Car(EnergySource energySource, Engine engine, Gear gear, MovingPart movingPart) {
        super(energySource, engine, gear, movingPart);
        System.out.println(getClass().toString() + " - created.");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().toString() + " - accelerating:");
        getMovingPart().accelerate(getGear().transmit(getEngine().transform(getEnergySource().get())));
        System.out.println(getClass().toString() + " - Current speed - " + getSpeed());
    }

    @Override
    public void turn(Direction direction) {
        System.out.println(getClass().toString() + " - turn:");
        getMovingPart().turn(direction);
        System.out.println(getClass().toString() + " - New direction - " + getDirection());
    }

    @Override
    public void brake() {
        System.out.println(getClass().toString() + " - brake:");
        getMovingPart().brake();
        System.out.println(getClass().toString() + " - Current speed - " + getSpeed());
    }

    public int getSpeed() {
        return ((Chassis)getMovingPart()).getRevolutionsPerMinute();
    }

    public Direction getDirection() {
        return ((Chassis)getMovingPart()).getDirection();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

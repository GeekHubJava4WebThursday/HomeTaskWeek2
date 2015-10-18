package com.geekhub.hw2;

import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;
import com.geekhub.hw2.vehicle.Direction;

/**
 * Created by Вадимка on 17.10.2015.
 */
public class SolarCar extends Car {

    public SolarCar(EnergySource energySource, Engine engine, Gear gear) {
        super(energySource, engine, gear);
    }
    @Override
    public void accelerate() {
        System.out.println("Solar car starts to move ");
        super.accelerate();
    }

    @Override
    public void turn(Direction direction) {
        super.turn(direction);
    }

    @Override
    public void brake() {
        System.out.println("Solar car starts to brake");
        super.brake();
    }
}

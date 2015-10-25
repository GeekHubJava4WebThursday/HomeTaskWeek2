package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.parts.*;

/**
 * Created by kvart on 25.10.15.
 */
public class SolarCar extends Car {
    public SolarCar(Battary energySource, BattaryEngine engine, CarGear gear) {
        super(energySource, engine, gear);
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println(" SOLAR");

    }

    @Override
    public void turn(Direction direction) {
        super.turn(direction);
        System.out.println(" SOLAR");

    }

    @Override
    public void brake() {
        super.brake();
        System.out.println(" SOLAR");
    }
}

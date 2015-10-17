package com.geekhub.hw2.vehicle.Car;

import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;
import com.geekhub.hw2.vehicle.Detail;
import com.geekhub.hw2.vehicle.Direction;

/**
 * Created by COMRADE on 17.10.2015.
 */
public class SolarCar extends Car {
    public SolarCar(EnergySource energySource, Engine engine, Gear gear, Detail detail) {
        super(energySource, engine, gear, detail);
    }

    @Override
    public void accelerate() {
        System.out.println("The solar car accelerate!");
        gear.consume(engine.transform(energySource.get(), screw));
    }

    @Override
    public void brake() {
        System.out.println("Solar car brakes.");
    }

    @Override
    public void turn(Direction direction) {
        System.out.println("The solar car turn to the " + direction.toString());
    }
}

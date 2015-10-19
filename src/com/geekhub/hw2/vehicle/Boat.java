package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;

/**
 * Created by Администратор on 18.10.2015.
 */
public class Boat extends Vehicle {

    public Boat(EnergySource energySource, Engine engine, Gear gear) {
        super(energySource, engine, gear);
        gear.consume(engine.transform(energySource.get()));
        System.out.println("___________");
    }

    @Override
    public void accelerate() {

        System.out.println("Boat is accelerate!!!");
    }

    @Override
    public void turn(Direction direction) {
        System.out.println("boat  turned to the "+direction.toString());
    }

    @Override
    public void brake() {
        System.out.println("Boat was braked\n----------------");
    }
}

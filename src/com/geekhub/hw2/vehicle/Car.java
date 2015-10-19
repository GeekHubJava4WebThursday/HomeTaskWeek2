package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.parts.*;

/**
 * Created by Администратор on 18.10.2015.
 */
public class Car extends Vehicle {

    public Car(EnergySource energySource, Engine engine, Gear gear) {
        super(energySource, engine, gear);
        gear.consume(engine.transform(energySource.get()));
        System.out.println("___________");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerate!!!!");
    }

    @Override
    public void turn(Direction direction) {
        System.out.println("car  turned to the "+direction.toString());
    }

    @Override
    public void brake() {
        System.out.println("car was braked\n-------------------");
    }
}

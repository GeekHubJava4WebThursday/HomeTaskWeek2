package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;

/**
 * Created by Администратор on 18.10.2015.
 */
public class SolarCar extends Car {


    public SolarCar(EnergySource energySource, Engine engine, Gear gear) {
        super(energySource, engine, gear);

    }

    @Override
    public void accelerate() {
        System.out.println("Solar Car is accelerate!!!!");
    }

    @Override
    public void turn(Direction direction) {
        System.out.println("Solar Car  turned to the "+direction.toString());
    }

    @Override
    public void brake() {
        System.out.println("Solar Car was braked\n------------------");
    }


}

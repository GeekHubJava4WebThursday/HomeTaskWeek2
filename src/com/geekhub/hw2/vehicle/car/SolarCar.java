package com.geekhub.hw2.vehicle.car;

import com.geekhub.hw2.parts.energy.Accumulator;
import com.geekhub.hw2.parts.engine.ElectricEngine;
import com.geekhub.hw2.parts.gear.AutomaticTransmission;
import com.geekhub.hw2.parts.gear.Wheels;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.car.Car;

public class SolarCar extends Car {

    public SolarCar(Accumulator accumulator, ElectricEngine engine, AutomaticTransmission transmission, Wheels wheels) {
        super(accumulator, engine, transmission, wheels);
    }

    @Override
    public void brake() {
        super.brake();
    }

    @Override
    public void turn(Direction direction) {
        super.turn(direction);
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }
}

package com.geekhub.hw2.SolarCar;

import com.geekhub.hw2.car.Car;
import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;
import com.geekhub.hw2.parts.MovingPart;
import com.geekhub.hw2.vehicle.Direction;

public class SolarCar extends Car {

    public SolarCar(EnergySource energySource, Engine engine, Gear gear, MovingPart movingPart) {
        super(energySource, engine, gear, movingPart);
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void turn(Direction direction) {
        super.turn(direction);
    }

    @Override
    public void brake() {
        super.brake();
    }
}

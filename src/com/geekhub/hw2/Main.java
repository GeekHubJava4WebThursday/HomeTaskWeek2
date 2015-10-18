package com.geekhub.hw2;

import com.geekhub.hw2.parts.energy.Accumulator;
import com.geekhub.hw2.parts.energy.GasTank;
import com.geekhub.hw2.parts.engine.ElectricEngine;
import com.geekhub.hw2.parts.engine.InternalCombustionEngine;
import com.geekhub.hw2.parts.gear.AutomaticTransmission;
import com.geekhub.hw2.parts.gear.MechanicTransmission;
import com.geekhub.hw2.parts.gear.Screw;
import com.geekhub.hw2.parts.gear.Wheels;
import com.geekhub.hw2.vehicle.*;
import com.geekhub.hw2.vehicle.boat.Boat;
import com.geekhub.hw2.vehicle.car.Car;
import com.geekhub.hw2.vehicle.car.SolarCar;

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                 new Car(new GasTank(100, 0), new InternalCombustionEngine(), new MechanicTransmission(), new Wheels()),
                 new Boat(new GasTank(200, 20), new InternalCombustionEngine(), new AutomaticTransmission(), new Screw()),
                 new SolarCar(new Accumulator(90), new ElectricEngine(), new AutomaticTransmission(), new Wheels())
        };

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("------------");
            testDrive(vehicles[i]);
        }
    }

    private static void testDrive(Driveable driveable) {
        driveable.accelerate();
        driveable.turn(Direction.LEFT);
        driveable.turn(Direction.RIGHT);
        driveable.brake();
        driveable.accelerate();
        driveable.brake();
    }
}

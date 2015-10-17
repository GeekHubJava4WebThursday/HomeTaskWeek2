package com.geekhub.hw2;

import com.geekhub.hw2.parts.BoatGear;
import com.geekhub.hw2.parts.CarGear;
import com.geekhub.hw2.parts.GasTank;
import com.geekhub.hw2.parts.GasolineEngine;
import com.geekhub.hw2.parts.SolarBattery;
import com.geekhub.hw2.parts.SolarEngine;
import com.geekhub.hw2.vehicle.Boat;
import com.geekhub.hw2.vehicle.Car;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Driveable;
import com.geekhub.hw2.vehicle.SolarCar;
import com.geekhub.hw2.vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {
        Boat boat = new Boat(new GasTank(), new GasolineEngine(), new BoatGear());
        Car car = new Car(new GasTank(), new GasolineEngine(), new CarGear());
        SolarCar solarCar = new SolarCar(new SolarBattery(), new SolarEngine(), new CarGear());
        Vehicle[] vehicles = {
                boat,
                car,
                solarCar
        };

        for (int i = 0; i < vehicles.length; i++) {
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

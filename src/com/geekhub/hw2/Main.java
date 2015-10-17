package com.geekhub.hw2;

import com.geekhub.hw2.boats.Boat;
import com.geekhub.hw2.cars.Car;
import com.geekhub.hw2.cars.SolarCar;
import com.geekhub.hw2.parts.sharedParts.GasTank;
import com.geekhub.hw2.parts.boatParts.BoatEngine;
import com.geekhub.hw2.parts.boatParts.BoatTransmission;
import com.geekhub.hw2.parts.boatParts.Screw;
import com.geekhub.hw2.parts.carsParts.*;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Driveable;
import com.geekhub.hw2.vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {
        Vehicle[] vehicles = {
                getCar1(),
                getCar2(),
                getBoat1()
        };

        for (int i = 0; i < vehicles.length; i++) {
            testDrive(vehicles[i]);
            System.out.println("=============================");
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

    private static Car getCar1() {
        Wheels wheels = new Wheels(0.35F);
        return new Car(new GasTank(8, 4), new CarEngine(0.6F), new CarTransmission(wheels), wheels);
    }

    private static SolarCar getCar2() {
        Wheels wheels = new Wheels(0.35F);
        return new SolarCar(new Accumulator(100), new SolarCarEngine(0.8F), new CarTransmission(wheels), wheels);
    }

    private static Boat getBoat1() {
        Screw screw = new Screw();
        return new Boat(new GasTank(20, 14), new BoatEngine(0.9F), new BoatTransmission(screw), screw);
    }

}

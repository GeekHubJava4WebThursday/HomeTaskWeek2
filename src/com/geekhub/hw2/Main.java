package com.geekhub.hw2;

import com.geekhub.hw2.details.*;
import com.geekhub.hw2.garage.Boat;
import com.geekhub.hw2.garage.Car;
import com.geekhub.hw2.garage.SolarCar;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Driveable;
import com.geekhub.hw2.vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {
        //TODO: Invoke testDrive method for every vehicle
        Vehicle[] vehicles = {
                new Car(new GasTank(59, 60), new InternalCombustionEngine(), new Transmission(), new SmallCarWheels()),
                new SolarCar(new Battery(100, 100500), new ElectricEngine(), new Transmission(), new SmallCarWheels()),
                new Boat(new GasTank(150, 170), new BoatEngineDecorator(new InternalCombustionEngine()))
        };

        for (Vehicle vehicle : vehicles) {
            testDrive(vehicle);
        }
    }

    private static void testDrive(Driveable driveable) {
        System.out.println("Vehicle: " + driveable.toString());
        driveable.accelerate();
        driveable.turn(Direction.LEFT);
        driveable.turn(Direction.RIGHT);
        driveable.brake();
        driveable.accelerate();
        driveable.brake();
    }
}

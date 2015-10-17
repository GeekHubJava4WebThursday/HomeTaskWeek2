package com.geekhub.hw2;

import com.geekhub.hw2.vehicle.Boat.Boat;
import com.geekhub.hw2.vehicle.Boat.boatPart.BoatEngine;
import com.geekhub.hw2.vehicle.Boat.boatPart.BoatTransmission;
import com.geekhub.hw2.vehicle.Boat.boatPart.Screw;
import com.geekhub.hw2.vehicle.Car.Car;
import com.geekhub.hw2.vehicle.Car.SolarCar;
import com.geekhub.hw2.vehicle.Car.carPart.CarEngine;
import com.geekhub.hw2.vehicle.Car.carPart.CarTransmission;
import com.geekhub.hw2.vehicle.Car.carPart.Wheel;
import com.geekhub.hw2.vehicle.Car.carPart.SolarEnergy;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Driveable;
import com.geekhub.hw2.vehicle.Vehicle;
import com.geekhub.hw2.vehicle.Car.carPart.Wheel;

public class Main {

    public static void main(String[] args) {
        //TODO: Invoke testDrive method for every vehicle
        Main main = new Main();
        Vehicle[] vehicles = {
            main.getCar(), main.getSolarCar(), main.getBoat()
        };
        for (int i = 0; i < vehicles.length; i++) {
            testDrive(vehicles[i]);
            System.out.println("_________________________________________");
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

    public Car getCar(){
        return new Car(new Energy(94), new CarEngine(), new CarTransmission(), new Wheel(17,6));
    }

    public SolarCar getSolarCar(){
        return new SolarCar(new SolarEnergy(42), new CarEngine(), new CarTransmission(), new Wheel(10,2));
    }

    public Boat getBoat(){
        return new Boat(new Energy(83),new BoatEngine(), new BoatTransmission(), new Screw(42, 7));

    }

}

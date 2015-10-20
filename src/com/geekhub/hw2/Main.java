package com.geekhub.hw2;

import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Driveable;
import com.geekhub.hw2.vehicle.Vehicle;
import com.geekhub.hw2.vehicle.boat.Boat;
import com.geekhub.hw2.vehicle.boat.BoatEngine;
import com.geekhub.hw2.vehicle.boat.BoatGearbox;
import com.geekhub.hw2.vehicle.car.Car;
import com.geekhub.hw2.vehicle.car.CarEngine;
import com.geekhub.hw2.vehicle.car.CarGearbox;
import com.geekhub.hw2.vehicle.car.SolarCar;
import com.geekhub.hw2.parts.GasTank;
import com.geekhub.hw2.parts.SolarBattery;

public class Main {

    public static void main(String[] args) {
        Main obj = new Main();
        Vehicle[] vehicles = { 
        		obj.getCar(),obj.getBoat(),obj.getSolarCar()
        };

        for (int i = 0; i < vehicles.length; i++) {
            testDrive(vehicles[i]);
            System.out.println();
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
        return new Car(new GasTank(), new CarEngine(), new CarGearbox());
    }
    public Boat getBoat(){
        return new Boat(new GasTank(), new BoatEngine(), new BoatGearbox());
    }
    
    public SolarCar getSolarCar(){
        return new SolarCar(new SolarBattery(), new BoatEngine(), new CarGearbox());
    }

}

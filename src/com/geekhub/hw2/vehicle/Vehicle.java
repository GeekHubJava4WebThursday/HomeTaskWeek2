package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;
import com.geekhub.hw2.vehicle.boat.BoatPropeller;
import com.geekhub.hw2.vehicle.car.Wheels;

public abstract class Vehicle implements Driveable {

    private final EnergySource energySource;
    private final Engine engine;
    private final Gear gear;

    public Vehicle(){
        energySource = new EnergySource() {
            @Override
            public Energy get() {
                return null;
            }
        };
        engine =new Engine() {
            @Override
            public Force transform(Energy energy) {
                return null;
            }
        };
        gear = new Gear() {
            @Override
            public void consume(Force force,Wheels wheels, BoatPropeller boatPropeller) {

            }
        };
    }
    public Vehicle(EnergySource energySource, Engine engine, Gear gear) {
        this.energySource = energySource;
        this.engine = engine;
        this.gear = gear;
    }

    @Override
    public void accelerate(){
        System.out.println("Accelerating");
    }

    @Override
    public void turn(Direction direction){
        if (direction == Direction.LEFT) {
            System.out.println("Turning left");
        } else {
            System.out.println("Turning right");
        }
    }

    @Override
    public void brake(){
        System.out.println("Stoping...");
    }
}


package com.geekhub.hw2.vehicle.boat;

import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Vehicle;

import java.lang.Override;

public class Boat extends Vehicle {
	
	  public Boat(EnergySource energySource, Engine engine, Gear gear) {
	        super(energySource, engine, gear);
	    }
	  
	    @Override
	    public void accelerate(){
	        System.out.println("Boat takes off");
	    }

	    public void turn(Direction direction) {
	        System.out.println("Boat turns "+direction.toString());
	    }

	    public void brake() {
	        System.out.println("Boat slows down");
	    }

}

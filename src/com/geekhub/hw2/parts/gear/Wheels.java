package com.geekhub.hw2.parts.gear;

import com.geekhub.hw2.vehicle.Direction;

public class Wheels{

    public void turn(Direction direction){
        System.out.println("Wheels turn " + direction.toString().toLowerCase());
    }

    public void stop(){
        try {
            Thread.sleep(1000);
            System.out.println("Car stopped");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

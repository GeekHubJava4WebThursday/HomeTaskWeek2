package com.geekhub.hw2.parts.gear;

import com.geekhub.hw2.vehicle.Direction;

public class Screw{

    public void turn(Direction direction){
        System.out.println("Screw turn "+direction.toString().toLowerCase());
    }

    public void stop(){
        System.out.println("Try to stop the screw");
        try {
            Thread.sleep(1000);
            System.out.println("Screw stopped");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

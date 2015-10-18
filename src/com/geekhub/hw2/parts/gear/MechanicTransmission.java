package com.geekhub.hw2.parts.gear;

import com.geekhub.hw2.Force;

public class MechanicTransmission implements Gear {

    @Override
    public void consume(Force force) {
        if(force.getAmount() != 0){
            System.out.println("Accelerate done");
        }
        else {
            System.out.println("Accelerate failed");
        }
    }

}

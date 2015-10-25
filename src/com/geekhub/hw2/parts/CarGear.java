package com.geekhub.hw2.parts;

import com.geekhub.hw2.Force;

/**
 * Created by kvart on 25.10.15.
 */
public class CarGear implements Gear {
    @Override
    public void consume(Force force) {
        System.out.println("START MOTION");
    }
}


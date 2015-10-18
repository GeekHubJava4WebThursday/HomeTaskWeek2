package com.geekhub.hw2.parts;

import com.geekhub.hw2.Force;

/**
 * Created by Вадимка on 18.10.2015.
 */
public class SolarGear implements Gear {
    @Override
    public void consume(Force force) {
        System.out.println("Gone!");
    }
}

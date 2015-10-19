package com.geekhub.hw2.parts;

import com.geekhub.hw2.Force;

/**
 * Created by Администратор on 18.10.2015.
 */
public class Screw implements Gear {
    @Override
    public void consume(Force force) {
        System.out.println("Screw had obtained "+force.getAmount()
                +" units of force, by that reason, Screw is rotates "
                +force.getAmount()*22+" times");
    }
}

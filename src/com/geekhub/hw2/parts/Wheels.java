package com.geekhub.hw2.parts;

import com.geekhub.hw2.Force;

/**
 * Created by Администратор on 18.10.2015.
 */
public class Wheels implements Gear{
    @Override
    public void consume(Force force) {
        System.out.println("Wheels had obtained " + force.getAmount()
                + " units of force, by that reason, wheels is rotate "
                +force.getAmount()*56+" times");
    }
}

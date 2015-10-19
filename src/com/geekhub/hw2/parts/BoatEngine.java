package com.geekhub.hw2.parts;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;

/**
 * Created by Администратор on 18.10.2015.
 */
public class BoatEngine implements Engine {
    @Override
    public Force transform(Energy energy) {
        System.out.println("Boat Engine obtained "+energy.getAmount()
                +"  units of energy, from this it will be "
                +energy.getAmount()*31+" units of force ");
        return new Force(energy.getAmount()*55);
    }
}

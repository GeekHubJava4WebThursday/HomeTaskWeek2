package com.geekhub.hw2.parts;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;

/**
 * Created by Администратор on 18.10.2015.
 */
public class SolarEngine implements Engine {
    @Override
    public Force transform(Energy energy) {
        System.out.println("Solar Engine obtain "+energy.getAmount()
                +"  units of solar energy, from this it will be "
                + energy.getAmount()*88+" units  of energy");
        return new Force(energy.getAmount()*88);
    }
}

package com.geekhub.hw2.parts;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;

/**
 * Created by kvart on 25.10.15.
 */
public class GasEngine implements Engine {


    @Override
    public Force transform(Energy energy) {
        return new Force(energy.getAmount()*2);
    }
}

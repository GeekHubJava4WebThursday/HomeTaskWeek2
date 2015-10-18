package com.geekhub.hw2.parts;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;

/**
 * Created by Вадимка on 18.10.2015.
 */
public class DieselEngine implements Engine {
    @Override
    public Force transform(Energy energy) {
        return new Force(energy.getAmount());
    }
}

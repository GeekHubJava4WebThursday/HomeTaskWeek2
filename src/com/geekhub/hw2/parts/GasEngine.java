package com.geekhub.hw2.parts;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;

/**
 * Class for Gas Engine
 */
public class GasEngine implements Engine{

    @Override
    public Force transform(Energy energy){
        return new Force(energy.getAmount());
    }

}

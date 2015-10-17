package com.geekhub.hw2.vehicle.Boat.boatPart;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.vehicle.Detail;

/**
 * Created by COMRADE on 17.10.2015.
 */
public class BoatEngine implements Engine {

    @Override
    public Force transform(Energy energy, Detail whell) {
        return new Force(energy.getAmount()/energy.getAmount());
    }

}

package com.geekhub.hw2.parts;

import com.geekhub.hw2.Energy;

/**
 * Created by Администратор on 18.10.2015.
 */
public class SolarBattery implements EnergySource {

    public int getCountSolarItems() {
        return countSolarItems;
    }

    private int countSolarItems;

    public SolarBattery(int countSolarItems){
        this.countSolarItems=countSolarItems;
    }

    @Override
    public Energy get() {
        System.out.println("Solar Battery obtain "+this.getCountSolarItems()
                + "  units of solar fuel, from this it will be "
                +this.getCountSolarItems()*72+" units of energy");
        return new Energy(this.getCountSolarItems()*72);
    }
}

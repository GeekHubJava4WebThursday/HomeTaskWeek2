package com.geekhub.hw2;

import com.geekhub.hw2.parts.EnergySource;

public class Energy implements EnergySource {

    private final int amount;

    public Energy(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public Energy get() {
        return null;
    }
}

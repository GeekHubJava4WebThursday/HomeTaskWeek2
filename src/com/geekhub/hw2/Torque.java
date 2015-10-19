package com.geekhub.hw2;

public class Torque {

    private final int amount;

    public Torque(int amount) {
        System.out.println(getClass().toString() + " - creating...");
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}

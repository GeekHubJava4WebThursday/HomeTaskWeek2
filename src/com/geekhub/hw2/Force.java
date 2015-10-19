package com.geekhub.hw2;

public class Force {

    private final int amount;

    public Force(int amount) {
        System.out.println(getClass().toString() + " - creating...");
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}

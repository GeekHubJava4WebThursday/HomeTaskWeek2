package com.geekhub.hw2;

public class Energy {

    private final int amount;

    public Energy(int amount) {
        System.out.println(getClass().toString() + " - creating...");
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}

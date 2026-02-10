package com.tollsystem.model;

public class FastagAccount {

    private double balance;

    public FastagAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deductAmount(double amount) {
        this.balance = this.balance - amount;
    }
}
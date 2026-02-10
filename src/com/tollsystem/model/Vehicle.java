package com.tollsystem.model;

public class Vehicle {

    private String vehicleNumber;
    private FastagAccount fastagAccount;

    public Vehicle(String vehicleNumber, FastagAccount fastagAccount) {
        this.vehicleNumber = vehicleNumber;
        this.fastagAccount = fastagAccount;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public FastagAccount getFastagAccount() {
        return fastagAccount;
    }
}
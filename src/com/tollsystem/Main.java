package com.tollsystem;

import com.tollsystem.model.FastagAccount;
import com.tollsystem.model.Vehicle;

public class Main {

    public static void main(String[] args) {

        FastagAccount fastag = new FastagAccount(500.0);
        Vehicle vehicle = new Vehicle("RJ14AB1234", fastag);

        System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
        System.out.println("FASTag Balance: " + vehicle.getFastagAccount().getBalance());
    }
}
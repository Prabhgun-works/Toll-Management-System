package com.tollsystem;

import com.tollsystem.model.FastagAccount;
import com.tollsystem.model.Vehicle;
import com.tollsystem.service.TollService;
import com.tollsystem.exception.InsufficientBalanceException;
import com.tollsystem.util.FileLogger;

public class Main {

    public static void main(String[] args) {

        FastagAccount fastag = new FastagAccount(80.0);
        Vehicle vehicle = new Vehicle("RJ14AB1234", fastag);

        TollService tollService = new TollService();

        try {
            tollService.processVehicle(vehicle);

            String successMsg = "SUCCESS | Vehicle: " + vehicle.getVehicleNumber()
                    + " | Remaining Balance: " + vehicle.getFastagAccount().getBalance();

            System.out.println("Toll Paid Successfully");
            FileLogger.log(successMsg);

        } catch (InsufficientBalanceException e) {

            String failMsg = "FAILED | Vehicle: " + vehicle.getVehicleNumber()
                    + " | Reason: " + e.getMessage();

            System.out.println("Vehicle Red-Flagged");
            System.out.println("Reason: " + e.getMessage());

            FileLogger.log(failMsg);
        }
    }
}
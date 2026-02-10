package com.tollsystem.service;

import com.tollsystem.model.Vehicle;
import com.tollsystem.exception.InsufficientBalanceException;

public class TollService {

    private static final double TOLL_AMOUNT = 100.0;

    public void processVehicle(Vehicle vehicle) throws InsufficientBalanceException {

        if (vehicle.getFastagAccount() == null) {
            throw new InsufficientBalanceException("FASTag not found");
        }

        double balance = vehicle.getFastagAccount().getBalance();

        if (balance < TOLL_AMOUNT) {
            throw new InsufficientBalanceException("Insufficient FASTag balance");
        }

        vehicle.getFastagAccount().deductAmount(TOLL_AMOUNT);
    }
}
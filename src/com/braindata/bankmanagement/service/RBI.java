package com.braindata.bankmanagement.service;

import com.braindata.bankmanagement.model.Register;

public interface RBI {
    void createAccount(Register register, double balance);
    void displayAllDetails(Register register);
    void depositMoney(Register register, double amount);
    void withdrawal(Register register, double amount);
    void balanceCheck(Register register);
}

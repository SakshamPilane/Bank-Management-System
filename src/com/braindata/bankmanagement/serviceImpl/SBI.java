package com.braindata.bankmanagement.serviceImpl;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.model.Register;
import com.braindata.bankmanagement.service.RBI;

import java.util.HashMap;

public class SBI implements RBI {

    private final HashMap<String, Register> users = new HashMap<>();

    public void registerUser(Register register, String userName, String userPassword, String name, String number, String adharCardNumber, String genderType, int age)
    {
        register.setUserName(userName);
        register.setPassword(userPassword);
        register.setName(name);
        register.setNumber(number);
        register.setAdharCardNumber(adharCardNumber);
        register.setGenderType(genderType);
        register.setAge(age);

        users.put(userName, register);
    }

    public Register loginUser(String userName, String userPassword)
    {
        if (users.containsKey(userName))
        {
            Register user = users.get(userName);
            if (user.getPassword().equals(userPassword))
            {
                return user;
            }
        }
        return null;
    }

    @Override
    public void createAccount(Register register, double balance) {
        if (register.getAccount() != null) {
            System.out.println("Account already exists!");
            return;
        }

        Account account = new Account();
        account.setAccountNumber((int)(Math.random() * 100000));
        account.setAccountBalance(balance);

        register.setAccount(account);

        System.out.println("Account created successfully!");
    }

    @Override
    public void displayAllDetails(Register register) {

        if (register == null) {
            System.out.println("No user logged in!");
            return;
        }

        System.out.println("----- USER DETAILS -----");
        System.out.println("Username: " + register.getUserName());
        System.out.println("Name: " + register.getName());
        System.out.println("Mobile Number: " + register.getNumber());
        System.out.println("Adhar Number: " + register.getAdharCardNumber());
        System.out.println("Gender: " + register.getGenderType());
        System.out.println("Age: " + register.getAge());

        if (register.getAccount() != null) {
            System.out.println("----- ACCOUNT DETAILS -----");
            System.out.println("Account Number: " + register.getAccount().getAccountNumber());
            System.out.println("Balance: " + register.getAccount().getAccountBalance());
        } else {
            System.out.println("No account created yet.");
        }
    }

    @Override
    public void depositMoney(Register register, double amount) {

        if (register == null) {
            System.out.println("No user logged in!");
            return;
        }

        if (register.getAccount() == null) {
            System.out.println("Create account first!");
            return;
        }

        Account account = register.getAccount();

        System.out.println("Current Balance = " + account.getAccountBalance());
        account.setAccountBalance(account.getAccountBalance() + amount);

        System.out.println("Amount Deposited Successfully!");
        System.out.println("Updated Balance = " + account.getAccountBalance());
    }

    @Override
    public void withdrawal(Register register, double amount) {

        if (register == null) {
            System.out.println("No user logged in!");
            return;
        }

        if (register.getAccount() == null) {
            System.out.println("Create account first!");
            return;
        }

        Account account = register.getAccount();

        if (account.getAccountBalance() >= amount) {

            account.setAccountBalance(account.getAccountBalance() - amount);

            System.out.println("Withdrawal Successful!");
            System.out.println("Remaining Balance = " + account.getAccountBalance());

        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    @Override
    public void balanceCheck(Register register) {
        if (register == null)
        {
            System.out.println("No user logged in!");
            return;
        }
        System.out.println("Current Balance Left = " + register.getAccount().getAccountBalance());
    }
}

package com.braindata.bankmanagement.client;

import com.braindata.bankmanagement.model.Register;
import com.braindata.bankmanagement.serviceImpl.SBI;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        SBI bank = new SBI();

        System.out.println("=======================================");
        System.out.println("      WELCOME TO SBI BANK SYSTEM      ");
        System.out.println("=======================================");

        while (true) {

            System.out.println("\n--------------- MAIN MENU ---------------");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    registerUser(input, bank);
                    break;

                case 2:
                    Register loggedInUser = loginUser(input, bank);

                    if (loggedInUser != null) {
                        userMenu(input, bank, loggedInUser);
                    }
                    break;

                case 3:
                    System.out.println("\nThank you for using SBI Bank!");
                    System.out.println("=======================================");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void registerUser(Scanner input, SBI bank) {

        input.nextLine();

        System.out.println("\n========== USER REGISTRATION ==========");

        Register register = new Register();

        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Username: ");
        String userName = input.next();

        System.out.print("Password: ");
        String password = input.next();

        System.out.print("Mobile Number: ");
        String number = input.next();

        System.out.print("Aadhar Number: ");
        String adhar = input.next();

        System.out.print("Gender: ");
        String gender = input.next();

        System.out.print("Age: ");
        int age = input.nextInt();

        bank.registerUser(register, userName, password, name, number, adhar, gender, age);

        System.out.println("\nRegistration Successful ✅");
    }

    private static Register loginUser(Scanner input, SBI bank) {

        System.out.println("\n============== LOGIN ==============");

        System.out.print("Username: ");
        String userName = input.next();

        System.out.print("Password: ");
        String password = input.next();

        Register user = bank.loginUser(userName, password);

        if (user == null) {
            System.out.println("Invalid Credentials ❌");
        } else {
            System.out.println("Login Successful ✅");
        }

        return user;
    }

    private static void userMenu(Scanner input, SBI bank, Register user) {

        while (true) {

            System.out.println("\n------------ ACCOUNT MENU ------------");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Profile");
            System.out.println("6. Logout");
            System.out.print("Enter choice: ");

            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Initial Deposit Amount: ");
                    double balance = input.nextDouble();
                    bank.createAccount(user, balance);
                    break;

                case 2:
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = input.nextDouble();
                    bank.depositMoney(user, depositAmount);
                    break;

                case 3:
                    System.out.print("Enter Withdrawal Amount: ");
                    double withdrawAmount = input.nextDouble();
                    bank.withdrawal(user, withdrawAmount);
                    break;

                case 4:
                    bank.balanceCheck(user);
                    break;

                case 5:
                    bank.displayAllDetails(user);
                    break;

                case 6:
                    System.out.println("Logged Out Successfully 👋");
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
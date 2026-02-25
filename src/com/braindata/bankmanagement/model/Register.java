package com.braindata.bankmanagement.model;

public class Register {
    private String userName;
    private String password;
    private String Name;
    private String number;
    private String adharCardNumber;
    private String GenderType;
    private int Age;
    private Account account;

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return Name;
    }

    public String getNumber() {
        return number;
    }

    public String getAdharCardNumber() {
        return adharCardNumber;
    }

    public String getGenderType() {
        return GenderType;
    }

    public int getAge() {
        return Age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setNumber(String number) {
        number = number;
    }

    public void setAdharCardNumber(String adharCardNumber) {
        adharCardNumber = adharCardNumber;
    }

    public void setGenderType(String genderType) {
        GenderType = genderType;
    }

    public void setAge(int age) {
        Age = age;
    }
}

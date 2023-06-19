/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.italo.trainningmertins.conta;

/**
 *
 * @author italo
 */
public class Account {

    private String accountNumber;
    private String agency;
    private String cvv;
    private boolean special;
    private double specialLimit;
    private double balance;
    private boolean activeLoan;
    private double specialValueUsed;
    private String password;

   
   
    boolean withdraw(double withdrawAmount) {
        // tem saldo na conta?
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            return true;
        } else {
            // não tem saldo na conta
            if (special) {
                // verificar se o limite especial tem saldo
                double limit = specialLimit + balance;
                if (limit >= withdrawAmount) {
                    balance -= withdrawAmount;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;   // não é conta espcial, não tem saldo suficiente
            }
        }
    }

    void deposit(double amountDeposited) {
        balance += amountDeposited;
    }

    void checkBalance() {
        System.out.println("Account Balance: " + balance);
    }

    void checkSpecialLimit() {
        System.out.println("Special Limit: " + specialLimit);
    }

    void checkCvv() {
        System.out.println("CVV: " + cvv);
    }

    void checkAgency() {
        System.out.println("Agency: " + agency);
    }

    void checkAccountNumber() {
        System.out.println("Account Number: " + accountNumber);
    }

    boolean checkOverdraftUse() {
        return balance < 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public boolean isSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }

    public double getSpecialLimit() {
        return specialLimit;
    }

    public void setSpecialLimit(double specialLimit) {
        this.specialLimit = specialLimit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isActiveLoan() {
        return activeLoan;
    }

    public void setActiveLoan(boolean activeLoan) {
        this.activeLoan = activeLoan;
    }

    public double getSpecialValueUsed() {
        return specialValueUsed;
    }

    public void setSpecialValueUsed(double specialValueUsed) {
        this.specialValueUsed = specialValueUsed;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

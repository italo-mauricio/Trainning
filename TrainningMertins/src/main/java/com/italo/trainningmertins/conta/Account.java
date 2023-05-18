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
    
    String accountNumber;
    String agency;
    String cvv;
    boolean special;
    double specialLimit;
    double balance;
    boolean activeLoan;
    double specialValueUsed;
    String password;
    
    boolean withdraw(double withdrawAmount){
        // tem saldo na conta?
        if (balance >= withdrawAmount){
            balance -= withdrawAmount;
            return true;
        }else {
            // não tem saldo na conta
            if (special){
                // verificar se o limite especial tem saldo
                double limit = specialLimit + balance;
                if(limit >= withdrawAmount){
                    balance -= withdrawAmount;
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;   // não é conta espcial, não tem saldo suficiente
            }
        }
    }
    
     void deposit (double amountDeposited){
        balance += amountDeposited;
    }

    void checkBalance(){
        System.out.println("Account Balance: " + balance);
    }

    void checkSpecialLimit(){
        System.out.println("Special Limit: " + specialLimit);
    }

    void checkCvv(){
        System.out.println("CVV: " + cvv);
    }

    void checkAgency(){
        System.out.println("Agency: " + agency);
    }

    void checkAccountNumber(){
        System.out.println("Account Number: " + accountNumber);
    }

    boolean checkOverdraftUse(){
        return balance < 0;
    }
    
}

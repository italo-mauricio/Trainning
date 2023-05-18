/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.italo.trainningmertins.conta;

import java.util.Scanner;

/**
 *
 * @author italo
 */
public class AppAccount {
    
     private static String soon(){
        String soon = "Welcome to Italo Bank!";
        System.out.println(soon);
        return soon;
    }
    
     public static String newPassword() {
        Scanner scan = new Scanner(System.in);
        String newPassword;
        boolean isValid = false;
        
        while (!isValid) {
            System.out.println("Create a new password [numbers and letters]: ");
            newPassword = scan.next();
            
            if (isValidPassword(newPassword)) {
                isValid = true;
                System.out.println("New password successfully registered!");
                return newPassword;
            } else {
                System.out.println("Invalid password! Please use only numbers and letters.");
            }
        }
        
        return null;
    }
    
    private static boolean isValidPassword(String password) {
        // Verifique se a senha contém apenas letras e números
        return password.matches("[a-zA-Z0-9]+");
    }
    
    public static void main(String[] args) {
        Account account = new Account();
        
        Scanner scan = new Scanner(System.in);
        String loanSituacion;
        String situacionSpecial;
        
        soon();
        account.password = newPassword();
        account.accountNumber = "188988";
        account.agency = "123";
        account.cvv = "199";
        account.activeLoan = true;
        account.special = true;
        account.specialLimit = 500.0;
        account.balance = -10;
        account.specialValueUsed = 0;
        boolean aproved = false;
        
        if(account.activeLoan){
            loanSituacion = "Active Loan";
        } else {
            loanSituacion = "Dormant Loan";
        }
        if(account.special){
            situacionSpecial = "Special Account Actived";
        } else {
            situacionSpecial = "Special Account Dormant";
        }
        
        while (!aproved){
            System.out.println("To view your account details, enter your password: ");
            String password = scan.next();
            
            if(password.equals(account.password)){
                aproved = true;
                System.out.println("Password PASS");
                account.checkAccountNumber();
                account.checkAgency();
                account.checkCvv();
                account.checkSpecialLimit();
                account.checkBalance();
                System.out.println("Account Situacion: " + situacionSpecial);
                System.out.println("Loan Situacion: " + loanSituacion);
            }
        }
        
        
    }


}

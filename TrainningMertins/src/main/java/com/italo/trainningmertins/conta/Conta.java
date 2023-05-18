/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.italo.trainningmertins.conta;

/**
 *
 * @author italo
 */
public class Conta {
    
    String numConta;
    String agencia;
    String cvv;
    boolean especial;
    double limiteEspecial;
    double saldo;
    boolean emprestimoAtivo;
    double valorEspecialUsado;
    String senha;
    
    boolean realizarSaque(double quantidadeSaque){
        
        if(saldo >= quantidadeSaque){
            saldo -= quantidadeSaque;
            return true;
        }
    }
    
}

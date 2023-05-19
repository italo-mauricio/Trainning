/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.italo.trainningmertins.exercicios.slide1;

/**
 *
 * @author italo
 */
public class Ex03 {
    public int processaValor(int val){
        int temp1 = val + 20;
        int temp2 = temp1 * 9;
        int temp3 = temp2 + temp1 * 3;
        int temp4 = temp3 % temp2;
        return temp4;
    }
    
    public static void main(String[] args) {
        int temp1 = 15;
        Ex03 exercicio = new Ex03();
        int temp2 = exercicio.processaValor(temp1);
        System.out.printf("Exercio 3: %d\n", temp2);
        
        // resultado: 35 315 420 105
    }
}

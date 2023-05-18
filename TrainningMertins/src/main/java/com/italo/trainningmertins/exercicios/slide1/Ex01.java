/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.italo.trainningmertins.exercicios.slide1;

/**
 *
 * @author italo
 */
public class Ex01 {
    public static void main(String[] args) {
        System.out.printf("\n------ \n");
        int x = 9;
        int y = 26;
       
        label:
        for(int z = 0; z < 6; z++, y-- ){
            if (x > 2){
                x--;
            }
            if (x > 5){
                System.out.printf("%d ", x);
                --x;
                continue label;
            }
            x--;
        }
        // Qual o valor da variável x e da variável y neste ponto? (Use o debug passo a passo)
        System.out.printf("\n------ \n");
    }
}

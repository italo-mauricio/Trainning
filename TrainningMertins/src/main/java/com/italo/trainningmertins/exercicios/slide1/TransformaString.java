/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.italo.trainningmertins.exercicios.slide1;

/**
 *
 * @author italo
 */
public class TransformaString {
    public String inverte(String param){
        StringBuilder sb = new StringBuilder();
        for(int i = param.length()-1; i>=0; i--){
            sb.append(param.charAt(i));      
        }
        return sb.toString(); // qual o maior valor de i?
    }
    public static void main(String[] args) {
        String msg = "abc teste ovo";
        TransformaString ts = new TransformaString();
        System.out.printf("MSG[%s]\n",ts.inverte(msg));
    }
}

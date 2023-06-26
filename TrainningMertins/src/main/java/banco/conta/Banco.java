/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.conta;

import java.util.Scanner;

/**
 *
 * @author italo
 */
public class Banco {
    private static double saldo = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor que você deseja depositar: ");
        double deposito = scan.nextDouble();

        calcular(deposito);
    }

    public static double calcular(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor não pode ser menor do que zero");
        } else {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso");
        }
        return saldo;
    }
}

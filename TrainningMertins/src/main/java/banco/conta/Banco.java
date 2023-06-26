/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.conta;

import banco.conta.Conta.ValorInvalidoException;
import java.util.Scanner;

/**
 *
 * @author italo
 */
public class Banco {
    public static void main(String[] args) {
        Conta conta = new Conta();

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor que você deseja depositar: ");
        double deposito = scan.nextDouble();

        try {
            conta.deposito(deposito);
            System.out.println("Depósito realizado com sucesso");
        } catch (ValorInvalidoException e) {
            System.out.println("Erro ao realizar depósito: " + e.getMessage());
            e.printStackTrace();
        }
    }
}



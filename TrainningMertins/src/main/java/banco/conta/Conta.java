/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.conta;

/**
 *
 * @author italo
 */
public class Conta {

    private String nome;
    private double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void deposito(double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor inválido. O valor do depósito deve ser maior que zero.");
        }

        // Lógica de depósito
        System.out.println("Depósito realizado. Valor: " + valor);
    }

    class ValorInvalidoException extends Exception {

        public ValorInvalidoException(String message) {
            super(message);
        }
    }
}

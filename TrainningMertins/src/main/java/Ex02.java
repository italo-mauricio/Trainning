/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author italo
 */
public class Ex02 {

    public static void main(String[] args) {

        int x = 12;

        int i = 0;

        fim:

        while (i < 10) {

            i++;

            x--;

            if (i == 4) {

                break fim;

            }

        }

        switch (x) { // Qual o valor de x e de i?   x = 8 e i = 4
            case 8:
                System.out.println("8 ");
            case 7:
                System.out.println("7 ");
                /* Este comando será executado? =   sim */
                break;
            default:
                System.out.println("--- Default ---");
               
        }
        /* Em resumo, quando entrar no laço de repetição, o X será decrementado
        e o I será incrementado. Quando i for == a 4, ele irá sair do while, e irá para o switch
        que fará as verificações.*/
    }
}

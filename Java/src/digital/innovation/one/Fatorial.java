package digital.innovation.one;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário
Ex.: 5!= 120 (5x4x3x2x1)
 */

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // abertura da entrada de fluxo de dados através do teclado

        System.out.println("Número: "); // peça um número
        int numero = input.nextInt(); // entrada de dados, neste caso de um int.

        int mulplicacao = 1; // variável para guardar o valor da multiplicação dos valores.

        System.out.println(numero + "!= "); // frase ilustrativo para indicar o fatorial

        //para: variável i = numero, até i maior que 0, diminuimos 1 ao valor de i a cada loop.

        for (int i = numero; i > 0; i--) {

            mulplicacao += i; //multiplicamos os valores de i e armazenamos na variável multiplicação

            //criamos esta estrutura condicional para imprimir o resultado conforme foi solicitado no exercício
            if (i != 1) { // se o i tiver o valor diferente de 1
                System.out.print(i + "."); // imprima o valor do i seguido de "."

            } else { // se não (se o i tiver o valor igual a 1)
                // imprima o valor do i seguido do sinal "=" e o resultado da mulplicação
                System.out.println(i + "=" + (mulplicacao));
            }

        }
    }
}

package digital.innovation.one;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números ímpares.
 */

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // abertura da entrada de fluxo de dados através do teclado

        System.out.println("Quantidade de números: "); // peça número
        int quantidadeDeNumeros = input.nextInt(); // Entrada de dados, neste caso de um int.

        // variáveis para guardar a quantidade dos números pares e ímpares
        int quantPar = 0, quantImpar = 0;

        int count = 0; // controla o loop

        //loop

        do { // primeiro, independente do que tem no while, faça:
            System.out.println("Número: "); // peça um número
            int numero = input.nextInt(); // entrada de dados, neste caso de um int.

            //se o resto da divisão do número por 2 (numero/2) for 0,
            if (numero % 2 == 0) quantPar++; //acrescente o valor 1 a variável quantPar.
            // caso contrário, o número digitando é ímpar
            else quantImpar++; // adicione o valor 1 a variável quantImpar

            count ++; //some o valor 1 ao contador até que invalide a condição do loop. (count < quantidadeDeNumeros)

        } while (count < quantidadeDeNumeros); // faça o loop caso o valor do contador seja menor que a quantidade de números

        // imprimindo a quantidade de números pares digitados e números ímpares digitados
        System.out.println("Quantidade números pares: " + quantPar + " / Quantidade números ímpares: " + quantImpar);
    }
}

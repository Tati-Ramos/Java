package digital.innovation.one;


/*
Faça um programa que leia 5 números
e informe o maior número e a méadia desses números
 */

import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // abertura da entrada de fluxo de dados através do teclado

        // variáveis
        double maior = 0; // guardar o maior número
        double soma = 0; // guarda a soma
        double media; // guarda a média

        int count = 0; // controla o loop
        // loop
        do {
            System.out.println("Número: "); // peça um número
           double numero = input.nextDouble(); // Entrada de dados, neste caso de um Double.

            if (numero > maior) { // Caso o valor que o usuário digitou seja maior que o valor armazenado na variável maior
                maior = numero; // atribua o valor desde número a variável maior

            }

            soma = soma + numero; // some o número informado pelo usuário com variável soma (independente do valor)

            count = count + 1; // some o valor 1 ao contador, até que invalide a condição do loop. (count < 5)
        } while (count < 5); // enquanto o contador tiver o valor menor que 5

            media = soma/5; // faça o cálculo da média. (soma/quantidade)

        // imprimindo o maior número digitados e a média dos mesmos
        System.out.println("Maior: " + maior + " - Média: " + media);

    }
}

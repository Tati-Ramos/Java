package digital.innovation.one;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue
pedindo até que o usuário informe um valor válido
 */
public class Nota {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // abertura da entrada de fluxo de dados através do teclado

        System.out.println("Nota de 0 a 10: "); // peça uma nota de 0 a 10
         int nota = input.nextInt(); // Entrada de dados, neste caso de um int

        while (nota <0 || nota >10) { // enquanto o valor da nota for menor que 0 ou maior que 10.
            System.out.println("Nota Inválida! Digite novamente: "); // mensagem que o valor é inválido
            nota = input.nextInt(); // entrada de dados, neste caso de um int
        }
        System.out.println("Nota: " + nota); // imprimindo a nota válida
    }
}

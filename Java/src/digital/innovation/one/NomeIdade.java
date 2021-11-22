package digital.innovation.one;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores, o primeiro representando
o nome do aluno e o segundo  representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
 */

public class NomeIdade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variáveis
        String nome; // armazena o nome
        int idade = 0; // armazena a idade

        while (true ) { // enquanto o loop for verdadeiro

            System.out.println("Nome: "); // peça o nome
            nome = input.next(); // armazena esse nome na variável

            if (nome.equals("0")) // caso o nome igual a "0"
                break; // interrompa o programa

            System.out.println("Idade: "); // peça a idade
            idade = input.nextInt(); // armazena a idade na variável
        }

        // imprima o nome e a idade
        System.out.println("Nome: " + nome + " - idade: " + idade);


    }
}

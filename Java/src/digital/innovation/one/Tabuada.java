package digital.innovation.one;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada
de qualquer número inteiro entre 1 a 10. O usuário deve informar
de qual número ele deseja ver a tabuada.

A saída deve ser conforme o exemplo abaixo:

5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
 */
public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Número: "); //peça um número
        int numero = input.nextInt(); // entrada de dados, neste caso de um int.

        System.out.println("Tabuada de:  " + numero + ":"); // frase ilustrativa para indicar a tabuada

        //para: variável i = 0; até i menor ou igual a 10, adicionando 1 ao valor de i a cada loop.

        for (int i = 0; i <=10; i++){

            //número escolhido pelo usuário "X" o valor de i "=" a multiplicação do número com o i.
            System.out.println(numero + " X " + i + " = " + (numero * i));

        }

    }
}

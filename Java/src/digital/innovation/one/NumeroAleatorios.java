package digital.innovation.one;

import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-se num vetor.
Ao final mostre os números e seus sucessores.
 */
public class NumeroAleatorios {
    public static void main(String[] args) {
        Random random = new Random(); //classe para gerar números aleatórios

        int[] numeros = new int[20]; // array com 20 posições

        //para: variável i = numero, até i menor que o tamanho do array, acrescentamos 1 ao valor de i a cada loop.
        for (int i = 0; i < numeros.length; i++) {
            int numero = random.nextInt(100); //pegando um número aleatório entre 0 e 100.
            numeros[i] = numero; //atribuindo esse valor ao elemento na respectiva posição do array números.

        }
        System.out.print("Numeros: "); //frase ilustrativa

        //loop for-each
        for (int numero : numeros) { //para cada número dentro do array de números
            System.out.print(numero + " "); //imprima o número
        }
        System.out.println("\n----------------------------------------------------------------------"); //separar os vetores

        System.out.print("Sucessores: "); //frase ilustrativa
        for (int numero : numeros) { // para cada numero dentro do array de números
            System.out.print((numero + 1) + " ");

        }

        System.out.println("\n----------------------------------------------------------------------"); //separar os vetores

        System.out.print("Antecessores: "); //frase ilustrativa
        for (int numero : numeros) { // para cada numero dentro do array de números
            System.out.print((numero - 1) + " ");
        }
    }
}
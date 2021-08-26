package tutorial;

public class ExemploVar {
    public static void main (String [] args){
        String name = "Tatiane";

        int idade = 26;

        int anoNasc;
        anoNasc = 1995;

        int peso = 54;
        peso = 52; // meu peso agora é 52

        /*
        Final Variables
However, you can add the final keyword if you don't want others (or yourself) to
 overwrite existing values (this will declare the variable as "final" or "constant",
  which means unchangeable and read-only):
         */

        final  int dianasc = 12;
        // dianasc = 20; // will generate an error: cannot assign a value to a final variable

        System.out.println("Meu nome é: " +name);
        System.out.println("Tenho " +idade + " anos");
        System.out.println("Nasci em: " +anoNasc);
        System.out.println("Peso: "+peso + "Kg");
        System.out.println("Nasci no dia: " +dianasc + " de fevereiro");


        //Examples

        int myNum = 5; // Integer (whole number)
        float myFloatNum = 5.99f; // Floating point number
        char myLetter = 'T'; // Character
        boolean myBool = true; // Boolean
        String myText = "Hello"; // String

        int x = 50;
        int y = 20;
        System.out.println("O total é " +x+y);

        System.out.println(myNum +" --- " + myFloatNum +" --- " + myLetter + " --- " + myBool + "---" + myText);

        // mais organizado

        String firstName = "Tatiane ";
        String lastName = "Ramos";
        String fullName = firstName + lastName;
        int age = 26;
        float altura = 1.52f;
        char sexo = 'F';
        boolean dados = true;
    System.out.println("Meu nome completo é: " +fullName + ". Tenho " + age + " anos."
     + " Minha altura é: " +altura + " Meu sexo é: " +sexo + ". Todos os meus dados são: " +dados);

    }



}



/*
Variables are containers for storing data values.

In Java, there are different types of variables, for example:

String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false

 */
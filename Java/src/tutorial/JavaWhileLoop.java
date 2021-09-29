package tutorial;

public class JavaWhileLoop {
    public static void main(String[] args) {

//Java While Loop
//The while loop loops through a block of code as long as a specified condition is true:

        int i = 0;
        while (i < 5) { //the code in the loop will run, over and over again, as long as a variable (i) is less than 5
            System.out.println(i);
            i++; //Do not forget to increase the variable used in the condition, otherwise the loop will never end!
        }

//The Do/While Loop
//The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.

        int a = 0;
        do {
            System.out.println(a);
            a++;
        }
        while (a < 5); //The loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested



    }

}

/*
Loops
Loops can execute a block of code as long as a specified condition is reached.
Loops are handy because they save time, reduce errors, and they make code more readable.
 */
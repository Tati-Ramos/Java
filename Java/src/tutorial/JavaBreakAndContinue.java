package tutorial;

public class JavaBreakAndContinue {
    public static void main(String[] args) {
//This example stops the loop when i is equal to 4:
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);

        }
//This example skips the value of 4:
        for (int a = 0; a < 10; a++) {
            if (a == 4) {
                continue;
            }
            System.out.println(a);
        }
//You can also use break and continue in while loops:
      //Break Example
        int b = 0;
        while (b < 10) {
            System.out.println(b);
            b++;
            if (b == 4) {
                break;
            }
        }
     //Continue Example
        int c = 0;
        while (c < 10) {
            if (c == 4) {
                c++;
                continue;
            }
            System.out.println(c);
            c++;
        }
    }
}

/*
Java Break
You have already seen the break statement used in an earlier chapter of this tutorial.
It was used to "jump out" of a switch statement.

The break statement can also be used to jump out of a loop.

Java Continue
The continue statement breaks one iteration (in the loop),
if a specified condition occurs, and continues with the next iteration in the loop.
 */
package tutorial;

public class ConditionsAndIfStatements {
    public static void main(String[] args) {
        if (20 > 18) { //Use the if statement to specify a block of Java code to be executed if a condition is true.
            System.out.println("20 is greater than 18");
        }

        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }

        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else { // Use the else statement to specify a block of code to be executed if the condition is false.
            System.out.println("Good evening.");
        }
                // Outputs "Good evening."

        int timeOne = 22;
        if (timeOne < 10) {
            System.out.println("Good morning.");
        } else if (timeOne < 20) { //Use the else if statement to specify a new condition if the first condition is false.
             System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
                // Outputs "Good evening."

        /*
        Short Hand If...Else (Ternary Operator)
        There is also a short-hand if else, which is known as
        the ternary operator because it consists of three operands.
        It can be used to replace multiple lines of code with a single line
         */

        int timeTwo = 20;
        String result = (timeTwo < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

    }
}

/*
Java supports the usual logical conditions from mathematics:

Less than: a < b
Less than or equal to: a <= b
Greater than: a > b
Greater than or equal to: a >= b
Equal to a == b
Not Equal to: a != b

Java has the following conditional statements:

Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed



 */
package classes;

public class JavaExceptions {

//This will generate an error, because myNumbers[10] does not exist.
    public static void main(String[ ] args) {
//        int[] myNumbers = {1, 2, 3};
//        System.out.println(myNumbers[10]); // error!

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }finally {//The finally statement lets you execute code, after try...catch, regardless of the result
            System.out.println("The 'try catch' is finished.");
        }
    }
    }



/*
Java Exceptions
When executing Java code, different errors can occur: coding errors made by the programmer,
 errors due to wrong input, or other unforeseeable things.

When an error occurs, Java will normally stop and generate an error message.
The technical term for this is: Java will throw an exception (throw an error).
 */


/*
Java try and catch
The try statement allows you to define a block of code to be tested for errors while it is being executed.

The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

The try and catch keywords come in pairs:

Syntax

try {
  //  Block of code to try
}
catch(Exception e) {
  //  Block of code to handle errors
}
 */
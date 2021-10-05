package classes;

import java.util.ArrayList;


//Use a lamba expression in the ArrayList's forEach() method to print every item in the list:
public class JavaLambdaExpressions {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );
    }

}

/*
Java Lambda Expressions

Lambda Expressions were added in Java 8.

A lambda expression is a short block of code which takes in parameters and returns a value.
Lambda expressions are similar to methods, but they do not need a name and they can be implemented
right in the body of a method.

Syntax

The simplest lambda expression contains a single parameter and an expression:

parameter -> expression

To use more than one parameter, wrap them in parentheses:

(parameter1, parameter2) -> expression

Expressions are limited. They have to immediately return a value, and they cannot contain variables,
 assignments or statements such as if or for. In order to do more complex operations,
  a code block can be used with curly braces. If the lambda expression needs to return a value,
  then the code block should have a return statement.

(parameter1, parameter2) -> { code block }
 */


package examples;

//Create an ArrayList to store numbers (add elements of type Integer):

import java.util.ArrayList;

public class Numeros {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }
        System.out.println("--------");
        for (int i = 0; i < myNumbers.size(); i++) {
            System.out.println(myNumbers.get(i));

        }
    }

}


/*
Other Types
Elements in an ArrayList are actually objects. In the examples above, we created elements (objects) of type "String".
Remember that a String in Java is an object (not a primitive type). To use other types, such as int,
 you must specify an equivalent wrapper class: Integer. For other primitive types, use:
 Boolean for boolean, Character for char, Double for double, etc.
 */
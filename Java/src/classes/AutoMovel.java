package classes;

import java.util.ArrayList; // import the ArrayList class

public class AutoMovel {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object

//The ArrayList class has many useful methods. For example, to add elements to the ArrayList, use the add() method:

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

//To find out how many elements an ArrayList have, use the size method:
        System.out.println(cars.size());

        System.out.println(cars);

//To access an element in the ArrayList, use the get() method and refer to the index number:
        System.out.println(cars.get(0));


//To modify an element, use the set() method and refer to the index number:
        cars.set(0, "Opel");
        System.out.println(cars);
        System.out.println(cars.get(0));

//To remove an element, use the remove() method and refer to the index number:
        cars.remove(3);
        System.out.println(cars.size());
        System.out.println(cars);

//To remove all the elements in the ArrayList, use the clear() method:
        cars.clear();
        System.out.println(cars.size());
        System.out.println(cars);





    }

}


/*
Java ArrayList
The ArrayList class is a resizable array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be
modified (if you want to add or remove elements to/from an array, you have to create a new one).
While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different:

Example
Create an ArrayList object called cars that will store strings:

import java.util.ArrayList; // import the ArrayList class

ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object


Remember: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.


 */
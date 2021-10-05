package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

//Create a HashSet object called cars that will store strings:
public class JavaHashSet {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);

//To find out how many items there are, use the size method:
        System.out.println(cars.size());

//To check whether an item exists in a HashSet, use the contains() method:
        System.out.println("Contém o carro Mazda? " +cars.contains("Mazda"));

//To remove an item, use the remove() method:
        cars.remove("Volvo");
        System.out.println(cars);
        System.out.println("--------------------------------------------------------------------------");

//Loop Through a HashSet
//Loop through the items of an HashSet with a for-each loop:

        for (String i: cars){
            System.out.println("Usando o for: " +i);
        }
        System.out.println("--------------------------------------------------------------------------");

//To remove all items, use the clear() method:

        cars.clear();
        System.out.println("A lista está vazia: " +cars);

    }
}

/*
Note: In the example above, even though BMW is added twice it only appears once in the set because
 every item in a set has to be unique.
 */

/*
A HashSet is a collection of items where every item is unique, and it is found in the java.util package.
 */
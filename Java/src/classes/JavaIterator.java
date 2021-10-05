package classes;

import java.util.ArrayList;
import java.util.Iterator;

//The iterator() method can be used to get an Iterator for any collection:
public class JavaIterator {
    public static void main(String[] args) {

        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());
        System.out.println("----------------------");

//To loop through a collection, use the hasNext() and next() methods of the Iterator:
        while(it.hasNext()) {
            System.out.println("Com while: " +it.next());
        }
    }

}


/*
An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
 It is called an "iterator" because "iterating" is the technical term for looping.

To use an Iterator, you must import it from the java.util package.
 */
package examples;

import java.util.ArrayList;
import java.util.Collections;

/*
Another useful class in the java.util package is the Collections class, which include
the sort() method for sorting lists alphabetically or numerically:
 */
public class OrdemAlfabeticaArray {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }
    }

}


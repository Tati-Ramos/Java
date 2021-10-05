package examples;

import java.util.ArrayList;

/*
Loop Through an ArrayList

Loop through the elements of an ArrayList with a for loop,
 and use the size() method to specify how many times the loop should run:
 */

public class Veiculos {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));

        }
        System.out.println("--------");
//You can also loop through an ArrayList with the for-each loop:
        for (String i : cars) {
            System.out.println(i);
        }
    }
}

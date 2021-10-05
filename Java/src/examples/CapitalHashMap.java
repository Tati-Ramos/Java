package examples;

import java.util.HashMap;

public class CapitalHashMap {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        System.out.println("---------------------------------------------------------------------");

        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        System.out.println("--------------------");

        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
        System.out.println("-----------------------------");

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + "   value: " + capitalCities.get(i));
        }
    }



}

/*
Loop Through a HashMap

Loop through the items of a HashMap with a for-each loop.

Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values.
 */

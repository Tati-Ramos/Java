package examples;

import java.util.HashMap;

//Create a HashMap object called people that will store String keys and Integer values:
public class OtherTypesHashMap {
    public static void main(String[] args) {

        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();


        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }
    }
}

/*
Keys and values in a HashMap are actually objects. In the examples above, we used objects of type "String".
 Remember that a String in Java is an object (not a primitive type). To use other types, such as int,
  you must specify an equivalent wrapper class: Integer.
 For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:
 */
package classes;

 enum Level {
/*
To create an enum, use the enum keyword (instead of class or interface),
 and separate the constants with a comma. Note that they should be in uppercase letters:
 */
  LOW,
  MEDIUM,
  HIGH
}
 class MainTwo {
 public static void main(String[] args) {
  Level myVar = Level.MEDIUM; //You can access enum constants with the dot syntax

  System.out.println(myVar);

     for (Level myOpt : Level.values()) {
         System.out.println(myOpt);
     }
 }


}

/*
Enums

Enum is short for "enumerations", which means "specifically listed".

An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

To create an enum, use the enum keyword (instead of class or interface),
 and separate the constants with a comma. Note that they should be in uppercase letters:
 */

/*

Enum inside a Class

You can also have an enum inside a class:

Example

public class Main {
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) {
    Level myVar = Level.MEDIUM;
    System.out.println(myVar);
  }
}

The output will be:

MEDIUM
 */


/*
Difference between Enums and Classes
An enum can, just like a class, have attributes and methods.
The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

Why And When To Use Enums?

Use enums when you have values that you know aren't going to change,
 like month days, days, colors, deck of cards, etc.
 */
package classes;

// Create a JavaConstructors class
public class JavaConstructors {

    int x;  // Create a class attribute

    // Create a class constructor for the JavaConstructors class
    public JavaConstructors(int y) {
        x = y;  // Set the initial value for the class attribute x
    }

    public static void main(String[] args) {
        JavaConstructors myObj = new JavaConstructors(5); // Create an object of class Main (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x
    }
}

// Outputs 5



/*
Java Constructors
A constructor in Java is a special method that is used to initialize objects.
 The constructor is called when an object of a class is created.
  It can be used to set initial values for object attributes:
 */

/*
Note that the constructor name must match the class name, and it cannot have a return type (like void).

Also note that the constructor is called when the object is created.

All classes have constructors by default: if you do not create a class constructor yourself,
 Java creates one for you.
However, then you are not able to set initial values for object attributes.
 */

/*
Constructor Parameters
Constructors can also take parameters, which is used to initialize attributes.

The following example adds an int y parameter to the constructor.
 Inside the constructor we set x to y (x=y). When we call the constructor,
  we pass a parameter to the constructor (5), which will set the value of x to 5:
 */
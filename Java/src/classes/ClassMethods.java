package classes;

public class ClassMethods {
    static void myMethod() { //Create a method named myMethod()
        System.out.println("Hello World!");
    }

    public static void main(String[] args) { //Inside main, call myMethod():
        myMethod(); // Outputs "Hello World!"

    }
}


/*
myMethod() prints a text (the action), when it is called.
 To call a method, write the method's name followed by two parentheses () and a semicolon;


 Static vs. Non-Static
You will often see Java programs that have either static or public attributes and methods.

In the example above, we created a static method, which means that it can be accessed without creating
 an object of the class, unlike public, which can only be accessed by objects:


 */
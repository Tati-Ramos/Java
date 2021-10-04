package classes;

//An abstract class can have both abstract and regular methods:

// Abstract class
abstract class JavaAbstraction {

    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }

//To access the abstract class, it must be inherited from another class.
// Let's convert the Animal class we used in the Polymorphism chapter to an abstract class:

    public static void main(String[] args) {
       // JavaAbstraction myObj = new JavaAbstraction(); // will generate an error

    }

}


/*
Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces
(which you will learn more about in the next chapter).

The abstract keyword is a non-access modifier, used for classes and methods:

Abstract class: is a restricted class that cannot be used to create objects
 (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body.
The body is provided by the subclass (inherited from).
 */
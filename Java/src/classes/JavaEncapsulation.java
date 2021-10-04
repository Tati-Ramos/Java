package classes;

/*
Example explained
The get method returns the value of the variable name.

The set method takes a parameter (newName) and assigns it to the name variable.
The this keyword is used to refer to the current object.
 */

public class JavaEncapsulation {
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        JavaEncapsulation  twoObj = new  JavaEncapsulation ();
        twoObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(twoObj.getName());
    }

}


/*
Encapsulation
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
To achieve this, you must:

declare class variables/attributes as private
provide public get and set methods to access and update the value of a private variable


Get and Set
You learned from the previous chapter that private variables can only be accessed within the same class (an outside class has no access to it). However, it is possible to access them if we provide public get and set methods.

The get method returns the variable value, and the set method sets the value.
 */

/*
Why Encapsulation?
Better control of class attributes and methods
Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
Flexible: the programmer can change one part of the code without affecting other parts
Increased security of data

 */
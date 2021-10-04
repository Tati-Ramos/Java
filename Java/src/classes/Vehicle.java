package classes;

//Java Inheritance

//In the example below,
// the Car class (subclass) inherits the attributes and methods from the Vehicle class (superclass):

class Vehicle {

/*
We set the brand attribute in Vehicle to a protected access modifier.
If it was set to private, the Car class would not be able to access it.
 */
    protected String brand = "Ford";        // Vehicle attribute
    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";    // Car attribute
    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}


/*
Java Inheritance (Subclass and Superclass)
In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from
To inherit from a class, use the extends keyword.

Why And When To Use "Inheritance"?
- It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class

The final Keyword
If you don't want other classes to inherit from a class, use the final keyword:
If you try to access a final class, Java will generate an error:

final class Vehicle {
  ...
}

class Car extends Vehicle {
  ...
}
 */
package examples;

// Code from filename: ModifierAbstract.java
// abstract class
    abstract class ModifierAbstract {
        public String fname = "John";
        public int age = 24;
        public abstract void study(); // abstract method
    }

    // Subclass (inherit from ModifierAbstract)
    class Student extends ModifierAbstract{
        public int graduationYear = 2018;
        public void study() { // the body of the abstract method is provided here
            System.out.println("Studying all day long");
        }
    }
// End code from filename: ModifierAbstract.java

    // Code from filename: Second.java
    class Second {
        public static void main(String[] args) {
            // create an object of the Student class (which inherits attributes and methods from Main)
            Student myObj = new Student();

            System.out.println("Name: " + myObj.fname);
            System.out.println("Age: " + myObj.age);
            System.out.println("Graduation Year: " + myObj.graduationYear);
            myObj.study(); // call abstract method
        }
    }


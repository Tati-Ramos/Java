package examples;

public class ClassAttributesTwo {
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        ClassAttributesTwo myObj = new ClassAttributesTwo();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}

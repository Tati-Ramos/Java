package classes;

public class ClassAttributes {
/*
In the previous chapter, we used the term "variable" for x in the example (as shown below).
 It is actually an attribute of the class. Or you could say that class attributes are variables within a class:
 */
    int x = 5;

//If you don't want the ability to override existing values, declare the attribute as final:
   final int y = 3;

    public static void main(String[] args) {
        ClassAttributes myObj = new ClassAttributes();

        System.out.println(myObj.x);
        System.out.println(myObj.y);

        ClassAttributes myObjMod = new ClassAttributes();//Modify Attributes
        myObjMod.x = 40; // x is now 40
        //myObj.y = 20; // // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);
        System.out.println(myObj.y);
    }
}


/*
Another term for class attributes is fields.

Accessing Attributes
You can access attributes by creating an object of the class, and by using the dot syntax (.):

The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).

The final keyword is called a "modifier". You will learn more about these in the Java Modifiers Chapter.

 */


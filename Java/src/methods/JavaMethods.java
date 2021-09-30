package methods;

public class JavaMethods {
    //In the following example, myMethod() is used to print a text (the action), when it is called:
    static void myMethod() {
        System.out.println("I just got executed!");
    }
//A method can also be called multiple times:
    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
    }
}

// I just got executed!
// I just got executed!
// I just got executed!
/*
Example Explained
myMethod() -> is the name of the method
static -> means that the method belongs to the Main class and not an object of the Main class.
void -> means that this method does not have a return value.
 */






/*
A method is a block of code which only runs when it is called.

You can pass data, known as parameters, into a method.

Methods are used to perform certain actions, and they are also known as functions.

Why use methods? To reuse code: define the code once, and use it many times.

Call a Method
To call a method in Java, write the method's name followed by two parentheses () and a semicolon;
 */
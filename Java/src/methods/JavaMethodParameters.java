package methods;

public class JavaMethodParameters {
/*
The following example has a method that takes a String called fname as parameter.
 When the method is called, we pass along a first name, which is used inside the method to print the full name and age:
 */
//Multiple Parameters
    static void myMethod(String fname, int age) {
        System.out.println(fname + " Refsnes" + " is " + age);
    }

    /*
The void keyword, used in the examples above, indicates that the method should not return a value.
 If you want the method to return a value, you can use a primitive data type (such as int, char, etc.)
  instead of void, and use the return keyword inside the method:
*/
    static int myMethod(int x, int y) {
        return x + y;

    }
//When a parameter is passed to the method, it is called an argument.
// So, from the example above: fname is a parameter, while Liam, Jenny and Anja are arguments.
    public static void main(String[] args) {
        myMethod("Liam", 25);
        myMethod("Jenny", 30);
        myMethod("Anja", 40);

        System.out.println(myMethod(5,3)); //Outputs 8 (5 + 3)

//You can also store the result in a variable (recommended, as it is easier to read and maintain):
        int z = myMethod(10,20);
        System.out.println(z);


// Liam Refsnes is 5
// Jenny Refsnes is 8
// Anja Refsnes  is 31

    }







}


/*
Parameters and Arguments
Information can be passed to methods as parameter. Parameters act as variables inside the method.

Parameters are specified after the method name, inside the parentheses.
You can add as many parameters as you want, just separate them with a comma.
 */
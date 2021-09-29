package tutorial;

import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {

/*
We have now declared a variable that holds an array of strings.
 To insert values to it, we can use an array literal
  - place the values in a comma-separated list, inside curly braces:
 */


        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(Arrays.toString(cars));

        //To create an array of integers, you could write:

        int[] myNum = {10, 20, 30, 40};
        System.out.println(Arrays.toString(myNum));

//You access an array element by referring to the index number.
//This statement accesses the value of the first element in cars:

        String[] carros = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(carros.length); // Outputs 4
        carros[0] = "Opel"; //Change an Array Element
        System.out.println(carros[0]); //Array indexes start with 0: [0] is the first element. [1] is the second element, etc.
        // Outputs Volvo


/*
Loop Through an Array
You can loop through the array elements with the for loop, and use the length property to specify how many times the loop should run.

The following example outputs all elements in the cars array:
 */

        String[] car= {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }

/*
Loop Through an Array with For-Each
There is also a "for-each" loop, which is used exclusively to loop through elements in arrays:
The following example outputs all elements in the cars array, using a "for-each" loop:
 */
        String[] carro = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : carro) {
            System.out.println(i);
        }

        /*
The example above can be read like this: for each String element
 (called i - as in index) in cars, print out the value of i.

If you compare the for loop and for-each loop, you will see that the for-each method is easier to write,
it does not require a counter (using the length property), and it is more readable.
         */

/*
Multidimensional Arrays
A multidimensional array is an array of arrays.

To create a two-dimensional array, add each array within its own set of curly braces:
 */
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(Arrays.deepToString(myNumbers));

        int[][] myNumber = { {9, 8, 6, 1}, {4, 3, 2} };
        int x = myNumber[1][2];
        System.out.println(x); // Outputs 2

/*
We can also use a for loop inside another for loop to get the elements of a two-dimensional array
(we still have to point to the two indexes):
 */

                int[][] myNumb = { {1, 2, 3, 4}, {5, 6, 7} };
                for (int i = 0; i < myNumb.length; ++i) {
                    for(int j = 0; j < myNumb[i].length; ++j) {
                        System.out.println(myNumb[i][j]);
                    }
                }
            }
        }




/*
Arrays are used to store multiple values in a single variable,
 instead of declaring separate variables for each value.

To declare an array, define the variable type with square brackets:

String[] cars;
 */
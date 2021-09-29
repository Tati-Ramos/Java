package tutorial;

public class TextStrings {
    public static void main(String[] args) {

        String greeting = "Hello";
        System.out.println(greeting);

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length()); //the length of a string can be found with the length() method

        String text = "Hello World";
        System.out.println(text.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(text.toLowerCase());   // Outputs "hello world"

    //The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):

        String texto = "Please locate where 'locate' occurs!";
        System.out.println(texto.indexOf("locate")); // Outputs 7

        /*  Java counts positions from zero.
        0 is the first position in a string, 1 is the second, 2 is the third ...*/

    //String Concatenation
        //The + operator can be used between strings to combine them. This is called concatenation:

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName); //Note that we have added an empty text (" ") to create a space between firstName and lastName on print.

        String firstNam = "Tati ";
        String lastNam = "Ramos";
        System.out.println(firstNam.concat(lastNam)); //You can also use the concat() method to concatenate two strings

        String example = "We are the so-called \"Vikings\" from the north.";
        System.out.println(example);

        String exampleSingle = "It\'s alright.";
        System.out.println(exampleSingle);

        String exampleBack = "The character \\ is called backslash.";
        System.out.println(exampleBack);

        String newLine = "Hello\nWorld!";
        System.out.println(newLine);

        String carriageReturn = "Hello\rWorld!";
        System.out.println(carriageReturn);

        String exTab = "Hello\tWorld!";
        System.out.println(exTab);

        String backSpace = "Hel\blo World!";
        System.out.println(backSpace);

        String formFeed = "Hello \fWorld!";
        System.out.println(formFeed);

     //Adding Numbers and Strings

    /*
    WARNING!

    Java uses the + operator for both addition and concatenation.

    Numbers are added. Strings are concatenated.
     */

        int x = 10;
        int y = 20;
        int z = x + y;      // z will be 30 (an integer/number)
        System.out.println(z);

        String a = "10";
        String b = "20";
        String c = a + b;   // z will be 1020 (a String)
        System.out.println(c);

        String d = "10";
        int e = 20;
        String f = d + e;   // z will be 1020 (a String)
        System.out.println(f);

    }
    }







/*
Special Characters
Because strings must be written within quotes, Java will misunderstand this string, and generate an error:

String txt = "We are the so-called "Vikings" from the north.";

The solution to avoid this problem, is to use the backslash escape character.

The backslash (\) escape character turns special characters into string characters:

Escape character  Result 	Description
    \'	            '	    Single quote
    \"	            "	    Double quote
    \\	            \	    Backslash


Six other escape sequences are valid in Java:

Code	Result
\n	    New Line
\r	    Carriage Return
\t	    Tab
\b	    Backspace
\f	    Form Feed

 */
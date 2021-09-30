package examples;

public class ClassAttributesOne {
//Change the value of x to 25 in myObj2, and leave x in myObj1 unchanged:

    int x = 5;

    public static void main(String[] args) {
        ClassAttributesOne myObj1 = new ClassAttributesOne();  // Object 1
        ClassAttributesOne myObj2 = new ClassAttributesOne();  // Object 2
        myObj2.x = 25;
        System.out.println(myObj1.x);  // Outputs 5
        System.out.println(myObj2.x);  // Outputs 25
    }
}

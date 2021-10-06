package filehandling;

import java.io.File;
import java.io.IOException;

public class JavaMathMethods {
    public static void main(String[] args) {
        try {
            File otherObj = new File("mathmethods.txt");

            if (otherObj.createNewFile()) {
                System.out.println("File created: " + otherObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (
                IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

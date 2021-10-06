package filehandling;

import java.io.File;
import java.io.IOException;

public class JavaReservedKeywords {
    public static void main(String[] args) {
        try {
            File novoObj = new File("reservekeywords.txt");

            if (novoObj.createNewFile()) {
                System.out.println("File created: " + novoObj.getName());
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


import java.util.Scanner;

// Section 3, lectures 21 & 22: Data types conversions in Java.
public class DataTypeConversions {
    public static void main(String args[]) {
        // Convert from (valid) String to int
        String age = "20";
        System.out.println("age = " + (Integer.parseInt(age) + 1));
        
        // Convert from (valid) String to double
        String piValue = "3.141592";
        System.out.println("piValue = " + (Double.parseDouble(piValue) + 0.5));
        
        // Now the double value comes from the console input
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your height: ");
        double height = Double.parseDouble(console.nextLine());
        System.out.println("height = " + height);
        
        // Convert int to String
        String aesMaxKeySize = String.valueOf(256);
        System.out.println("aesMaxKeySize = " + aesMaxKeySize);
        
        // Get a single char from a String and save it in a char variable
        // Important note: String is a Class, NOT a primitive data type,
        // char IS a primitive data type.
        char justOneChar = "Hello".charAt(0);
        System.out.println("justOneChar = " + justOneChar);
        
        System.out.print("Enter your favorite character: ");
        justOneChar = console.nextLine().charAt(0);
        System.out.println("justOneChar = " + justOneChar);
        
    }
}

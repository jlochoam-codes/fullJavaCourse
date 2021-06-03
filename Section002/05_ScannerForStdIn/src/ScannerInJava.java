
import java.util.Scanner;

// Section 2, lecture 13: Scanner class in Java.
public class ScannerInJava {
    public static void main(String args[]) {
        System.out.print("Tell me your name: ");
        Scanner fromConsole = new Scanner(System.in);
        String user = fromConsole.nextLine();
        System.out.print("Tell me your title: ");
        String title = fromConsole.nextLine();
        System.out.println("Hello, " + title + " " + user);
    }
}


import java.util.Scanner;

// Section 4, assignment 5: The greatest of two numbers
public class GreatestNumber {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        System.out.print("Proporciona el numero1: ");
        int numero1 = console.nextInt();
        System.out.print("Proporciona el numero2: ");
        int numero2 = console.nextInt();
        System.out.println("El numero mayor es:");
        System.out.println( numero1 >= numero2 ? numero1 : numero2 );
    }
}

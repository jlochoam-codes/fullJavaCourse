
import java.util.Scanner;

// Section 4, assignment 4: Area and perimeter of a rectangle
public class Rectangle {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        System.out.print("Proporciona el alto: ");
        int alto = console.nextInt();
        System.out.print("Proporciona el ancho: ");
        int ancho = console.nextInt();
        System.out.println("Area: " + (alto * ancho));
        System.out.println("Perimetro: " + ((alto + ancho) * 2));
    }
}

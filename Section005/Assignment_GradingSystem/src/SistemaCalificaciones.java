
import java.util.Scanner;

// Section 5, assignment 6: Grading system
public class SistemaCalificaciones {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        System.out.print("Proporciona un valor entre 0 y 10: ");
        int valor = console.nextInt();
        switch(valor) {
            case 10: case 9:
                System.out.println("A");
                break;
            case 8: 
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5: case 4: case 3: case 2: case 1: case 0:
                System.out.println("F");
                break;
            default:
                System.out.println("Valor desconocido");
        }
    }
}


import java.util.Scanner;

public class DetallesLibro {
    public static void main(String args[]) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Proporciona el titulo: ");
        String titulo = consola.nextLine();
        System.out.print("Proporciona el autor: ");
        String autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
}

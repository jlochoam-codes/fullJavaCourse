
import java.util.Scanner;

// Assignment for section 3: Read and print data for a book in a book store.
public class BookStore {
    public static void main(String args[]) {
        // Get data from console input
        Scanner console = new Scanner(System.in);
        System.out.print("Type the name of the book: ");
        String bookName = console.nextLine();
        System.out.print("Type the id number of the book: ");
        int bookId = console.nextInt();
        System.out.print("Type the price for the book: ");
        double bookPrice = console.nextDouble();
        System.out.print("Does the book have free shipping? (true or false): ");
        boolean freeShipping = console.nextBoolean();
        
        // Display data in console output
        System.out.println(bookName + " #" + bookId);
        System.out.println("Price: $" + bookPrice);
        System.out.println("Free shipping: " + freeShipping);
    }
}

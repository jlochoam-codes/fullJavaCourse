// Section 2, lecture 11: String concatenations.

public class StringConcatenation {

    public static void main(String args[]) {
        String user = "Juan";
        String degree = "Engineer";
        String concatenation = user + " " + degree;
        System.out.println("concatenation = " + concatenation);
        
        // This is the + symbol being used as a common sum.
        int i = 3;
        int j = 4;
        System.out.println(i + j);
        
        System.out.println(i + j + " " + user); // First normal sum, then concatenation.
        System.out.println(user + " " + i + j); // Everything is concatenated.
        // Known in Java as "String context". After the first concatenation is found,
        // everything else is taken as a concatenation (ints are taken as Strings).
        
        System.out.println(user + " " + (i + j)); // String context is canceled with ().
        // This is because of the operators hierarchy (first the normal sum is performed).
        
        System.out.println(i + j + (" " + user + " ") + i + j); // Output: 7 Juan 34 (interesting).
    }
}

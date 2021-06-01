 // Section 2, lectures 7 and 8
public class Variables {
    public static void main(String args[]) {
        // A new integer variable is defined.
        int myIntVariable = 10;
        System.out.println("myIntVariable = " + myIntVariable);
        
        // The value of the (already existing) integer variable is modified.
        myIntVariable = 5;
        System.out.println("myIntVariable = " + myIntVariable);
        
        // A new String variable (object, actually) is defined.
        String myStringVariable = "Greetings";
        System.out.println("myStringVariable = " + myStringVariable);
        
        // The value of the (already existing) String object is modified.
        myStringVariable = "Good bye";
        System.out.println("myStringVariable = " + myStringVariable);
    }
}

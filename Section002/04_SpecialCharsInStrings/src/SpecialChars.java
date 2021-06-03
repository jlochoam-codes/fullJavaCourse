// Section 2, lecture 12: Special characters in Java.
public class SpecialChars {
    public static void main(String args[]) {
        String name = "Jose";
        System.out.println("Name on new line:\n" + name); // New line char: \n
        System.out.println("Name tabulated: \t" + name); // Tabulation: \t
        System.out.println("Name with one char back: \b" + name); // Erase previous char in output: \b
        System.out.println("Name with two chars back: \b\b" + name);
        System.out.println("Name around simple quotes: '" + name + "'");
        System.out.println("Name around double quotes: \"" + name + "\""); // \ as an escape char
    }
}

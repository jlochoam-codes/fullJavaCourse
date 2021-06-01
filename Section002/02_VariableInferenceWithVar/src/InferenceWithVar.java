 // Section 2, lecture 9: Type inference in Java.
public class InferenceWithVar {
    public static void main(String args[]) {
        var myInferredIntVariable = 10;
        System.out.println("myInferredIntVariable = " + myInferredIntVariable);
        
        var myInferredStringVariable = "Greetings";
        System.out.println("myInferredStringVariable = " + myInferredStringVariable);
    }
}

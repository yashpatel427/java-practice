public class Demo{
    public static void main(String[] args) {
        // Exeption = An exception is an unexpected event that occurs while a
        //            program is running and interrupts the normal flow of the program.
        // TRY = try running a block of code.
        // CATCH = gives message when try block cathes an error.
        // FINALLY = finally contains code that you want to execute whether an 
        //           exception occurs or not.
        // THROW = throw is used when you want to manually create/raise an exception.
        // THROWS = It is used in a method declaration to tell the caller:
        //          "This method might throw this exception."
        // Checked Exception = A checked exception is checked by the compiler.
        // Unchecked Exception = An unchecked exception generally occurs at runtime
        //                       and doesn't have to be explicitly handled by the compiler.


        int a = 10;
        int b = 0;

        try {
            int c = a/b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally{
            System.out.println("Program finished.");
        }
    }
}
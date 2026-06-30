
import java.util.InputMismatchException;
import java.util.Scanner;


public class main {

    public static void main(String[] args) {

        // Exception = An event that interrupts the normal flow of a program (dividing by zero, file not found, mismatch input
        //             type)
        //             Surround any dangerous code with a try{} block.
        //             try{}, catch{}, finally{}

        Scanner sc = new Scanner(System.in);
        try {
          System.out.print("Enter a number: ");
          int number = sc.nextInt();
          System.out.println(number);
        }
        catch(ArithmeticException e){
           System.out.println("You can not divide by zero");
        }
        catch(InputMismatchException e){
            System.out.println("It is not a number");
        }
        catch(Exception e){
            //Safty block for unexpected exception
            System.out.println("Something went wrong");
        }
        finally{
            // Resource cleanup
            sc.close();
            System.out.println("finally block always executes");
        }
    }
}

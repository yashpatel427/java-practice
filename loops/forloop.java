
import java.util.Scanner;

public class forloop{
    public static void main(String[] args) throws InterruptedException { 
        // FOR LOOP = Execute the code for certain number of times
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many seconds for countdown: ");
        int start = sc.nextInt();
        // int i; YOU CAN INITIALIZE I AS VARIABLE FROM BEGINING
        for (int i = start; i > 0 ; i-- ) {
            System.out.println(i);
            Thread.sleep(500);  // FROM ADDVANCE JAVA throws InterruptedException NEEDS TO BE ADDED THE 500 IS IN MILISECOND
            
        }
        System.out.println("HAPPY NEW YEAR!");
    }
    
}
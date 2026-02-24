
import java.util.Scanner;

public class dowhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        while (num < 0) {
            System.out.println("It is a negative number");
            System.out.print("Enter a number: ");
            num = sc.nextInt();

        }

        System.out.println("it is a positive number");
        sc.close();
    }
}

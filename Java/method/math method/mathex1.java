
import java.util.Scanner;

public class mathex1 {

    public static void main(String[] args) {
        //hypotenuse of triangle c=sqrt(a^2 + b^2)
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.print("The lenght of side A is: ");
        a = sc.nextDouble();
        System.out.print("The lenght of side B is: ");
        b = sc.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.print("The lenght of side C is: " + c + "cm");
        sc.close();
    }
}


import java.util.Scanner;

public class mathex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //circumference of circle = 2*Math.PI*radius
        //area of circle = 2*Math.PI*Math.pow(radius, 2)
        //volume of circle = (4.0 / 3.0)*Math.PI*Math.pow(radius, 3)

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius of circle: ");
        radius = sc.nextDouble();
        circumference = 2 * Math.PI * radius;
        System.out.println("The circumference of circle is: " + circumference);
        area = 2 * Math.PI * Math.pow(radius, 2);
        System.out.println("The area of circle is: " + area);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("The volume of circle is: " + volume);

        sc.close();
    }
}

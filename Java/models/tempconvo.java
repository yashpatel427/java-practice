
import java.util.Scanner;

public class tempconvo {

    public static void main(String[] args) {
        //TEMPRATURE CONVERSION 
        // C TO F = (TEMP - 32)*5/9 , F TO C = (TEMP * 9/5) + 32

        Scanner sc = new Scanner(System.in);

        double temp;
        double newtemp;
        String unit;

        System.out.print("Enter the temprature: ");
        temp = sc.nextDouble();

        System.out.print("Convert to celcius or ferenheat (C or F): ");
        unit = sc.next().toUpperCase();

        newtemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;
        System.out.printf("The New Temprature is %.2f°%s", newtemp, unit);  // FOR ° NUMELOCK ON + ALT + 0176

        sc.close();
    }
}

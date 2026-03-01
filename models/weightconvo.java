
import java.util.Scanner;
//lbs to kg = weight*.453592  , kg to lbs = weight*2.20462

public class weightconvo {

    public static void main(String[] args) {
        
        //WEIGHT CONVERESION PROGRAM

        Scanner sc = new Scanner(System.in);
        double weight;
        double newweight;
        int choice;

        System.out.println("Weight convresion program");
        System.out.println("1: convert weight from kg to lbs");
        System.out.println("2: convert weight from lbs to kg");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter the weight in kg: ");
            weight = sc.nextDouble();
            newweight = weight * 2.20462;
            System.out.printf("New weight in lbs is: %.2f", newweight);

        } else if (choice == 2) {

            System.out.print("Enter the weight in lbs: ");
            weight = sc.nextDouble();
            newweight = weight * .453592;
            System.out.printf("New weight in lbs is: %.2f", newweight);

        } else {
            System.out.println("It is a invalid choice!");
        }

        sc.close();

    }
}

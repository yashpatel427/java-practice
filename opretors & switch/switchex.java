
import java.util.Scanner;

public class switchex {

    public static void main(String[] args) {

      // Enhanced switch is a replacement for to many if statement        
        Scanner sc = new Scanner(System.in);
        String day;
        System.out.print("Enter the day of week: ");
        day = sc.nextLine();

        switch (day) {
            case "monday", "tuesday", "wednesday", "thursday" ->
                System.out.println("It is a working day");
            case "friday", "saturday", "sunday" ->
                System.out.println("It is a weekend");
            default ->
                System.out.println(day + " is not a day");
        }

        sc.close();
    }

}

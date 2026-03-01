
import java.util.Scanner;

public class ifelse {
//if else condition

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.print("Are you a student?(true/false): ");
        isStudent = sc.nextBoolean();

        //group 1
        if (name.isEmpty()) {
            System.out.println("You did not enter your name!");

        } else {
            System.out.println("Hello " + name);
        }

        //group 2
        if (age >= 50) {
            System.out.println("You are a senior");

        } else if (age >= 18) {
            System.out.println("You are n Adult");

        } else if (age >= 15) {
            System.out.println("You are a tinager");

        } else if (age == 0) {
            System.out.println("You are a baby");

        } else if (age < 0) {
            System.out.println("You are not born yet");
        } else {
            System.out.println("You did not enter your age");
        }
        //group 3
        if (isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        }

        sc.close();
    }
}

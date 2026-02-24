
import java.util.Scanner;

public class methods {

    public static void main(String[] args) {
        // method = A block of reusable code that executed when called
        /* String name = "yash";
        int age = 20;
        happybirthday(name, age);*/
 /*double result = square(3);
       System.out.println(result);*/
 /* double result = cube(4);
       System.out.println(result);*/
 /* String fullname = getfullName("yash", "patel");
       System.out.println(fullname);*/
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter your are: ");
        age = sc.nextInt();
        if (ageCheck(age)) {
            System.out.println("You are eligibale for voting");

        } else {
            System.out.println("You are not eligible for voting");
        }
        sc.close();
    }

    static void happybirthday(String name, int age) {
        System.out.printf("Happy birthday to you %s\n", name);
        System.out.printf("You are %d years old\n", age);

    }

    static double square(double number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static String getfullName(String first, String last) {
        return first + " " + last;
    }

    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }

    }
}

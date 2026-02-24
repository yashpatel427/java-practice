
import java.util.Scanner;

public class bank2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
          // java beginner banking program
        double balance = 0;
        int choice;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("***************");
            System.out.println("Banking program");
            System.out.println("***************");
            System.out.println("1.Show balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("***************");

            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 ->
                    showBalace(balance);
                case 2 ->
                    balance = +deposit();
                case 3 ->
                    balance -= withdraw(balance);   // if =- output will be negative
                case 4 ->
                    isRunning = false;
                case 5 ->
                    System.out.println("Invalid choice !");
            }

        }
        System.out.println("****************************");
        System.out.println("Thank you ! Have a nice day.");
        System.out.println("****************************");
        sc.close();
    }

    static void showBalace(double balance) {
        System.out.println("**************");
        System.out.printf("$%.2f\n", balance);
    }

    static double deposit() {
        double amount;
        System.out.print("Enter amount to be deposited: ");
        amount = sc.nextDouble();
        if (amount < 0) {
            System.out.println("The amount can not be negative");
            return 0;
        } else {
            return amount;
        }

    }

    static double withdraw(double balance) {
        double amount;
        System.out.print("Enter amount to withdraw: ");
        amount = sc.nextDouble();

        if (amount > balance) {
            System.out.println(" Insufficiant balance!");
            return 0;
        } else if (amount < 0) {
            System.out.println("The amount can not be negative");
            return 0;
        } else {
            return amount;
        }
    }
}

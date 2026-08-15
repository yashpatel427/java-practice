
import java.util.Scanner;

public class main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        ATM Simulation
        Check balance
        Deposit
        Withdraw
        PIN verification
        Menu using switch
         */
        double balance = 0;
        String pin = "1234";
        int choice;
        boolean isRunning = true;
        int Attempts = 0;

        while (isRunning) {

            System.out.println("**************");
            System.out.println("ATM Simulation");
            System.out.println("**************");

            while (Attempts < 3) {
                System.out.print("Enter your 4 digit pin: ");
                String userPin = scanner.nextLine();
                if (userPin.length() == 4 && userPin.equals(pin)) {

                    boolean menuRunning = true;
                    while (menuRunning) {
                        System.out.println("**********");
                        System.out.println("MENU");
                        System.out.println("**********");
                        System.out.println("1.Balance");
                        System.out.println("2.Diposit");
                        System.out.println("3.Withdraw");
                        System.out.println("4.Exit");
                        System.out.println("**********");
                        System.out.print("Enter your choice(1-4): ");
                        choice = scanner.nextInt();
                        switch (choice) {
                            case 1 ->
                                showBalace(balance);
                            case 2 ->
                                balance += deposit();
                            case 3 ->
                                balance -= withdraw(balance);
                            case 4 ->{
                                menuRunning = false;
                                isRunning = false;
                            }
                            default ->
                                System.out.println("Invalid choice!");
                        }
                    }
                    break;
                } else {
                    Attempts++;
                    
                    if(userPin.length() != 4){
                        System.out.println("Please enter a 4 digit pin");
                    } else {
                        System.out.println("Incorrect pin! Please try again");
                    }

                }
            }
            if (Attempts == 3) {
                System.out.println("To many attempts, ATM is locked");
                isRunning = false;
            }

        }
        System.out.println("Thank you, Have a nice day");
        scanner.close();
    }

    static void showBalace(double balance) {
        System.out.printf("$%.2f\n", balance);
    }

    static double deposit() {
        double amount;
        System.out.print("Enter the amount you want to deposit: ");
        amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Amount to be deposited can not be negative or zero");
            return 0;
        } else {
            return amount;
        }
    }

    static double withdraw(double balance) {
        double amount;

        System.out.print("Enter the amount you want to withdraw: ");
        amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Withdrawal amount can not be nagative or zero");
            return 0;
        } else if (amount > balance) {
            System.out.println("Insufficient Balance!");
            return 0;
        } else {
            return amount;
        }
    }
}

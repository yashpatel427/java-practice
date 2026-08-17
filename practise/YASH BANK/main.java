
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // JAVA BANK PROGRAM

        Scanner scanner = new Scanner(System.in);

        Customer customer1 = new Customer(1, "Yash", "1325752456", "yash@123gmail.com");
        Customer customer2 = new Customer(2, "Vivek", "1324576821", "vivek@124gmail.com");
        String pin1 = createPin(scanner, 101);
        BankAccount bankAccount1 = new BankAccount(101, 2000, customer1, "Savings", pin1);
        String pin2 = createPin(scanner, 102);
        BankAccount bankAccount2 = new BankAccount(102, 3000, customer2, "Current", pin2);

        ArrayList<BankAccount> accounts = new ArrayList<>();

        accounts.add(bankAccount1);
        accounts.add(bankAccount2);

        BankAccount selectedAccount = null;

        while (selectedAccount == null) {
            System.out.print("Enter your Account Number: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Account number must be a number.");
                scanner.next();
                System.out.print("Enter your account number again: ");
            }

            int accountNum = scanner.nextInt();

            for (BankAccount account : accounts) {
                if (account.getBankAccountNum() == accountNum) {
                    selectedAccount = account;
                    break;
                }
            }
            if (selectedAccount == null) {
                System.out.println("Account not Found! Please try again.");
            } else {
                System.out.println("Account found!");

                scanner.nextLine();

                int attempts = 0;
                boolean authenticated = false;

                while (attempts < 3 && !authenticated) {

                    System.out.print("Enter your pin: ");
                    String enteredPin = scanner.nextLine();

                    if (selectedAccount.verifyPin(enteredPin)) {

                        authenticated = true;
                        System.out.println("Login successful!");
                    } else {
                        attempts++;
                        System.out.println("Incorrect Pin!");
                    }
                }
                if (!authenticated) {
                    System.out.println("To many incorect attempts.");
                } else {

                    boolean isRunning = true;

                    while (isRunning) {
                        System.out.println("********Bank Menu********");
                        System.out.println("|1.Dispaly Account Info |");
                        System.out.println("|2.Check Balance        |");
                        System.out.println("|3.Deposit Money        |");
                        System.out.println("|4.Withdraw Money       |");
                        System.out.println("|5.Transfer Money       |");
                        System.out.println("|6.Transaction History  |");
                        System.out.println("|7.Exit                 |");
                        System.out.println("*************************");
                        System.out.print("Enter your choice: ");
                        if (scanner.hasNextInt()) {

                            int choice = scanner.nextInt();

                            switch (choice) {
                                case 1 ->
                                    selectedAccount.displayInfo();
                                case 2 ->
                                    selectedAccount.checkBalance();
                                case 3 ->
                                    selectedAccount.deposit(scanner);
                                case 4 ->
                                    selectedAccount.withdraw(scanner);
                                case 5 -> {
                                    System.out.print("Enter the receivers account number: ");
                                    int receiverNum = scanner.nextInt();

                                    BankAccount receiver = null;

                                    for (BankAccount account : accounts) {
                                        if (account.getBankAccountNum() == receiverNum) {
                                            receiver = account;
                                            break;
                                        }
                                    }
                                    if (receiver == null) {
                                        System.out.println("Account not Found!");
                                    } else if (receiver == selectedAccount) {
                                        System.out.println("You can not Transfer money to your own Account!");
                                    } else {
                                        System.out.println("Account Found!");
                                        selectedAccount.transfer(receiver, scanner);
                                    }
                                }
                                case 6 ->
                                    selectedAccount.displayTransactions();
                                case 7 ->
                                    isRunning = false;
                                default ->
                                    System.out.println("Invalid Choice!");
                            }
                        } else {
                            System.out.println("Please enter a number of your choice.");
                            scanner.next();
                        }
                    }
                }
            }
        }
        scanner.close();
    }

    public static String createPin(Scanner scanner, int accountNum) {

        System.out.print("Create a 4-Digit pin for Account number " + accountNum + ": ");
        String pin = scanner.nextLine();

        while (!pin.matches("\\d{4}")) {

            System.out.println("Pin must be exactly 4 digit.");
            System.out.print("Enter pin again: ");
            pin = scanner.nextLine();
        }
        return pin;
    }
}

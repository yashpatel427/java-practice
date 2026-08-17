
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // JAVA BANK PROGRAM

        Scanner scanner = new Scanner(System.in);

        Customer customer1 = new Customer(1, "Yash", "1325752456", "yash@123gmail.com");
        Customer customer2 = new Customer(2, "Vivek", "1324576821", "vivek@124gmail.com");
        BankAccount bankAccount1 = new BankAccount(101, 2000, customer1, "Savings");
        BankAccount bankAccount2 = new BankAccount(102, 3000, customer2, "Current");

        ArrayList<BankAccount> accounts = new ArrayList<>();

        accounts.add(bankAccount1);
        accounts.add(bankAccount2);

        System.out.print("Enter your Account Number: ");
        int accountNum = scanner.nextInt();

        BankAccount selectedAccount = null;

        for (BankAccount account : accounts) {
            if (account.getBankAccountNum() == accountNum) {
                selectedAccount = account;
                break;
            }
        }
        if (selectedAccount == null) {
            System.out.println("Account not Found!");
        } else {
            System.out.println("Account found!");

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
            }

        }
        scanner.close();
    }
}

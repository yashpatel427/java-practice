
import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {

    private int bankAccountNum;
    private double balance;
    private Customer customer;
    private String accountType;
    private String pin;
    private ArrayList<String> transactions;

    public BankAccount(int bankAccountNum, double balance, Customer customer, String accountType, String pin) {
        this.bankAccountNum = bankAccountNum;
        this.balance = balance;
        this.customer = customer;
        this.accountType = accountType;
        this.pin = pin;
        this.transactions = new ArrayList<>();
    }

    public int getBankAccountNum() {
        return bankAccountNum;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getPin() {
        return pin;
    }

    public void setBankAccountNum(int bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void deposit(Scanner scanner) {
        double amount;

        while (true) {
            amount = main.getDoubleInput(scanner, "Enter the amount to deposit in number " + bankAccountNum + ": ");

            if (amount <= 0) {
                System.out.println("Amount must be greater than zero.");
            } else {
                balance += amount;
                System.out.println("Amount deposited successfully in Account number " + bankAccountNum);
                System.out.println("Balance: " + balance);
                transactions.add("Deposit: +" + amount);
                break;
            }
        }

    }

    public static BankAccount createBankAccount(Scanner scanner, Customer customer, ArrayList<BankAccount> accounts) {
        int accountNum;

        accountNum = main.generateAccountNum(accounts);
        System.out.println("Your Account number is: " + accountNum);
        double balance = 0;

        while (true) {
            balance = main.getDoubleInput(scanner, "Enter your Initial Blance: ");

            if (balance < 0) {
                System.out.println("Initial balance can not be Negative.");
                continue;
            }
            break;
        }
        scanner.nextLine();

        String accountType = null;
        boolean validType = false;

        while (!validType) {
            System.out.print("Enter Account Type(Current/Savings): ");
            accountType = scanner.nextLine();
            switch (accountType.toLowerCase()) {
                case "current", "savings" ->
                    validType = true;
                default ->
                    System.out.println("Invalid Account Type! Please enter Current or Savings.");
            }

        }
        String pin = createPin(scanner, accountNum);

        return new BankAccount(accountNum, balance, customer, accountType, pin);

    }

    public void withdraw(Scanner scanner) {
        double amount;

        while (true) {

            amount = main.getDoubleInput(scanner, "Enter the amount to withdraw from " + bankAccountNum + ": ");

            if (amount <= 0) {
                System.out.println("Amount to withdraw can not be negative or zero");
                continue;
            } else if (amount > balance) {
                System.out.println("Insufficient Balance.");
                continue;
            }
            break;
        }
        balance -= amount;
        System.out.println("Amount withdrawn successfully from " + bankAccountNum);
        System.out.println("Balance: " + balance);
        transactions.add("Withdrawal: -" + amount);
    }

    public void displayInfo() {
        System.out.println("*****************************");

        getCustomer().displayInfo();
        System.out.println();
        System.out.println("Account Number: " + getBankAccountNum() + "        ");
        System.out.println("Balance: " + getBalance() + "            ");
        System.out.println("Account Type: " + getAccountType() + "      ");

        System.out.println("*****************************");
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + getBalance());
    }

    public void transfer(BankAccount receiver, Scanner scanner) {
        double amount;

        while (true) {

            amount = main.getDoubleInput(scanner, "Enter the amount to transfer from " + bankAccountNum + ": ");

            if (amount <= 0) {
                System.out.println("Amount to transfer has to be greater than zero");
                continue;
            }
            if (amount > balance) {
                System.out.println("Insufficient Balance");
                continue;
            }
            break;
        }
        balance -= amount;
        receiver.balance += amount;
        transactions.add("Transfer to account " + receiver.bankAccountNum + ": -" + amount);
        receiver.transactions.add("Transferred from Account " + bankAccountNum + ": +" + amount);
        System.out.println("Amount successfully transferred");
    }

    public void displayTransactions() {
        System.out.println("***********************************");
        System.out.println("*Transaction History of " + getCustomer().getName() + "*");

        for (String transaction : transactions) {
            System.out.println(transaction);
        }
        System.out.println("Current Blance: " + balance);
        System.out.println("***********************************");
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

    public void changePin(Scanner scanner) {
        System.out.print("Enter your current pin: ");
        String currentPin = scanner.nextLine();

        if (!verifyPin(currentPin)) {
            System.out.println("Incorrect current pin!");
            return;
        }
        String newPin;
        while (true) {
            System.out.print("Enter your new 4-Digit PIN: ");
            newPin = scanner.nextLine();

            if (newPin.matches("\\d{4}")) {
                break;
            }
            System.out.println("Pin must be exactly 4 digits.");
        }
        System.out.print("Confirm your new pin: ");
        String confirmPin = scanner.nextLine();

        if (!newPin.equals(confirmPin)) {
            System.out.println("Pin's does not match. Pin was not changed.");
            return;
        }
        if (newPin.equals(pin)) {
            System.out.println("New pin can not be same as your previous pin.");
            return;
        }

        pin = newPin;
        System.out.println("Pin changed succeddfully.");
    }

    public boolean verifyPin(String enteredPin) {
        return pin.equals(enteredPin);
    }

    public boolean deleteAccount(Scanner scanner) {
        System.out.print("Are you sure you want to delete this account(yes/no): ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            return true;
        }
        System.out.println("Account deletion cancelled.");
        return false;
    }

}


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {

    private int bankAccountNum;
    private double balance;
    private Customer customer;
    private String accountType;
    private String pin;
    private ArrayList<String> transactions;
    private static int transactionCounter = 1;

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

    public boolean deposit(Scanner scanner) {
        double amount;

        while (true) {
            amount = Main.getDoubleInput(scanner, "Enter the amount to deposit in number " + bankAccountNum + ": ");

            if (amount <= 0) {
                System.out.println("Amount must be greater than zero.");
            } else {
                balance += amount;
                System.out.println("Amount deposited successfully in Account number " + bankAccountNum);
                System.out.println("Balance: " + balance);
                addTransactions(generateTransactionID(), "Deposit", amount);

                return true;
            }
        }

    }

    public static BankAccount createBankAccount(Scanner scanner, Customer customer, ArrayList<BankAccount> accounts) {
        int accountNum;

        accountNum = Main.generateAccountNum(accounts);
        System.out.println("Your Account number is: " + accountNum);
        double balance = 0;

        while (true) {
            balance = Main.getDoubleInput(scanner, "Enter your Initial Balance: ");

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

    public boolean withdraw(Scanner scanner) {
        double amount;

        while (true) {

            amount = Main.getDoubleInput(scanner, "Enter the amount to withdraw from " + bankAccountNum + ": ");

            if (amount <= 0) {
                System.out.println("Amount to withdraw can not be negative or zero");
                continue;
            } else if (amount > balance) {
                System.out.println("Insufficient Balance.");
                continue;
            }
            balance -= amount;
            System.out.println("Amount withdrawn successfully from " + bankAccountNum);
            System.out.println("Balance: " + balance);
            addTransactions(generateTransactionID(), "Withdrawal", -amount);

            return true;
        }
    }

    public void displayInfo() {
        System.out.println("*****************************");

        getCustomer().displayInfo();
        System.out.println();
        System.out.println("-> Account Number: " + getBankAccountNum() + "        ");
        System.out.println("-> Balance: " + getBalance() + "            ");
        System.out.println("-> Account Type: " + getAccountType() + "      ");

        System.out.println("*****************************");
    }

    public void checkBalance() {
        System.out.println("-> Current Balance: " + getBalance());
    }

    public boolean transfer(BankAccount receiver, Scanner scanner) {
        double amount;

        while (true) {

            amount = Main.getDoubleInput(scanner, "Enter the amount to transfer from " + bankAccountNum + ": ");

            if (amount <= 0) {
                System.out.println("Amount to transfer has to be greater than zero");
                continue;
            }
            if (amount > balance) {
                System.out.println("Insufficient Balance");
                continue;
            }
            balance -= amount;
            receiver.balance += amount;
            String transactionId = generateTransactionID();
            transactions.add("-> " + transactionId + " - Transfer to account "
                    + receiver.bankAccountNum + ": -" + amount + " - Balance: " + balance + " - " + getCurrentTime());
            receiver.transactions.add("-> " + transactionId + " - Transferred from Account "
                    + bankAccountNum + ": +" + amount + " - Balance: " + receiver.balance + " - " + getCurrentTime());
            System.out.println("Amount successfully transferred");

            return true;
        }
    }

    public void displayTransactions() {
        System.out.println("***************************************************");
        System.out.println("*Transaction History of " + getCustomer().getName() + "*");

        if (transactions.isEmpty()) {
            System.out.println("-> NO Transaction yet.");
        } else {
            for (String transaction : transactions) {
                System.out.println(transaction);
            }
        }
        System.out.println("-> Current Blance: " + balance);
        System.out.println("***************************************************");
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

    public boolean changePin(Scanner scanner) {
        System.out.print("Enter your current pin: ");
        String currentPin = scanner.nextLine();

        if (!verifyPin(currentPin)) {
            System.out.println("Incorrect current pin!");
            return false;
        }
        String newPin;
        while (true) {
            System.out.print("Enter your new 4-Digit PIN: ");
            newPin = scanner.nextLine();
            if (newPin.equals(currentPin)) {
                System.out.println("New pin can not be same as previous one.");
                return false;
            }
            if (newPin.matches("\\d{4}")) {
                break;
            }
            System.out.println("Pin must be exactly 4 digits.");
        }
        System.out.print("Confirm your new pin: ");
        String confirmPin = scanner.nextLine();

        if (!newPin.equals(confirmPin)) {
            System.out.println("Pin's does not match. Pin was not changed.");
            return false;
        }
        if (newPin.equals(pin)) {
            System.out.println("New pin can not be same as your previous pin.");
            return false;
        }

        pin = newPin;
        System.out.println("Pin changed succefully.");
        return true;
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

    public String getCurrentTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }

    public static String generateTransactionID() {
        return String.format("TXN%03d", transactionCounter++);
    }

    public static void saveAccounts(ArrayList<BankAccount> accounts) {
        try (FileWriter writer = new FileWriter("YashBankData.txt")) {

            for (BankAccount account : accounts) {
                writer.write(account.toFileString() + "\n");
            }

            System.out.println("Bank data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving bank data: " + e.getMessage());
        }
    }

    public static void loadAccounts(ArrayList<BankAccount> accounts, ArrayList<Customer> customers) {
        try (BufferedReader reader = new BufferedReader(new FileReader("YashBankData.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {

                if (line.isBlank()) {
                    continue;
                }

                String[] data = line.split("\\|");

                if (data.length < 8) {
                    System.out.println("Skipping invalid bank data.");
                    continue;
                }

                int customerID = Integer.parseInt(data[0]);
                String name = data[1];
                String phoneNum = data[2];
                String email = data[3];

                int accountNum = Integer.parseInt(data[4]);
                double balance = Double.parseDouble(data[5]);
                String accountType = data[6];
                String pin = data[7];

                Customer customer = new Customer(customerID, name, phoneNum, email);
                BankAccount account = new BankAccount(accountNum, balance, customer, accountType, pin);

                for (int i = 8; i < data.length; i++) {
                    account.addTransactions(data[i]);
                }

                customers.add(customer);
                accounts.add(account);
            }
        } catch (IOException e) {
            System.out.println("Error loading bank data: " + e.getMessage());
        }
    }

    public String toFileString() {
        String data = customer.getCustomerID() + "|"
                + customer.getName() + "|"
                + customer.getPhoneNum() + "|"
                + customer.getEmail() + "|"
                + bankAccountNum + "|"
                + balance + "|"
                + accountType + "|"
                + pin;
        return data;
    }

    public void addTransactions(String transaction) {
        transactions.add(transaction);
    }

    public static void saveTransaction(ArrayList<BankAccount> accounts) {
        try (FileWriter writer = new FileWriter("YashBankTransactions.txt")) {

            for (BankAccount account : accounts) {
                for (String transaction : account.transactions) {
                    writer.write(account.bankAccountNum + "|" + transaction + "\n");
                }
            }
            System.out.println("Transactions saved successfully.");
        } catch (IOException e) {
            System.out.println("Error savings transactionss: " + e.getMessage());
        }
    }

    public static void loadTransactions(ArrayList<BankAccount> accounts) {
        try (BufferedReader reader = new BufferedReader(new FileReader("YashBankTransactions.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                if (line.isBlank()) {
                    continue;
                }
                String[] data = line.split("\\|", 2);
                if (data.length < 2) {
                    System.out.println("Skipping invalid bank data.");
                    continue;
                }

                int accountNum = Integer.parseInt(data[0]);
                String transaction = data[1];

                for (BankAccount account : accounts) {
                    if (account.getBankAccountNum() == accountNum) {
                        account.addTransactions(transaction);
                        break;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading transactions: " + e.getMessage());
        }
    }

    public static void loadTransactionCounter() {
        int highestID = 0;

        try (BufferedReader reader
                = new BufferedReader(new FileReader("YashBankTransactions.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {

                if (line.isBlank()) {
                    continue;
                }

                int start = line.indexOf("TXN");

                if (start != -1) {

                    int end = start + 3;

                    while (end < line.length()
                            && Character.isDigit(line.charAt(end))) {
                        end++;
                    }

                    String numberString
                            = line.substring(start + 3, end);

                    int number = Integer.parseInt(numberString);

                    if (number > highestID) {
                        highestID = number;
                    }
                }
            }

            transactionCounter = highestID + 1;

        } catch (IOException e) {
            System.out.println("Error loading transaction counter: " + e.getMessage());
            transactionCounter = 1;
        }
    }

    public void addTransactions(String transactionID, String description, double amount) {
        transactions.add(
                "-> " + transactionID
                + " - " + description
                + ": " + (amount >= 0 ? "+" : "") + amount
                + "- Balance: " + balance
                + "- " + getCurrentTime()
        );
    }
}

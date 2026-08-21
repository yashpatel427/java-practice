
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // JAVA BANK PROGRAM

        Scanner scanner = new Scanner(System.in);
        BankAccount.createDataFile();
        BankAccount.writeData();
        BankAccount.readData();

        Customer customer1 = new Customer(1, "Yash", "1325752456", "yash@123gmail.com");
        Customer customer2 = new Customer(2, "Vivek", "1324576821", "vivek@124gmail.com");
        String pin1 = BankAccount.createPin(scanner, 101);
        BankAccount bankAccount1 = new BankAccount(101, 2000, customer1, "Savings", pin1);
        String pin2 = BankAccount.createPin(scanner, 102);
        BankAccount bankAccount2 = new BankAccount(102, 3000, customer2, "Current", pin2);

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(bankAccount1);
        accounts.add(bankAccount2);

        boolean Running = true;
        while (Running) {
            System.out.println("********YASH BANK********");
            System.out.println("1. Login");
            System.out.println("2. Create new Account");
            System.out.println("3. Display Total Accounts");
            System.out.println("4. Exit");
            System.out.println("*************************");

            int choice = getIntInput(scanner, "Enter your choice: ");

            switch (choice) {
                case 1 -> {
                    //login
                    BankAccount selectedAccount = login(scanner, accounts);
                    if (selectedAccount != null) {
                        bankMenu(scanner, selectedAccount, accounts, customers);
                    }
                }
                case 2 -> {
                    //create new account
                    scanner.nextLine();
                    int customerID = generateCustomerID(customers);
                    System.out.println("Your customer ID is: " + customerID);
                    Customer customer = Customer.createCustomer(scanner, customerID, customers);
                    customers.add(customer);

                    BankAccount newAccount = BankAccount.createBankAccount(scanner, customer, accounts);
                    accounts.add(newAccount);

                    System.out.println("******Account Created Successfully!******");
                    newAccount.displayInfo();
                    System.out.println("*****************************************");
                    System.out.println("Total Accounts: " + accounts.size());
                }
                case 3 ->
                    dispalyTotalAccounts(accounts);
                case 4 -> {
                    Running = false;
                    System.out.println("Thank you for using our Bank.");
                }
                default ->
                    System.out.println("Invalid Choice!");
            }
        }
        scanner.close();
    }

    public static BankAccount login(Scanner scanner, ArrayList<BankAccount> accounts) {
        BankAccount selectedAccount = null;
        while (selectedAccount == null) {
            int accountNum = getIntInput(scanner, "Enter your Account Number: ");

            for (BankAccount account : accounts) {
                if (account.getBankAccountNum() == accountNum) {
                    selectedAccount = account;
                    break;
                }
            }
            if (selectedAccount == null) {
                System.out.println("Account not Found! Please try again.");
            }
        }
        System.out.println("Account Found!");

        scanner.nextLine();

        int attempts = 0;
        boolean authenticated = false;

        while (attempts < 3 && !authenticated) {

            System.out.print("Enter your pin: ");
            String enteredPin = scanner.nextLine();

            if (selectedAccount.verifyPin(enteredPin)) {

                authenticated = true;
                System.out.println("Login successful!");
                System.out.println("Welcome " + selectedAccount.getCustomer().getName() + ".");
            } else {
                attempts++;
                int remaining = 3 - attempts;
                if (remaining > 0) {
                    System.out.println("Incorrect Pin!");
                    System.out.println("Attempts remaining: " + remaining);
                } else {
                    System.out.println("Too many incorrect attempts.");
                }
            }
        }
        if (!authenticated) {
            System.out.println("Too many Incorrect Attempts.");
            return null;
        }

        return selectedAccount;
    }

    public static void bankMenu(Scanner scanner, BankAccount selectedAccount, ArrayList<BankAccount> accounts, ArrayList<Customer> customers) {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("********Bank Menu********");
            System.out.println("1.Dispaly Account Info ");
            System.out.println("2.Check Balance        ");
            System.out.println("3.Deposit Money        ");
            System.out.println("4.Withdraw Money       ");
            System.out.println("5.Transfer Money       ");
            System.out.println("6.Transaction History  ");
            System.out.println("7.Change Pin           ");
            System.out.println("8.Delete Account       ");
            System.out.println("9.Logout               ");
            System.out.println("*************************");

            int menuchoice = getIntInput(scanner, "Enter your choice: ");

            switch (menuchoice) {
                case 1 ->
                    selectedAccount.displayInfo();
                case 2 ->
                    selectedAccount.checkBalance();
                case 3 ->
                    selectedAccount.deposit(scanner);
                case 4 ->
                    selectedAccount.withdraw(scanner);
                case 5 -> {
                    BankAccount receiver = null;

                    while (receiver == null) {

                        int receiverNum = getIntInput(scanner, "Enter the receiver's account number: ");

                        for (BankAccount account : accounts) {
                            if (account.getBankAccountNum() == receiverNum) {
                                receiver = account;
                                break;
                            }
                        }
                        if (receiver == null) {
                            System.out.println("Account not Found! Please try Again");
                        } else if (receiver == selectedAccount) {
                            System.out.println("You can not Transfer money to your own Account!");
                            receiver = null;
                        }
                    }
                    System.out.println("Account Found!");
                    selectedAccount.transfer(receiver, scanner);
                }
                case 6 ->
                    selectedAccount.displayTransactions();
                case 7 -> {
                    scanner.nextLine();
                    selectedAccount.changePin(scanner);
                }
                case 8 ->{
                    scanner.nextLine();

                    boolean deleted = selectedAccount.deleteAccount(scanner);

                    if(deleted){
                        customers.remove(selectedAccount.getCustomer());
                        accounts.remove(selectedAccount);
                        System.out.println("Account deleted successfully.");
                        isRunning = false;
                    }
                }
                case 9 -> {
                    isRunning = false;
                    System.out.println("Logged out successfully.");
                }
                default ->
                    System.out.println("Invalid Choice!");
            }
        }
    }

    public static int getIntInput(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);

            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            System.out.println("Please enter a valid number.");
            scanner.next();
        }
    }

    public static double getDoubleInput(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);

            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            }
            System.out.println("Please enter a valid amount!");
            scanner.next();
        }
    }

    public static void dispalyTotalAccounts(ArrayList<BankAccount> accounts) {
        System.out.println("Total Accounts: " + accounts.size());
    }

    public static int generateCustomerID(ArrayList<Customer> customers) {
        int customerID = 1;

        while (true) { 
            boolean exists = false;

            for(Customer customer : customers){
                if(customer.getCustomerId() == customerID){
                    exists = true;
                    break;
                }
            }
            if(!exists){
                return customerID;
            }
            customerID++;
        }
    }

    public static int generateAccountNum(ArrayList<BankAccount> accounts) {
        int accountNum = 101;

        while (true) { 
            boolean exists = false;
            
            for(BankAccount account : accounts){
                if(account.getBankAccountNum() == accountNum){
                    exists = true;
                    break;
                }
            }
            if(!exists){
                return accountNum;
            }
            accountNum++;
        }
    }

    public static boolean phoneExists(ArrayList<Customer> customers, String phoneNum) {
        for (Customer customer : customers) {
            if (customer.getPhoneNum().equals(phoneNum)) {
                return true;
            }
        }
        return false;
    }

    public static boolean emailExists(ArrayList<Customer> customers, String email) {
        for (Customer customer : customers) {
            if (customer.getEmail().equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false;
    }
}

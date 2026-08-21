
import java.util.ArrayList;
import java.util.Scanner;

public class Customer {

    private int customerId;
    private String name;
    private String phoneNum;
    private String email;

    public Customer(int customerId, String name, String phoneNum, String email) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setCustomerId(int customerId) {
        if (customerId > 0) {
            this.customerId = customerId;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayInfo() {
        System.out.println("-> Customer Id: " + customerId + "             ");
        System.out.println("-> Name: " + name + "                 ");
        System.out.println("-> Phone Number: " + phoneNum + "   ");
        System.out.println("-> Email: " + email + "   ");
    }

    public static Customer createCustomer(Scanner scanner, int customerID, ArrayList<Customer> customers) {

        String name;
        while (true) {
            System.out.print("Enter your Name: ");
            name = scanner.nextLine();

            if (!name.trim().isEmpty()) {
                break;
            }
            System.out.println("Name can not be empty.");
        }

        String phoneNum;
        while (true) {
            System.out.print("Enter your Phone Number: ");
            phoneNum = scanner.nextLine();
            if (!phoneNum.matches("\\d{10}")) {
                System.out.println("Phone Number must be of exactly 10 Digits.");
                continue;
            }
            if (main.phoneExists(customers, phoneNum)) {
                System.out.println("Phone number already exists! Please enter another phone number.");
                continue;
            }
            break;
        }

        String email;
        while (true) {
            System.out.print("Enter your Email: ");
            email = scanner.nextLine();
            if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                System.out.println("Invalid Email! Please enter a valid Email.");
                continue;
            }
            if (main.emailExists(customers, email)) {
                System.out.println("Email Address already exists! Please enter another email.");
                continue;
            }
            break;
        }

        return new Customer(customerID, name, phoneNum, email);
    }
}

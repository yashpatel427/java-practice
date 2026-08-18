
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
        System.out.println("Customer Id: " + customerId + "             ");
        System.out.println("Name: " + name + "                 ");
        System.out.println("Phone Number: " + phoneNum + "   ");
        System.out.println("Email: " + email + "   ");
    }

    public static Customer createCustomer(Scanner scanner, ArrayList<Customer> customers) {
        int customerID;

        while (true) {
            System.out.print("Enter Customer ID: ");
            customerID = scanner.nextInt();

            boolean exists = false;

            for (Customer customer : customers) {
                if (customer.getCustomerId() == customerID) {
                    exists = true;
                    break;
                }
            }
            if (exists) {
                System.out.println("Customer ID already exists. Please enter a new ID.");
            } else {
                break;
            }
        }
        scanner.nextLine();

        String name;
        while (true) {
            System.out.print("Enter your Name: ");
            name = scanner.nextLine();

            if(!name.trim().isEmpty()){
                break;
            }
            System.out.println("Name can not be empty.");
        }

        String phoneNum;
        while (true) {
            System.out.print("Enter your Phone Number: ");
            phoneNum = scanner.nextLine();
            if (phoneNum.matches("\\d{10}")) {
                break;
            }
            System.out.println("Phone Number must be of exactly 10 Digits.");
        }

        String email;
        while (true) {
            System.out.print("Enter your Email: ");
            email = scanner.nextLine();
            if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                break;
            }
            System.out.println("Invalid Email! Please enter a valid Email.");
        }

        return new Customer(customerID, name, phoneNum, email);
    }
}

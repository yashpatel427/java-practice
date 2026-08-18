
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
        System.out.println("|Customer Id: " + customerId + "             |");
        System.out.println("|Name: " + name + "                 |");
        System.out.println("|Phone Number: " + phoneNum + "   |");
        System.out.println("|Email: " + email + "   |");
    }

    public static Customer createCustomer(Scanner scanner){
        System.out.print("Enter Customer ID: ");
        int customerID = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your Phone Number: ");
        String phoneNum = scanner.nextLine();
        System.out.print("Enter your Email: ");
        String email = scanner.nextLine();

        return new Customer(customerID, name, phoneNum, email);
    }
}


import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        // JAVA BANK PROGRAM

        Scanner scanner = new Scanner(System.in);

        Customer customer1 = new Customer(1, "Yash", "1325752456", "yash@123gmail.com");
        Customer customer2 = new Customer(2, "Vivek", "1324576821", "vivek@124gmail.com");
        BankAccount bankAccount1 = new BankAccount(101, 2000, customer1, "Saving");
        BankAccount bankAccount2 = new BankAccount(102, 3000, customer2, "Current");

       
        bankAccount1.displayInfo();
        bankAccount2.displayInfo();

        scanner.close();
    }
}

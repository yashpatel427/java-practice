
public class main {

    public static void main(String[] args) {
        // JAVA BANK PROGRAM

        Customer customer = new Customer(1001, "Yash", "1325752456", "yash@123gmail.com");

        customer.displayInfo();

        customer.setName("Vivek");
        System.out.println(customer.getName());

    }
}

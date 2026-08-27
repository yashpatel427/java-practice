
import java.util.ArrayList;
import java.util.Iterator;


public class Demo {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer(101, "yash"));
        customers.add(new Customer(102, "vivek"));
        customers.add(new Customer(103, "vighnesh"));
        customers.add(new Customer(104, "vraj"));

        Iterator<Customer> iterator = customers.iterator();

        while(iterator.hasNext()){
            Customer customer = iterator.next();

            if (customer.id == 103){
                iterator.remove();
            }
        }

        for(Customer customer : customers){
            System.out.println(customer.id + " : " + customer.name);
        }
    }
}

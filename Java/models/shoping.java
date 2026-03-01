import java.util.Scanner;

public class shoping{
   //Shopping Program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        String item;
        double price;
        int quantity;
        double total;
        char currency='$';

        System.out.print("what would you like to buy?: ");
        item = sc.nextLine();

        System.out.print("The price of each is: ");
        price = sc.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = sc.nextInt();

        total = price*quantity;
        System.out.print("Your Total will be: "  + currency + total);

        sc.close();
    }
}
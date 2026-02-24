
public class nestedif {

    public static void main(String[] args) {
        boolean isStudent = false;
        boolean isSenior = true;
        double price = 200;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You get a total of 30% discount");
                price *= .70;
            } else {
                System.out.println("You get a total of 10% discount");
                price *= .90;
            }
        } else {
            if (isSenior) {
                System.out.println("You get a total of 20% discount");
                price *= .80;
            }

        }
        System.out.printf("The price of a movie ticket is = %.2f", price);
    }
}

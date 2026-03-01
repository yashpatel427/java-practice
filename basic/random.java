
import java.util.Random;

public class random {

    public static void main(String[] args) {
        Random random = new Random();
        //Printing random number
        // number = random.nextInt(1, 6);

        boolean isheads;
        isheads = random.nextBoolean();

        // System.out.println(isheads);   //For printing output do not add "" if do it becomes variable
        //Using if statement
        if (isheads) {
            System.out.println("Heads");

        } //Hear we are using "" becaous we want variable as output
        else {
            System.out.println("Tails");
        }

    }
}

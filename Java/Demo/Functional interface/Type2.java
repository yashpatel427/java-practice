
import java.util.function.Predicate;

public class Type2{
    public static void main(String[] args) {
        // Predicate takes something and answer true or false.

        Predicate<Integer> isAdult = age -> age >= 18;

        System.out.println(isAdult.test(20));
        System.out.println(isAdult.test(15));
    }
}
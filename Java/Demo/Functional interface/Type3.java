
import java.util.function.Function;

public class Type3{
    public static void main(String[] args) {
        // A Function takes something and returns another thing.

        Function<String, Integer> length = name -> name.length();

        System.out.println(length.apply("yash"));
        System.out.println(length.apply("vighnesh"));
    }
}

import java.util.function.Consumer;

public class Type1{
    public static void main(String[] args) {
        
        // A Consumer takes something and does something with it, but doesn't return a result.

        Consumer<String> printer = name -> System.out.println(name);

        printer.accept("Yash");
        printer.accept("Vivek");
    }
}
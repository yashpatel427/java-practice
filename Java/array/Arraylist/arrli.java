
import java.util.ArrayList;
import java.util.Collections;

public class arrli{
    public static void main(String[] args) {
        
        // ArrayList = A resizable array that stores objects (autoboxing).
        //             Arrays are fixed in size, but ArrayList can change.

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("kiwi");
        fruits.add("Banana");

        // fruits.remove(0);
        // fruits.set(0, "Coconut");

        System.out.println(fruits); 
        System.out.println(fruits.get(0));
        System.out.println(fruits.size());
        
        Collections.sort(fruits);

        System.out.println(fruits);
    }
}
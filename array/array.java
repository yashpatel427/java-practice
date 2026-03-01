
import java.util.Arrays;

public class array {

    public static void main(String[] args) {
        //Array = array is a set of elements with same data type but different name 
        String[] fruits = {"apple", "banana", "kiwi", "orange"};
        // System.out.println(fruits[2]); // For printing single element
        // System.out.println(fruits.length); // For length of array or int numoffruits = fruits.length
        Arrays.sort(fruits);
        // Arrays.fill(fruits, "water melon"); 
        // Enhanced for loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}

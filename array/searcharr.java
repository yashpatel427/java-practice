
import java.util.Scanner;

public class searcharr {

    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "kiwi", "watermelon"};
        Scanner sc = new Scanner(System.in);
        String target;
        boolean isFound = false;

        System.out.print("Enter the fruit you want to find: ");
        target = sc.nextLine();

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target)) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Element not found in array");
        }
        sc.close();
    }
}

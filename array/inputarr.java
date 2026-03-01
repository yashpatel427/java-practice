
import java.util.Scanner;

public class inputarr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.print("Enter the size of the array: ");
        size = sc.nextInt();
        sc.nextLine();

        foods = new String[size];
        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter the name of food: ");
            foods[i] = sc.nextLine();
        }
        for(String food : foods){
            System.out.println(food);
        }
        sc.close();
    }
}
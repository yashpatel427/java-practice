
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        // Runtime or dynamic polymorphism = When the method that gets executed is decided at runtime based on the
        //                                   actual type of the object.
        Scanner sc = new Scanner(System.in);

        Animal animal;

        System.out.print("The enter the choice of your animal(1=dog, 2=cat) : ");
        int choice = sc.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }

        sc.close();
    }
}

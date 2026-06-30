
import java.util.Random;
import java.util.Scanner;

public class numguess {

    public static void main(String[] args) throws InterruptedException {
        //To do more in project list
        //Difficulty levels (Easy: 1–50, Medium: 1–100, Hard: 1–1000)
        // Limited attempts
        // A score system 
        //Input validation(prevent crashes if the user enters text instead of a number)

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int computerChoice;
        boolean choice;
        int Attempts = 0;

        do {
            System.out.println();
            System.out.println("-------------------------------");
            System.out.println("Welcome to Number Guessing Game");
            System.out.println("-------------------------------");

            System.out.println("The computer is selecting a random number between 1 to 100 ...");
            computerChoice = random.nextInt(1, 101);

            Thread.sleep(1000);
            System.out.println("The computer has selected the number");

            do {
                System.out.print("Enter your guess : ");
                guess = scanner.nextInt();
                Attempts++;

                if (guess > computerChoice) {
                    System.out.println("Your guess is bigger than the right answer.");
                } else if (guess < computerChoice) {
                    System.out.println("Your guess is smaller than the right answer");
                } else {
                    System.out.println("Correct ! You guessed the right number");
                    System.out.println("Number of Attempts: " + Attempts);
                }
            } while (guess != computerChoice);
            System.out.print("Do you want to play again(true/false) :");
            choice = scanner.nextBoolean();
            if (choice == false) {
                System.out.println("Game Over");
            }

        } while (choice == true);
        scanner.close();
    }
}

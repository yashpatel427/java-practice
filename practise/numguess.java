
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
        int level;
        int computerChoice = 0;
        boolean choice;
        int maxAttempts = 0;
        int maxNumber = 0;

        do {
            System.out.println();
            System.out.println("-------------------------------");
            System.out.println("Welcome to Number Guessing Game");
            System.out.println("-------------------------------");

            System.out.print("Select the difficulty level you want to play(level : 1, 2, 3) : ");
            level = scanner.nextInt();
            int attempts = 0;
            switch (level) {
                case 1 -> {
                    System.out.println("You selected level 1");
                    System.out.println("The numbers will range from 1-50");
                    System.out.println("You will have maximum of 7 attempts");
                    maxNumber = 50;
                    maxAttempts = 7;
                }
                case 2 -> {
                    System.out.println("You selected level 2");
                    System.out.println("The numbers will range from 1-100");
                    System.out.println("You will have maximum of 10 attempts");
                    maxNumber = 100;
                    maxAttempts = 10;
                }
                case 3 -> {
                    System.out.println("You selected level 3");
                    System.out.println("The numbers will range from 1-200");
                    System.out.println("You will have maximum of 15 attempts");
                    maxNumber = 200;
                    maxAttempts = 15;
                }
                default -> {
                    System.out.println("Invalid choice! level 2 will be seleted by default");
                    System.out.println("The numbers will range from 1-100");
                    maxNumber = 100;
                    maxAttempts = 10;
                }

            }

            System.out.println("The computer is selecting the number");
            Thread.sleep(1000);
            computerChoice = random.nextInt(maxNumber) + 1;
            Thread.sleep(1000);
            System.out.println("The computer has selected the number");

            do {
                System.out.print("Enter your guess : ");
                guess = scanner.nextInt();
                attempts++;

                if (guess > computerChoice) {
                    System.out.println("Your guess is bigger than the right answer.");
                } else if (guess < computerChoice) {
                    System.out.println("Your guess is smaller than the right answer");
                } else {
                    System.out.println("Correct ! You guessed the right number");
                    System.out.println("Number of Attempts: " + attempts);
                }
            } while (guess != computerChoice && attempts < maxAttempts);
            if (guess != computerChoice && attempts < maxAttempts) {
                System.out.println("You ran out of attempts");
                System.out.println("The correct answer was: " + computerChoice);
            }
            System.out.print("Do you want to play again(true/false) :");
            choice = scanner.nextBoolean();
            if (choice == false) {
                System.out.println("Game Over");
            }

        } while (choice == true);
        scanner.close();
    }
}

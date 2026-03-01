
import java.util.Random;
import java.util.Scanner;

public class numguess{
  public static void main(String[] args) {
      Random random = new Random();
      Scanner sc = new Scanner(System.in);
      int guess;
      int min = 1, max = 100;
      int randomnumber = random.nextInt(min, max +1);
      int attempt = 0;
      System.out.println("Welcome to number guessing game");
      System.out.printf("Guess a number between %d - %d\n", min, max);
      do { 
        System.out.print("Enter your guess: ");
        guess = sc.nextInt();
        attempt++;

        if (guess < randomnumber) {
            System.out.println("Try again! it is low");
            
        }
        else if (guess > randomnumber) {
            System.out.println("Try again! it is high");
            
        }
        else{
            System.out.println("Correct!The random number is " + guess);
            System.out.println(" The number of attempts: " + attempt);
        }
          
      } while (guess != randomnumber);
      sc.close();
  }
}
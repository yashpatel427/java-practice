
import java.util.Random;
import java.util.Scanner;

public class rck{
    public static void main(String[] args) {
        // ROCK PAPER SCISSORS GAME

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        //DECLARE VARIABLE
        String choice[] = {"rock", "paper", "scissors"};
        String userchoice;
        String computerchoice;
        String playagain = "yes";

        do { 
            
        //GET CHOICE FROM USER
        System.out.println("-----------------------------------");
        System.out.println("Welcome to rock,paper,scissors game");
        System.out.println("-----------------------------------");
        System.out.print("Enter your move(rock, paper, scissors): ");
        userchoice = sc.nextLine();
        if(!userchoice.equals("rock") && !userchoice.equals("paper") && ! userchoice.equals("scissors")){
            System.out.println("Invalid choice");
        }
        //GET RANDOM CHOICE FOR COMPUTER
        computerchoice = choice[random.nextInt(3)];
        System.out.println("computers move: " + computerchoice);
        //CHECK WIN CONDITION
        if (userchoice.equals(computerchoice)) {
           System.out.println("It is a tie!"); 
        }
        else if((userchoice.equals("rock") && computerchoice.equals("scissors")) ||
        (userchoice.equals("paper") && computerchoice.equals("rock")) ||
        (userchoice.equals("scissors") && computerchoice.equals("paper"))) {
            System.out.println("You win!");
        }
        else{
            System.out.println("You lose!");
        }
        System.out.print("Do you want to play again(yes/no:): ");
        playagain = sc.nextLine().toLowerCase();
        } while (playagain.equals("yes"));  
        //ASK TO PLAY AGAIN
        
                        
         //GOOD BYE MESSAGE
         System.out.println("Thanks for playing");
         sc.close();
    }
}
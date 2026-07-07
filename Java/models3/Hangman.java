
import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {

        // Java Hangman Game
        String word = "pizza";
        int wrongGuess = 0;

        Scanner sc = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }
        System.out.println("-----------------------");
        System.out.println("Welcome to JAVA Hangman");
        System.out.println("-----------------------");

        while (wrongGuess < 6) {

            System.out.println(getHangmanArt(wrongGuess));

            System.out.print("Word : ");

            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = sc.next().toLowerCase().charAt(0);
            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct Guess!");

                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }
                if (!wordState.contains('_')) {
                    System.out.println(getHangmanArt(wrongGuess));
                    System.out.println("YOU WIN!");
                    System.out.println("The word is: " + word);
                    break;
                }
            } else {
                wrongGuess++;
                System.out.println("Wrong Guess!");
            }
        }
        if (wrongGuess >= 6) {
            System.out.println(getHangmanArt(wrongGuess));
            System.out.println("GAME OVER");
            System.out.println("The word was: " + word);
        }

        sc.close();
    }

    static String getHangmanArt(int wrongGuess) {

        return switch (wrongGuess) {
            case 0 ->
                """ 
                        
                        

                      """;

            case 1 ->
                """ 
                       o 
                        
                         
                      """;

            case 2 ->
                """ 
                       o 
                       |
                         
                      """;

            case 3 ->
                """ 
                       o 
                      /| 
                         
                      """;

            case 4 ->
                """ 
                       o 
                      /|\\ 
                         
                      """;

            case 5 ->
                """ 
                       o 
                      /|\\ 
                      /   
                      """;

            case 6 ->
                """ 
                       o 
                      /|\\ 
                      / \\  
                      """;

            default ->
                "";
        };
    }
}

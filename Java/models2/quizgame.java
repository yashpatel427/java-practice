
import java.util.Scanner;

public class quizgame {

    public static void main(String[] args) {
        // question array[]
        String[] questions = {"1 - What is the main function of a router?",
            "2 - Which part of a computer is considered brain?",
            "3 - In Which year facebook was launched?",
            "4 - Who is know as the father of computer?",
            "5 - Which was the first programing language?"};
        // option array[][]
        String[][] options = {{"1.storing files", "2.encrypting data", "3.directing internet traffic", "4.managing passwords"},
        {"1.cpu", "2.hard drive", "3.ram", "4.gpu"},
        {"1.2000", "2.2004", "3.2006", "4.2008"},
        {"1.steve jobs", "2.bill gates", "3.mark zukerburg", "4.charles babbege"},
        {"1.cobol", "2.c", "3.fortran", "4.assembly"}};
        //declare variable
        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int answer;
        //welcome message
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.println("Welcome to quiz game");
        System.out.println("--------------------");
        //question (loop)

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            //option (loop)
            for (String option : options[i]) {
                System.out.println(option);
            }
            //get answer from user
            System.out.print("Enter your answer: ");
            answer = sc.nextInt();
            // check answer
            if (answer == answers[i]) {
                System.out.println("CORRECT");
                score++;
            } else {
                System.out.println("WRONG!");
            }
        }
        //display final score
        System.out.println("Your final score is:" + score + "/" + questions.length);
        sc.close();
    }
}

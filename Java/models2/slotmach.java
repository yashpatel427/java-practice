
import java.util.Random;
import java.util.Scanner;

public class slotmach{
    public static void main(String[] args) {
        //JAVA SLOT MACHINE

        //DECLARE VARIABLE
        Scanner sc = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String playagain;
        String[] row;

        //WELCOME MESSAGE
        System.out.println("--------------------");
        System.out.println("Welcome to java slot");
        System.out.println("Symbols: 🍖🥫🍗🍥🍰");
        System.out.println("--------------------");
        //PLAY ONLY IF BALANCE > 0
        while (balance > 0) { 
           System.out.println("Current balance: $" + balance);
        //ENTER BET AMOUNT
           System.out.print("Enter the amount to bet: ");
           bet = sc.nextInt(); 
           sc.nextLine();
        // VERIFY IF BET > BALANCE
        if(bet > balance){
            System.out.println("Insufficient Balance");
            continue;
        }
        // VERIFY IF BET > 0
        else if(bet <= 0){
            System.out.println("Bet must be greater than $0");
            continue;
        }
        //SUNTRACT BET FROM BALANCE
        else{
            balance -= bet;
        }
        //SPIN ROW
        System.out.println("spinning.... ");
        row = spinRow();
        //PRINT ROW
        printRow(row);
        //GET PAYOUT
        payout = getPayout(row, bet);
        if (payout > 0) {
            System.out.println("You won $" + payout);
            balance += payout;
        }
        else{
            System.out.println("Sorry you lost this round");
        }
        //ASK TO PLAY AGAIN
        System.out.print("Do you want to continue playing(Y/N): ");
        playagain = sc.nextLine().toUpperCase();
        if (!playagain.equals("Y")) {
            break;
        }
        }
        //DISPLAY EXIT MESSAGE
         sc.close();
    }
    static String[] spinRow(){
        String[] symbols = {"🍖", "🥫", "🍗", "🍥", "🍰"};
        String[] row = new String[3];
        Random random = new Random();
        for(int i = 0; i < 3 ; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
        
    }
    static void printRow(String[] row){
        System.out.println("--------------");
        System.out.println(" " + String.join(" | ", row));    // .join is string method to connect two or more string together
         System.out.println("-------------");  
    }
    static int getPayout(String[] row, int bet){
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
           return switch(row[0]){
            case "🍖" -> bet*3;
            case "🥫" -> bet*4;
            case "🍗" -> bet*5;
            case "🍥" -> bet*10;
            case "🍰" -> bet*20;     
            default -> 0 ;
            } ;
            // to add condition where two matching symbols give output as win
        }
        return 0;

    }
}
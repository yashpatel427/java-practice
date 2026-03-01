
import java.util.Scanner;

public class logicop{
    public static void main(String[] args) {
        // && = AND
        // || = OR
        // ! = NOT

       /* int temp = 50;
        boolean isSunny = false;

        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The wether is good today");
            
        }
        else if(temp >= 0 && temp <= 30 && !isSunny ){
            System.out.println("The wether is good today but it is cloudy");

        }
        else if (temp > 30 || temp < 0){
            System.out.println("The wether is bad today");

        }*/
       Scanner sc = new Scanner(System.in);

       String username;
       System.out.print("Enter your username : ");
       username = sc.nextLine();
       if (username.length() < 4 || username.length() > 12) {
        System.out.println("The username must of 4 - 12 character");
           
       }
       else if (username.contains(" ") || username.contains("_")) {
        System.out.println("The username must not contain any space or uderscore");
           
       }
       else{
        System.out.println("Hello " + username);
       }
       sc.close();

    }
}
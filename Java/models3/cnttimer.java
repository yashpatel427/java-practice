import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class cnttimer{
    public static void main(String[] args) {
        // Java Countdown timer program

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number from you start want to start the countdown : ");
        int response = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = response;

            @Override
            public void run() {
               System.out.println(count);
               count--;
               if(count < 0){
                System.out.println("Happy Newyear!");
                timer.cancel();
               }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);

        scanner.close();
    }

    
}
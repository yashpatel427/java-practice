
import java.util.Timer;
import java.util.TimerTask;

public class Timertsk{
    public static void main(String[] args) {
        // Timer = Class that scheduels task at specific times or periodically
        //         Useful for : Sending notification, Schedule updates, Repetive actions

        // TimerTask = Represents the task that will be executed by timer
        //             You will extend the TimerTask class to define your task
        //             Create a subclass of TimerTask and @Override run()

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = 3;
            @Override
            public void run(){
                System.out.println("Hello!");
                count--;
                if(count <= 0){
                    System.out.println("Task Compelete!");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 1000, 1000);  // (task, delay, period between execution of task)
    }
}
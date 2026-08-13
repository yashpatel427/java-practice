
import java.time.LocalTime;

public class Alarmclk implements Runnable{

    private final LocalTime alarTime;

    Alarmclk(LocalTime alarTime) {
        this.alarTime = alarTime;
    }

    @Override
    public void run(){

        while (LocalTime.now().isBefore(alarTime)) { 
            try {
            Thread.sleep(1000);

            LocalTime now = LocalTime.now();

            System.out.printf("\r%02d:%02d:%02d", 
                                now.getHour(), 
                                now.getMinute(), 
                                now.getSecond()); // \r moves the cursor back tp the begining
                
            } catch (InterruptedException e) {
                System.out.println("Thread was intrrupted");
            }
        }
    }
}
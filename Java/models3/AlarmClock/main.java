
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // JAVA ALARM CLOCK

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime alarTime = null;

        while (alarTime == null) {
            try {
                System.out.print("Set an alarm :");
                String inputTime = scanner.nextLine();

                alarTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for " + alarTime);

            } catch (DateTimeParseException e) {
                System.out.println("Invalid Format. please use HH:MM:SS");
            }
        }

        Alarmclk alarmclk = new Alarmclk(alarTime);
        Thread alarmThread = new Thread(alarmclk);
        alarmThread.start();

        scanner.close();
    }
}

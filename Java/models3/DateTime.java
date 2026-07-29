
import java.time.LocalDateTime;

public class DateTime {

    public static void main(String[] args) {
        // How to work with dates & times with java
        //(LocalDate, LocalTime, LocalDateTime, UTC timestamp) 

        /*
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);

        //UTC

        Instant instant = Instant.now();
        System.out.println(instant);
         
        
        //Custom format
        LocalDateTime datetime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
        String newDateTime = datetime.format(formatter);

        System.out.println(newDateTime);
         */
        LocalDateTime dateTime1 = LocalDateTime.of(2026, 6, 25, 12, 25, 0);
        LocalDateTime dateTime2 = LocalDateTime.of(2026, 5, 25, 12, 25, 0);

        if (dateTime1.isAfter(dateTime2)) {
            System.out.println(dateTime1 + " is after the " + dateTime2);
        } else if (dateTime1.isBefore(dateTime2)) {
            System.out.println(dateTime1 + " is before the " + dateTime2);
        } else if (dateTime1.equals(dateTime2)) {
            System.out.println(dateTime1 + " is same as " + dateTime2);
        }

    }
}

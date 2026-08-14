
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Alarmclk implements Runnable{

    private final LocalTime alarTime;
    private final String filepath;
    private final Scanner scanner;

    Alarmclk(LocalTime alarTime, String filepath, Scanner scanner) {
        this.alarTime = alarTime;
        this.filepath = filepath;
        this.scanner = scanner;
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
        System.out.println("\nAlarm noise");
        playSound(filepath);
    }

    private void playSound(String filepath){

        File audioFile = new File(filepath);

        try( AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)){
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            System.out.print("Press Enter to stop the alarm: ");
            scanner.nextLine();
            clip.close();
            scanner.close();
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        }
        catch(LineUnavailableException e){
            System.out.println("File not available");
        }
        catch(IOException e){
            System.out.println("Error reading audio file");
        }
    }
}
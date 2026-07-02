
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class fwrite {

    public static void main(String[] args) {
        //How to write a file using java( 4 popular options)
        // FileWriter =Good for small and midium size text files
        // BufferredWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs 
        // fileOutputStream = Best for binary files (e.g., images, audio files) 
        // For multiline string use """  """.

        String filePath = "C:\\Users\\yp932\\OneDrive\\Desktop\\test.txt";
        String textContent = "This is text that is written in file\n This is yash";

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("The file has been written");
        } catch (FileNotFoundException e) {
            System.out.println("could not find the file");
        } catch (IOException e) {
            System.out.println("Could not write the file");
        }
    }
}

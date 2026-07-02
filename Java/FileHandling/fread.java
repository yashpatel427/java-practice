
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fread {

    public static void main(String[] args) throws IOException {
        // BufferedReader + FileReader: Best for reading text files line by line
        // FileInputtream : Best for binary files1(e.g., images, audio files)
        // RandomaccessFile : Best foe read\write specific potions of large file

        String filePath = "C:\\Users\\yp932\\OneDrive\\Desktop\\test.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not find the file");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }
}

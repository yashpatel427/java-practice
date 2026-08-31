
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try( FileWriter writer = new FileWriter("student.txt")) {

            writer.write("Name : Yash\nMarks : 85");

            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Something went wrong!");
        }

        try(BufferedReader reader = new BufferedReader(new FileReader("student.txt"))){
            
            String line;

            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch(IOException e){
            System.out.println("Something went wrong!");
        }
    }
}

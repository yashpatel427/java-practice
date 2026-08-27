
import java.util.ArrayList;
import java.util.Comparator;

public class Test{
    public static void main(String[] args) {
        
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("yash", 75));
        students.add(new Student("vivek", 90));
        students.add(new Student("vighnesh", 85));
        students.add(new Student("vraj", 74));

        students.sort(Comparator.comparing(Student :: getMarks).reversed());

        students.forEach(student ->  System.out.println(student.name + " : " + student.marks));
    }
}
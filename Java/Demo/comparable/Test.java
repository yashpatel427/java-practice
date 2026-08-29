
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test{
    public static void main(String[] args) {
        
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("yash", 30));
        students.add(new Student("vivek", 90));
        students.add(new Student("vighnesh", 85));
        students.add(new Student("vraj", 32));

        students.sort(Comparator.comparing(Student :: getMarks).reversed());

        students.forEach(student ->  System.out.println(student.name + " : " + student.marks));

        Predicate<Student> passed = student -> student.marks >= 40;

        System.out.println();
        students.forEach(student ->{
            if(passed.test(student)){
                System.out.println(student.name + " Passed.");
            } else {
                System.out.println(student.name + " Failed.");
            }
        });

        Predicate<Student> topStudent = student -> student.marks >= 80;

        System.out.println();
        students.forEach(student -> {
            if(topStudent.test(student)){
                System.out.println(student.name + " : " + student.marks);
            }
        });

        Function<Student, Integer> getMarks = student -> student.marks;
        System.out.println();
        System.out.println(getMarks.apply(students.get(0)));
    }
}
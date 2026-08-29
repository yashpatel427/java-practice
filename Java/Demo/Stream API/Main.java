
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

public class Main {

    public static void main(String[] args) {

        // A Stream in Java is a sequence of elements from a data source, such as a List or Set,
        // that allows you to process and transform the elements using operations like filtering, sorting, and mapping.
        // filter() → select elements
        // map() → transform elements .map(student -> student.name) elements are transformed into Strings from student object.
        // sorted() → sort elements
        // forEach() → perform an action collect
        // collect() → create a collection / result
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("yash", 50));
        students.add(new Student("vivek", 90));
        students.add(new Student("vighnesh", 85));
        students.add(new Student("vraj", 35));

        students.stream().filter(student -> student.marks >= 40)
                .sorted(Comparator.comparing(Student::getMarks))
                .forEach(student -> System.out.println(student.name + " : " + student.marks));

        List<Student> topStudents = students.stream()
                .filter(student -> student.marks >= 75)
                .collect(Collectors.toList());

        System.out.println();
        topStudents.forEach(student
                -> System.out.println(student.name + " : " + student.marks));
    }
}

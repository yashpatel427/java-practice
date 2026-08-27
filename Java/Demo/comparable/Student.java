

public class Student implements Comparable<Student>{

    String name;
    int marks;

    Student(String name, int marks){
        this.marks = marks;
        this.name = name;
    }

    public int getMarks(){
        return marks;
    }
    @Override
    public int compareTo(Student other){
        return this.marks - other.marks;
    }

}

public class Student {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // CONSTRUCTOR
     Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }
    // once constuctor is assinged with values then values can be used in methods as well.

    void study() {
        System.out.println(this.name + " is studying.");
    }
}

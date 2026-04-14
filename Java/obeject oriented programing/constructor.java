
public class constructor {

    public static void main(String[] args) {
        // CONSTRUCTOR = A special method to initialize objects. you can pass arguments to a constructor and set up initial value
        Student student1 = new Student("yash", 20, 8);
        Student student2 = new Student("vighnesh", 19, 7.5);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        student1.study();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        student2.study();

    }
}

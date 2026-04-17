public class Student extends Person{
    
    double gpa;

   Student(String firstname, String lastname, double gpa) {
    super(firstname,lastname);
    this.gpa = gpa;
    }

    void showGpa(){
        System.out.println(this.firstname + "'s gpa is: " + this.gpa);
    }
}
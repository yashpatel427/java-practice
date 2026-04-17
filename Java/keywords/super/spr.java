public class spr {
    public static void main(String[] args) {
        
        // SUPER = Refer to the parent class (subclass <- superclass) used in constructors and method overriding
        //         calls the parent constructor to initialize attributes

        Person person = new Person("Yash", "Patel");
        Student student = new Student("Vivek", "Varia", 8.5);
        Eployee eployee = new Eployee("Vighnesh", "Kamthe", 50000);

        person.showName(); 
        student.showName();
        student.showGpa();
        eployee.showSalary();
    }
}
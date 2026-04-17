public class Eployee extends Person{

    int salary;

    Eployee(String firstname, String lastname, int salary) {
        super(firstname, lastname);
        this.salary = salary;
    }

    void showSalary(){
        System.out.println(this.firstname + "'s salary is $" + this.salary);
    }
}
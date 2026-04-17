public class Person{

    String firstname;
    String lastname;

     Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    void showName(){
        System.out.println("The person's name is " + this.firstname + " " + this.lastname);
    }
}
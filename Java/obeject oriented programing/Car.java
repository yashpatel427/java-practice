
public class Car {

    //String maker = "Ford";
    String model;  //= "Mustang";
    String color;
    // int year = 2024;
    // double price = 75000.95;
    // boolean isRunning = false;

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* void start(){
       isRunning = true;
        System.out.println("You started the car");
    }
    void stop(){
        isRunning =false;
        System.out.println("you stoped the car");
    }*/
    void drive() {
        System.out.println("You are driving a " + this.color + " " + this.model);
    }
}

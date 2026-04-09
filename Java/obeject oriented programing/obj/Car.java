public class Car{
    String maker = "Ford";
    String model = "Mustang";
    int year = 2024;
    double price = 75000.95;
    boolean isRunning = false;

    void start(){
       isRunning = true;
        System.out.println("You started the car");
    }
    void stop(){
        isRunning =false;
        System.out.println("you stoped the car");
    }
}
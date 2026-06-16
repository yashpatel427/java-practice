public class main{
    public static void main(String[] args) {
        
        //They help protect object data and add rules for accessing or modifying them.
        //Getters = Mehods that makes a field readable.
        //Setters = Mehods that makes a field writeable.

        Car car = new Car("supra", "white", 50000);

        car.setColor("black");
        car.setPrice(25000);

        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());
    }
}
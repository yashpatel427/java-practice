public class main{
    public static void main(String[] args) {
        // Composition = Represents a "part of" relationship between objects.
        //               For example, Engine is part of a car.
        //               Allows complex objects to be constructed from smaller objects.

        Car car = new Car("Corvette", 2012, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();
    }
}
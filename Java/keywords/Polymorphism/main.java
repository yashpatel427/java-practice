public class main{
    public static void main(String[] args) {
        
        // Polymorphism = "POLY" means many & "MORPH" means shape
        //                 Objects can be identify as other objects.
        //                 Objects can be treated as objects of a common superclass.
        //                 for  Polymorphism both inheritance and interface ca be used

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};

        for (Vehicle vehicle : vehicles) {

         vehicle.go();   
        }
    }
}
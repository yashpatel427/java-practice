
public class arrobj {

    public static void main(String[] args) {
        Car[] cars = {new Car("Mustang", "red"), // this can be called anonymous objects they are whithout idendifire
            new Car("supra", "yellow"),//  like, Car car1 = new Car("Mustang", "red") and so on.
            new Car("scorpio", "white")};

        for (Car car : cars) {
            car.color = "black";
        }

        for (Car car : cars) {
            car.drive();
        }
    }
}

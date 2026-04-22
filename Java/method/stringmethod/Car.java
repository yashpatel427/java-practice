
public class Car {

    String maker;
    String model;
    int year;
    String color;

    public Car(String maker, String model, int year, String color) {
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.maker + " " + this.model + " " + this.year + " " + this.color;
    }

}

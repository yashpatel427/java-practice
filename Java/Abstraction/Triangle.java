
public class Triangle extends Shape {

    double heigth;
    double base;

    public Triangle(double height, double base) {
        this.heigth = height;
        this.base = base;
    }

    @Override
    double area() {
        return 0.5 * heigth * base;
    }

}

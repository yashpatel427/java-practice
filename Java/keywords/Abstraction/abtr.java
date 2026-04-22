
public class abtr {

    public static void main(String[] args) {

        // Abstract =Used to define abstract classes and methods.abstraction is the process of hiding implementation details
        //           and showing only the essential feature.
        //           abstract classes can't be instantiated directly.
        //           can contain 'abstract' methods (which must be implemented)
        //           can contain 'concrete' methods (which are inherited)
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(4, 5);
        Triangle triangle = new Triangle(5, 3);

        circle.display();
        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(triangle.area());
    }

}

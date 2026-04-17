public class mthdover{
    public static void main(String[] args) {
        
        //Method overriding = When a subclass provides its own implementation of a method that is already defined.
        //                    Allows for code reusability and give specific implementation.
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();

        cat.move();
        dog.move();
        fish.move();
    }
}
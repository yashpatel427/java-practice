public class inheritance{
    public static void main(String[] args) {
        //inheritance = one class inherits the attributes and method from another class.
        //              Child <- Parent <- Grandparent

        Cat cat = new Cat();
        Dog dog = new Dog();
        Plant plant = new Plant();

        System.out.println(cat.isAlive);
        System.out.println(cat.lives);
        cat.eat();
        cat.speak();

        System.out.println(dog.isAlive);
        System.out.println(dog.lives);
        dog.eat();
        dog.speak();

        System.out.println(plant.isAlive);
        plant.photosynthesis();

    }
}
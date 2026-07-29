
public class main {

    public static void main(String[] args) {
        // Anonymous classes = A class that dorsn't have a name. Can not be reused.
        //                     Add custom behavior without having to create a new class.
        //                     Ofyen used for one time uses (TimerTask, Runnable, callbacks).

        Dog dog1 = new Dog();
        Dog dog2 = new Dog() {     // Custom behavior through Anonymous class
            @Override
            void speak() {
                System.out.println("Scooby Doo goes *Ruh Roh*");
            }
        };

        dog1.speak();
        dog2.speak();
    }
}

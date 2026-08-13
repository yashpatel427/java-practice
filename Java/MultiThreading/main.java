
public class main {

    public static void main(String[] args) {
        // Multithreading = Enables a program to run multiple thread concurrently
        //                  (Thread = A set of indtruction that run idependently)
        //                  Useful for background task or time-consuming operations.

        Thread thread1 = new Thread(new Myrunnable("ping")); // myrunnable is anonymous object
        Thread thread2 = new Thread(new Myrunnable("pong"));

        System.out.println("Game Start!");

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // Using join() method will make main thread wait until other thread ends 
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        System.out.println("Game Over!");
    }
}

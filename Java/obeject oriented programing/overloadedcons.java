
public class overloadedcons {

    public static void main(String[] args) {
        // OVERLOADED CONSTRUCTOR = Allow a class to have multiple constructors with
        //                          different parameter lists.
        //                          Enable objects to initialized in various ways.
        User user1 = new User("yash");
        User user2 = new User("vighnesh", "vighnesh@gmail.com");
        User user3 = new User("vivek", "vivek@gmail.com", 20);
        User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}

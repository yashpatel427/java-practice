
public class Friend {

    static int numOfFriends; // This belongs to class rather then object because of static keyword.
    String name;

    Friend(String name) {
        this.name = name;
        numOfFriends++;
    }

    static void showFriends() {
        System.out.println("You have total of " + numOfFriends + " friends"); // numOfFriends is static attribut so we don't need
                                                                              // to use this.variable to call variable.
    }
}

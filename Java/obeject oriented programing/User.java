
public class User {

    String username;
    String email;
    int age;

    User() {
        this.username = "Guest"; // default value
        this.email = "Not provided"; // default value
        this.age = 0;  // default value
    }

    User(String username) {
        this.username = username;
        this.email = "Not provided"; // default value
        this.age = 0;  // default value
    }

    User(String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 0;  // default value
    }

    User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

}

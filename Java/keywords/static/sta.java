
public class sta {

    public static void main(String[] args) {
        // Static = Makes a variable or method belong to the class rather than to any specific 
        //          object.
        //          commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("Yash");
        Friend friend2 = new Friend("vighnesh");
        Friend friend3 = new Friend("vivek");

        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);
        Friend.showFriends();

        // math class = it can be used whithout creating math object, it is a static utility method
        // Math.round(3.23);
    }
}

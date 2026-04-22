
import java.util.Scanner;

public class substring {

    public static void main(String[] args) {
        //.substring() = A method used to extract a portian of string
        //.substring(startIndex, lastIndex)
        Scanner sc = new Scanner(System.in);
        String email;

        System.out.print("Enter your email: ");
        email = sc.nextLine();

        if (email.contains("@")) {

            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);
            System.out.println("Your username is = " + username);
            System.out.println("Your domain is = " + domain);

        } else {
            System.out.println("Email must have @");
        }

    }
}

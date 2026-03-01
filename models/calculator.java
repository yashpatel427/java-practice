
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter a operator(+, -, *, /, ^): ");
        operator = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        switch (operator) {
            case '+' ->
                result = num1 + num2;
            case '-' ->
                result = num1 - num1;
            case '*' ->
                result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("It can not be devided by zero");
                    validOperator = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' ->
                Math.pow(num1, num2);
            default -> {
                System.out.println("It is not a valid operator");
                validOperator = false;
            }

        }
        if (validOperator) {
            System.out.println(result);
        }

        sc.close();
    }
}

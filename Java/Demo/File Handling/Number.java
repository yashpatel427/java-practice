public class Number{
    public static void main(String[] args) {
        
        try {
            int[] number = {10, 20, 30};
            System.out.println(number[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");
        }
    }
}
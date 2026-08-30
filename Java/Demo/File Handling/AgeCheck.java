public class AgeCheck{
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void checkAge(int age) throws Exception{
        if(age < 18){
            throw new Exception("Your must be older than 18.");
        }else{
            System.out.println("Access granted.");
        }
    }
}
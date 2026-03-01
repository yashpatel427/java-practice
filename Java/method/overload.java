public class overload{
    public static void main(String[] args) {
        // OVERLOADED METHODS = methods that share same name but have different parameters
        String pizza = bakePizza("flat bread", "mozzarela", "olive");
        System.out.println(pizza + " pizza");
    }
    static String bakePizza(String bread){
        return bread;
    }
    static String bakePizza(String bread, String cheese){
        return bread + " " + cheese;
    }
    static String bakePizza(String bread, String cheese, String toping){
        return toping + " " + bread + " " + cheese;
    }
}
public class main{
    public static void main(String[] args) {
        
        // Generics = A concept where you can write a class, interface or method that is 
        //            compatible with different data types.
        //            <T> type parameter (placeholder that gets replaced with a real type)
        //            <String> type arguments (specifies the type)

        Product<String, Double> product1 = new Product<>("apple", 0.50);
        Product<String, Integer> product2 = new Product<>("ticket", 15);

       System.out.println(product1.getItem());
       System.out.println(product2.getItem());
    }
}
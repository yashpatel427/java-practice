public class wrapp{
    public static void main(String[] args) {
        //Wrapper classes = Allow priitive values (int, char, double, boolean) to be used as objects.
        //                  "Wrap them in an object"
        //                   generally, don't wrap primitive unless you need an object.
        //                   Allows use of collection farmework and static utility methods.

        // Autoboxing
       /* Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true; */
        
        // Unboxing
        /* int x = a;
         double y = b;
         char z = c; */

       // convert primitive to string

      /* String a = Integer.toString(123);
       String b = Double.toString(3.14);
       String c = Character.toString('#');
       String d = Boolean.toString(true);

       String x = a + b + c +d;

       System.out.println(x);  */

       // convert string to primitive

      /* int a = Integer.parseInt("123");
       double b = Double.parseDouble("3.14");
       char c = "Pizza".charAt(0);
       boolean d = Boolean.FALSE; // or Boolean("true") */

       char letter = 'A';

       System.out.println(Character.isLetter(letter));
       System.out.println(Character.isUpperCase(letter));

    }
}
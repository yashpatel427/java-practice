public class printf{
    public static void main(String[] args) {
     //printf() is a method to format the output
     //%[flags][width][.precision][specifier character=sp]
     /*for 12.56 use precision as %.2specifier char

      for width %0sp=zero padding
      %3sp= right justified padding
      %-3sp= left  "       "

       for flags %+sp = positive output
       %,sp = coma grouping separator(10,000 , 100,000)
       %(sp = (-num)
       % sp = display a minus if negative or space if positive
     */
     String name="Yash";
     char Firstletter='Y';
     int age=21;
     double height=175.5;
     boolean isStudent=true;

     System.out.printf("Hello %s\n", name); 
     System.out.printf("The first letter of your name is %c\n", Firstletter);  
     System.out.printf("You are %d years old\n", age);  
     System.out.printf("Your height is %.1f cm\n", height);  
     System.out.printf("Student: %b\n", isStudent);
     System.out.printf("%s is a %d years old boy\n", name, age);
    }
}

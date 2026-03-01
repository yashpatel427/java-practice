import java.util.Scanner;
public class scanner {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //My age
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("You are " + age + " years old");
        
        //Area Of Rectangle
        System.out.println("Enter the width ");
        double width = sc.nextDouble();
        System.out.println("Enter the heigth ");
        double heigth = sc.nextDouble();
        System.out.println("Width is " + width + " heigth is " +  heigth);
        double area = heigth*width;
        System.out.println("Area Of Rectangle is: " + area);       
        
        //Area Of Circle
        System.out.println("Enter the Radius ");
        double r = sc.nextDouble();
        double Area = 3.14*r*r;
        System.out.println("Area of circle is: " + Area);      
        
        sc.close();
        
        
        
    }
    
}

        
import java.util.Scanner;
public class bank{
    public static void main(String []args){
        //compound interest calculator
      Scanner sc = new Scanner(System.in);
      double principle;
      double rate;
      int years;
      int timesCompouded;
      double amount;

      System.out.print("Enter the principle amount: ");
      principle = sc.nextDouble();
      System.out.print("Enter the rate of interest in %: ");
      rate = sc.nextDouble()/100;
      System.out.print("Enter the years of deposit: ");
      years = sc.nextInt();
      System.out.print("Enter the how many times the principle is compounded: ");
      timesCompouded = sc.nextInt();
      amount = principle * Math.pow(1 + rate/timesCompouded, timesCompouded*years);
      System.out.printf("The amount after %d is = $%.2f ", years, amount);

      sc.close();

    }
}
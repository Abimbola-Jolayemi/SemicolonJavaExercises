import java.util.Scanner;

public class PoundsToKg{
  public static void main (String []args){
   Scanner input = new Scanner (System.in);

   System.out.print("Enter value (in pounds): ");
   double pounds = input.nextDouble();

   double kilograms = pounds * 0.454;

   System.out.print(pounds + "pounds:" + " " + kilograms + "kilograms");
 }
}
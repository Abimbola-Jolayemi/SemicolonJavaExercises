import java.util.Scanner;

public class FeetToMeter{
   public static void main (String []args){
   Scanner input = new Scanner(System.in);

   System.out.print("Enter number in feet:");
   double feet = input.nextDouble();
 
   System.out.print("In meters:");
   double meters = (feet * 0.305);

   System.out.println(meters);
}

}
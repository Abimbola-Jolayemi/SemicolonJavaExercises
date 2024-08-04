import java.util.Scanner;

public class Interest{
  public static void main (String []args){
  Scanner input = new Scanner (System.in);

   //Receive input for balance from the user
   System.out.print("Enter balance: ");
   int balance = input.nextInt();

   //Receive input for interestRate from user
   System.out.print("Enter interest rate in %: ");
   double interestRate = input.nextDouble();

   //Divide the interestRate by 1200
   double intRate = interestRate / 1200;

   //Multiply the result for the division by balance value to get the interest
   double interest = balance * intRate;

   System.out.print("The interest is:" + " " + interest);

}
   
   
}

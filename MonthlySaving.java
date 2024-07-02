import java.util.Scanner;

public class MonthlySaving{
   public static void main (String []args){

	Scanner input = new Scanner (System.in);
	
	//Prompt user to enter monthly savings amount
	System.out.print ("Enter monthly saving amount: ");
	int monthlySaving = input.nextInt();

	//Prompt user to enter monthly interest rate
	System.out.print ("Enter annual interest rate: ");
	double annualInterestRate = input.nextDouble();
	double monthlyInterestRate = annualInterestRate / 100;
	double interestRate = monthlyInterestRate / 12;

	//Set intial account value to zero
	double initialAccountValue = 0;

	//Allow user enter the number of months
	System.out.print("Enter the number of months:");
  	int number = input.nextInt();

	//Repeat the step below to display account value for the sixth month
	for (int i =1; i <= number; i++){

	   initialAccountValue += monthlySaving;

	   double interest = initialAccountValue * interestRate;

	   initialAccountValue += interest;

	   System.out.println("The amount after " + i + "month: " + initialAccountValue);
        }

	
   }
}
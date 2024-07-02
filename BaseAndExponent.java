import java.util.Scanner;

public class BaseAndExponent{
   public static void main (String []args){

	Scanner input = new Scanner (System.in);

	System.out.print("Enter the first number:");
	int firstNumber = input.nextInt();

	System.out.print("Enter the second number:");
	int secondNumber = input.nextInt();

	double power = Math.pow(firstNumber, secondNumber);
	
	System.out.printf("The value of %d%s%d%s%.0f", firstNumber, " raised to the power of ", secondNumber, " is ", power);
   }
}
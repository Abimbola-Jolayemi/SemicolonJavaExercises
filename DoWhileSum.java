import java.util.Scanner;

public class DoWhileSum{
   public static void main (String []args){

	Scanner input = new Scanner (System.in);

	String usersInput;

	do {
	System.out.println("Enter first number: ");
	int firstNumber = input.nextInt();

	System.out.println("Enter second number: ");
	int secondNumber = input.nextInt();
	   
	int sum = firstNumber + secondNumber;

	System.out.println("The sum of the two numbers is: " + sum);

	System.out.print("Do you wish to repeat this process? (yes/no)");
	usersInput = input.next();

	}while (usersInput.equalsIgnoreCase("yes"));

	System.out.print("Merci Bouquou Mademoiselle/Monsieur!!!");

   }
}
import java.util.Scanner;

public class Factorial{
   public static void main (String []args){

	Scanner input = new Scanner (System.in);

	System.out.print("Enter a non-negative integer: ");
	int number = input.nextInt();

	if (number < 0) {
		System.out.print("Pls, enter a non-negative integer: ");
	} else {
		long factorial = 1;
		for (int i = 1; i <= number; i++){
			factorial *= i;
		}
		System.out.print("The factorial of " + number + " is " + factorial);
	}
   }
}
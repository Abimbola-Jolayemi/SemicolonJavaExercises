import java.util.Scanner;

public class FactorialEx{
   public static void main (String []args){

	Scanner input = new Scanner (System.in);

	System.out.print("Enter the value of x: ");
	int x = input.nextInt();

	System.out.print("Enter the number of terms to calculate e^x: ");
	int numberOfTerms = input.nextInt();

	double xPower = 1.0;
	double eRaisedToPowerX = 1.0;
	double factorial = 1.0;

		for (int i = 1; i < numberOfTerms; i++){
			factorial *= i;
			xPower *= x;
			eRaisedToPowerX += xPower/factorial;
		}
		System.out.printf("The value of e^x by %d%s%.2f", numberOfTerms, " terms is ", eRaisedToPowerX);
	}
   }

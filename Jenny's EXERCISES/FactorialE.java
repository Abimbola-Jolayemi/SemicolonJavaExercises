import java.util.Scanner;

public class FactorialE{
   public static void main (String []args){

	Scanner input = new Scanner (System.in);

	System.out.print("Enter the number of terms to calculate: ");
	int numberOfTerms = input.nextInt();

	double e = 1.0;
	double factorial = 1.0;

		for (int i = 1; i < numberOfTerms; i++){
			factorial *= i;
			e += 1.0/factorial;
		}
		System.out.printf("The value of e by %d%s%.2f", numberOfTerms, " terms is ", e);
	}
   }

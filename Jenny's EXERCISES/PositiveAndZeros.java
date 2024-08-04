import java.util.Scanner;

public class PostiveAndZeros{
   public static void main (String []args){

	Scanner input = new Scanner (System.in);

	int positive = 0;
	int negative = 0;
	int zeros = 0;

	System.out.print("Enter the no of terms: ");
	int noOfTerms = input.nextInt();

	for (int i = 1; i <= noOfTerms; i++){
		System.out.printf("Enter number %d%n", i);
		int number = input.nextInt();

		if (number > 0){
			positive++;
		} else if (number < 0){
			negative++;
		} else {
			zeros++;
		}

		System.out.printf("The number of positive numbers is %d%n", positive);

		System.out.printf("The number of negative numbers is %d%n", negative);

		System.out.printf("The number of zeros is %d%n", zeros);
	}

	
   }

}
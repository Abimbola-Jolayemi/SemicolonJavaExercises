import java.util.Scanner;

public class SumAndAverage{
   public static void main (String []args){

	Scanner input = new Scanner (System.in);

	

	int sum = 0;
	int average = 0;
	int noOfScore = 10;
	
	

	for (int score = 1; score <= 10; score++){
		System.out.print("Enter a score: ");
		int scoreInput = input.nextInt();
		sum = sum + scoreInput;
	}

	 average = (sum / noOfScore);

	System.out.printf("The sum is %d%n", sum);
	System.out.printf("The average is %d", average);
   }
}
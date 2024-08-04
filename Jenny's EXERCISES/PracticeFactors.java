import java.util.Scanner;

public class PracticeFactors{
   public static void main (String []args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number to check its factors: ");
	int number = input.nextInt();

	for (int factor = 1; factor <= number; factor++){
		if (number % factor == 0){
			System.out.print(" " + factor);
		}
	}
   }
}
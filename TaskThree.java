import java.util.Scanner;

public class TaskThree{
   public static void main(String []args){

	Scanner input = new Scanner(System.in);

	int sum = 0;
	int noOfInput = 0;

	for(int count = 1; count <= 10; count++){
		System.out.print("Enter score: ");
		int score = input.nextInt();

		noOfInput++;
		sum = sum + score;
	}

	int average = sum / noOfInput;
	System.out.println("The sum of the score is: " + sum);
	System.out.print("The average score is: " + average);
   }
}
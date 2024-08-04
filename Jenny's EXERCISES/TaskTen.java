import java.util.Scanner;

public class TaskNine{
   public static void main(String []args){

	Scanner input = new Scanner(System.in);

	int sum = 0;
	int noOfInput = 0;

	for(int index = 1; index <= 10; index++){
		System.out.print("Enter score between 0 and 100: ");
		int score = input.nextInt();

		if (score >= 0 && score <= 100){
			noOfInput++;
			sum = sum + score;
		}
	}
	int average = sum / noOfInput;
	System.out.println("The average of score between 0 and 100 is: " + average);
	
   }
}
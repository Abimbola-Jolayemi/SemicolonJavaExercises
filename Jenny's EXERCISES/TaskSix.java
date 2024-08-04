import java.util.Scanner;

public class TaskSix{
   public static void main(String []args){

	Scanner input = new Scanner(System.in);

	int sum = 0;
	int noOfInput = 0;

	for(int index = 1; index <= 10; index++){
		System.out.print("Enter score: ");
		int score = input.nextInt();

		if (score % 2 == 0){
			noOfInput++;
			sum = sum + score;
		}
	}
	int average = sum / noOfInput;
	System.out.println("The average even score is: " + average);
	
   }
}
import java.util.Scanner;

public class TaskEight{
   public static void main(String []args){

	Scanner input = new Scanner(System.in);

	int sum = 0;

	for(int index = 1; index <= 10; index++){
		System.out.print("Enter score between 0 and 100: ");
		int score = input.nextInt();

		if (score >= 0 && score <= 100){
			sum = sum + score;
		} else{
			System.out.println("Invalid score!!!");
			break;
		}
	}

	System.out.println("The sum of score is: " + sum);
	
   }
}
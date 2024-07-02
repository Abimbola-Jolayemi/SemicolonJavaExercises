import java.util.Scanner;

public class Question1{
   public static void main(String []args){

	Scanner input = new Scanner(System.in);

	int sum = 0;

	for (int counter = 1; counter <= 10; counter++){
		System.out.println("Enter score: ");
		int[] score = input.nextInt();
		
		if (score % 2 == 0){
			sum = sum + score;
		}
	} 
		System.out.print("The sum of the even scores: " + sum);
   }
}
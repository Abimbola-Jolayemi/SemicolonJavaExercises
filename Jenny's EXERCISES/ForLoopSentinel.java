import java.util.Scanner;

public class ForLoopSentinel{
   public static void main(String []args){

	Scanner input = new Scanner(System.in);

	int sum = 0;
	int sentinelValue = -1;

	for (int score = 0; score != sentinelValue;){
		   sum = sum + score;
	    	   System.out.println("Enter score (or -1 to quit): ");
		   score = input.nextInt();
	} 
		System.out.print(sum);
   }
}
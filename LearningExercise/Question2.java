import java.util.Scanner;

public class Question2{
  public static void main (String []args){

	Scanner input = new Scanner(System.in);
 
	int sum = 0;
	
	for(int index = 1; index <= 10; index++){
		
		System.out.println("Enter score: ");
		int score = input.nextInt();
		
			if (index % 2 == 0){
			sum = sum + score;
		}
	}
		
	System.out.print("The sum of the even indices scores: " + sum);
  }
}
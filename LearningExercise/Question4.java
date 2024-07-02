import java.util.Scanner;

public class Question4{
   public static void main (String []args){

	Scanner input = new Scanner (System.in);

	for (int index = 1; index <= 10; index++){
	   System.out.print("Enter score: ");
	   int score = input.nextInt();
		if (index % 2 == 0){
		   continue;
		}
		System.out.print(score);
	}
	
   }
}
import java.util.Scanner;

public class Grade{
   public static void main (String []args){

	Scanner input = new Scanner(System.in);

 	System.out.print("Enter a score: ");
	int score = input.nextInt();

	if (score >= 80){
		System.out.print("Your grade is A");
	}

	if (score >= 70 && score <= 79){
		System.out.print("Your grade is B");
	}

	if (score >= 50 && score <= 69){
		System.out.print("Your grade is C");
	}

	if (score <= 49){
		System.out.print("Your grade is D");
	}
   }
}
import java.util.Scanner;

public class GradeWithIfElse{
   public static void main (String []args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter your score: ");
	int score = input.nextInt();

	if (score >= 80 && score <= 100){
 		System.out.print("Your grade is A");
	}else if (score >= 70 && score <= 79){
		System.out.print("Your grade is B");
	}else if (score >= 50 && score <= 69){
		System.out.print("Your grade is C");
	}else if (score <= 49 && score >= 0){
		System.out.print("Your grade is D");
	}else{
		System.out.print("Invalid score");
	}
   }
}
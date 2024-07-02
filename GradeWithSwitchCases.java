import java.util.Scanner;

public class GradeWithSwitchCases{
   public static void main (String []args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Score: ");
	int score = input.nextInt();


	switch(score){
		case 80:
		   System.out.print("Grade is A");
		break;
		case 70:
		   System.out.print("Grade is B");
		break;
		case 60:
		   System.out.print("Grade is C");
		break;
		case 50:
		   System.out.print("Grade is D");
		break;
		default:
		   System.out.print("Invalid");
 	}
   }
}
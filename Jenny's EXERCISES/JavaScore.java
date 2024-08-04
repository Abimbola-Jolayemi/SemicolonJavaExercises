import java.util.Scanner;

public class JavaScore{
   public static void main (String []args){
	Scanner input = new Scanner(System.in);

	//Collect input for java score
	System.out.print ("Enter your Java Score: ");
	int score = input.nextInt();

	//If score is greater than or equal to 60, display "You pass the exam"
	//If score is less than 60, display "You failed the exam"
	//If score is equal to -1, terminate program
	if (score == -1) {
	  System.exit(0);
	} else if (score > 60 || score == 60){
	  System.out.print("You passed the exam");
	} else{
	  System.out.print("You failed!!!");
	}
   }

}
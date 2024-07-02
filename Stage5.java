import java.util.Scanner;

public class Stage5{
   public static void main (String []args){

	Scanner input = new Scanner (System.in);
	
	int i = 1;
	
	while(i <= 5){
		System.out.print("Enter Score(or -1 to quit): ");
		int score = input.nextInt();

		if (score = -1){
		   break;
		}else if (score >= 80 && score <= 100){
 		   System.out.print("Your grade is A");
		}else if (score >= 70 && score <= 79){
		   System.out.print("Your grade is B");
		}else if (score >= 50 && score <= 69){
		   System.out.print("Your grade is C");
		}else if (score <= 49 && score >= 0){
		   System.out.print("Your grade is D");
		}else{
		   System.out.println("Invalid score");
		}

		System.out.println();
		i++;
	}
   }
}
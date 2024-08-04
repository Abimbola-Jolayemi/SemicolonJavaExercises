import java.util.Scanner;

public class Game{
  public static void main (String []args){

	Scanner input = new Scanner (System.in);

	int computer = (int) (Math.random () * 3);

	System.out.print ("Scissor(0), rock (1), paper(2): ");
	int user = input.nextInt();

	System.out.print ("The computer chose: ");

	switch (computer){
	   case 0:
		System.out.print("Scissor");
	   	break;
	   case 1:
		System.out.print("Rock");
		break;
	   case 2:
		System.out.print("Paper");
	}

	System.out.print(" You are: ");
	
	switch (user){
	   case 0:
		System.out.print("Scissor");
	   	break;
	   case 1:
		System.out.print("Rock");
		break;
	   case 2:
		System.out.print("Paper");
	}

	if (computer == user){
	   System.out.println(" too. It is a draw");
	} else {
	   boolean win = (user == 0 && computer == 2) || (user == 0 && computer == 1) || (user == 2 && computer == 1);

		if (win) {
		  System.out.println(". You won!!!");
		} else {
		  System.out.println(". You lose!!!");
		}
	}

  }
}
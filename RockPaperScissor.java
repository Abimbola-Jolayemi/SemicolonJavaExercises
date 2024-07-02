import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        int scissor = 0;
        int rock = 1;
        int paper = 2;

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        // Generate computer's choice
        int computerSelection = random.nextInt(3);

        // Prompt user for their choice
        System.out.println("Enter a number (0: Scissor, 1: Rock, 2: Paper): ");
        int userSelection = input.nextInt();

        // Validate user input
        if (userSelection < 0 || userSelection > 2) {
            System.out.println("Invalid input. Please enter 0, 1, or 2.");
            return;
        }

        // Determine the choices for the computer
        System.out.print("The computer chose ");
        switch (computerSelection) {
            case 0:
                System.out.println("Scissor.");
                break;
            case 1:
                System.out.println("Rock.");
                break;
            case 2:
                System.out.println("Paper.");
                break;
        }

	//Determine the choice for the user
        System.out.print("You chose ");
        switch (userSelection) {
            case 0:
                System.out.println("Scissor.");
                break;
            case 1:
                System.out.println("Rock.");
                break;
            case 2:
                System.out.println("Paper.");
                break;
        }

        // Compare the selection
        if (userSelection == computerSelection) {
            System.out.println("It's a draw.");
        } else if (userSelection == scissor && computerSelection == paper){
            System.out.println("You win!");
        }else if (userSelection == rock && computerSelection == scissor){
	    System.out.println("You win!");
	} else if (userSelection == paper && computerSelection == rock){
	    System.out.println("You win!");
	} else {
            System.out.println("You lose.");
        }
    }
}
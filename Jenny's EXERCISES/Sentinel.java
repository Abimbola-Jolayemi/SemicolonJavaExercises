import java.util.Scanner;

public class Sentinel{
   public static void main(String []args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	while(number != -1){
		System.out.println("Welcome to my banking app");
		System.out.print("Enter name: ");
		String name = input.next().toUpperCase();

		System.out.print("Hi " + name + ", enter 1 to continue or another number to quit: ");
		int num = input.nextInt();

		switch(num){
		   case 1:
		   String listOfOptions = """
			 1. Transfer
			 2. Buy Airtime
			 3. Buy Data
			 4. Share Data
			 99. Go back
			 """;

		     System.out.print(listOfOptions);
			System.out.println("Select an option to proceed");
			int option = input.nextInt();

			  switch (option){
				case 1: System.out.println("Transfer");
				  break;
				case 2: System.out.println("Buy Data");
				  break;
				case 3: System.out.println("Share Data");
				  break;
				case 4: System.out.println("Buy Data");
				  break;
				case 99: System.out.println("Back");
				  break;
				default: System.out.println("Invalid option");
			  }

		break;
		default: System.out.print("Invalid input");
		}

	number = input.nextInt();
	}

   }
}
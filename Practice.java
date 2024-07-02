import java.util.Scanner;

public class Practice{
   public static void main (String []args){

	Scanner input = new Scanner (System.in);

	System.out.println("Welcome to the E-banking App!!!");
	System.out.print("Enter name: ");
	String name = input.next().toUpperCase();

	int counter = 0;
	while (counter <= 2){
	   System.out.println("Hi " + name + ", Pls enter 1 to proceed, or any other value to exit page: ");
	int userInput = input.nextInt();

	switch (userInput){

	   case 1:
		String options = """
			 1. Transfer
			 2. Buy Airtime
			 3. Buy Data
			 4. Share Data
			 99. Go back
			 """;

	System.out.print(options);

	System.out.println("Enter a number to get started: ");
	int number = input.nextInt();

	  switch(number){
	   case 1: 
		System.out.println("Transfer");
		  break;

	   case 2: 
		System.out.println("Buy airtime");
		  break;
                          
	   case 3: 
		System.out.println("Buy data");
		  break;

	   case 4: 
		System.out.println("Share Data");
		  break;

	   case 99: 
		System.out.println("Go Back");
		  break;

	   default:
		System.out.println("Invalid");
	  }
	
	break;

        default:
	System.out.print("Invalid ");
	
	}
		counter++;
	}

	}

}
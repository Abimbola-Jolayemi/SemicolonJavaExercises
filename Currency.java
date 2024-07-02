import java.util.Scanner;

public class Currency{
   public static void main (String []args){
	Scanner input = new Scanner(System.in);

	//Collect exchange rate from user
	System.out.print ("Enter exchange rate: ");
	double exchangeRate = input.nextDouble();

	//prompt user to enter 0 to convert to dollars, or 1 to convert to RMB
	System.out.print ("Enter 0 to convert to dollars and 1 to convert to RMB: ");
	int number = input.nextInt();

	//Prompt user to enter amount to be converted
	System.out.print ("Enter amount to be converted: ");
	int amount = input.nextInt();

	//Let 'dollarsToRmb' represent amount to be converted multiplied by exchangeRate
	//Let 'rmbToDollars' represent amount to be converted divided by exchangeRate
	double dollarsToRmb = amount * exchangeRate;
	double rmbToDollars = amount / exchangeRate;

	//Display result in either dollars or RMB
	if (number == 0) {
		System.out.printf("Amount in RMB: %f", dollarsToRmb);
	} else if (number == 1){
		System.out.printf("Amount in U: %f", rmbToDollars);
	}
   }
}
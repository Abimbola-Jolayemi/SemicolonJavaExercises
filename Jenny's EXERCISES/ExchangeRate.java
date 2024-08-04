import java.util.Scanner;

public class ExchangeRate{
  public static void main (String []args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter an amount to be converted: ");
	double amount = input.nextDouble();

	System.out.print("Enter exchange rate: ");
	double exchangeRate = input.nextDouble();

	System.out.print("Enter 0 (USD to RMB) or 1 (RMB to USD): ");
	int number = input.nextInt();

	if (number == 0){
	  double amountInRMB = amount * exchangeRate;
	  System.out.printf("The amount in RMB: %.2f", amountInRMB);
	} else if (number == 1){
	  double amountInUsd = amount / exchangeRate;
	  System.out.printf("The amount in USD: %.2f", amountInUsd);
	}
  }

}
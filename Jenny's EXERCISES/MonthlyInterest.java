import java.util.Scanner;

public class MonthlyInterest{
  public static void main (String []args){

	Scanner input = new Scanner (System.in);

	System.out.print("Enter monthly value: ");
	int monthlyValue = input.nextInt();

	System.out.print("Enter interest rate: ");
	double interestRate = input.nextDouble();

	double percentageInterestRate = interestRate / 1200;

	double monthlyInterest = monthlyValue *	percentageInterestRate;

	System.out.printf("The interest: %f", monthlyInterest);
  }
}
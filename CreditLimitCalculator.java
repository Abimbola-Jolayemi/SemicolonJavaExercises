import java.util.Scanner;

public class CreditLimitCalculator{
   public static void main (String []args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Account Number: ");
	int accountNumber = input.nextInt();

	System.out.print("Enter Balance at the beginning of the month: ");
	int beginningBalance = input.nextInt();

	System.out.print("Enter Customer's charges: ");
	int customerCharges = input.nextInt();

	System.out.print("Enter Total credit applied to Customer's account: ");
	int totalCredit = input.nextInt();

	System.out.print("Enter Credit limit: ");
	int creditLimit = input.nextInt();

	int newBalance = beginningBalance + customerCharges - totalCredit;

	if (newBalance > creditLimit){
		System.out.print("Credit limit exceeded");
	} else {
		System.out.print("Credit limit not exceeded");
	}
   }

}
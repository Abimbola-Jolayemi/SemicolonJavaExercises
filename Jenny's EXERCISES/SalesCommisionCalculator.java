import java.util.Scanner;

public class SalesCommisionCalculator{
   public static void main (String []args){

	Scanner input = new Scanner (System.in);

	double commission = 0.09;
	int payment = 200;

	System.out.print("Enter Item Value: ");
	double item = input.nextDouble();

	double percentageGross = commission * item;
	
	double earning = payment + percentageGross;
	System.out.printf("The earning of this salesman is: %.2f", earning);
   }
}
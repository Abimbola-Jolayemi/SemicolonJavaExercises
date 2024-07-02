import java.util.Scanner;

public class PyramidOfGiza{
   public static void main (String []args){

	Scanner input = new Scanner (System.in);

	System.out.print("Enter number of stones used to build the pyramid of Giza: ");
	int noOfStones = input.nextInt();

	System.out.print("Enter Average weight of each stones used: ");
	double AverageWeight = input.nextDouble();

	System.out.print("Enter number of years taken to build: ");
	int noOfYears = input.nextInt();

	double totalWeight = noOfStones * AverageWeight;

	double hoursRequired = noOfYears * 365 * 24;

	double minutesRequired = hoursRequired * 60;

	double weightPerYear = totalWeight / noOfYears;

	double weightPerHour = totalWeight / hoursRequired;

	double weightPerMinutes = totalWeight / minutesRequired;

	System.out.printf("The estimated weight of stones used is: %.2f%s%.2f%s%.2f%s", weightPerYear, "kg per year, ", weightPerHour, "kg per hour, and ", weightPerMinutes, "kg per minute.");
   }
}
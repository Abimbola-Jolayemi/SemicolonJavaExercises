import java.util.Scanner;

public class MilesPerGallon{
  public static void main (String []args){

	Scanner input = new Scanner (System.in);

	int milesDriven = 0;
	int gallonsUsed = 0;
	int terminate = -1;

	while (true){
		System.out.print("Enter miles: ");
		double miles = input.nextDouble();

		if (miles == -1){
			break;
		}

		System.out.print("Enter gallons used for trip: ");
		double gallons = input.nextDouble();

		double milesPerGallon = miles / gallons;
		System.out.printf("The miles per gallon each trip is: %f%s%n", milesPerGallon, "mpg");

		milesDriven++;
		gallonsUsed++;
	
		if (gallons > 0){
			double combinedMilesPerGallon = milesDriven / gallonsUsed;
		System.out.printf("The combined miles per gallon is: %f%n", combinedMilesPerGallon);
		}
	}
	
  }
}
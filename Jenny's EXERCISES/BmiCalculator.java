import java.util.Scanner;

public class BmiCalculator{
   public static void main (String []args){

	Scanner input = new Scanner (System.in);

	System.out.println("Enter a number; 0 or 1:");
	int number = input.nextInt();

	if (number == 0){
		System.out.print("Enter weight in Pounds: ");
		double weightInPounds = input.nextDouble();

		System.out.print("Enter height in inches: ");
		double heightInInches = input.nextDouble();

		double BmiInPoundsPerInches = (weightInPounds * 703) / (heightInInches * heightInInches);

		System.out.printf("The BMI is: %.2f%n", BmiInPoundsPerInches);
	}

	if (number == 1){
		System.out.print("Enter weight in Kilograms: ");
		double weightInKilograms = input.nextDouble();

		System.out.print("Enter height in meters: ");
		double heightInMeters = input.nextDouble();

		double BmiInKilogramPerMeters = weightInKilograms / (heightInMeters * heightInMeters);

		System.out.printf("The BMI is: %.2f%n", BmiInKilogramPerMeters);
	}
	
   }

}
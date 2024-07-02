import java.util.Scanner;

public class AverageAcceleration{
  public static void main (String []args){
	Scanner input = new Scanner (System.in);

	System.out.print("Enter the Starting velocity: ");
	double startingVelocity = input.nextDouble();

	System.out.print("Enter Ending velocity: ");
	double endingVelocity = input.nextDouble();

	System.out.print("Enter time span:");
	double timeSpan = input.nextDouble();

	double changeInVelocity = endingVelocity - startingVelocity;

	double averageAcceleration = changeInVelocity / timeSpan;

	System.out.printf("The average acceleration: %f", averageAcceleration);
  }
}
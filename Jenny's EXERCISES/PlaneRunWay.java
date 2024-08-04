import java.util.Scanner;

public class PlaneRunWay{
  public static void main(String []args){
	
	Scanner input = new Scanner (System.in);

	System.out.print("Enter the value for Take-off Speed in m/s: ");
	double takeOffSpeed = input.nextDouble();

	System.out.print("Enter the value for Acceleration in m/s^2: ");
	double acceleration = input.nextDouble();

	double takeOffSpeedSquared = Math.pow(takeOffSpeed, 2);

	double accelerationSquared = 2 * acceleration;

	double minimumRunWayLength = takeOffSpeedSquared / accelerationSquared;

	System.out.printf("The minimum Runway Length: %.3f", minimumRunWayLength);
 }
}
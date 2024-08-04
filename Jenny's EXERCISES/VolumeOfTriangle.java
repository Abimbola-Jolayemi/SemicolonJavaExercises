import java.util.Scanner;

public class VolumeOfTriangle {
  public static void main (String []args){
	Scanner input = new Scanner (System.in);

	double area, volume;

	//Prompt user to enter vale for the length and height of the triangle
	System.out.print("Enter length and height of traingle: ");
	double length = input.nextDouble();

	//Divide the square root of three by four, and multiply the result by the square of triangle's length
	area = (Math.sqrt(3) / 4) * Math.pow(length, 2);
	System.out.println("The area is: " + area);

	volume = area * length;

	System.out.println("The volume of the triange is: " + volume);

  }
}
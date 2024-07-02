import java.util.Scanner;

public class Circle{
   public static void main (String []args){

	Scanner input = new Scanner (System.in);

	double pi = 3.14159;

	System.out.print("Enter radius: ");
	double radius = input.nextDouble();

	System.out.printf("The radius of the circle is: %.2f%n", 2 * radius);
	System.out.printf("The circumference of the circle is %.2f%n", 2 * pi * radius);
	System.out.printf("The area of the circle is: %.2f", pi * radius * radius);
   }

}
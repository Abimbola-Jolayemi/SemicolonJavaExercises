import java.util.Scanner;

public class AreaAndPerimeterOfCircle {
  public static void main (String []args){
	Scanner input = new Scanner (System.in);

	double pi = 3.14159;
	double radius = 6.5;

	double perimeter = 2 * radius * pi;
	double area = radius * radius * pi;

	System.out.println ("Perimeter of a circle: " + perimeter);
	System.out.println ("Area of a circle: " + area);


  }
}
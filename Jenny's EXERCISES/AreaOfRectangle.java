import java.util.Scanner;

public class AreaOfRectangle {
  public static void main (String []args){
	Scanner input = new Scanner (System.in);

	double width = 5.3;
	double height = 8.6;

	double area = width * height;
	double perimeter = 2 * (width + height);

	System.out.println("Area of a rectangle: " + area);
	System.out.println("Perimeter of a rectangle: " + perimeter);

  }

}
import java.util.Scanner;

public class AreaAndPerimeter {
   public static void main (String []args){
 
	Scanner input = new Scanner (System.in);

	System.out.print("Enter value for the Width: ");
	double width = input.nextDouble();

	System.out.print("Enter value for the Height: ");
	double height = input.nextDouble();

	double area = width * height;

	double widthPlusHeight = width + height;

	double perimeter = 2 * widthPlusHeight;

	System.out.printf("The area of the rectangle: %.2f", area);
	System.out.printf("The perimeter of the rectangle: %.2f", perimeter);
   }

}
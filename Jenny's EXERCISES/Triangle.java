import java.util.Scanner;

public class Triangle{
  public static void main (String []args){
    Scanner input = new Scanner (System.in);

    //prompt user to enter three points of a triangle
    System.out.print("Enter three points of a triangle: ");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    double x3 = input.nextDouble();
    double y3 = input.nextDouble();

    //calculate the sides of the triangle
    double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
    double side3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

    //sum up the sides of the triangle
    double side = side1 + side2 + side3;

    //divide the sum of the sides by 2
    double s = side / 2;

    double s1 = s - side1;
    double s2 = s - side2;
    double s3 = s - side3;

    //Calculate: s * (s-side1) * (s-side2) * (s-side3);
    double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    System.out.print("Area of the triangle:" + " " + area);
 }
}
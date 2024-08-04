import java.util.Scanner;

public class BMI {
  public static void main (String []args){
   Scanner input = new Scanner(System.in);

   //Receive input for the weight (in pounds)
   System.out.print("Enter the weight (in pounds): ");
   double weight = input.nextDouble();

   //Receive input for the height (in inches)
   System.out.print("Enter the height (in inches): ");
   double height = input.nextDouble();

   //Convert the weight (in pound) to kilogram
   double weightInKg = weight * 0.45359237;

   //Convert the height (in inches) to meters
   double heightInMeters = height * 0.0254;

   //Square the value of the heightInMeters
   double heightSquared = heightInMeters * heightInMeters;

   //Divide the weightInKg by the heightSquared to get the BMI
   double Bmi = weightInKg / heightSquared;

   System.out.print("The BMI is:" + " " + Bmi);

 }

}
import java.util.Scanner;

public class RunwayLength{
   
   public static void main (String []args){
    Scanner input = new Scanner(System.in);

     //collect speed from user in m/s
     System.out.print("Enter speed in m/s: ");
     double speed = input.nextDouble();

     //collect acceleration from user in m/s^2
     System.out.print("Enter acceleration in m/s^2: ");
     double acceleration = input.nextDouble();

     //Let Speed raised to the power of 2 be represented by takeOffSpeed
     double takeOffSpeed = speed * speed;

     //Let Acceleration multiplied by 2 be represented by takeOffAcceleration
     double takeOffAcceleration = acceleration * 2;

     //Divide the takeOffSpeed by the takeOffAcceleration to get the minimum runway length
     System.out.print("The minimum runway length is: ");
     double runwayLength = takeOffSpeed / takeOffAcceleration;

     System.out.print(runwayLength);
 }
}
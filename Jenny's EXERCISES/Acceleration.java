import java.util.Scanner;

public class Acceleration{
  public static void main(String []args){
    Scanner input = new Scanner (System.in);

    //Collect input for intial velocity from user
    System.out.print("Enter Initial velocity: ");
    double initialVelocity = input.nextDouble();

    //Collect final velocity from user
    System.out.print("Enter Final velocity: ");
    double finalVelocity = input.nextDouble();

    //Collect input for the Time span from user
    System.out.print("Enter Time: ");
    double time = input.nextDouble();
    
    //Deduct the initial velocity from the final velocity to derive the change in velocity
    double changeInVelocity = finalVelocity - initialVelocity;

    //Divide the change in velocity by the time span to get the average acceleration
    double averageAcceleration = changeInVelocity / time;

    System.out.print("The average acceleration is:" + " " + averageAcceleration);
 }
}
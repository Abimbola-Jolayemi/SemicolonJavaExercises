import java.util.Scanner;

public class Energy{
  public static void main (String []args){
    Scanner input = new Scanner (System.in);

    //Collect the weight of the water (in Kg) from the user
    System.out.print("Enter the Weight of the water in Kg: ");
    double weight = input.nextDouble();

    //Collect the Initial temperature from the user
    System.out.print("Enter Initial temperature: ");
    double initialTemperature = input.nextDouble();

    //Collect Final temperature from the user
    System.out.print("Enter Final Temperature: ");
    double finalTemperature = input.nextDouble();

    //Deduct the initial temperature from the final temperature to get the change in temperature
    double changeInTemperature = finalTemperature - initialTemperature;

    //Multiply the weight of the water and the changeInTemperature by 4184 to get the energy needed in Joules
    System.out.print("The energy needed is: ");
    double energy = weight * changeInTemperature * 4184;

    
    System.out.print(energy);
 }
}
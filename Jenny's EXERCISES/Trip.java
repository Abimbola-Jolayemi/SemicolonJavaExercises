import java.util.Scanner;

public class Trip{
  public static void main(String []args){

  Scanner input = new Scanner(System.in);

  //Enter the value for the distance
  System.out.print("Enter Distance:");
  double distance = input.nextDouble();

  //Enter the value for Fuel efficiency
  System.out.print("Enter miles per gallon:");
  double milesPerGallon = input.nextDouble();

  //Enter the value for fuel price
  System.out.print("Enter price per gallon:");
  double pricePerGallon = input.nextDouble();

  //Divide the distance by the fuelEfficiency to get the total cost of fuel
  //Multiply the total cost of the fuel by the fuel price to get the cost of the trip

  double totalCost = (distance * pricePerGallon) / milesPerGallon;

  System.out.println(totalCost);
 } 
}
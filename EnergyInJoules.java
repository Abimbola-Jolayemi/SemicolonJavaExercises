import java.util.Scanner;

public class EnergyInJoules{
  public static void main (String []args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter amount of water in Kg: ");
	double waterInKg = input.nextDouble();

	System.out.print("Enter initial temperature: ");
	double initialTemperature = input.nextDouble();

	System.out.print("Enter final temperature: ");
	double finalTemperature = input.nextDouble();

	double changeInTemperature = finalTemperature - initialTemperature;

	double energy = waterInKg * changeInTemperature * 4184;

	System.out.printf("The energy in Joules: %f", energy);
  }

}
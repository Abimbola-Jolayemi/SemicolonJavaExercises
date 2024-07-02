import java.util.Scanner;

public class WorldPopulation{
  public static void main (String []args){

	Scanner input = new Scanner (System.in);

	double worldPopulation = 8.1;
	double annualGrowthRate = 0.0091;

	for (int n = 1; n <= 5; n++){
		double populationPerYear = worldPopulation * (Math.pow(1 + annualGrowthRate, n));

		System.out.printf("The population for %d%s%.9f%s%n ", n, " years is ", populationPerYear, " billion");
	}
  }
}
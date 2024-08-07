import java.util.Scanner;

public class MenstrualCycle{
   public static void main (String []args){

	Scanner input = new Scanner (System.in);

	System.out.println("Enter date for last cycle: ");
	int date = input.nextInt();

	System.out.println("Enter month for last cycle(e.g 1 represents January): ");
	int month = input.nextInt();

	System.out.println("Enter year for last cycle: ");
	int year = input.nextInt();

	System.out.print("Enter cycle duration: ");
	int cycleDuration = input.nextInt();

	MenstrualPalava cycle = new MenstrualPalava(month, date, year, cycleDuration);
	String nextCycle = cycle.getNextCycleDate();

	System.out.print("The next cycle date is: " + nextCycle);
	
   }
}
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

	System.out.print("Enter bleeding duration: ");
	int bleedingDuration = input.nextInt();

	MenstrualPalava cycle = new MenstrualPalava(month, date, year, cycleDuration, bleedingDuration);
	String nextCycle = cycle.getNextCycleDate();
	String endBleedingDate = cycle.getEndBleedingDate();
	String nextOvulationData = cycle.getOvulationPeriod();

	System.out.println("The next cycle date is: " + nextCycle);
	System.out.println("The date of ending the next period is: " + endBleedingDate);
	System.out.println("The next ovulation period should be around: " + nextOvulationData); 
	System.out.println("The safe days are: " + cycle.getFertileDays());

   }
}
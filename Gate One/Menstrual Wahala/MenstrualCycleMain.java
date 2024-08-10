import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;

public class MenstrualCycleMain{
   public static void main (String []args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter your name: ");
	String name = input.nextLine().toUpperCase();

	System.out.print("Enter your age: ");
	int age = input.nextInt();

	System.out.print("What date did you start your period: ");
	int date = input.nextInt();

	System.out.print("Enter month(E.g '1' represents January: ");
	int month = input.nextInt();

	System.out.print("Enter year: ");
	int year = input.nextInt();

	System.out.print("What is the average of your cycle duration?: ");
	int cycleDuration = input.nextInt();

	System.out.print("How long does your period last?: ");
	int menstrualDuration = input.nextInt();

	MenstrualCycleFunction cycle = new MenstrualCycleFunction(date, month, year, cycleDuration, menstrualDuration);
	ArrayList<LocalDate> fertileDates = cycle.getFertileDays();
	ArrayList<LocalDate> firstSafeDates = cycle.getFirstSafeDays();
	ArrayList<LocalDate> secondSafeDates = cycle.getSecondSafeDays();

	System.out.println();

	System.out.println("******************************************************************");

	System.out.println();

	System.out.println("Hello, " + name);

	System.out.println("Your current menstrual cycle will end on: " + cycle.getNextCycleDate());
	System.out.println("The current bleeding period: " + cycle.mensEnding());
	System.out.println("The next ovulation date: " + cycle.getOvulationDate());
	System.out.println("The Fertility days include: ");

	for(LocalDate dates: fertileDates){
		System.out.println(dates);
	}
	System.out.println();

	System.out.println("The Safe dates include: ");
	
	for(LocalDate dates: firstSafeDates){
		System.out.println(dates);
	}
	
	for(LocalDate dates: secondSafeDates){
		System.out.println(dates);
	}

   }
}
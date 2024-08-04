import java.util.Scanner;

public class MinutesToYears {
  
  public static void main (String []args){
   Scanner input = new Scanner(System.in);

   //Declare constants
   
   //multiply hoursPerDay(24) by minutesPerHour(60) to get the minutesPerDay
   long minutesPerDay = 1440;
   
   //multiply minutesPerDay(1440) by daysPerYear(365) to get the minutesPerYear
   long minutesPerYear = 525600;

   //collect input for the minute's value
   System.out.print("Enter value for the minutes: ");
   long minutes = input.nextLong();

   //Divide the minutes by the minutesPerYear to get the number of years
   long numberOfYears = minutes / minutesPerYear;

   //Calculate the remainder of the division of minutes by minutesPerYear to get the remaining minutes
   long remainingMinutes = minutes % minutesPerYear;

   //Convert the remaining minutes to days by dividing remainingMinutes by minutesPerDay
   long remainingDays = remainingMinutes / minutesPerDay;

   //Display numberOfYears and remainingDays as the value of the number of years and days for the minutes

   System.out.print(numberOfYears + " " + "Years" + "," + " " + remainingDays + " " + "Days");
 }
}
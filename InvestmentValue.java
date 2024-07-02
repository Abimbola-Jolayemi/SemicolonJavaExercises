import java.util.Scanner;

public class InvestmentValue {
  public static void main (String []args){
   Scanner input = new Scanner (System.in);

   //Get input for the investment amount
   System.out.print ("Enter value for the Investment Amount: ");
   double investmentAmount = input.nextDouble();

   //Get input for the annual interest rate
   System.out.print ("Enter Annual Interest Rate: ");
   double annualInterestRate = input.nextDouble();

   // Divide the annual interest by 100 to get the percentage interest rate
   double percentageMonthlyInterest = annualInterestRate / 100;

   //Add 1 to the percentage interest rate
   double interestRatePlus1 = percentageMonthlyInterest + 1;

   Get  the input for the number of years
   System.out.print ("Enter Number of Years: ");
   double noOfYears = input.nextDouble();

   //Raise the interestRatePlus1 to the power of the number of years
   double investmentValue =  Math.pow(interestRatePlus1, noOfYears);

   //Multiply the result by the investment amount to the future investment value
   double futureInvestmentValue = investmentAmount * investmentValue; 

   System.out.print("The Future Investment Value is:" + futureInvestmentValue);
   
 }
}

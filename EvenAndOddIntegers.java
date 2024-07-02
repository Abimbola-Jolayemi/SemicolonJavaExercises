import java.util.Scanner;

public class EvenAndOddIntegers{
  
  public static void main (String []args){
   Scanner input = new Scanner(System.in);
  
  //let the sum of the even numbers be equal to zero
  int evenNumbers = 0;

  //let the sum of the odd numbers be equal to zero
  int oddNumbers =0;

  // collect the 'n' number of times the integers will be collected
  System.out.print("Enter the number of Integers:");
  int number = input.nextInt();

  //Collect the integers from the user 'n' number of times
  for (int i = 1; i <= number; i++) {
   System.out.print("Enter integer " + i + ":");
   int num = input.nextInt();

  //Add up numbers that are divisible by 2 to give the sum of even numbers
  //Add up numbers that are not divisible by 2 to give the sum of odd numbers
   if (num % 2 == 0) {
   evenNumbers += num;
   } else if{
   oddNumbers += num;
   }else if {
    
   }

  }
 
  //D‬isplay the sum of the even numbers
  System.out.println("Sum of the Even Numbers:" + evenNumbers);

  //Display the sum of the odd numbers
  System.out.print("Sum of the Odd Numbers:" + oddNumbers);
   
 }

}
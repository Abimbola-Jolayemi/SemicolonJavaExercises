import java.util.Scanner;

public class SumOfDigits{
  public static void main (String []args){
  int sum =0;
    Scanner input = new Scanner (System.in);

    //Ask user to enter a number between 0 and 1000
    System.out.print("Enter a number between 0 and 1000: ");
    int number = input.nextInt();
   
       //sum up the digits in the integer
       while (number > 0) {
       sum += number % 10;
       number = number / 10;

    }
     System.out.println(sum);
 }
}
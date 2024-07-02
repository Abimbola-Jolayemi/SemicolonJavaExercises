import java.util.Scanner;

public class DivisibleByThree {
  public static void main (String []args){
	Scanner input = new Scanner (System.in);

	System.out.print("Enter an integer: ");
	int anInteger = input.nextInt();


        if (anInteger % 3 ==0){
	  System.out.print("Number is divisible by 3");
	}else {
	  System.out.print("Number is not divisible by 3");
	}
  }
}
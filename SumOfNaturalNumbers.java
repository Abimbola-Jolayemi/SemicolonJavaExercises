import java.util.Scanner;

public class SumOfNaturalNumbers{
   public static void main (String []args){

	Scanner input = new Scanner (System.in);

	int sum = 0;

	for (int number = 1; number <= 10; number++){
 		sum += number;

	}
		System.out.print(sum);
   }

}
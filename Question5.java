import java.util.Scanner;

public class Question5{
  public static void main (String []args){

	Scanner input = new Scanner(System.in);

	

	for (int number = 1; number <= 10; number++){
		for (int i = 1; i <= 5; i++){
			if (number % 4 == 0)
		       System.out.print(number );
		}

		System.out.print(" ");
	}
  }
}
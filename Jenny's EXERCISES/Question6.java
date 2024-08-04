import java.util.Scanner;

public class Question6{
  public static void main (String []args){

	Scanner input = new Scanner(System.in);

	for (int i = 1; i <= 10; i++){
			if (i % 4 == 0){
			   int number = i;
			   //System.out.print(number + " ");
			  for (int x = 0; x < 4; x++){
			   System.out.print(number);
			   number = number * i;	
			   System.out.print(number + " ");
			  }
			}
			 

		System.out.print(" ");
	}
  }
}
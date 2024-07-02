import java.util.Scanner;

public class Question7{
   public static void main (String []args){

	Scanner input = new Scanner (System.in);

	for (int i = 1; i <= 10; i++){
		if (i % 4 == 0){
		 int num = i;
		 int sum = 0;
			for (int x = 0; x < 5; x++){
			   num = num * i;
			   sum = sum + num;
			}
		   System.out.print(sum + " ");
		}
	}
   }
}
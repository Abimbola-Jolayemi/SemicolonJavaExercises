import java.util.Scanner;

public class SumOfAllNumbers{
 public static void main (String []args){
	Scanner input = new Scanner (System.in);
		
	//Assign each numbers 1 - 10 to a variable
	int integer1 = 1;
	int integer2 = 2;
	int integer3 = 3;
	int integer4 = 4;
	int integer5 = 5;
	int integer6 = 6;
	int integer7 = 7;
	int integer8 = 8;
	int integer9 = 9;
	int integer10 = 10;

	
	int result = integer1 + integer2 + integer3 + integer4 + integer5 + integer6 + integer7 + integer8 + integer9 + integer10;

        System.out.print("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = " + result);

 }

}
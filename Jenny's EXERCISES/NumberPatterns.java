import java.util.Scanner;

public class NumberPatterns{
   public static void main (String []args){
	
	Scanner input = new Scanner (System.in);

	//System.out.printf("%4s%15s%18s%18s%n", "Pattern A", "Pattern B", "Pattern C", "Pattern D");//
 
	int noOfLines = 6;

	System.out.printf("%4s%n", "Pattern A");

	for (int A = 1; A <= noOfLines; A++){
		for (int A1 = 1; A1 <= A; A1++){
		   System.out.printf("%d ", A1);
		}

		System.out.println();
	}

		System.out.println();

	System.out.printf("%4s%n", "Pattern B");

	for (int B = 1; B <= noOfLines; B++){
		for (int B1 = 1; B1 <= (noOfLines - B + 1); B1++){
		   System.out.printf("%d ", B1);
		}

		System.out.println();
	}

		System.out.println();

	System.out.printf("%4s%n", "Pattern C");

	for (int C = 1; C <= noOfLines; C++){
		for (int space = 0; space < (noOfLines - C) * 2; space++){
		   System.out.print(" ");
		}
		for (int C1 = C; C1 >= 1; C1--){
		   System.out.printf("%d ", C1);
		}

		System.out.println();
	}

		System.out.println();

	System.out.printf("%4s%n", "Pattern D");

	for (int D = 0; D < noOfLines; D++){
		for (int space = 0; space < (D * 2); space++){
		   System.out.print(" ");
		}
		for (int D1 = 1; D1 <= (noOfLines - D); D1++){
		   System.out.printf("%d ", D1);
		}

		System.out.println();
	}


   }
}
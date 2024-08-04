public class TrianglePrintingAsterisks{
   public static void main (String []args){

	int noOfLines = 10;

		System.out.println();

		System.out.printf("%5s%n", "(a)");
	for (int A = 1; A <= noOfLines; A++) {
		for (int a = 1; a <= A; a++){
		   System.out.printf("%1s ","*");
		}

		System.out.println();
	}
		System.out.println();

		System.out.printf("%5s%n", "(b)");
	
	for (int B = 1; B <= noOfLines; B++){
		for (int b = 1; b <= (noOfLines - B + 1); b++){
		   System.out.printf("%1s ", "*");
		}

		System.out.println();
	}

		System.out.println();

		System.out.printf("%5s%n", "(c)");
	
	for (int C = 1; C <= noOfLines; C++){
		for (int space = 0; space < (noOfLines - C) * 2; space++){
		   System.out.print(" ");
		}
		for (int c = C; c >= 1; c--){
		   System.out.printf("%1s ", "*");
		}

		System.out.println();
	}

		System.out.println();

	System.out.printf("%4s%n", "(d)");

	for (int D = 0; D < noOfLines; D++){
		for (int space = 0; space < (D * 2); space++){
		   System.out.print(" ");
		}
		for (int d = 1; d <= (noOfLines - D); d++){
		   System.out.printf("%1s ", "*");
		}

		System.out.println();
	}
   }
}
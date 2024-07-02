public class TableOfSquaresAndCubes{
   public static void main (String []args){

	System.out.printf("%-10s%-10s%-10s%n", "number", "squared", "cube");

	for (int number = 0; number <= 10; number++){
		int numberSquared = number * number;
		int numberCube = number * number * number;

		System.out.printf("%-10d%-10d%-10d%n", number, numberSquared, numberCube);
	}
   }
}
public class TabularOutput{
   public static void main (String []args){

	System.out.printf("%-10c%-10s%-10s%-10s%n", 'N', "N2", "N3", "N4");

	for (int number = 1; number <= 5; number++){
		int numberSquared = number * number;
		int numberTripled = number * number * number;
		int numberQuadrupled = number * number * number * number;

		System.out.printf("%-10d%-10d%-10d%-10d%n", number, numberSquared, numberTripled, numberQuadrupled);
	}
   }
}
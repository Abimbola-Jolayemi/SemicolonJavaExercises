public class TableOfValuesAndPowers {
   public static void main (String []args){
 
	System.out.printf("%2c%4c%10s%n", 'a', 'b', "pow(a, b)");

	for (int numA = 1; numA <= 5; numA++){
		int numB = numA + 1;
		double numPower = Math.pow(numA, numB);
		System.out.printf("%2d%4d%-30.0f%n", numA, numB, numPower);
	}
   }

}
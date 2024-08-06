import java.util.Arrays;

public class Trial{
	public static void main(String []args){

		Question1 q1 = new Question1();
		Question2 q2 = new Question2();
		Question3 q3 = new Question3();
		Question4 q4 = new Question4();
		Question5 q5 = new Question5();
		Question6 q6 = new Question6();
		Question8 q8 = new Question8();

		int[] num = {1, 4, 3, 2, 5, 8};
		int result = q1.findLargestInteger(num);
		System.out.println(result);
		
		int[] reverse = q2.reverseList(num);
		System.out.println(Arrays.toString(reverse));

		System.out.println(q3.checkIfElementIsPresent(9, num));

		System.out.println(Arrays.toString(q4.numbersOnOddPositions(num)));

	System.out.println(Arrays.toString(q5.numbersOnEvenPositions(num)));

	System.out.println(q6.computeTotal(num));

	System.out.println(q8.sumUsingForLoop(num));

	System.out.println(q8.sumUsingWhileLoop(num));

	System.out.println(q8.sumUsingDoWhileLoop(num));
	}
}
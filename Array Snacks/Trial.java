import java.util.Arrays;
import java.util.ArrayList;

public class Trial{
	public static void main(String []args){

		Question1 q1 = new Question1();
		Question2 q2 = new Question2();
		Question3 q3 = new Question3();
		Question4 q4 = new Question4();
		Question5 q5 = new Question5();
		Question6 q6 = new Question6();
		Question8 q8 = new Question8();
		Question9 q9 = new Question9();
		Question10 q10 = new Question10();
		Question11 q11 = new Question11();

		int[] num = {1, 2, 3, 4, 5};
		
		int result = q1.findLargestInteger(num);
		System.out.println(result);
		
		int[] reverse = q2.reverseList(num);
		System.out.println(Arrays.toString(reverse));

		System.out.println(q3.checkIfElementIsPresent(9, num));

		System.out.println(Arrays.toString(q4.numbersOnOddPositions(num)));

	System.out.println(Arrays.toString(q5.numbersOnEvenPositions(num)));

	System.out.println(q6.computeTotal(num));

	ArrayList<Integer> list2 = new ArrayList<>();
	list2.add(6);
	list2.add(6);
	ArrayList<Integer> list3 = new ArrayList<>();
	list3.add(11);
	list3.add(11);

	ArrayList<Integer> concartenatedList = new ArrayList<Integer>(q9.concartenateList(list2, list3));

	System.out.println(concartenatedList);

	int[] newList1 = {1, 2, 3};
	int[] newList2 = {4, 5, 6};
	int[] concartList = (q10.concartenateList(newList1, newList2));

	System.out.println(Arrays.toString(concartList));

	int numbers= 12345;

	System.out.print(Arrays.toString(q11.returnArray(numbers)));
	}
}
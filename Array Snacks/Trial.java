import java.util.Arrays;

public class Trial{
	public static void main(String []args){

		Question1 q1 = new Question1();
		Question2 q2 = new Question2();
		int[] num = {1, 4, 3, 2, 5, 8};
		int result = q1.findLargestInteger(num);
		System.out.println(result);
		
		int[] reverse = q2.reverseList(num);
		System.out.println(Arrays.toString(reverse));
	}
}
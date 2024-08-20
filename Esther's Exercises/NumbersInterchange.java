import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class NumbersInterchange{
   public static void main(String []args){

	Scanner input = new Scanner(System.in);
	int[] numbers = {1, 2, 3, 4, 5, 6, 7};
	int[] newList = reArrange(numbers);

	System.out.print(Arrays.toString(newList));
   }

   public static int[] reArrange(int[] numbers) {
	int[] newList = new int[numbers.length];

        for (int index = 0; index < numbers.length - 1; index+=2) {
                newList[index] = numbers[index + 1];
                newList[index + 1] = numbers[index];
        }

	if (numbers.length % 2 != 0) {
            newList[numbers.length - 1] = numbers[numbers.length - 1];
        }
        return newList;
    }
}
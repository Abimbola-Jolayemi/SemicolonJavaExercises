public class Question6{
   public int computeTotal(int[] numbers){

	int total = 0;

	for(int index = 0; index < numbers.length; index++){
		total = total + numbers[index];
	}

	return total;
   }
}
public class Question1{
   public int findLargestInteger(int[] numbers){

	int largestNumber = numbers[0];
	for(int index = 0; index < numbers.length; index++){
		if(numbers[index] > largestNumber){
			largestNumber = numbers[index];
		}
	}
		return largestNumber;
   }
}
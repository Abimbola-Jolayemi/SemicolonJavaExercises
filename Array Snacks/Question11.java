public class Question11{
   public int[] returnArray(int number){

	int[] array = new int[String.valueOf(number).length()];

	int digit = 0;
	int counter = 0;
	while(number != 0){
		digit = number % 10;
		array[counter] = digit;

		counter++;

		number = number / 10;
	}
		return array;
	
   }
}
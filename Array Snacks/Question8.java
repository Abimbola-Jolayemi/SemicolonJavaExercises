public class Question8{
   public int sumUsingForLoop(int[] numbers){

	int total = 0;

	for(int index = 0; index < numbers.length; index++){
		total += numbers[index];
	}

	return total;
   }

   public int sumUsingWhileLoop(int[] numbers){

	int total = 0;
	int index = 0;

	while(index < numbers.length){
		total += numbers[index];
		 index++;
	}
	return total;
   }

   public int sumUsingDoWhileLoop(int[] numbers){

	int total = 0;
	int index = 0;

	do{
		total += numbers[index];
		index++;
	}while(index < numbers.length);

	return total;
   }
}
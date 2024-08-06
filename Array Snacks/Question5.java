public class Question5{
   public int[] numbersOnEvenPositions(int[] list){
	
	int[] evenIndexNumbers = new int[(list.length + 1) / 2];

	int counter = 0;
	for(int index = 0; index < list.length; index++){
		if(index % 2 == 0){
			evenIndexNumbers[counter] = list[index];
			counter = counter + 1;
		}
	} 
	return evenIndexNumbers;
   }
}
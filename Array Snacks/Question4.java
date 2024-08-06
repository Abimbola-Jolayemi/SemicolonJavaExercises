public class Question4{
   public int[] numbersOnOddPositions(int[] list){
	
	int[] oddIndexNumbers = new int[(list.length) / 2];

	int counter = 0;
	for(int index = 0; index < list.length; index++){
		if(index % 2 == 1){
			oddIndexNumbers[counter] = list[index];
			counter = counter + 1;
		}
	} 
	return oddIndexNumbers;
   }
}
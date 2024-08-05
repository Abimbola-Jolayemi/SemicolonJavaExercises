public class Question2{
   public int[] reverseList(int[] list){
 
	int[] reversedList = new int[list.length];
	 
	for(int index = 0; index < list.length; index++){
		reversedList[index] = list[list.length - 1 - index];
	}
	return reversedList;
	
   }
}
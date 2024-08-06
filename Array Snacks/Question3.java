public class Question3{
   public boolean checkIfElementIsPresent(int element, int[] list){

	for(int number: list){
		if(number == element){
			return true;
		}
	}
	return false;
   }
}
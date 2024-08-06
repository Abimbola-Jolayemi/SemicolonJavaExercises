import java.util.ArrayList;

public class Question10{
   public int[] concartenateList(int[] list1, int[] list2){
	
	int[] newList = new int[list1.length + list2.length];

	int counter = 0;
	for(int index = 0; index < (list1.length + list2.length); index+=2){
		newList[index] = list1[counter];
		newList[index + 1] = list2[counter];

		counter++;
	}
	
	return newList;
   }
}
import java.util.ArrayList;

public class Question9{
   public ArrayList<Integer> concartenateList(ArrayList<Integer> list1, ArrayList<Integer> list2){
	
	ArrayList<Integer> result = new ArrayList<>(list1);
	result.addAll(list2);
	return result;
   }
}
public class TaskFifteen{
   public static void main(String []args){

	for(int number = 1; number <= 10; number++){
		for (int counter = 1; counter <= 5; counter++){
		    if(number % 4 == 0){
			System.out.print(number);
		    }
			System.out.print(" ");
		}
	}
   }
}
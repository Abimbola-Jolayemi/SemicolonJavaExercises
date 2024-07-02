public class TaskSixteen{
   public static void main(String []args){

	for(int number = 1; number <= 10; number++){
		if (number % 4 == 0){
	
			for (int noOfTimes = 1; noOfTimes <= 5; noOfTimes++){
			   double multipleOfFour = Math.pow(number, noOfTimes);
			System.out.printf("%.0f", multipleOfFour);
			System.out.print(" ");
			} System.out.println();
			   
		}
	}
   }
}
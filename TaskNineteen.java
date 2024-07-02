public class TaskNineteen{
   public static void main(String []args){

	double sum = 0;
	double sqrtSum = 0;

	for(int number = 1; number <= 10; number++){
		if (number % 4 == 0){
	
			for (int noOfTimes = 1; noOfTimes <= 5; noOfTimes++){
			   	double multipleOfFour = Math.pow(number, noOfTimes);

				sum = sum + multipleOfFour;
				sqrtSum = Math.pow(sum, 2);
			}
				   
		}
	} 
		System.out.printf("%.0f", sqrtSum);

   }
}
import java.util.Scanner;

public class CorrespondingLetters{
  public static void main (String []args){

	Scanner input = new Scanner (System.in);

	System.out.print("Enter a grade: ");
	char grade = input.next().toUpperCase().charAt(0);

	if (grade == 'A'){
    	  System.out.print("The score is 4");
	} else if (grade == 'B'){
	  System.out.print("The score is 3");
	} else if (grade == 'C'){
	  System.out.print("The score is 2");
	} else if (grade == 'D'){
	  System.out.print("The score is 1");
	} else if(grade == 'F'){
   	  System.out.print("The score is 0");
	} else {
	  System.out.print("Invalid grade");
	}
  }
}
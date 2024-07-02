import java.util.Scanner;

public class StudentGrade{
   public static void main (String []args){

	Scanner input = new Scanner (System.in);

	int gradeACounter = 0;
	int gradeBCounter = 0;
	int gradeCCounter = 0;
	int gradeDCounter = 0;

	int noOfStudents = 5;

	for (int i = 1; i <= noOfStudents; i++){
		System.out.print("Enter name of student: ");
	  	String name = input.nextLine();

		System.out.print("Enter grade: ");
		char grade = input.nextLine().charAt(0);

		switch (grade) {
			case 'A':
			   gradeACounter++;
			   break;
			case 'B':
			   gradeBCounter++;
			   break;
			case 'C':
			   gradeCCounter++;
			   break;
			case 'D':
			   gradeDCounter++;
			   break;
			default:
			   System.out.print("Invalid grade");
		}
	}
		System.out.println(gradeACounter++ + " Students scored A");
		System.out.println(gradeBCounter++ + " Students scored B");
		System.out.println(gradeCCounter++ + " Students scored C");
		System.out.println(gradeDCounter++ + " Students scored D");
   }
}
import java.util.Scanner;

public class SchoolApplication{

    public static void main(String []args){

	Scanner input = new Scanner(System.in);

	String[] subjects = {"Subject 1", "Subject 2", "Subject 3"};

	String[] students = {"Student 1", "Student 2", "Student 3", "Student 4"};

	int total = 0;
	int studentIndex;
	int subjectIndex;
	
	for (studentIndex = 0; studentIndex < 4; studentIndex++){

	int studentSum = 0;
		System.out.println(students[studentIndex] + ":");

		for (subjectIndex = 0; subjectIndex < 3; subjectIndex++){
			System.out.println("Enter score for " + subjects[subjectIndex] + ":");
			int score = input.nextInt();

			studentSum += score;
			total = total + score;
			
		}
			double studentAverage = studentSum / 3.0;
			System.out.println("The sum of scores for " + students[studentIndex] + " is: " + studentSum);
			System.out.printf("The average score for %s is: %.2f\n", students[studentIndex], studentAverage);

			studentSum = 0;

			System.out.println(" ");
	} 
		double classAverage = total / 4;
		System.out.printf("Total: %d\n", total);
		System.out.printf("Class Average: %.2f\n", classAverage);


    }
}
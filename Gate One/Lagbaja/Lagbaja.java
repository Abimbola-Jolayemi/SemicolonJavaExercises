import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;

public class Lagbaja{

	static Scanner input = new Scanner(System.in);
	private int noOfStudents;
	private int noOfSubjects;
	private int[][] scores;

	public void setNoOfStudents(){
		while(true){
			try{
				System.out.print("Enter number of Students: ");
				noOfStudents = input.nextInt();
				if(noOfStudents < 0){
					System.out.println("Invalid input!!!. Enter a valid number!!!");
				} else {
					this.noOfStudents = noOfStudents;
					break;
				}
			} catch (InputMismatchException e){
				System.out.println("Invalid input. Please enter an integer.");
                        	input.next();
			}
		}
	}

	public int getNoOfStudents(){
		return noOfStudents;
	}

	public void setNoOfSubjects(){
		while(true){
			try{
				System.out.print("Enter number of Subjects: ");
				noOfSubjects = input.nextInt();

				if(noOfSubjects < 0){
				 System.out.println("Invalid input!!!. Enter a valid input.");
				} else {
					this.noOfSubjects = noOfSubjects;
					break;
				}
			} catch (InputMismatchException e){
				System.out.println("Enter a valid integer!!!");
				input.next();
			}
		}
	}

	public int getNoOfSubjects(){
		return noOfSubjects;
	}

	public int[][] collectScores() {
    		Scanner input = new Scanner(System.in);

    		scores = new int[this.noOfStudents][this.noOfSubjects];

		for (int student = 0; student < noOfStudents; student++) {
        	    System.out.println("STUDENT " + (student + 1) + ":");
        		for (int subject = 0; subject < noOfSubjects; subject++) {

				System.out.print("Subject " + (subject + 1) + ": ");
            			int score = 0;

				boolean isValid = false;

				while(!isValid){
					try{
						score = input.nextInt();
						if(score < 0 || score > 100){
							System.out.print("Invalid Score!!!. Enter a score between 0 and 100");
						} else {
							isValid = true;
						}
					} catch(InputMismatchException e){
						System.out.println("Invalid input. Please enter an integer.");
                        			input.next();
					}
				}
				scores[student][subject] = score;
			}
			System.out.println();	
            	}
		return scores;
	}

	public int[][] getScores() {
        	return scores;
    	}

	public int[] computeTotalPerStudent() {
    		int[][] scores = collectScores();
    		int[] totalPerStudent = new int[this.noOfStudents];

        	for (int student = 0; student < noOfStudents; student++) {
        	   int total = 0;

        		for (int subject = 0; subject < noOfSubjects; subject++) {
            			total += scores[student][subject];
        		}

        	   totalPerStudent[student] = total;
    		}
    		return totalPerStudent;
	}

	public double[] computeAveragePerStudent(){
		int[] total = computeTotalPerStudent();
		double[] averageScore = new double[this.noOfStudents];

		double average = 0;
		for(int student = 0; student < total.length; student++){
			average = (double) total[student] / noOfSubjects;

			averageScore[student] = average;
		}
		return averageScore;
	}

	public int[] computePosition(){
		int[] total = computeTotalPerStudent();

		
	}
}
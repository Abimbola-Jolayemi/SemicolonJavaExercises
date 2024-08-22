import java.util.Scanner;
import java.util.Arrays;

public class LagbajaMain{
   public static void main(String... args){

	Scanner input = new Scanner (System.in);
	Lagbaja lagbaja = new Lagbaja();

	lagbaja.setNoOfStudents();
	lagbaja.setNoOfSubjects();
	
	lagbaja.collectScores();

	lagbaja.computeTotalPerStudent();
	lagbaja.computeAveragePerStudent();
        lagbaja.computePositions();
	lagbaja.displayResults();
   }
}

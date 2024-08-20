import java.util.Scanner;

public class LagbajaMain{
   public static void main(String... args){

	Scanner input = new Scanner (System.in);
	Lagbaja lagbaja = new Lagbaja();

	lagbaja.setNoOfStudents();
	lagbaja.setNoOfSubjects();
	
	lagbaja.collectScores();

   }
}

public class Lagbaja{

	private int noOfStudents;
	private int noOfSubjects;

	public Lagbaja(int noOfStudents, int noOfSubjects){
		this.noOfStudents = noOfStudents;
		this.noOfSubjects = noOfSubjects;
	}

	public void setNoOfStudents(int noOfStudents){
		this.noOfStudents = noOfStudents;
	}

	public int getNoOfStudents(){
		return noOfStudents;
	}

	public void setNoOfSubjects(int noOfSubjects){
		this.noOfSubjects = noOfSubjects;
	}

	public int getNoOfSubjects(){
		return noOfSubjects;
	}

	public int[][] collectScores(){
		int[][] scores = new int[this.noOfStudents][this.noOfSubjects];

		for(int student = 0; student < this.noOfStudents; student++){
			System.out.println("STUDENT " + student + ":")
			for(int subject = 0; subject < this.noOfSubjects; subject++){
				System.out.println(
			}
		} 
 	}
}
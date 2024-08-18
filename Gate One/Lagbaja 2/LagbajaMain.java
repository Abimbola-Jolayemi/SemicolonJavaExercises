import java.util.Scanner;
import java.util.Arrays;

public class LagbajaMain {

    private static int noOfStudents;
    private static int noOfSubjects;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Enter the number of students: ");
        noOfStudents = input.nextInt();
        System.out.print("Enter the number of subjects: ");
        noOfSubjects = input.nextInt();

        LagbajaMain lagbajaMain = new LagbajaMain();

        int[][] scores = lagbajaMain.collectScores();

        lagbajaMain.displayClassSummary(scores);
    }

    public int[][] collectScores() {
        int[][] scores = new int[noOfStudents][noOfSubjects];

        for (int student = 0; student < noOfStudents; student++) {
            System.out.println("STUDENT " + (student + 1) + ":");
            for (int subject = 0; subject < noOfSubjects; subject++) {
                int score;
                do {
                    System.out.print("Score for Subject " + (subject + 1) + ": ");
                    score = input.nextInt();
                    if (score < 0 || score > 100) {
                        System.out.println("Invalid score. Please enter a score between 0 and 100.");
                    }
                } while (score < 0 || score > 100);
                scores[student][subject] = score;
            }
            System.out.println();
        }

        return scores;
    }

    public void displayClassSummary(int[][] scores) {
        int[] totalScoresPerStudent = new int[noOfStudents];
        int[] totalScoresPerSubject = new int[noOfSubjects];
        double[] averageScoresPerStudent = new double[noOfStudents];
        double[] averageScoresPerSubject = new double[noOfSubjects];
        int[] studentPositions = new int[noOfStudents];
        String[] bestStudentsPerSubject = new String[noOfSubjects];

        // Calculate total and average scores per student and per subject
        for (int student = 0; student < noOfStudents; student++) {
            for (int subject = 0; subject < noOfSubjects; subject++) {
                totalScoresPerStudent[student] += scores[student][subject];
                totalScoresPerSubject[subject] += scores[student][subject];
            }
            averageScoresPerStudent[student] = (double) totalScoresPerStudent[student] / noOfSubjects;
        }
        for (int subject = 0; subject < noOfSubjects; subject++) {
            averageScoresPerSubject[subject] = (double) totalScoresPerSubject[subject] / noOfStudents;
        }

        // Calculate student positions
        Integer[] sortedIndices = getSortedIndices(totalScoresPerStudent);
        for (int i = 0; i < sortedIndices.length; i++) {
            studentPositions[sortedIndices[i]] = i + 1;
        }

        // Determine the best student in each subject
        for (int subject = 0; subject < noOfSubjects; subject++) {
            int highestScore = -1;
            for (int student = 0; student < noOfStudents; student++) {
                if (scores[student][subject] > highestScore) {
                    highestScore = scores[student][subject];
                    bestStudentsPerSubject[subject] = "Student " + (student + 1);
                }
            }
        }

        // Print the summary table
        System.out.printf("%-12s", "Student");
        for (int subject = 0; subject < noOfSubjects; subject++) {
            System.out.printf("Subject %-3d ", (subject + 1));
        }
        System.out.printf("%-10s %-10s %-10s\n", "Total", "Average", "Position");

        for (int student = 0; student < noOfStudents; student++) {
            System.out.printf("%-12s", "Student " + (student + 1));
            for (int subject = 0; subject < noOfSubjects; subject++) {
                System.out.printf("%-12d", scores[student][subject]);
            }
            System.out.printf("%-10d %-10.2f %-10d\n", totalScoresPerStudent[student], averageScoresPerStudent[student], studentPositions[student]);
        }

        System.out.printf("\n%-12s", "Total");
        for (int subject = 0; subject < noOfSubjects; subject++) {
            System.out.printf("%-12d", totalScoresPerSubject[subject]);
        }

        System.out.printf("\n%-12s", "Average");
        for (int subject = 0; subject < noOfSubjects; subject++) {
            System.out.printf("%-12.2f", averageScoresPerSubject[subject]);
        }

        System.out.printf("\n%-12s", "Best Student");
        for (int subject = 0; subject < noOfSubjects; subject++) {
            System.out.printf("%-12s", bestStudentsPerSubject[subject]);
        }

        System.out.println();
    }

    private Integer[] getSortedIndices(int[] array) {
        Integer[] indices = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> Integer.compare(array[b], array[a]));
        return indices;
    }
}
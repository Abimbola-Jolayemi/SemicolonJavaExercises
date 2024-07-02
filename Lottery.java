import java.util.Scanner;
import java.util.Random;

public class Lottery {
    public static void main(String []args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        // Generate a random 3-digit number
        int lotteryNumber = 100 + rand.nextInt(900);

        // Prompt the user to enter a three-digit number
        System.out.print("Enter a three-digit number: ");
        int usersNumber = input.nextInt();

        // Extract digits from the lottery number
        int lottery1 = lotteryNumber / 100;
        int lottery2 = (lotteryNumber / 10) % 10;
        int lottery3 = lotteryNumber % 10;

	//Extract digits from user's input
        int user1 = usersNumber / 100;
        int user2 = (usersNumber / 10) % 10;
        int user3 = usersNumber % 10;

	//Set prize to be zero
        int prize = 0;

        // Check if the user's input match the lottery number in the exact order
        if (usersNumber == lotteryNumber) {
            prize = 12000;
        } 
       
	
	 // Check if all digit in the user's input match the lottery number in any order
        else if ((user1 == lottery1 || user1 == lottery2 || user1 == lottery3) &&
                 (user2 == lottery1 || user2 == lottery2 || user2 == lottery3) &&
                 (user3 == lottery1 || user3 == lottery2 || user3 == lottery3) &&
                 (user1 != user2 && user2 != user3 && user1 != user3)) {
            prize = 5000;
        } 
       

	 // Check if at least one digit matches
        else if (user1 == lottery1 || user1 == lottery2 || user1 == lottery3 ||
                 user2 == lottery1 || user2 == lottery2 || user2 == lottery3 ||
                 user3 == lottery1 || user3 == lottery2 || user3 == lottery3) {
            prize = 2000;
        }

        // Display results
        System.out.println("Lottery number: " + lotteryNumber);
        System.out.println("Your number: " + usersNumber);
        System.out.println("You've won $" + prize);
    }
}
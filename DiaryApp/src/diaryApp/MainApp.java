package diaryApp;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
       int number1 = Integer.parseInt(input("Enter a number: "));

       System.out.println(number1 + 3);
    }

    private static String input(String prompt) {
        Scanner input = new Scanner(System.in);
        display(prompt);
        return input.nextLine();
    }

    public static void display(String prompt) {
        System.out.print(prompt);
    }
}

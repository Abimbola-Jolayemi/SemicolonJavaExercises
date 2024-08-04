import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Countries {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the first country: ");
        String country1 = input.nextLine();

        System.out.print("Enter the second country: ");
        String country2 = input.nextLine();

        System.out.print("Enter the third country: ");
        String country3 = input.nextLine();

        List<String> countries = new ArrayList<>();
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);

        Collections.sort(countries, Collections.reverseOrder());

        System.out.println("Countries in descending order:");
        for (String country : countries) {
            System.out.println(country);
        }

        input.close();
    }
}
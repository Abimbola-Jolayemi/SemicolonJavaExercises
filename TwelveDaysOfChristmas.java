public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
     
        String[] days = {
            "first", "second", "third", "fourth", "fifth", "sixth",
            "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
        };

        for (int i = 0; i < 12; i++) {
            System.out.println("On the " + days[i] + " day of Christmas, my true love said to me:");

            switch (i) {
                case 11:
			System.out.println("Twelve drummers drumming");
                case 10:
			System.out.println("Eleven pipers piping");
                case 9:
			System.out.println("Ten lords are leaping");
                case 8:
			System.out.println("Nine ladies dancing");
                case 7:
			System.out.println("Eight maids are milking");
                case 6:
			System.out.println("Seven swans are swimming");
                case 5:
			System.out.println("Six geese are sslaying");
                case 4:
			System.out.println("Five gold rings");
                case 3:
			System.out.println("Four calling birds");
                case 2:
			System.out.println("Three French hens");
                case 1:
			System.out.println("Two turtle doves");
                case 0:
			if (i == 0) {
                             System.out.println("A partridge in a pear tree");
                         } else {
                             System.out.println("And a partridge in a pear tree".toLowerCase());
                         }
                         break;
            }
            System.out.println();

	}
    }
}
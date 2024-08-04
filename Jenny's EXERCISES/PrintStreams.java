public class PrintStreams {
   public static void main (String []args){
     //System.out.println ("Hello");
     //System.out.println ("Natives");
     //System.out.println ("This is Semicolon");

     //System.out.print("I ");
     //System.out.print("Love ");
     //System.out.print("Java");

     //System.out.printf("I own %d%s%n%f%c%b", 24, "Cars", 2.4, 'm', true);

     //PRIMITIVE DATA TYPES
     int result = 54;
     char vowel = 'e';
     boolean isValueGreaterThanFour = true;
     short lengthInMeters = 300;
     long amount = 8000000;
     double balance = 28.4;


     //REFERENCE DATA TYPES
     String nameOfSupplier = "Adetayo";
     int[] listOfStudents = {1, 2};

     System.out.printf("%d%s%n%f%c%b%d", result, nameOfSupplier, 58.9, 'e', true, 300);
     System.out.print(listOfStudents[1]);
     
  }
}
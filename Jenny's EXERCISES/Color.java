import java.util.Random;

public class Color{
  public static void main (String []args){
	Random rand = new Random ();

	//A random integer is generated
	int randomInteger = rand.nextInt(7) + 1;

	//Assign each color on the rainbow to a number
	String color = "";
	switch (randomInteger){
		case 1:
		  color = "Red";
		  break;
		case 2:
		  color = "Orange";
		  break;
		case 3:
		  color = "Yellow";
		  break;
		case 4:
		  color = "Green";
		  break;
		case 5:
		  color = "Blue";
		  break;
		case 6:
		  color = "Indigo";
		  break;
		case 7:
		  color = "Violet";
		  break;
	}

	System.out.println("The color is: " + color);
  }
}
public class PizzaFunction{

   private int noOfGuests;
   private String pizzaType;

   public PizzaFunction(int noOfGuests, String pizzaType){
	this.noOfGuests = noOfGuests;
	setPizzaType(pizzaType);
   }

   public void setNoOfGuests(int noOfGuests){
	this.noOfGuests = noOfGuests;
   }

   public int getNoOfGuests(){
	return noOfGuests;
   }

   public void setPizzaType(String pizzaType) {
        if (isValidPizzaType(pizzaType)) {
            this.pizzaType = pizzaType;
        } else {
            throw new IllegalArgumentException("Invalid pizza type. Please enter one of the following: Sapa size, Small Money, Big boys, Odogwu.");
        }
    }

   public static boolean isValidPizzaType(String pizzaType) {
        return pizzaType.equalsIgnoreCase("Sapa size") ||
               pizzaType.equalsIgnoreCase("Small Money") ||
               pizzaType.equalsIgnoreCase("Big boys") ||
               pizzaType.equalsIgnoreCase("Odogwu");
    }

   public String getPizzaType(){
   	return pizzaType;
   }

   public int getPizzaSlicesPerBox(){
	switch(pizzaType){
	    case "odogwu":
		return 12;
	    case "big boys":
		return 8;
	    case "small money":
		return 6;
	    case "sapa size":
		return 4;
	    default: return 0;	
	}
   }

   public int getPricePerBox(){
	switch(pizzaType){
	    case "odogwu":
		return 4200;
	    case "big boys":
		return 3000;
	    case "small money":
		return 2400;
	    case "sapa size":
		return 2000;
	    default: return 0;	
	}
   } 

   public int getNoOfBoxes(){
	int slicesPerBox = getPizzaSlicesPerBox();
	int noOfBoxes = noOfGuests / slicesPerBox;

	if(noOfBoxes % slicesPerBox != 0 || noOfBoxes * slicesPerBox <  noOfGuests){
		noOfBoxes += 1;
	}

	return noOfBoxes;
   }

   public int getLeftOver(){
	int slicesPerBox = getPizzaSlicesPerBox();
	int totalNoOfSlices =  getNoOfBoxes() * slicesPerBox;

	int leftOvers = totalNoOfSlices - noOfGuests;

	return leftOvers;
   }

   public int getTotalCost(){
       	int pricePerBox = getPricePerBox();
	int cost = getNoOfBoxes() * pricePerBox;

	return cost;
   }
	
   public void displayPizzaType(){
	System.out.print("""
	1. Sapa size
	2. Small money
	3. Big Boys
	4. Odogwu
""");
   }

   public static void displayTable(){
	System.out.println("---------------------------------------------------");
	System.out.println("| PIZZA TYPE   | NUMBER OF SLICES | PRICE PER BOX |");
	System.out.println("---------------------------------------------------");
	System.out.println("| Sapa Size    | 4                | 2000          |");
	System.out.println("---------------------------------------------------");
	System.out.println("| Small Money  | 6                | 2400          |");
	System.out.println("---------------------------------------------------");
	System.out.println("| Big Boys     | 8                | 3000          |");
	System.out.println("---------------------------------------------------");
	System.out.println("| Odogwu       | 12               | 4200          |");
	System.out.println("---------------------------------------------------");
   }
}
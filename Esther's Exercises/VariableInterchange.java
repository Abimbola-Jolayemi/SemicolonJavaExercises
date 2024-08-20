public class VariableInterchange{
   public static void main(String []args){

	String var1 = "Beauty";
	String var2 = "Pablo";
	String var3 = "Nike";

	String tempVar = var1;
	var1 = var2;
	var2 = var3;
	var3 = tempVar;

	System.out.println(var1);
	System.out.println(var2);
	System.out.println(var3);
   }
}
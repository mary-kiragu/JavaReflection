
 public class kiragu {
	 
	 public  static String wife,son,daughter;
	 
	 public static String wifeName( String name){
		 wife=name;
		 
		return wife;
	 }
	 
	 public static String getWifeName(){
		 return wife;
	 }
	
	 public static void sonName(String name){
		 
		 son=name;
		 
	 }
	 public static void family(){
		 	System.out.println("The names of Kiragu's wife and son are " + getWifeName() + " and "+ son +" respectively");
	 }
}
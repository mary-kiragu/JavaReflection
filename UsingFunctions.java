import java.util.Scanner;
public class UsingFunctions{
	
	public static String firstName,secondName,surName,name;
 
	public static void main(String[]args){
		
		firstName();
		
		secondName();
		
		surName();
		
		System.out.println("Your name is " +firstName+" "+secondName+" "+surName);
	}
	
	public static void firstName(){
		
		System.out.println("Enter first name");
		
		firstName=scan();
	}
	
	public static void secondName(){
		
		System.out.println("Enter second name");
		
		secondName=scan();
	}
	
	public static void surName(){
		
		System.out.println("Enter surname");
		
		surName=scan();
	}
	
	public static String scan(){
		
		Scanner sc=new Scanner(System.in);
		
		name=sc.nextLine();
		
		return name;
	}
}
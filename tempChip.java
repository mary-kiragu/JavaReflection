import java.util.Scanner;
public class tempChip{
	public static int temp,i,n,age,num;
	public static String firstName,secondname,surname,name;
	public static void main(String[]args){
		firstName();
		secondname();
        surname();
         System.out.println("You are "+firstName+""+secondname+""+surname);
		 age();
		 
		 
	}
	//scanner function used to prompt a user to input a variable
	public static  String scan(){
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		return name;
		
	}
	public static void firstName(){
		System.out.println("Enter your first name");
		firstName=scan();
	}
	public static void secondname(){
		
		System.out.println("Enter your second name\n");
		secondname=scan();
		
	}
	public static void surname(){
		
		System.out.println("Enter your surname");
		surname=scan();
		
	}
	public static int scann(){
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt;
		return num;
	}
	public static int age(){
		System.out.println("How old are you?"+firstName);
		age=scann();
		return age;
	}
}
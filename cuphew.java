import java.util.Scanner;
public class cuphew{
			public static String time;
			public static String age;
			public static String num;
		    public static String name;
	public static void main(String[] args){
		
		System.out.println("Please enter your first name:");
			name=scan();
		System.out.println("hello  "+name);
		System.out.println("How old are you   "+name);
		age=scan();
		if(age<"18"){
			System.out.println("You are a baby you can't go out it's dangerous.You should stay indoors ");
			
		}
		else 
			System.out.println("You are only to go out before the cuphew stats");
		
		//System.out.println("")
	}
	public static String scan(){
		Scanner sc=new Scanner(System.in);
		num=sc.nextLine();
		return num;
	}
}
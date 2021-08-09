import java.util.Scanner;
public class Njenga{
		public static int num;
	
	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		kiragu kiraguobject=new kiragu();
		System.out.println("Enter the number of children that Kiagu has");
		num=sc.nextInt();
		System.out.println("Enter trhe name of kiragu's wife");
		String temp=sc.nextLine();
		System.out.println("Enter trhe name of kiragu's son");
		String temp1=sc.nextLine();
		kiraguobject.wifeName(temp);
		kiraguobject.sonName(temp1);
		kiraguobject.family();
		
	}
}
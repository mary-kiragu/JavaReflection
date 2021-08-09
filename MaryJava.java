
import java.util.Scanner;

public class MaryJava {
	
	public static void main (String[] args)
	{
		String myName;
		int num;
		double decimalNumber;
		
		//System.out.println("Nilikua nimesahau stuff fulani:\n1:Capital s\n2:kusave file\n3:cmd kiasi");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		
		myName = sc.nextLine();
		
		System.out.println("Nice to meet you " + myName );
		
		System.out.println("Enter any number.");
		
		num = sc.nextInt();
		
		System.out.println("The number you input is " + num );
		
		System.out.println("Enter a decimal number.");
		
		decimalNumber = sc.nextDouble();
		
		System.out.println("The Decimal Number that you chose is " + decimalNumber );
		
		
		
	}
	
	
	
}
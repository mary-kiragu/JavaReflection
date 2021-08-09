import java.util.Scanner;

public class GoodCalc{
	
	public static int firstNum,secondNum,number,product;
	//public static String operand;
	
	public static void main(String[]args){
		
		firstNum();
		
		secondNum();
		
		product();
		System.out.println("first number = "+firstNum+" second number= "+secondNum+" product = "+product );
		
		
	}
	public static int scan(){
	Scanner sc=new Scanner (System.in);
	
	number=sc.nextInt();
	
	return number;
	}
	
	public static void firstNum(){
		
	System.out.println("Enter first number:\n");
	firstNum=scan();
	}
	
	public static void secondNum(){
		
	System.out.println("Enter second number:\n");
	
	secondNum=scan();
	
	
	}
	public static int product(){

	product=firstNum*secondNum;
	return product;
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
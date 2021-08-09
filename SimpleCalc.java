import java.util.Scanner;
public class SimpleCalc{
public static void main(String[]args){
	
Scanner sc=new Scanner(System.in);
int num1,num2,ans; 
String operand;

System.out.println("Enter first number:");
num1=sc.nextInt();
System.out.println("Enter the second number:");
num2=sc.nextInt();
System.out.println("Input Operand To use.!");
operand=sc.nextLine();
operand=sc.nextLine();
//ans=num1+num2;
//System.out.println("The sum is:"+ans);
switch(operand){
	
case "+":
ans=num1+num2;
System.out.println("The sum is:"+ans);	
break;

case "-":
ans=num1-num2;
System.out.println("The difference is:"+ans);
break;

	case "*":
ans=num1*num2;
System.out.println("The product is:"+ans);	
break;

case "/":
ans=num1/num2;
System.out.println("The quotient is:"+ans);	
break;

default: System.out.println("Your operand "+operand+" Is not valid!");	
	
}	
	
}	

}
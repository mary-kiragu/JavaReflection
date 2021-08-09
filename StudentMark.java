import java.util.Scanner;
public class StudentMark{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int cat1,cat2,main,total,n,i;
		String name;
		System.out.println("input the numbey of students");
		n=sc.nextInt();
		for(i=1;i<=n;i++){
			System.out.println("Enter the name of the student:\n");
			name=sc.nextLine();
			name=sc.nextLine();
			System.out.println("Enter the CAT1:\n");
			cat1=sc.nextInt();
			System.out.println("Enter the CAT2:\n");
			cat2=sc.nextInt();
			System.out.println("Enter the MAIN EXAM:\n");
			main=sc.nextInt();
			total=cat1+cat2+main;
			System.out.println(" CAT1=:\n"+cat1);
			System.out.println(" CAT2=:\n"+cat2);
			System.out.println("MAIN EXAM=:\n"+main);
			System.out.println("has a total of Marks"+name+" "+total);
		}
	}
}
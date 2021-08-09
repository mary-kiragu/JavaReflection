/*A program that allows user to enter the number of items and their Quantity.Prices for items are constant.
Compute indvidual amount and TOTAL.Amount picked from customer
entered and change computed.*/
import java.util.Scanner;
public class Receipt
{
    //priceA is the price of Dairyland choconut stick.
    //priceB is the price of cadbury lunch bar dream.
    static final double priceA=54.00;
    static final double priceB=60.00;
    static final double vat=0.14;
    static final int choconut_stick_code =19000207;
    static final String choconut_stick_name = "DAIRYLAND CHOCONUT STICK";

    static final int lunchbar_stick_code=14007438;
    static final String lunchbar_stick_name = "CADBURY LUNCH BAR DREAM";

    //Declaration of instance variables.

    static int quantityA,quantityB,total_items;
    static int item_code;
    static String item;
	static String item_name;
    static double amount,sub_total,total = 0;

    static double amount_picked,change;
    // main method
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int i = 0;

        System.out.println("Enter the number of Items:");
        total_items = sc.nextInt();//Scan the number of items that are to be billed.2

        while( i < total_items) {//while loop to ensure repetition when asking for the items.

            System.out.println("Enter the code of the item : " + (i + 1));
            item_code = sc.nextInt();//The unique code that identifies the item.
			System.out.println("Enter the name of the item : " + (i + 1));
            item_name = sc.nextLine();//The name of the item.


            if (item_code == choconut_stick_code) {//This means that the code is for choconut stick.

                System.out.println("Enter the number of " + choconut_stick_name + ":");
                quantityA = sc.nextInt();
                amount = quantityA * priceA;

                total += amount;//add the total amount to the chocho sticks amount.

                System.out.println( choconut_stick_name + " Amount = " + amount);

                ++i;//increment i since we have scanned an item;

            } else if (item_code == lunchbar_stick_code) {//this means that the code is for the LunchBar

                System.out.println("Enter the number of " + lunchbar_stick_name + " You Want :");
                quantityB = sc.nextInt();
                amount = quantityB * priceB;

                total += amount;//add the total amount to the LunchBar amount.

                System.out.println(lunchbar_stick_name + " Amount = " + amount);

                ++i;//increment i since we have scanned an item;

            }else{//This means that the code input is not known andinvalid.
                System.out.println("Wrong code Input again.!");
            }
        }//end of while loop
		System.out.println(" Enter Amount from customer");
		amount_picked=sc.nextDouble();
			change=amount_picked-total;
        System.out.println("\n\nThe TOTAL COST for the "+total_items + " items is = " + total);
		System.out.println("\t\tNAIVAS LIMITED");
		System.out.println("\t\tP.O BOX 61600-00100 NAIROBI");
		System.out.println("\t\tTELEPHONE NO 020-8000356");
		System.out.println("\t\tVAT #: 0109300U");
		System.out.println("\t\tPIN :P051123223G");
		System.out.println("");
		System.out.println("");
		
		System.out.println("Cash Sale #800-01100027484");
		System.out.println("Date Time :07/06/2020 16:04:43");
		System.out.println("Store :EASTERN BYPASS Till#:80-01");
		System.out.println("");
		
		System.out.println("ITEM \t\t\t\tQTY\tPRICE\tAMOUNT");
		System.out.println("-------------------------------------------------------------");
		
		System.out.println(choconut_stick_code+"\t\t\t\t\t"+priceA+"x"+quantityA);
		System.out.println("DAIRYLAND CHOCONUT STICK 70ML\t\t\t"+ (priceA*quantityA));
		System.out.println(lunchbar_stick_code+"\t\t\t\t\t"+priceB+"x"+quantityB);
		System.out.println("CADBURY LUNCH BAR DREAM 48GM\t\t\t"+ (priceB*quantityB));
		System.out.println("----------------------------------------------------------");
		
		
		System.out.println("TOTAL ITEMS:"+total_items);
		System.out.println("-----------------------------------------------------");
		
		System.out.println("SUBTOTAL\t\t\t\t200.00");
		
		System.out.println("VAT\t\t\t\t\t28.00");
		System.out.println("TOTAL\t\t"+total);
		System.out.println("-----------------------------------------------------");
		
		System.out.println("CODE\tRATE\tVATABLE AMT\tVAT AMT");
		System.out.println("-----------------------------------------------------");
		
		System.out.println("A\t14.00%\t200.00\t28.00");
		System.out.println("---------------------------------------------------");
		System.out.println("");
		System.out.println("TOTAL\t\t\t\t\t"+total);
		System.out.println("Mpesa\t\t\t\t\t"+amount_picked);
		System.out.println("Change\t\t\t\t\t"+change);
		System.out.println("------------------------------------------------------");
		
		System.out.println("PRICES INCLUSIVE OF VAT WHERE APPLICABLE");
		System.out.println("-------------------------------------------------------");
		
		System.out.println("YOU WERE SERVED BY CECILIA NDUKU MUTUKU");
		System.out.println("--------------------------------------------------------");
		
		
		
		
		
		
		
		
		
		
    }//end main()
}//end Public class.
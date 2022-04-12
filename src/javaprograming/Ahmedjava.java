package javaprograming;

import java.util.Scanner;

public class Ahmedjava {
	
	
	public static void main (String args []) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("*******invoice*********");
		
        System.out.println( " enter item1 name");
		String item1 = input.next();
		System.out.println( " enter item1 price ");
		double price1= input.nextDouble();
		
		System.out.println( "enter item2 name");
		String item2 = input.next();
		System.out.println(" enter item2 price");
		double price2 = input.nextDouble();
		
		
		System.out.println( "enter item3 name");
		String item3 = input.next();
		System.out.println(" enter item3 price");
		double price3 = input.nextDouble();
		
		
		System.out.println( "enter item4 name");
		String item4 = input.next();
		System.out.println(" enter item4 price");
		double price4 = input.nextDouble();
		
		
		double subtotal =price2+price3+price4;
	    System.out.println( "subtotal is ="+ subtotal );
	    
	    System.out.println("Enter Tax bracket");
		double tax = input.nextFloat();
		System.out.println("Tax bracket : "+tax);
		 
		double total = subtotal+subtotal* tax;
		System.out.println("total is=" +total );
		
		
		System.out.println("**************** Shoprite invoice*****************");
		
		System.out.println( item1+"                          "+ price1 );
		
		
		System.out.println( item2+"                          "+ price2 );
		
	
		System.out.println( item3+"                          "+ price3 );
		
		System.out.println( item4+"                          "+ price4 );
		
		
		System.out.println( "subtotal =                      " +subtotal );
		 
		System.out.println( "tax=                            "   +tax  );
		       
		System.out.printf("tax is %.2f\n                     "    ,tax);
		
		System.out.printf("Total is %.2f\n                   "   ,total);
		
		
		
		System.out.println("********Thanksfor bringing your money to us********" );
	}
	
	
}

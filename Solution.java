package com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		//Scanner
				Scanner scan=new Scanner(System.in);
				//Calculator CalculatorImpl ->abstraction ->Upcasting
				
				Calculator c=new CalculatorImp();
				//Menu Driven program ->display options  
				
				while(true) {
				System.out.println("1:Addition\n2:Substraction\n3:Multiplication");
				System.out.println("4:Division\n5:Exit\nEnter your Choice");
				
				int choice=scan.nextInt();
				
				int a=0;
				int b=0;
				
				if(choice>=1 && choice<=4) {
					System.out.println("Enter 2 numbers");
				a=scan.nextInt();
				b=scan.nextInt();
				}
				switch(choice) {
				
				case 1:
					System.out.println("Sum of "+a+" And "+b+" is "+c.add(a, b));
					break;
					
				case 2:
					System.out.println("Difference of "+a+" And "+b+" is "+c.sub(a, b));
					break;
					
				case 3:
					System.out.println("Product of "+a+" And "+b+" is "+c.mul(a, b));
					break;
					
				case 4:
					int result=c.div(a, b); //calc.div(10,0)
					if(result!=0) {
					System.out.println("Division of "+a+" And "+b+" is "+c.div(a, b));
					}
					else {
						System.out.println("Cannout Perform division");
					}
					break;
					
				case 5:	
				System.out.println("Thank You");
				System.exit(0);
				
					default:
						System.out.println(c.displayErrorMessage());
				
				}
				System.out.println("-----------");
				
				}
		
	}

}

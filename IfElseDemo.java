package com.review01;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean  tired=true;
		//is ali tired?
		if(tired) {
			System.out.println("Got to Sleep!");
			System.out.println("Don't forget to wake up!");
			
		if(tired)	{
			System.out.println("Ali is tired");
			System.out.println("Ali goes to bed");
				
		}else
			System.out.println("Ali is strong");
			
		} else {
			System.out.println("Study more!");
			System.out.println("Continue studying!");
			
		if(tired)	
			System.out.println("Go to sleep!");
			
			
		}
		
		System.out.println("Let's print the bigger number");
		int number1=14;
		int number2=10;
		if(number1>number2) {
			System.out.println("number 1 is bigger, the value is "+ number1);
		}else if(number2>number1) {
			System.out.println("number2 is bigger, the value is "+ number2);
		}else {
			System.out.println("number1 and number2 aree equal, the value is "+number1);
		}
	}

}	
		
	


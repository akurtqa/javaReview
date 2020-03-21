package com.review01;

import java.util.Scanner;

public class ScannerTask01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		int age=scan.nextInt();
		System.out.println("The age is " + age);
		
		int height=scan.nextInt();
		System.out.println("The age is " + age);
		
		if(age<=10);{
		System.out.println("You're too young my brotheer!");
		
		}else if(age<=20);{
		System.out.println("You're growing budy!");
		
		}else if(age<=50);{
		System.out.println("You're the man!");
		
		}else {
		System.out.println("Man, you're dying!");
		
		}
			

	}

}

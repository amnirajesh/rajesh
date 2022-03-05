package com.casio;

import java.util.Scanner;

public class AddOrEven {
	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("The Enter value need to check");
		a=s.nextInt();
		b=a%2;
		if(b!=0)
		{
			System.out.println("The Entered value of"+a+" is odd Number ");
			
		}
		else
		{
			System.out.println("The entered value of "+a+"is  number");
		
	}

}
}
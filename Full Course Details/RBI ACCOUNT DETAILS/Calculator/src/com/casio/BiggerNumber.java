package com.casio;

import java.util.Scanner;

public class BiggerNumber {
	public static void main(String[] args) {
		int a,b,c,d;
		Scanner s=new Scanner(System.in);
		System.out.println("End the values a");
		a=s.nextInt();
		System.out.println("End the values b");
		b=s.nextInt();
		System.out.println("End the values c");
		c=s.nextInt();
		if(a!=c&&b!=c)
		{
		if(a>b&&a>c)
		{
		System.out.println("The value a "+a+" bigger");	
		}
		if(b>a&&b>c)
		{System.out.println("The value b "+b+"bigger");
		}
		if(c>a&&c>b)
		{System.out.println("The value c "+c+"bigger");
		}
		
	}
		else
		{System.out.println("The Entered all three values are same");
		}
	
}}

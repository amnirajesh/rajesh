package com.casio;

import java.util.Scanner;

public class BiggerNumberr {
	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value to be check");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a!=b&&a!=c&&b!=c)
		{
			if(a>b&&a>c) {System.out.println(""+a+" bigger");}
			if(b>a&&b>c) {System.out.println(""+b+" bigger");}
			if(c>b&&c>a) {System.out.println(""+c+" bigger");}
		}

		else	
			
			
		{
			if(a==b&&a>c) {System.out.println(""+a+" bigger");}
			if(a==b&&a<c) {System.out.println(""+c+" bigger");}
			if(a==c&&a<b) {System.out.println(""+b+" bigger");}
			if(c==b&&a>c) {System.out.println(""+a+" bigger");}
			if(a==c&&a>b) {System.out.println(""+a+" bigger");}			
			if(c==b&&c>a) {System.out.println(""+b+" bigger");}
			if(a==b&&c==b) {System.out.println("All  numbers are equal");}
		}
		
		
	}

}

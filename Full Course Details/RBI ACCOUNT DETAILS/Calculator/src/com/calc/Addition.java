package com.calc;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner rj= new Scanner(System.in);
		int a,b;
		System.out.println("Enter the value to be added ");
		a=rj.nextInt();
		while(a>0) {
			b=a%10;
			int c=0;
			c=c+b*b*b;
			a=a/10;
			
		}
System.out.println(rj.c);		
	}

}

package com.casio;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
		
		do
		{System.out.println("value is" +c);
		}
		while(c<1);
	}

}

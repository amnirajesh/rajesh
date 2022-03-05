package com.casio;

import java.util.Scanner;

public class FactorialCalculation {
	public static void main(String[] args) {
		int fact=1,i;
		Scanner f=new Scanner(System.in);
		System.out.println("enter the value");
		i=f.nextInt();
		while(i>0)
		{
			fact=fact*i;
			i--;
		}
		System.out.println("the factorial is"+fact);
	}

}


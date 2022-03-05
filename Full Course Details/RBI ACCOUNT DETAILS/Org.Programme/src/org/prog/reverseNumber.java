package org.prog;

import java.util.Scanner;

public class reverseNumber {
	public static void main(String[] args) {
		int a,j=0,i=0,b;
		System.out.println("enter the value to be reverse");
		Scanner rj=new Scanner(System.in);
		a=rj.nextInt();
		while(a>0)
		{
			b=a%10;
			j=j*10+b;
			a=a/10;
		}
		System.out.println("the reverse is" +j);
	}

}

package com.casio;

import java.util.Scanner;

public class WhileDoWhile {
	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		System.out.println("The Numbers to be Print below 10");
		while(a<10) {
			System.out.print(a+"is less than 10\n");a++;
		}
		do{
			System.out.println("Rajesh is all Time King");
		}while(a<10);
		
	}

}


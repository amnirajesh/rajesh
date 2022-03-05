package com.casio;
import java.util.Scanner;
public class BankingDetails {
	public static void main(String[] args) {
		Scanner raj =new Scanner(System.in);
		System.out.println("Enter the name");
		String a=raj.nextLine();
		System.out.println("Enter the age");
		int aa=raj.nextInt();
		System.out.println("Initial");
		char ab=raj.next().charAt(2);
		System.out.println("nick");
		String ah=raj.next();
		
		System.out.println("The age is :"+aa);
		System.out.println("The Canditate name:"+ab);
		System.out.println("The address" +a);
		System.out.println("The nick name" +ah);

	}
} 

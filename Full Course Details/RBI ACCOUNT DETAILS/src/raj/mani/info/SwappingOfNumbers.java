package raj.mani.info;

import java.util.Scanner;

public class SwappingOfNumbers {
	public static void main(String[] args) {
		///using 3rd value
		Scanner aa=new Scanner(System.in);
		System.out.println("enter the values to be swapped-x");
		int x = aa.nextInt();
		System.out.println("y");
		int y = aa.nextInt();
		int m;
		m=x;
		x=y;
		y=m;
		System.out.println("x value is"+x);
		System.out.println("y value is" +y);
		//without using 3rd value
		
		Scanner a=new Scanner(System.in);
		System.out.println("i");
		int i = a.nextInt();
		System.out.println("j");
		int j = a.nextInt();
		i=i+j;
		j=i-j;
		i=i-j;
		
		System.out.println("i"+i);
		System.out.println("j"+j);
		
	}

}

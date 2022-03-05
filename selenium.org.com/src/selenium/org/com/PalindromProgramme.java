package selenium.org.com;

import java.util.Iterator;
import java.util.Scanner;

public class PalindromProgramme {
	
	public static void main(String[] args) {
//		123
//		1x1x1+2X2x2+3X3X3
		int a,b;
		System.out.println("Enter the value to check");
		Scanner input=new Scanner(System.in);
		int aa = input.nextInt();
		int c=0,d;
		a=aa;
		while(a>0) {
			b=a%10;
			
			d=c+b*b*b;
			c=d;
			a=a/10;	
		
	}
		if(c==aa) {
System.out.println("Given number is AmstrongNumber");
}
		else{System.out.println("Given number is not a AmstrongNumber");}}}

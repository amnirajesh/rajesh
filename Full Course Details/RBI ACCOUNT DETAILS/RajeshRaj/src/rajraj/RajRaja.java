package rajraj;

import java.util.Scanner;

public class RajRaja {
	public static void main(String[] args) {
		long a,b,c=1,i;
		Scanner na=new Scanner(System.in);
		System.out.println("enter the value of a");
		a=na.nextLong();
		for(i=1;i<=a;i++) {
			c=c*i;
			
		}
		System.out.println(c);
	}

}

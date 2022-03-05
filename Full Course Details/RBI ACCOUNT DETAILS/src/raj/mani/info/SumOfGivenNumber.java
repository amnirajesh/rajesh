package raj.mani.info;

import java.util.Scanner;

public class SumOfGivenNumber {
public static void main(String[] args) {
	Scanner aa=new Scanner(System.in);
	System.out.println("enter");
	int x = aa.nextInt();
	int y=0;
	while(x>0) {
	int m=x%10;
	y=y+m;
	x=x/10;
	}
	System.out.println(y);
}
}

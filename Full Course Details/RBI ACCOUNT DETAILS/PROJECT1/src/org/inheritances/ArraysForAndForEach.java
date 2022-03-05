package org.inheritances;

import java.util.Scanner;

public class ArraysForAndForEach {
	public static void main(String[] args) {
		int i,j,x,y;
		Scanner rag=new Scanner(System.in);
		x=rag.nextInt();
		y=rag.nextInt();
		int a[][]=new int[2][2];
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		for (i = 0; i <x ; i++) {
			for (j = 0; j < y; j++) {
				System.out.println(a[i][j]);
				
			}
			
			
		}
		
for (int[] ks : a) {
	for (int ks2 : ks) {
		System.out.println(ks2);
	}
	
}
	
}			
		}
	



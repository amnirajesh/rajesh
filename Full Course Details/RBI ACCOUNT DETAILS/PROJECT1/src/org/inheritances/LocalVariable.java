package org.inheritances;

public class LocalVariable {
	public int c;
	public static  int d=2;
	public void localVar() {
		int a=0;
		System.out.println("local before initialization"+a);
		a++;
		System.out.println("local after initialization"+a);
		System.out.println("");
		System.out.println("instance before initialization"+c);
		c++;
		System.out.println("instance after initialization"+c);
		System.out.println("");
		System.out.println("Static  variable before initialization" +d);
		d++;
		System.out.println("static variable after initialization" +d);
	}
	
	public static void main(String[] args) {
		LocalVariable b=new LocalVariable();		
		b.localVar();
		d++;
		System.out.println("static variable" +d);
		System.out.println("instance variable"+b.c);
	}

}

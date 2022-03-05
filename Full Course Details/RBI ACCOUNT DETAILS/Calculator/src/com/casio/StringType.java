package com.casio;

public class StringType {
	public static void main(String[] args) {
			
String a="Rajesh J Jayashree",b="Jaya",c=" raji i ",d="rajesh j jayashree",e="manimegalai";
int length= a.length();
System.out.println(length);
boolean space=a.isEmpty();
System.out.println(space);
char place=a.charAt(9);
System.out.println(place);
int A=a.indexOf('a');
System.out.println(A);
int B=a.lastIndexOf('j');
System.out.println(B);
String Up=a.toUpperCase();
System.out.println(Up);
String Low=a.toLowerCase();
System.out.println(Low);
String j=a.concat(b).concat(c);
System.out.println(j);
boolean C=a.contains("h");
System.out.println(C);
boolean St=a.startsWith("j");
System.out.println(St);
boolean End=a.endsWith("e");
System.out.println(End);
boolean eql=a.equals(d);
System.out.println(eql);
boolean eqlign=a.equalsIgnoreCase(d);
System.out.println(eqlign);
String replace=a.replace('e','a');
System.out.println(replace);
String Trim=c.trim();
System.out.println(Trim);
System.out.println(c);

}

	

}

package com.casio;

import java.util.Scanner;
public class Addition{
public static void main(String[] args) {
	int a,b,c;
	Scanner rj=new Scanner(System.in);
	System.out.println("enter the value");
	a=rj.nextInt();
	b=rj.nextInt();
	c=a+b;
	System.out.println("addition of two number is:" +c);
}}
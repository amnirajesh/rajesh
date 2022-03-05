package org.inheritances;

public class MethodOverRiding extends MethodOveriding {	

	public void studentPassMark() {
		System.out.println("Pass Mark is 35 in this state RRRRRRRRRR");
	}

	public void canditatePassMark() {
		System.out.println("Canditate pass mark is 2665  RRRRRRRRRRR");
	}
	public static void main(String[] args) {
		MethodOverRiding raj =new MethodOverRiding();
		raj.canditatePassMark();
		raj.studentPassMark();
	}
	}

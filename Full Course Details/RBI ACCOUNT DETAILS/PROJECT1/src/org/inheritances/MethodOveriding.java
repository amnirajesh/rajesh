package org.inheritances;

public  class MethodOveriding {
	public  void studentPassMark()
	{
		System.out.println("Student pass mark is 25 as per state board rrrrrrrrrrrrr");
	}
	public  void canditatePassMark()
	{
	System.out.println("Candidates pass mark is 50 as per state board rrrrrrrrrrrr");
	}
	
	public static void main(String[] args) {
		MethodOveriding main=new MethodOveriding();
		main.studentPassMark();
		main.canditatePassMark();
	}
	
}

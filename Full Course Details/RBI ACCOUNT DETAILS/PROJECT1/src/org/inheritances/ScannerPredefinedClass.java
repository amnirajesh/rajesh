package org.inheritances;
import java.util.Scanner;
public class ScannerPredefinedClass {
public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.println("address");
	String address = a.nextLine();
	System.out.println(address);
	String name = a.next();
	System.out.println(name);
	byte age = a.nextByte();
	System.out.println(age);
	int year = a.nextInt();
	System.out.println(year);
	short empId = a.nextShort();
	System.out.println(empId);
	long phone = a.nextLong();
	System.out.println(phone);
double salary = a.nextDouble();
System.out.println(salary);
float currency = a.nextFloat();
System.out.println(currency);
boolean maritalStatus = a.nextBoolean();
System.out.println(maritalStatus);
System.out.println(a);

	
}

}

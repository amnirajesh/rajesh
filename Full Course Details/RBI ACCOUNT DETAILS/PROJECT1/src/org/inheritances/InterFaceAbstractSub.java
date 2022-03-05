package org.inheritances;

public class InterFaceAbstractSub implements InterFaceAbstract {
	public void workerId(){System.out.println("Worker ID is 585695");}
	public void workerAge(){System.out.println("Worker age is 55");}
	public  void workerAddress(){System.out.println("Worker Address is vadapalani chennai");}
	public  void workerPlace(){System.out.println("Work place is thuthukudi");}



public static void main(String[] args) {
	InterFaceAbstractSub g=new InterFaceAbstractSub();
	g.workerId();
	g.workerAge();
	g.workerAddress();
	g.workerPlace();
	
}
	
}

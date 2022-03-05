package org.inheritances;

public class MethodOverLoading {
	public void postOffice(String Name,int Age,int rating) {
		System.out.println("Postoffice details "+"\n"+Name+"\n"+Age+"\n"+rating);
	}
	
	public void postOffice(String Name,int Age,int rating,long mobile,float balance) {
		System.out.println("Postoffice datas" +"\n"+Name+ "\n"+Age+"\n" +rating+"\n" +mobile+"\n"+balance);
	}
	
	public static void main(String[] args) {
		MethodOverLoading a= new MethodOverLoading();
		a.postOffice("Rajesh", 25, 1);
		a.postOffice("RajeshKanna",35, 5,252624,256);
	}
}

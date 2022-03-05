package selenium.org.com;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkeSetVsLinkedList {
	public static void main(String[] args) {
		LinkedList<Object> li=new LinkedList<>();
		li.add(50);
		li.add(25);
		li.add(505);
		li.add(502);
		li.add(256);
		li.add(265);
		li.add(246);
		li.add(222);
		
		
	//Copy of value list to set	
		System.out.println("List values are          :"+li);
		LinkedHashSet<Object> set=new LinkedHashSet<>();
		set.addAll(li);
		System.out.println("List values copied to set :"+set);
		
		////First 5  numbers
		System.out.println("");
		System.out.println("First 5 numbers are:");
		for (int i = 0; i < 5; i++) {
			Object num = li.get(i);
			System.out.println(num);}
		
		
		///size of list
		int size = li.size();
		System.out.println("");
		System.out.println("size of the array is:"+size);
		
		///Iteration of all value by for loop
		System.out.println("");
				System.out.println("Iteration of all values");		
		for (int i = 0; i < li.size(); i++) 
		{
			Object num1 = li.get(i);
			System.out.println(num1);	
		}
		
		//Iteration of all value by Enhanced loop
		System.out.println("");
		System.out.println("Iteration of Enhanced loop");
		for (Object a : li) {
			System.out.println(a);
		}
		//Alternate numbers
		System.out.println("");
		System.out.println("Alternate numbers");
		for (int i = 0; i < li.size(); i++) 
		{
			Object num1 = li.get(i);
			System.out.println(num1);	
			i++;
		}
		//Last five index value
				System.out.println("");
				System.out.println("Last five value");
				for (int i = li.size()-5; i <li.size();  i++) 
				{
				//	int index = li.size();
				//	int x=index-i-1;
					Object num2 = li.get(i);
					System.out.println(num2);	
				}
				
				//middle index value 
				for (int i = li.size()/2; i == li.size()/2 ; i++) {
					Object num2 = li.get(i);
					System.out.println("middle number is:"+num2);
				}
					
				System.out.println("");	
				System.out.println("First value is:"+li.getFirst());
		       System.out.println("Last value is"+li.getLast());
		
		
		
		
		
		
		
		
}

	}
	



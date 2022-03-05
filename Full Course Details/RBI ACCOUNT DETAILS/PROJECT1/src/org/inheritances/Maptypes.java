package org.inheritances;

import java.util.HashMap;
import java.util.Map;
/////map Itegration using Entry set
public class Maptypes {
	public static void main(String[] args) {
		Map<Integer,String> ap=new HashMap<>();
		ap.put(1, "rajesh");
		ap.put(2, "suresh");
		ap.put(3,"ramesh");
		ap.put(4,"dinesh");
		ap.put(5,"vignesh");
		ap.put(6,"kailash");
		System.out.println("Befor adding a value"+ap);
		System.out.println("Topic of Adding of a value in Mapping");
		ap.put(7,"mugesh");
		System.out.println("After adding a value"+ap);	
		for (Integer Order :ap.keySet()) {
			System.out.println(Order);
		}
		for (String Items : ap.values()) {
			System.out.println(Items);
			
		}		
		System.out.println("Topic about iteration of value and keys");
		for (Map.Entry<Integer,String>a :ap.entrySet()) {
			System.out.println(a.getKey()+ "="+a.getValue());
		
		}
	}

}

package raj.mani.info;

public class FabinacySeriase {
public static void main(String[] args){
	long a=0,b=1;
	System.out.println(a);
	System.out.println(a+1);
	for (long  j = 2; j <= 50; j++) {		
		long c=a+b;
		a=b;
	b=c;
	System.out.println(c);
	}                                                 
}}                                                        
                                                                
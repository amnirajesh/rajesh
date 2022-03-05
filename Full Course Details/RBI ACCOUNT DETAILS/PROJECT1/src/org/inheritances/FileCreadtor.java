package org.inheritances;
import java.io.File;
import java.io.IOException;
public class FileCreadtor {
	public static void main(String[] args) throws IOException {
		File f =new File("C:\\jack\\ram.xlxs");
		boolean createNewFile = f.createNewFile();
		System.out.println(createNewFile);
		
		
				
	}

}

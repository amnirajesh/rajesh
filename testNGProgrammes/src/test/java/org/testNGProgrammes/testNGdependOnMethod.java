package org.testNGProgrammes;

import javax.print.attribute.standard.MediaSize.Engineering;

import org.testng.annotations.Test;

public class testNGdependOnMethod {
		@Test (priority = 0,enabled = true)
		private void highSchool() {
	System.out.println("High School");
		}
		@Test(dependsOnMethods = "highSchool")
	private void highSecSchool() {
System.out.println("HighSecSchool");
	}	
		@Test(dependsOnMethods = "highSecSchool") void engineering() {
			System.out.println("Engineering");
		}
	}


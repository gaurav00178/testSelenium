package com.seleniumlearn.app;

import org.testng.annotations.Test;

public class FirstTest extends HomePageObjects {
	
/*	@Test
	public void firstMavenRun(){
		System.out.println("This is first Maven prog run");
	}
*/

	@Test
	public void runHeadingTestCase(){
	
		
		FirstTest ft = new FirstTest();
		
		ft.checkHeading(); 
		
	}
		
	
}

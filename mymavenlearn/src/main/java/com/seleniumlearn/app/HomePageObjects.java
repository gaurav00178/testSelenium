package com.seleniumlearn.app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageObjects {
	
	WebDriver driver;
	
	public void checkHeading(){
		
		String s1="GROWSURE";
		String s= driver.findElement(By.xpath("//img[@id='header_logo']")).getText();
		
		if (s1.equals(s)){
			System.out.println("Heading is fine and test case is Pass");
		}
		else
			System.out.println("This is Failed Test Case");
	}
		
	}


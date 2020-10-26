package com.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openGooglePage 
{
		
	public static void main(String args[])
	{
		
		System.out.println("First Selenium test to open google.com");

		//Setup ChromeDriver Path ( Any Browser )
		System.setProperty("webdriver.chrome.driver","E:\\Selenium + Java - Youtube\\Selenium\\Libraries\\chromedriver_win32\\chromedriver.exe");
		
		//Creating object for Webdriver
		WebDriver driver=new ChromeDriver();
		
	
		// Opening Google.com
		driver.navigate().to("http://www.google.com");
		
		// Maximise the Browser
		driver.manage().window().maximize();
		
		System.out.println("google.com opened succesfully");
		
	}
}

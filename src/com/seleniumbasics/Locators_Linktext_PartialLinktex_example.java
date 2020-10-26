package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Linktext_PartialLinktex_example

{
		public static void main(String args[])
		{
			System.setProperty("webdriver.chrome.driver","E:\\Selenium + Java - Youtube\\Selenium\\Libraries\\chromedriver_win32\\chromedriver.exe");
			
			//Creating object for Webdriver
			WebDriver driver=new ChromeDriver();
			
		
			// Opening Google.com
			driver.navigate().to("http://demowebshop.tricentis.com/");
			
			// Maximise the Browser
			driver.manage().window().maximize();
			
			System.out.println("Demowebshop opened succesfully");
			
			//driver.findElement(By.linkText("Register")).click();
			
			//System.out.println("Navigated to Registrtaion page ");
			
			
			//driver.findElement(By.linkText("Log in")).click();
			
			driver.findElement(By.partialLinkText("Log")).click();
	
		}
}

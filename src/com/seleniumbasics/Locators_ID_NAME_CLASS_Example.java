package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_ID_NAME_CLASS_Example 
{
	public static void main(String args[])
	{
		
		System.out.println("Registration Test Case Automation");

		//Setup ChromeDriver Path ( Any Browser )
		System.setProperty("webdriver.chrome.driver","E:\\Selenium + Java - Youtube\\Selenium\\Libraries\\chromedriver_win32\\chromedriver.exe");
		
		//Creating object for Webdriver
		WebDriver driver=new ChromeDriver();
		
	
		// Opening Google.com
		driver.navigate().to("http://demowebshop.tricentis.com/");
		
		// Maximise the Browser
		driver.manage().window().maximize();
		
		System.out.println("Demowebshop opened succesfully");
		
		
		
		//Click on Registration button
		driver.findElement(By.className("ico-register")).click();
		
		//Click on Male radio button
		driver.findElement(By.id("gender-male")).click();
		
		//Type First Name
		driver.findElement(By.name("FirstName")).sendKeys("Knowledge");
		
		//Type Last Name
		driver.findElement(By.id("LastName")).sendKeys("Share");
		
		//Type Email adress
		driver.findElement(By.name("Email")).sendKeys("knowledgeshare@test.com");
		
		//Type Password
		driver.findElement(By.name("Password")).sendKeys("123456");
		
		//Type Confirm Password
		driver.findElement(By.name("ConfirmPassword")).sendKeys("123456");
		
		//Click on Register button
		driver.findElement(By.id("register-button")).click();
		
		
		System.out.println("registration details entered successfully");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_CSS_Selectors_example 
{
	public static void main(String args[])
	{
			System.out.println("Registration Test Case Automation");
			System.setProperty("webdriver.chrome.driver","E:\\Selenium + Java - Youtube\\Selenium\\Libraries\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("http://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			System.out.println("Demowebshop opened succesfully");

			driver.findElement(By.cssSelector("input#FirstName")).sendKeys("test123"); // Using # for ID
			driver.findElement(By.cssSelector("input.form-text-input")).sendKeys("sampleemail@gmail.com"); // Using . for Class [ https://wordpress.com/log-in "] 
			driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("test345"); // Single Attribute
			//driver.findElement(By.cssSelector("input[id='Email'][name='Email']")).sendKeys("test@gmail.com"); // Multiple Attributes
			driver.findElement(By.cssSelector("input[data-val-required*='Email']")).sendKeys("test@gmail.com"); // Contains Using * Symbol
			driver.findElement(By.cssSelector("input[data-val-required^='Email']")).sendKeys("test@gmail.com"); // Starts with Using ^ Symbol
			driver.findElement(By.cssSelector("input[data-val-required^='Email']")).sendKeys("test@gmail.com"); // Ends with using $ Symbol
			
}
	
}

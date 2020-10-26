package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_XPATH_Using_Standard_and_or 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium + Java - Youtube\\Selenium\\Libraries\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		
		System.out.println("XPATH Examples - Registration Page ");
			
										/*     XPath using Basic Syntax, and, or */ 
		
		  driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		  driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("test1234");
		  driver.findElement(By.xpath("//input[@id='LastName' and @name='LastName']")).sendKeys("test3456");
		  driver.findElement(By.xpath("//input[@id='Email' or @name='Email']")).
		  sendKeys("testknowledgeshare@gmail.com"); driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/input")).sendKeys("123456");
		  driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("123456"); driver.findElement(By.
		  xpath("//input[@class='button-1 register-next-step-button']")).click();
		  System.out.println("Registration Successfull");
		 
	}
}

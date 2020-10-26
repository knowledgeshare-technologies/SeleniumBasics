package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_XPATH_functions_related 
{
	
	public static void main(String args[])
	{
		
	
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium + Java - Youtube\\Selenium\\Libraries\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/register");
	driver.manage().window().maximize();
	System.out.println("XPATH Examples - Registration Page ");
	
										/*     XPath using Functions, contains, starts-with , text , Index */ 
	
	driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
	driver.findElement(By.xpath("//input[contains(@id,'First')]")).sendKeys("knowledge123");
	driver.findElement(By.xpath("//input[starts-with(@id,'Last')]")).sendKeys("share123");
	driver.findElement(By.xpath("//input[starts-with(@id,'Email')]")).sendKeys("knowledgeshare@gmail.com");
	Boolean check_password_label=driver.findElement(By.xpath("//label[text()='Password:']")).isDisplayed();	
	System.out.println("Password value presence : " + check_password_label);
	driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("123456");
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("123456");
	
	}
	
}

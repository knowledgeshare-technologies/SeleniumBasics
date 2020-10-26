package com.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_tagName_example 
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
		
		System.out.println("Fiding Number of links on a web page");
		List <WebElement> list = driver.findElements(By.tagName("a"));
		
		System.out.println("Number of links on a web page is : "  + list.size());
		
		System.out.println("List of links available on the web page");
		
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}

		driver.quit();

	}
	
}

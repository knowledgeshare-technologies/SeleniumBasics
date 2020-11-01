package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDown_example 
{
		public static void main(String args[])
		{
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			/* Single Select DropsDown */
			driver.get("http://demowebshop.tricentis.com/books");
			
			Select sort_by =new Select(driver.findElement(By.name("products-orderby")));
			sort_by.selectByVisibleText("Price: Low to High");
			
			Select view_as=new Select(driver.findElement(By.name("products-viewmode")));
			view_as.selectByIndex(1);
	
			
		}
}

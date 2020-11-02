package com.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Search_SelectDropDown_examples 
{
		public static void main(String args[])
		{
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			/* Search Select Dropdown*/
			driver.get("C:\\Users\\SAM\\Desktop\\webpages\\SearchDropDown_Page.html");
			
			driver.manage().window().maximize();
			driver.findElement(By.className("dropbtn")).click();
			driver.findElement(By.id("myInput")).sendKeys("Contact");
			driver.findElement(By.xpath("//a[text()='Contact']")).click();
		}
}

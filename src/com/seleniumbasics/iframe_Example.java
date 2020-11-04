package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_Example 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		
		//find number of iframes
		int number_of_iframes=driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of iframes on a web page : " + number_of_iframes);
		
		driver.switchTo().frame("mce_0_ifr"); // By Name or ID
		
		/*
		 * driver.switchTo().frame(0);// By Index 
		 * WebElement frame_1=driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		 * driver.switchTo().frame(frame_1); // By WebElement
		 */		
		
		String get_content=driver.findElement(By.xpath("//p")).getAttribute("innerHTML");
		System.out.println(get_content);
		
		driver.switchTo().defaultContent(); // switching to main page content 
		String main_text=driver.findElement(By.xpath("//h3")).getAttribute("innerHTML");
		System.out.println(main_text);
		
	}
}

package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop_Example {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement From=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		
		WebElement To=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		
		Actions actions=new Actions(driver);
		
		actions.dragAndDrop(From, To).build().perform();
	}

}

package com.seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow_Handling_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		//Get handle of a parent window
		String mainWindowHandle=driver.getWindowHandle();
		System.out.println("Parent Window ID is : " + mainWindowHandle);
		
		//Get handles of child Windows
		Set<String> allWindowHandles =driver.getWindowHandles();
		Iterator<String> iterator=allWindowHandles.iterator();
		
		while(iterator.hasNext())
		{
			String child_window=iterator.next();
			System.out.println("Window ID : " + child_window );
			if(!mainWindowHandle.equalsIgnoreCase(child_window))
			{
				driver.switchTo().window(child_window);
				String text_on_new_window = driver.findElement(By.xpath("//*[text()='New Window']")).getAttribute("innerHTML");
				System.out.println("Text on new window is : " + text_on_new_window);
				 
			}
			
		}
		
		
		
		
		
		
	}

}

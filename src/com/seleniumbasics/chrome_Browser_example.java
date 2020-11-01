package com.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_Browser_example
{
	
	public static void main(String args[])
		{
				System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.navigate().to("http://www.google.com");
				
		}
}

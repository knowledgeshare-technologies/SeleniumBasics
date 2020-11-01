package com.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox_Browser_example
{
	public static void main(String args[])
	{

				System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.navigate().to("http://www.google.com");
	
	}
}

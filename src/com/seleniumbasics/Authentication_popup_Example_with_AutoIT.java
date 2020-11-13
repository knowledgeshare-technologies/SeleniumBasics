package com.seleniumbasics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Authentication_popup_Example_with_AutoIT 
{
		public static void main(String args[]) throws IOException
		{
			System.out.println("Handling Authentication - Using ");
			
			/*
			 * System.setProperty("webdriver.chrome.driver",
			 * ".\\drivers\\chromedriver.exe"); WebDriver driver=new ChromeDriver();
			 */
			 			
				  System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
				  WebDriver driver=new FirefoxDriver();
				 
			String URL = "http://the-internet.herokuapp.com/basic_auth";
			driver.get(URL);
			
			Runtime.getRuntime().exec("E:\\Scripts\\authentication_popup.exe");

		}
}

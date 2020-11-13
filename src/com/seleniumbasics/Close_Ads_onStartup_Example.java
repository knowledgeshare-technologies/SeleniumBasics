package com.seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Ads_onStartup_Example
{
	
	public static void main(String args[])
		{
				System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.navigate().to("http://the-internet.herokuapp.com/");
								
					WebElement entry_ad_link= driver.findElement(By.xpath("//*[text()='Entry Ad']"));
					entry_ad_link.click();
					
					Alert alert=driver.switchTo().alert();
					alert.dismiss();
					//driver.findElement(By.xpath("//*[text()='Close']")).click();
			        	
		}
}

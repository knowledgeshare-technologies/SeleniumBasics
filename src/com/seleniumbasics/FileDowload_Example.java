package com.seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDowload_Example 
{
	public static void main(String args[]) throws AWTException
	{
		//File Download using Chrome Browser
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * ".\\drivers\\chromedriver.exe"); WebDriver driver=new ChromeDriver();
		 * driver.navigate().to("http://the-internet.herokuapp.com/download");
		 * driver.findElement(By.xpath("//a[text()='some-file.txt']")).click();
		 */
		
		// File Download using Firefox
		  System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe"); 
		  WebDriver driver=new FirefoxDriver();
		  driver.navigate().to("http://the-internet.herokuapp.com/download");
		  driver.findElement(By.xpath("//a[text()='some-file.txt']")).click();
		  // Pressing Down arrow to select Save File and then pressing Enter so that it will download the File
		  Robot robot=new Robot();
		  robot.keyPress(KeyEvent.VK_DOWN);
		  robot.keyRelease(KeyEvent.VK_DOWN);
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
 
	}
}

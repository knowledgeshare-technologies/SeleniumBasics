package com.seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Events {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/register");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("gender-male")).click();
		
		//Method - 1
		/*
		 * Actions action=new Actions(driver); action.sendKeys(Keys.TAB);
		 * action.sendKeys("test1"); action.sendKeys(Keys.TAB);
		 * action.sendKeys("test2"); action.sendKeys(Keys.TAB);
		 * action.sendKeys("testtt@gmail.com"); action.sendKeys(Keys.ENTER);
		 * action.build().perform();
		 */
		
		//Method - 2
		Actions action=new  Actions(driver);
		action.sendKeys(Keys.TAB)
		.sendKeys("test1")
		.sendKeys(Keys.TAB)
		.sendKeys("test2")
		.sendKeys(Keys.TAB)
		.sendKeys("testtt@gmail.com")
		.sendKeys(Keys.ENTER)
		.build().perform();
		
		//Using Robot Class - java based class
		
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}

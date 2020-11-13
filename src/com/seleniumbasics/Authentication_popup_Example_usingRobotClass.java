package com.seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Authentication_popup_Example_usingRobotClass 
{
		public static void main(String args[]) throws AWTException, InterruptedException
		{
			System.out.println("Handling Authentication - Using ");
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			String URL = "http://the-internet.herokuapp.com/basic_auth";
			driver.get(URL);
			
			//Type UserName
			Robot robot = new Robot(); 
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_A);
			robot.keyPress(KeyEvent.VK_D);
			robot.keyRelease(KeyEvent.VK_D);
			robot.keyPress(KeyEvent.VK_M);
			robot.keyRelease(KeyEvent.VK_M);
			robot.keyPress(KeyEvent.VK_I);
			robot.keyRelease(KeyEvent.VK_I);
			robot.keyPress(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_N);
			
			//Press Tab
			robot.keyPress(KeyEvent.VK_TAB);
			//Type Password
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_A);
			robot.keyPress(KeyEvent.VK_D);
			robot.keyRelease(KeyEvent.VK_D);
			robot.keyPress(KeyEvent.VK_M);
			robot.keyRelease(KeyEvent.VK_M);
			robot.keyPress(KeyEvent.VK_I);
			robot.keyRelease(KeyEvent.VK_I);
			robot.keyPress(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_N);
	
			robot.keyPress(KeyEvent.VK_ENTER);
			
			Thread.sleep(5000);
			String expected_text=driver.findElement(By.xpath("//p")).getAttribute("innerHTML");
			
			if(expected_text.contains("Congratulations! You must have the proper credentials."))
			{
				System.out.println("Authentication successfull and expected text is present");
			}
			else
			{
				System.out.println("Authentication not successfull and expected text is present");
			}
			
		}
}

package com.seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Simple_Promt_Confirmation_Examples {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://the-internet.herokuapp.com/javascript_alerts");
		
		//Simple Alert
		/*
		 * driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click()
		 * ; Alert alert=driver.switchTo().alert(); alert.accept();
		 */	
		
		//Confirmation Alert
		/*
		 * driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click
		 * (); Alert alert=driver.switchTo().alert(); String
		 * alert_message=alert.getText();
		 * System.out.println("Alert Message displayed is : " + alert_message);
		 * alert.accept();
		 */
		
		//Prompt alert
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Knowledge Share");
		alert.accept();
		String expected_Result="You entered: Knowledge Share";
		String actual_Result=driver.findElement(By.xpath("//p[text()='You entered: Knowledge Share']")).getText();
		
		
		if(actual_Result.equalsIgnoreCase(expected_Result))
		{
			System.out.println("Expected Result is displayed correctly");
		}
		else
		{
			System.out.println("Expected Result is NOT displayed correctly");
		}
		
	}

}
